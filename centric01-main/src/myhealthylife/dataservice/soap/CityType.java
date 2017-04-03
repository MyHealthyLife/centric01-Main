
package myhealthylife.dataservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for city_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="city_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coord" type="{http://soap.dataservice.myhealthylife/}coord_type"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sun" type="{http://soap.dataservice.myhealthylife/}sun_type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "city_type", propOrder = {
    "coord",
    "country",
    "sun"
})
public class CityType {

    @XmlElement(required = true)
    protected CoordType coord;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected SunType sun;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the coord property.
     * 
     * @return
     *     possible object is
     *     {@link CoordType }
     *     
     */
    public CoordType getCoord() {
        return coord;
    }

    /**
     * Sets the value of the coord property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordType }
     *     
     */
    public void setCoord(CoordType value) {
        this.coord = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the sun property.
     * 
     * @return
     *     possible object is
     *     {@link SunType }
     *     
     */
    public SunType getSun() {
        return sun;
    }

    /**
     * Sets the value of the sun property.
     * 
     * @param value
     *     allowed object is
     *     {@link SunType }
     *     
     */
    public void setSun(SunType value) {
        this.sun = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
