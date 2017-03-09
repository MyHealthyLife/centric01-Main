
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readRandomSentenceByType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readRandomSentenceByType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readRandomSentenceByType", propOrder = {
    "sentenceType"
})
public class ReadRandomSentenceByType {

    protected String sentenceType;

    /**
     * Recupera il valore della proprietà sentenceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentenceType() {
        return sentenceType;
    }

    /**
     * Imposta il valore della proprietà sentenceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentenceType(String value) {
        this.sentenceType = value;
    }

}
