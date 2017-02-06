
package myhealtylife.optimalparamters.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readAgeRangesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAgeRangesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeRangeList" type="{http://soap.optimalparamters.myhealtylife/}ageRangeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readAgeRangesResponse", propOrder = {
    "ageRangeList"
})
public class ReadAgeRangesResponse {

    @XmlElement(name = "AgeRangeList")
    protected AgeRangeList ageRangeList;

    /**
     * Gets the value of the ageRangeList property.
     * 
     * @return
     *     possible object is
     *     {@link AgeRangeList }
     *     
     */
    public AgeRangeList getAgeRangeList() {
        return ageRangeList;
    }

    /**
     * Sets the value of the ageRangeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRangeList }
     *     
     */
    public void setAgeRangeList(AgeRangeList value) {
        this.ageRangeList = value;
    }

}
