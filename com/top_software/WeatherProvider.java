//This is a Singleton !

package com.top_software;

import com.top_software.*;

public class WeatherProvider
{
		private WeatherProvider()
		{}

		private static		WeatherProvider instance = new WeatherProvider;
		private String[]	weather;

		public String		getCurrentWeather(Coordinates p_coordinates)
		{
				//return weather as string
		}

		public static		getInstance()
		{
				return this.instance;
		}
}
