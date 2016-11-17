
package time.susu.ru;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for time_in_guest_zoneResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time_in_guest_zoneResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="time_in_guest_zoneResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time_in_guest_zoneResponse", propOrder = {
    "timeInGuestZoneResult"
})
public class TimeInGuestZoneResponse {

    @XmlElementRef(name = "time_in_guest_zoneResult", namespace = "ru.susu.time", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeInGuestZoneResult;

    /**
     * Gets the value of the timeInGuestZoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeInGuestZoneResult() {
        return timeInGuestZoneResult;
    }

    /**
     * Sets the value of the timeInGuestZoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeInGuestZoneResult(JAXBElement<String> value) {
        this.timeInGuestZoneResult = value;
    }

}
