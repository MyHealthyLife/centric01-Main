
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteSentence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteSentence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSentence", propOrder = {
    "sentenceId"
})
@XmlRootElement(name = "deleteSentence")
public class DeleteSentence {

    protected long sentenceId;

    /**
     * Gets the value of the sentenceId property.
     * 
     */
    public long getSentenceId() {
        return sentenceId;
    }

    /**
     * Sets the value of the sentenceId property.
     * 
     */
    public void setSentenceId(long value) {
        this.sentenceId = value;
    }

}
