
package myhealthylife.dataservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for healthProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="healthProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentHealth" type="{http://soap.dataservice.myhealthylife/}currentHealth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthProfile", propOrder = {
    "currentHealth"
})
@XmlRootElement(name = "healthProfile")
public class HealthProfile {

    protected CurrentHealth currentHealth;

    /**
     * Gets the value of the currentHealth property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentHealth }
     *     
     */
    public CurrentHealth getCurrentHealth() {
        return currentHealth;
    }

    /**
     * Sets the value of the currentHealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentHealth }
     *     
     */
    public void setCurrentHealth(CurrentHealth value) {
        this.currentHealth = value;
    }

}
