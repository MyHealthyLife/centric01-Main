
package myhealthylife.dataservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for temperature_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="temperature_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temperature_type")
public class TemperatureType {

    @XmlAttribute(name = "value")
    protected Float value;
    @XmlAttribute(name = "min")
    protected Float min;
    @XmlAttribute(name = "max")
    protected Float max;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMin(Float value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMax(Float value) {
        this.max = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
