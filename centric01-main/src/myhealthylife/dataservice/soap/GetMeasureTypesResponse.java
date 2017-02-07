
package myhealthylife.dataservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMeasureTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMeasureTypesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measureTypes" type="{http://soap.dataservice.myhealthylife/}measureTypeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMeasureTypesResponse", propOrder = {
    "measureTypes"
})
public class GetMeasureTypesResponse {

    protected MeasureTypeList measureTypes;

    /**
     * Gets the value of the measureTypes property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureTypeList }
     *     
     */
    public MeasureTypeList getMeasureTypes() {
        return measureTypes;
    }

    /**
     * Sets the value of the measureTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureTypeList }
     *     
     */
    public void setMeasureTypes(MeasureTypeList value) {
        this.measureTypes = value;
    }

}
