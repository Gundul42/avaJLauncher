//This is a Singleton !

package com.top_software

import com.top_software.Coordinates
import com.top_software.Helicopter
import com.top_software.JetPlane
import com.top_software.Baloon

public class AircraftFactory
{
		private AircraftFactory()
		{
				this.id = 0;
		}

		private static AircraftFactory	instance = new AircraftFactory;
		private long					id;

		private long					getId()
		{
				this.id++;
				return (this.id);
		}

		public static		getInstance()
		{
				return this.instance;
		}

		public Flyable newAircraft(string p_type, string p_name, Coordinates p_coordinate)
		{
				if (p_type == nil || p_name == nil)
						throw new Exception("Factory error: type or name is nil");
				if (p_type.equals("Helicopter"))
						return (new Helicopter(this.getId(), p_name, p_coordinate));
				elseif (p_type.equals("JetPlane"))
						return (new JetPlane(this.getId(), p_name, p_coordinate));
				elseif (p_type.equals("Baloon"))
						return (new Baloon(this.getId(), p_name, p_coordinate));
				else
						throw new Exception("Factory can only return Helicopter, JetPlane or Baloon");
		}
}
