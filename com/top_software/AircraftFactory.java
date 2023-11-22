//This is a Singleton !

package com.top_software;

import com.top_software.*;

public class AircraftFactory
{
		private static AircraftFactory	instance = null;
		private long					id;

		private AircraftFactory()
		{
				this.id = 0;
		}

		private long					getId()
		{
				this.id++;
				return (this.id);
		}

		public static AircraftFactory	getInstance()
		{
				if (instance == null)
					instance = new AircraftFactory();
				return instance;
		}

		public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinate)
			throws Exception
		{
				if (p_type == null || p_name == null)
						throw new Exception("Factory error: type or name is null");
				if (p_type.equals("Helicopter"))
						return (new Helicopter(this.getId(), p_name, p_coordinate));
				else if (p_type.equals("JetPlane"))
						return (new JetPlane(this.getId(), p_name, p_coordinate));
				else if (p_type.equals("Baloon"))
						return (new Baloon(this.getId(), p_name, p_coordinate));
				else
						throw new Exception("Factory can only return Helicopter, " +
							"JetPlane or Baloon");
		}
}
