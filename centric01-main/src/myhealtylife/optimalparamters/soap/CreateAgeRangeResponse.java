
package myhealtylife.optimalparamters.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createAgeRangeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAgeRangeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeRange" type="{http://soap.optimalparamters.myhealtylife/}ageRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAgeRangeResponse", propOrder = {
    "ageRange"
})
@XmlRootElement(name = "createAgeRangeResponse")
public class CreateAgeRangeResponse {

    @XmlElement(name = "AgeRange")
    protected AgeRange ageRange;

    /**
     * Gets the value of the ageRange property.
     * 
     * @return
     *     possible object is
     *     {@link AgeRange }
     *     
     */
    public AgeRange getAgeRange() {
        return ageRange;
    }

    /**
     * Sets the value of the ageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRange }
     *     
     */
    public void setAgeRange(AgeRange value) {
        this.ageRange = value;
    }

}
