
package time.susu.ru;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for time_in_guest_zone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time_in_guest_zone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="home_time_zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guest_time_zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time_in_guest_zone", propOrder = {
    "time",
    "homeTimeZone",
    "guestTimeZone"
})
public class TimeInGuestZone {

    @XmlElementRef(name = "time", namespace = "ru.susu.time", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time;
    @XmlElementRef(name = "home_time_zone", namespace = "ru.susu.time", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homeTimeZone;
    @XmlElementRef(name = "guest_time_zone", namespace = "ru.susu.time", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guestTimeZone;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime(JAXBElement<String> value) {
        this.time = value;
    }

    /**
     * Gets the value of the homeTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomeTimeZone() {
        return homeTimeZone;
    }

    /**
     * Sets the value of the homeTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomeTimeZone(JAXBElement<String> value) {
        this.homeTimeZone = value;
    }

    /**
     * Gets the value of the guestTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGuestTimeZone() {
        return guestTimeZone;
    }

    /**
     * Sets the value of the guestTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGuestTimeZone(JAXBElement<String> value) {
        this.guestTimeZone = value;
    }

}
