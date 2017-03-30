
package myhealthylife.nutritionservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readFoodTypeListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readFoodTypeListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foodTypeList" type="{http://soap.nutritionservice.myhealthylife/}foodTypeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readFoodTypeListResponse", propOrder = {
    "foodTypeList"
})
@XmlRootElement(name = "readFoodTypeListResponse")
public class ReadFoodTypeListResponse {

    protected FoodTypes foodTypeList;

    /**
     * Gets the value of the foodTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link FoodTypes }
     *     
     */
    public FoodTypes getFoodTypeList() {
        return foodTypeList;
    }

    /**
     * Sets the value of the foodTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodTypes }
     *     
     */
    public void setFoodTypeList(FoodTypes value) {
        this.foodTypeList = value;
    }

}
