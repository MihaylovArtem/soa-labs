
package time.susu.ru;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the time.susu.ru package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TimeBetween_QNAME = new QName("ru.susu.time", "time_between");
    private final static QName _PlusHours_QNAME = new QName("ru.susu.time", "plus_hours");
    private final static QName _TimeBetweenResponse_QNAME = new QName("ru.susu.time", "time_betweenResponse");
    private final static QName _CurrentTimeResponse_QNAME = new QName("ru.susu.time", "current_timeResponse");
    private final static QName _TimeInGuestZone_QNAME = new QName("ru.susu.time", "time_in_guest_zone");
    private final static QName _TimeInGuestZoneResponse_QNAME = new QName("ru.susu.time", "time_in_guest_zoneResponse");
    private final static QName _HelloResponse_QNAME = new QName("ru.susu.time", "helloResponse");
    private final static QName _Hello_QNAME = new QName("ru.susu.time", "hello");
    private final static QName _PlusHoursResponse_QNAME = new QName("ru.susu.time", "plus_hoursResponse");
    private final static QName _StringArray_QNAME = new QName("ru.susu.time", "stringArray");
    private final static QName _AvailableTimezones_QNAME = new QName("ru.susu.time", "available_timezones");
    private final static QName _CurrentTime_QNAME = new QName("ru.susu.time", "current_time");
    private final static QName _AvailableTimezonesResponse_QNAME = new QName("ru.susu.time", "available_timezonesResponse");
    private final static QName _PlusHoursResponsePlusHoursResult_QNAME = new QName("ru.susu.time", "plus_hoursResult");
    private final static QName _AvailableTimezonesResponseAvailableTimezonesResult_QNAME = new QName("ru.susu.time", "available_timezonesResult");
    private final static QName _CurrentTimeTimeZone_QNAME = new QName("ru.susu.time", "time_zone");
    private final static QName _TimeBetweenResponseTimeBetweenResult_QNAME = new QName("ru.susu.time", "time_betweenResult");
    private final static QName _TimeInGuestZoneGuestTimeZone_QNAME = new QName("ru.susu.time", "guest_time_zone");
    private final static QName _TimeInGuestZoneHomeTimeZone_QNAME = new QName("ru.susu.time", "home_time_zone");
    private final static QName _TimeInGuestZoneTime_QNAME = new QName("ru.susu.time", "time");
    private final static QName _CurrentTimeResponseCurrentTimeResult_QNAME = new QName("ru.susu.time", "current_timeResult");
    private final static QName _HelloString_QNAME = new QName("ru.susu.time", "string");
    private final static QName _PlusHoursHours_QNAME = new QName("ru.susu.time", "hours");
    private final static QName _HelloResponseHelloResult_QNAME = new QName("ru.susu.time", "helloResult");
    private final static QName _TimeBetweenFirstTimeZone_QNAME = new QName("ru.susu.time", "first_time_zone");
    private final static QName _TimeBetweenSecondTimeZone_QNAME = new QName("ru.susu.time", "second_time_zone");
    private final static QName _TimeInGuestZoneResponseTimeInGuestZoneResult_QNAME = new QName("ru.susu.time", "time_in_guest_zoneResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: time.susu.ru
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimeBetween }
     * 
     */
    public TimeBetween createTimeBetween() {
        return new TimeBetween();
    }

    /**
     * Create an instance of {@link PlusHours }
     * 
     */
    public PlusHours createPlusHours() {
        return new PlusHours();
    }

    /**
     * Create an instance of {@link TimeBetweenResponse }
     * 
     */
    public TimeBetweenResponse createTimeBetweenResponse() {
        return new TimeBetweenResponse();
    }

    /**
     * Create an instance of {@link CurrentTimeResponse }
     * 
     */
    public CurrentTimeResponse createCurrentTimeResponse() {
        return new CurrentTimeResponse();
    }

    /**
     * Create an instance of {@link TimeInGuestZoneResponse }
     * 
     */
    public TimeInGuestZoneResponse createTimeInGuestZoneResponse() {
        return new TimeInGuestZoneResponse();
    }

    /**
     * Create an instance of {@link TimeInGuestZone }
     * 
     */
    public TimeInGuestZone createTimeInGuestZone() {
        return new TimeInGuestZone();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link PlusHoursResponse }
     * 
     */
    public PlusHoursResponse createPlusHoursResponse() {
        return new PlusHoursResponse();
    }

    /**
     * Create an instance of {@link AvailableTimezones }
     * 
     */
    public AvailableTimezones createAvailableTimezones() {
        return new AvailableTimezones();
    }

    /**
     * Create an instance of {@link CurrentTime }
     * 
     */
    public CurrentTime createCurrentTime() {
        return new CurrentTime();
    }

    /**
     * Create an instance of {@link AvailableTimezonesResponse }
     * 
     */
    public AvailableTimezonesResponse createAvailableTimezonesResponse() {
        return new AvailableTimezonesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBetween }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time_between")
    public JAXBElement<TimeBetween> createTimeBetween(TimeBetween value) {
        return new JAXBElement<TimeBetween>(_TimeBetween_QNAME, TimeBetween.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusHours }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "plus_hours")
    public JAXBElement<PlusHours> createPlusHours(PlusHours value) {
        return new JAXBElement<PlusHours>(_PlusHours_QNAME, PlusHours.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeBetweenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time_betweenResponse")
    public JAXBElement<TimeBetweenResponse> createTimeBetweenResponse(TimeBetweenResponse value) {
        return new JAXBElement<TimeBetweenResponse>(_TimeBetweenResponse_QNAME, TimeBetweenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "current_timeResponse")
    public JAXBElement<CurrentTimeResponse> createCurrentTimeResponse(CurrentTimeResponse value) {
        return new JAXBElement<CurrentTimeResponse>(_CurrentTimeResponse_QNAME, CurrentTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeInGuestZone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time_in_guest_zone")
    public JAXBElement<TimeInGuestZone> createTimeInGuestZone(TimeInGuestZone value) {
        return new JAXBElement<TimeInGuestZone>(_TimeInGuestZone_QNAME, TimeInGuestZone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeInGuestZoneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time_in_guest_zoneResponse")
    public JAXBElement<TimeInGuestZoneResponse> createTimeInGuestZoneResponse(TimeInGuestZoneResponse value) {
        return new JAXBElement<TimeInGuestZoneResponse>(_TimeInGuestZoneResponse_QNAME, TimeInGuestZoneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusHoursResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "plus_hoursResponse")
    public JAXBElement<PlusHoursResponse> createPlusHoursResponse(PlusHoursResponse value) {
        return new JAXBElement<PlusHoursResponse>(_PlusHoursResponse_QNAME, PlusHoursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableTimezones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "available_timezones")
    public JAXBElement<AvailableTimezones> createAvailableTimezones(AvailableTimezones value) {
        return new JAXBElement<AvailableTimezones>(_AvailableTimezones_QNAME, AvailableTimezones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "current_time")
    public JAXBElement<CurrentTime> createCurrentTime(CurrentTime value) {
        return new JAXBElement<CurrentTime>(_CurrentTime_QNAME, CurrentTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableTimezonesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "available_timezonesResponse")
    public JAXBElement<AvailableTimezonesResponse> createAvailableTimezonesResponse(AvailableTimezonesResponse value) {
        return new JAXBElement<AvailableTimezonesResponse>(_AvailableTimezonesResponse_QNAME, AvailableTimezonesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "plus_hoursResult", scope = PlusHoursResponse.class)
    public JAXBElement<String> createPlusHoursResponsePlusHoursResult(String value) {
        return new JAXBElement<String>(_PlusHoursResponsePlusHoursResult_QNAME, String.class, PlusHoursResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "available_timezonesResult", scope = AvailableTimezonesResponse.class)
    public JAXBElement<StringArray> createAvailableTimezonesResponseAvailableTimezonesResult(StringArray value) {
        return new JAXBElement<StringArray>(_AvailableTimezonesResponseAvailableTimezonesResult_QNAME, StringArray.class, AvailableTimezonesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time_zone", scope = CurrentTime.class)
    public JAXBElement<String> createCurrentTimeTimeZone(String value) {
        return new JAXBElement<String>(_CurrentTimeTimeZone_QNAME, String.class, CurrentTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time_betweenResult", scope = TimeBetweenResponse.class)
    public JAXBElement<String> createTimeBetweenResponseTimeBetweenResult(String value) {
        return new JAXBElement<String>(_TimeBetweenResponseTimeBetweenResult_QNAME, String.class, TimeBetweenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "guest_time_zone", scope = TimeInGuestZone.class)
    public JAXBElement<String> createTimeInGuestZoneGuestTimeZone(String value) {
        return new JAXBElement<String>(_TimeInGuestZoneGuestTimeZone_QNAME, String.class, TimeInGuestZone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "home_time_zone", scope = TimeInGuestZone.class)
    public JAXBElement<String> createTimeInGuestZoneHomeTimeZone(String value) {
        return new JAXBElement<String>(_TimeInGuestZoneHomeTimeZone_QNAME, String.class, TimeInGuestZone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time", scope = TimeInGuestZone.class)
    public JAXBElement<String> createTimeInGuestZoneTime(String value) {
        return new JAXBElement<String>(_TimeInGuestZoneTime_QNAME, String.class, TimeInGuestZone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "current_timeResult", scope = CurrentTimeResponse.class)
    public JAXBElement<String> createCurrentTimeResponseCurrentTimeResult(String value) {
        return new JAXBElement<String>(_CurrentTimeResponseCurrentTimeResult_QNAME, String.class, CurrentTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "string", scope = Hello.class)
    public JAXBElement<String> createHelloString(String value) {
        return new JAXBElement<String>(_HelloString_QNAME, String.class, Hello.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "hours", scope = PlusHours.class)
    public JAXBElement<BigInteger> createPlusHoursHours(BigInteger value) {
        return new JAXBElement<BigInteger>(_PlusHoursHours_QNAME, BigInteger.class, PlusHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time_zone", scope = PlusHours.class)
    public JAXBElement<String> createPlusHoursTimeZone(String value) {
        return new JAXBElement<String>(_CurrentTimeTimeZone_QNAME, String.class, PlusHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "helloResult", scope = HelloResponse.class)
    public JAXBElement<String> createHelloResponseHelloResult(String value) {
        return new JAXBElement<String>(_HelloResponseHelloResult_QNAME, String.class, HelloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "first_time_zone", scope = TimeBetween.class)
    public JAXBElement<String> createTimeBetweenFirstTimeZone(String value) {
        return new JAXBElement<String>(_TimeBetweenFirstTimeZone_QNAME, String.class, TimeBetween.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "second_time_zone", scope = TimeBetween.class)
    public JAXBElement<String> createTimeBetweenSecondTimeZone(String value) {
        return new JAXBElement<String>(_TimeBetweenSecondTimeZone_QNAME, String.class, TimeBetween.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "ru.susu.time", name = "time_in_guest_zoneResult", scope = TimeInGuestZoneResponse.class)
    public JAXBElement<String> createTimeInGuestZoneResponseTimeInGuestZoneResult(String value) {
        return new JAXBElement<String>(_TimeInGuestZoneResponseTimeInGuestZoneResult_QNAME, String.class, TimeInGuestZoneResponse.class, value);
    }

}
