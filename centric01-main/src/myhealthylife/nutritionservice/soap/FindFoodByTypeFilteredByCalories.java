
package myhealthylife.nutritionservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findFoodByTypeFilteredByCalories complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findFoodByTypeFilteredByCalories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxCal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findFoodByTypeFilteredByCalories", propOrder = {
    "maxCal"
})
@XmlRootElement(name = "findFoodByTypeFilteredByCalories")
public class FindFoodByTypeFilteredByCalories {

    protected Integer maxCal;

    /**
     * Gets the value of the maxCal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCal() {
        return maxCal;
    }

    /**
     * Sets the value of the maxCal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCal(Integer value) {
        this.maxCal = value;
    }

}
