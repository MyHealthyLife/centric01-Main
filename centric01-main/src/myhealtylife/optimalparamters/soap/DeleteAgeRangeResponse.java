
package myhealtylife.optimalparamters.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteAgeRangeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteAgeRangeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAgeRange" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteAgeRangeResponse", propOrder = {
    "idAgeRange"
})
@XmlRootElement(name = "deleteAgeRangeResponse")
public class DeleteAgeRangeResponse {

    protected long idAgeRange;

    /**
     * Gets the value of the idAgeRange property.
     * 
     */
    public long getIdAgeRange() {
        return idAgeRange;
    }

    /**
     * Sets the value of the idAgeRange property.
     * 
     */
    public void setIdAgeRange(long value) {
        this.idAgeRange = value;
    }

}
