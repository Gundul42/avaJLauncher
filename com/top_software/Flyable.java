package com.top_software;

import com.top_software.*;

abstract class Flyable
{
		protected WeatherTower weatherTower;

		public abstract void	updateConditions();

		public void				registerTower(WeatherTower p_tower) throws Exception
		{
				if (p_tower == null)
						throw new Exception("You cannot register a NULL WeatherTower");
				this.weatherTower = p_tower;
		}
}
