
package myhealthylife.nutritionservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteFoodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteFoodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteFoodType", propOrder = {
    "typeId"
})
@XmlRootElement(name = "deleteFoodType")
public class DeleteFoodType {

    protected long typeId;

    /**
     * Gets the value of the typeId property.
     * 
     */
    public long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(long value) {
        this.typeId = value;
    }

}
