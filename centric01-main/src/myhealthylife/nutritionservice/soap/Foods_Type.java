
package myhealthylife.nutritionservice.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foodList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foodList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="food" type="{http://soap.nutritionservice.myhealthylife/}food" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foodList", propOrder = {
    "foods"
})
@XmlRootElement(name = "foods")
public class Foods_Type {

    @XmlElement(name = "food", nillable = true)
    protected List<Food> foods;

    /**
     * Gets the value of the foods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Food }
     * 
     * 
     */
    public List<Food> getFoods() {
        if (foods == null) {
            foods = new ArrayList<Food>();
        }
        return this.foods;
    }

}
