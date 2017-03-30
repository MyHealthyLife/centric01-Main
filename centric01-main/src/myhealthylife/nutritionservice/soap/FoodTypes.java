
package myhealthylife.nutritionservice.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foodType" type="{http://soap.nutritionservice.myhealthylife/}foodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foodTypeList", propOrder = {
    "foodTypes"
})
@XmlRootElement(name = "foodTypes")
public class FoodTypes {

    @XmlElement(name = "foodType", nillable = true)
    protected List<FoodType> foodTypes;

    /**
     * Gets the value of the foodTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodType }
     * 
     * 
     */
    public List<FoodType> getFoodTypes() {
        if (foodTypes == null) {
            foodTypes = new ArrayList<FoodType>();
        }
        return this.foodTypes;
    }

}
