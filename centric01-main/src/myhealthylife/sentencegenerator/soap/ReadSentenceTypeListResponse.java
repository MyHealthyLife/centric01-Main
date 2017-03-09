
package myhealthylife.sentencegenerator.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per readSentenceTypeListResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="readSentenceTypeListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceTypeList" type="{http://soap.sentencegenerator.myhealthylife/}sentenceTypeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readSentenceTypeListResponse", propOrder = {
    "sentenceTypeList"
})
public class ReadSentenceTypeListResponse {

    protected SentenceTypeList sentenceTypeList;

    /**
     * Recupera il valore della proprietà sentenceTypeList.
     * 
     * @return
     *     possible object is
     *     {@link SentenceTypeList }
     *     
     */
    public SentenceTypeList getSentenceTypeList() {
        return sentenceTypeList;
    }

    /**
     * Imposta il valore della proprietà sentenceTypeList.
     * 
     * @param value
     *     allowed object is
     *     {@link SentenceTypeList }
     *     
     */
    public void setSentenceTypeList(SentenceTypeList value) {
        this.sentenceTypeList = value;
    }

}
