package myhealthylife.centric1.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="weatherSentence")
public class WeatherSentence {

	
	private Long idWeatherSentence;
	
	private String url;
	
	private Float weatherCode;

	private String textWeather;
	
	private String textSentence;
	
	private String city;
	
	private String precipitation;
	
	private Float temperature;
	
	private Float windSpeed;
	
	private String windDirection;
	
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
	public Float getWeatherCode() {
		return weatherCode;
	}

	/**
	 * @param weatherCode the weatherCode to set
	 */
	public void setWeatherCode(Float weatherCode) {
		this.weatherCode = weatherCode;
	}

	/**
	 * @return the textWeather
	 */
	public String getTextWeather() {
		return textWeather;
	}

	/**
	 * @param textWeather the textWeather to set
	 */
	public void setTextWeather(String textWeather) {
		this.textWeather = textWeather;
	}

	/**
	 * @return the textSentence
	 */
	public String getTextSentence() {
		return textSentence;
	}

	/**
	 * @param textSentence the textSentence to set
	 */
	public void setTextSentence(String textSentence) {
		this.textSentence = textSentence;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the precipitation
	 */
	public String getPrecipitation() {
		return precipitation;
	}

	/**
	 * @param precipitation the precipitation to set
	 */
	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}

	/**
	 * @return the temperature
	 */
	public Float getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the windSpeed
	 */
	public Float getWindSpeed() {
		return windSpeed;
	}

	/**
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(Float windSpeed) {
		this.windSpeed = windSpeed;
	}

	/**
	 * @return the windDirection
	 */
	public String getWindDirection() {
		return windDirection;
	}

	/**
	 * @param windDirection the windDirection to set
	 */
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	
}
