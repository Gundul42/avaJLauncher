//This is a Singleton !

package com.top_software

import com.top_software.Coordinates

public class WeatherProvider
{
		private WeatherProvider()
		{}

		private static		WeatherProvider instance = new WeatherProvider;
		private string[]	weather;

		public string		getCurrentWeather(Coordinates p_coordinates)
		{
				//return weather as string
		}

		public static		getInstance()
		{
				return this.instance;
		}
}
