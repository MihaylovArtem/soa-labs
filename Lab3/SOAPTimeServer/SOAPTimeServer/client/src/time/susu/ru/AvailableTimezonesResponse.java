
package time.susu.ru;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for available_timezonesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="available_timezonesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="available_timezonesResult" type="{ru.susu.time}stringArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "available_timezonesResponse", propOrder = {
    "availableTimezonesResult"
})
public class AvailableTimezonesResponse {

    @XmlElementRef(name = "available_timezonesResult", namespace = "ru.susu.time", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> availableTimezonesResult;

    /**
     * Gets the value of the availableTimezonesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getAvailableTimezonesResult() {
        return availableTimezonesResult;
    }

    /**
     * Sets the value of the availableTimezonesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setAvailableTimezonesResult(JAXBElement<StringArray> value) {
        this.availableTimezonesResult = value;
    }

}
