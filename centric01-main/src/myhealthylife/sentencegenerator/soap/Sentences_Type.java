
package myhealthylife.sentencegenerator.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sentenceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sentenceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentence" type="{http://soap.sentencegenerator.myhealthylife/}sentence" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sentenceList", propOrder = {
    "sentences"
})
@XmlRootElement(name = "sentences")
public class Sentences_Type {

    @XmlElement(name = "sentence", nillable = true)
    protected List<Sentence> sentences;

    /**
     * Gets the value of the sentences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sentences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSentences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sentence }
     * 
     * 
     */
    public List<Sentence> getSentences() {
        if (sentences == null) {
            sentences = new ArrayList<Sentence>();
        }
        return this.sentences;
    }

}
