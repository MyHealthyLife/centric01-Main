
package myhealtylife.optimalparamters.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteParameterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteParameterResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idParameter" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteParameterResponse", propOrder = {
    "idParameter"
})
@XmlRootElement(name = "deleteParameterResponse")
public class DeleteParameterResponse {

    protected long idParameter;

    /**
     * Gets the value of the idParameter property.
     * 
     */
    public long getIdParameter() {
        return idParameter;
    }

    /**
     * Sets the value of the idParameter property.
     * 
     */
    public void setIdParameter(long value) {
        this.idParameter = value;
    }

}
