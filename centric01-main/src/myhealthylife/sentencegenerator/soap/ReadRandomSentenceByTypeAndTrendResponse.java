
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readRandomSentenceByTypeAndTrendResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readRandomSentenceByTypeAndTrendResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentence" type="{http://soap.sentencegenerator.myhealthylife/}sentence" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readRandomSentenceByTypeAndTrendResponse", propOrder = {
    "sentence"
})
public class ReadRandomSentenceByTypeAndTrendResponse {

    protected Sentence sentence;

    /**
     * Gets the value of the sentence property.
     * 
     * @return
     *     possible object is
     *     {@link Sentence }
     *     
     */
    public Sentence getSentence() {
        return sentence;
    }

    /**
     * Sets the value of the sentence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sentence }
     *     
     */
    public void setSentence(Sentence value) {
        this.sentence = value;
    }

}
