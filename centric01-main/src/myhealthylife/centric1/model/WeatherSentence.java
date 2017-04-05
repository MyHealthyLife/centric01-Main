package myhealthylife.centric1.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="weatherSentence")
public class WeatherSentence {

	
	private Long idWeatherSentence;
	
	private String text;
	
	private String url;
	
	private Float weatherCode;

	/**
	 * @return the idWeatherSentence
	 */
	public Long getIdWeatherSentence() {
		return idWeatherSentence;
	}

	/**
	 * @param idWeatherSentence the idWeatherSentence to set
	 */
	public void setIdWeatherSentence(Long idWeatherSentence) {
		this.idWeatherSentence = idWeatherSentence;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the weatherCode
	 */
	private Float getWeatherCode() {
		return weatherCode;
	}

	/**
	 * @param weatherCode the weatherCode to set
	 */
	private void setWeatherCode(Float weatherCode) {
		this.weatherCode = weatherCode;
	}
	
}
