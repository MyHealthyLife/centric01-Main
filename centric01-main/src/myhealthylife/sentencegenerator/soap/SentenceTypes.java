
package myhealthylife.sentencegenerator.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sentenceTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sentenceTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sentenceType" type="{http://soap.sentencegenerator.myhealthylife/}sentenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sentenceTypeList", propOrder = {
    "sentenceTypes"
})
@XmlRootElement(name = "sentenceTypes")
public class SentenceTypes {

    @XmlElement(name = "sentenceType", nillable = true)
    protected List<SentenceType> sentenceTypes;

    /**
     * Gets the value of the sentenceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sentenceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSentenceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SentenceType }
     * 
     * 
     */
    public List<SentenceType> getSentenceTypes() {
        if (sentenceTypes == null) {
            sentenceTypes = new ArrayList<SentenceType>();
        }
        return this.sentenceTypes;
    }

}
