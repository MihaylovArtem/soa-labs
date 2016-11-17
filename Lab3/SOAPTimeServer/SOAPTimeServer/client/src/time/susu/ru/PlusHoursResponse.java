
package time.susu.ru;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plus_hoursResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plus_hoursResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plus_hoursResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plus_hoursResponse", propOrder = {
    "plusHoursResult"
})
public class PlusHoursResponse {

    @XmlElementRef(name = "plus_hoursResult", namespace = "ru.susu.time", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plusHoursResult;

    /**
     * Gets the value of the plusHoursResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlusHoursResult() {
        return plusHoursResult;
    }

    /**
     * Sets the value of the plusHoursResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlusHoursResult(JAXBElement<String> value) {
        this.plusHoursResult = value;
    }

}
