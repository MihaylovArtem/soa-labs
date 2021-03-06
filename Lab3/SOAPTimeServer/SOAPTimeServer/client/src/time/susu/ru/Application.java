
package time.susu.ru;

import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Application", targetNamespace = "ru.susu.time")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Application {


    /**
     * 
     * @param timeZone
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "current_time", action = "current_time")
    @WebResult(name = "current_timeResult", targetNamespace = "ru.susu.time")
    @RequestWrapper(localName = "current_time", targetNamespace = "ru.susu.time", className = "time.susu.ru.CurrentTime")
    @ResponseWrapper(localName = "current_timeResponse", targetNamespace = "ru.susu.time", className = "time.susu.ru.CurrentTimeResponse")
    public String currentTime(
        @WebParam(name = "time_zone", targetNamespace = "ru.susu.time")
        String timeZone);

    /**
     * 
     * @param string
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "hello")
    @WebResult(name = "helloResult", targetNamespace = "ru.susu.time")
    @RequestWrapper(localName = "hello", targetNamespace = "ru.susu.time", className = "time.susu.ru.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "ru.susu.time", className = "time.susu.ru.HelloResponse")
    public String hello(
        @WebParam(name = "string", targetNamespace = "ru.susu.time")
        String string);

    /**
     * 
     * @return
     *     returns time.susu.ru.StringArray
     */
    @WebMethod(operationName = "available_timezones", action = "available_timezones")
    @WebResult(name = "available_timezonesResult", targetNamespace = "ru.susu.time")
    @RequestWrapper(localName = "available_timezones", targetNamespace = "ru.susu.time", className = "time.susu.ru.AvailableTimezones")
    @ResponseWrapper(localName = "available_timezonesResponse", targetNamespace = "ru.susu.time", className = "time.susu.ru.AvailableTimezonesResponse")
    public StringArray availableTimezones();

    /**
     * 
     * @param hours
     * @param timeZone
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "plus_hours", action = "plus_hours")
    @WebResult(name = "plus_hoursResult", targetNamespace = "ru.susu.time")
    @RequestWrapper(localName = "plus_hours", targetNamespace = "ru.susu.time", className = "time.susu.ru.PlusHours")
    @ResponseWrapper(localName = "plus_hoursResponse", targetNamespace = "ru.susu.time", className = "time.susu.ru.PlusHoursResponse")
    public String plusHours(
        @WebParam(name = "time_zone", targetNamespace = "ru.susu.time")
        String timeZone,
        @WebParam(name = "hours", targetNamespace = "ru.susu.time")
        BigInteger hours);

    /**
     * 
     * @param time
     * @param homeTimeZone
     * @param guestTimeZone
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "time_in_guest_zone", action = "time_in_guest_zone")
    @WebResult(name = "time_in_guest_zoneResult", targetNamespace = "ru.susu.time")
    @RequestWrapper(localName = "time_in_guest_zone", targetNamespace = "ru.susu.time", className = "time.susu.ru.TimeInGuestZone")
    @ResponseWrapper(localName = "time_in_guest_zoneResponse", targetNamespace = "ru.susu.time", className = "time.susu.ru.TimeInGuestZoneResponse")
    public String timeInGuestZone(
        @WebParam(name = "time", targetNamespace = "ru.susu.time")
        String time,
        @WebParam(name = "home_time_zone", targetNamespace = "ru.susu.time")
        String homeTimeZone,
        @WebParam(name = "guest_time_zone", targetNamespace = "ru.susu.time")
        String guestTimeZone);

    /**
     * 
     * @param secondTimeZone
     * @param firstTimeZone
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "time_between", action = "time_between")
    @WebResult(name = "time_betweenResult", targetNamespace = "ru.susu.time")
    @RequestWrapper(localName = "time_between", targetNamespace = "ru.susu.time", className = "time.susu.ru.TimeBetween")
    @ResponseWrapper(localName = "time_betweenResponse", targetNamespace = "ru.susu.time", className = "time.susu.ru.TimeBetweenResponse")
    public String timeBetween(
        @WebParam(name = "first_time_zone", targetNamespace = "ru.susu.time")
        String firstTimeZone,
        @WebParam(name = "second_time_zone", targetNamespace = "ru.susu.time")
        String secondTimeZone);

}
