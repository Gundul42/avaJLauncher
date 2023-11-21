package com.top_software

import com.top_software.WeatherTower

abstract class Flyable
{
		protected WeatherTower weatherTower;

		public abstract void	updateConditions()
		{}

		public void				registerTower(WeatherTower p_tower)
		{
				if (!p_tower)
						throw new Exeption("You cannot register a nil WeatherTower");
				this.weatherTower = p_tower;
		}
}
