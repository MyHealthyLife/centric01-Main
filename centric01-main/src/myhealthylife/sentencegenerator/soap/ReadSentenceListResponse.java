
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readSentenceListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readSentenceListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceList" type="{http://soap.sentencegenerator.myhealthylife/}sentenceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readSentenceListResponse", propOrder = {
    "sentenceList"
})
public class ReadSentenceListResponse {

    protected SentenceList sentenceList;

    /**
     * Gets the value of the sentenceList property.
     * 
     * @return
     *     possible object is
     *     {@link SentenceList }
     *     
     */
    public SentenceList getSentenceList() {
        return sentenceList;
    }

    /**
     * Sets the value of the sentenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SentenceList }
     *     
     */
    public void setSentenceList(SentenceList value) {
        this.sentenceList = value;
    }

}
