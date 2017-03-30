
package myhealthylife.nutritionservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for food complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="food">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFood" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calories" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="foodType" type="{http://soap.nutritionservice.myhealthylife/}foodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "food", propOrder = {
    "idFood",
    "name",
    "calories",
    "foodType"
})
@XmlRootElement(name = "food")
public class Food {

    protected Long idFood;
    protected String name;
    protected Integer calories;
    protected FoodType foodType;

    /**
     * Gets the value of the idFood property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdFood() {
        return idFood;
    }

    /**
     * Sets the value of the idFood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdFood(Long value) {
        this.idFood = value;
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

    /**
     * Gets the value of the calories property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCalories(Integer value) {
        this.calories = value;
    }

    /**
     * Gets the value of the foodType property.
     * 
     * @return
     *     possible object is
     *     {@link FoodType }
     *     
     */
    public FoodType getFoodType() {
        return foodType;
    }

    /**
     * Sets the value of the foodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoodType }
     *     
     */
    public void setFoodType(FoodType value) {
        this.foodType = value;
    }

}
