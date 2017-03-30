
package myhealthylife.nutritionservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findFoodByTypeFilteredByCaloriesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findFoodByTypeFilteredByCaloriesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foodList" type="{http://soap.nutritionservice.myhealthylife/}foodList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findFoodByTypeFilteredByCaloriesResponse", propOrder = {
    "foodList"
})
@XmlRootElement(name = "findFoodByTypeFilteredByCaloriesResponse")
public class FindFoodByTypeFilteredByCaloriesResponse {

    protected Foods_Type foodList;

    /**
     * Gets the value of the foodList property.
     * 
     * @return
     *     possible object is
     *     {@link Foods_Type }
     *     
     */
    public Foods_Type getFoodList() {
        return foodList;
    }

    /**
     * Sets the value of the foodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Foods_Type }
     *     
     */
    public void setFoodList(Foods_Type value) {
        this.foodList = value;
    }

}
