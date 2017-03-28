
package myhealthylife.dataservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMeasureHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMeasureHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measureHistory" type="{http://soap.dataservice.myhealthylife/}measureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMeasureHistoryResponse", propOrder = {
    "measureHistory"
})
@XmlRootElement(name = "getMeasureHistoryResponse")
public class GetMeasureHistoryResponse {

    protected MeasureHystory measureHistory;

    /**
     * Gets the value of the measureHistory property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureHystory }
     *     
     */
    public MeasureHystory getMeasureHistory() {
        return measureHistory;
    }

    /**
     * Sets the value of the measureHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureHystory }
     *     
     */
    public void setMeasureHistory(MeasureHystory value) {
        this.measureHistory = value;
    }

}
