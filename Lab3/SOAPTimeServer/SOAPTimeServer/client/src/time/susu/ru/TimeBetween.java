
package time.susu.ru;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for time_between complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time_between">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="first_time_zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="second_time_zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time_between", propOrder = {
    "firstTimeZone",
    "secondTimeZone"
})
public class TimeBetween {

    @XmlElementRef(name = "first_time_zone", namespace = "ru.susu.time", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstTimeZone;
    @XmlElementRef(name = "second_time_zone", namespace = "ru.susu.time", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondTimeZone;

    /**
     * Gets the value of the firstTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstTimeZone() {
        return firstTimeZone;
    }

    /**
     * Sets the value of the firstTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstTimeZone(JAXBElement<String> value) {
        this.firstTimeZone = value;
    }

    /**
     * Gets the value of the secondTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondTimeZone() {
        return secondTimeZone;
    }

    /**
     * Sets the value of the secondTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondTimeZone(JAXBElement<String> value) {
        this.secondTimeZone = value;
    }

}
