
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sentence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sentence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSentence" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sentenceType" type="{http://soap.sentencegenerator.myhealthylife/}sentenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sentence", propOrder = {
    "idSentence",
    "text",
    "url",
    "sentenceType"
})
@XmlRootElement(name = "sentence")
public class Sentence {

    protected Long idSentence;
    protected String text;
    protected String url;
    protected SentenceType sentenceType;

    /**
     * Gets the value of the idSentence property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSentence() {
        return idSentence;
    }

    /**
     * Sets the value of the idSentence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSentence(Long value) {
        this.idSentence = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the sentenceType property.
     * 
     * @return
     *     possible object is
     *     {@link SentenceType }
     *     
     */
    public SentenceType getSentenceType() {
        return sentenceType;
    }

    /**
     * Sets the value of the sentenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SentenceType }
     *     
     */
    public void setSentenceType(SentenceType value) {
        this.sentenceType = value;
    }

}
