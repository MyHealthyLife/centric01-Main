
package myhealtylife.optimalparamters.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ageRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ageRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idRange" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="toAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ageRange", propOrder = {
    "fromAge",
    "idRange",
    "toAge"
})
public class AgeRange {

    protected Integer fromAge;
    protected long idRange;
    protected Integer toAge;

    /**
     * Gets the value of the fromAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromAge() {
        return fromAge;
    }

    /**
     * Sets the value of the fromAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromAge(Integer value) {
        this.fromAge = value;
    }

    /**
     * Gets the value of the idRange property.
     * 
     */
    public long getIdRange() {
        return idRange;
    }

    /**
     * Sets the value of the idRange property.
     * 
     */
    public void setIdRange(long value) {
        this.idRange = value;
    }

    /**
     * Gets the value of the toAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToAge() {
        return toAge;
    }

    /**
     * Sets the value of the toAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToAge(Integer value) {
        this.toAge = value;
    }

}
