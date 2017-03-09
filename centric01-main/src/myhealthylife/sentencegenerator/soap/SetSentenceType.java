
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per setSentenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="setSentenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSentenceType", propOrder = {
    "sentenceId",
    "typeId"
})
public class SetSentenceType {

    protected long sentenceId;
    protected long typeId;

    /**
     * Recupera il valore della proprietà sentenceId.
     * 
     */
    public long getSentenceId() {
        return sentenceId;
    }

    /**
     * Imposta il valore della proprietà sentenceId.
     * 
     */
    public void setSentenceId(long value) {
        this.sentenceId = value;
    }

    /**
     * Recupera il valore della proprietà typeId.
     * 
     */
    public long getTypeId() {
        return typeId;
    }

    /**
     * Imposta il valore della proprietà typeId.
     * 
     */
    public void setTypeId(long value) {
        this.typeId = value;
    }

}
