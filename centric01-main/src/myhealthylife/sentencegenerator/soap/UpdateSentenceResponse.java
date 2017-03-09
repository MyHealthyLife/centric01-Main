
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateSentenceResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updateSentenceResponse">
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
@XmlType(name = "updateSentenceResponse", propOrder = {
    "sentence"
})
public class UpdateSentenceResponse {

    protected Sentence sentence;

    /**
     * Recupera il valore della proprietà sentence.
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
     * Imposta il valore della proprietà sentence.
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
