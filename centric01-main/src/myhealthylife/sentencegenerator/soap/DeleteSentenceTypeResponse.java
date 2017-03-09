
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per deleteSentenceTypeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="deleteSentenceTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSentenceType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSentenceTypeResponse", propOrder = {
    "idSentenceType"
})
public class DeleteSentenceTypeResponse {

    protected long idSentenceType;

    /**
     * Recupera il valore della proprietà idSentenceType.
     * 
     */
    public long getIdSentenceType() {
        return idSentenceType;
    }

    /**
     * Imposta il valore della proprietà idSentenceType.
     * 
     */
    public void setIdSentenceType(long value) {
        this.idSentenceType = value;
    }

}
