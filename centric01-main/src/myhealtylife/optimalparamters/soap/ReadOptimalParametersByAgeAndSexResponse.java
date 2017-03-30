
package myhealtylife.optimalparamters.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readOptimalParametersByAgeAndSexResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readOptimalParametersByAgeAndSexResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametersList" type="{http://soap.optimalparamters.myhealtylife/}parametersList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readOptimalParametersByAgeAndSexResponse", propOrder = {
    "parametersList"
})
@XmlRootElement(name = "readOptimalParametersByAgeAndSexResponse")
public class ReadOptimalParametersByAgeAndSexResponse {

    protected ParametersList parametersList;

    /**
     * Gets the value of the parametersList property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersList }
     *     
     */
    public ParametersList getParametersList() {
        return parametersList;
    }

    /**
     * Sets the value of the parametersList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersList }
     *     
     */
    public void setParametersList(ParametersList value) {
        this.parametersList = value;
    }

}
