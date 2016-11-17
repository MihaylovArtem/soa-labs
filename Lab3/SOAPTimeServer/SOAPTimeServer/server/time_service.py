import arrow
import pytz
from spyne import ServiceBase, Unicode, Integer, Iterable
from spyne import srpc


def debug_response(func):
    """
    we don't want to raise exceptions on client, so we send them as usual response
    :param func:
    :return:
    """
    def wrapper(*args, **kwargs):
        try:
            return func(*args, **kwargs)
        except Exception as e:
            return "error: {}".format(e)
    return wrapper


class TimeServiceOrig:
    """
    Methods to call remotely.
    """

    @staticmethod
    @debug_response
    def current_time(time_zone):
        return arrow.now(time_zone).isoformat()

    @staticmethod
    @debug_response
    def time_in_guest_zone(time, home_time_zone, guest_time_zone):
        return arrow.get(arrow.get(time).naive, home_time_zone).to(guest_time_zone).isoformat()

    @staticmethod
    @debug_response
    def plus_hours(time_zone, hours):
        return (arrow.now(time_zone) + arrow.arrow.timedelta(hours=hours)).isoformat()

    @staticmethod
    @debug_response
    def time_between(first_time_zone, second_time_zone):
        return str(arrow.arrow.timedelta(0, (arrow.now(second_time_zone).utcoffset() -
                                             arrow.now(first_time_zone).utcoffset()).seconds))

    @staticmethod
    @debug_response
    def available_timezones():
        return pytz.all_timezones


class TimeService(ServiceBase):
    """
    TimeService is only wrapper for TimeServiceOrig. Restrictions of spyne don't allow
    use several decorators at once, so we have useless class.
    """
    @srpc(Unicode, _returns=Unicode)
    def current_time(time_zone):
        return TimeServiceOrig.current_time(time_zone)

    @srpc(Unicode, Unicode, Unicode, _returns=Unicode)
    def time_in_guest_zone(time, home_time_zone, guest_time_zone):
        return TimeServiceOrig.time_in_guest_zone(time, home_time_zone, guest_time_zone)

    @srpc(Unicode, Integer, _returns=Unicode)
    def plus_hours(time_zone, hours):
        return TimeServiceOrig.plus_hours(time_zone, hours)

    @srpc(Unicode, Unicode, _returns=Unicode)
    def time_between(first_time_zone, second_time_zone):
        return TimeServiceOrig.time_between(first_time_zone, second_time_zone)

    @srpc(_returns=Iterable(Unicode))
    def available_timezones():
        return TimeServiceOrig.available_timezones()

    @srpc(Unicode, _returns=Unicode)
    def hello(string):
        return "Hello, {}".format(string)
