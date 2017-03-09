
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per createSentenceTypeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createSentenceTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "createSentenceTypeResponse", propOrder = {
    "sentenceType"
})
public class CreateSentenceTypeResponse {

    protected SentenceType sentenceType;

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
