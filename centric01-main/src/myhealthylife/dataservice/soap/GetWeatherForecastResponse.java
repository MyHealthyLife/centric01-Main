
package myhealthylife.dataservice.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWeatherForecastResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWeatherForecastResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weatherForecast" type="{http://soap.dataservice.myhealthylife/}current_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeatherForecastResponse", propOrder = {
    "weatherForecast"
})
@XmlRootElement(name = "getWeatherForecastResponse")
public class GetWeatherForecastResponse {

    protected Current weatherForecast;

    /**
     * Gets the value of the weatherForecast property.
     * 
     * @return
     *     possible object is
     *     {@link Current }
     *     
     */
    public Current getWeatherForecast() {
        return weatherForecast;
    }

    /**
     * Sets the value of the weatherForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Current }
     *     
     */
    public void setWeatherForecast(Current value) {
        this.weatherForecast = value;
    }

}
