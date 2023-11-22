package com.top_software;

public class WeatherProvider
{
		private WeatherProvider()
		{}

		private static WeatherProvider	instance = new WeatherProvider();
		private String[]				weather = {"RAIN", "FOG", "SUN", "SNOW"};

		public String getCurrentWeather(Coordinates p_coordinates)
		{
			//return weather as string
			return "SNOW";
		}

		public static WeatherProvider getInstance()
		{
				return instance;
		}
}
