
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readRandomSentenceByTypeAndTrend complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readRandomSentenceByTypeAndTrend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readRandomSentenceByTypeAndTrend", propOrder = {
    "sentenceType",
    "motive"
})
public class ReadRandomSentenceByTypeAndTrend {

    protected String sentenceType;
    protected Boolean motive;

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

    /**
     * Recupera il valore della proprietà motive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMotive() {
        return motive;
    }

    /**
     * Imposta il valore della proprietà motive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMotive(Boolean value) {
        this.motive = value;
    }

}
