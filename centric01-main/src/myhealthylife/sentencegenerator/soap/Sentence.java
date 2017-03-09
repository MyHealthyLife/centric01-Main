
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per sentence complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
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
public class Sentence {

    protected Long idSentence;
    protected String text;
    protected String url;
    protected SentenceType sentenceType;

    /**
     * Recupera il valore della proprietà idSentence.
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
     * Imposta il valore della proprietà idSentence.
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
     * Recupera il valore della proprietà text.
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
     * Imposta il valore della proprietà text.
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
     * Recupera il valore della proprietà url.
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
     * Imposta il valore della proprietà url.
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
     * Recupera il valore della proprietà sentenceType.
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
     * Imposta il valore della proprietà sentenceType.
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
