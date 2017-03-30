
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteSentenceTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteSentenceTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSentenceType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSentenceTypeResponse", propOrder = {
    "idSentenceType"
})
@XmlRootElement(name = "deleteSentenceTypeResponse")
public class DeleteSentenceTypeResponse {

    protected long idSentenceType;

    /**
     * Gets the value of the idSentenceType property.
     * 
     */
    public long getIdSentenceType() {
        return idSentenceType;
    }

    /**
     * Sets the value of the idSentenceType property.
     * 
     */
    public void setIdSentenceType(long value) {
        this.idSentenceType = value;
    }

}
