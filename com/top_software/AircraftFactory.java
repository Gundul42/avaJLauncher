package com.top_software;

public class AircraftFactory
{
		private static AircraftFactory	instance = null;
		private long					id;

		private AircraftFactory()
		{
				id = 0;
		}

		private long					getId()
		{
				id++;
				return (id);
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
						throw new Exception("Error: AircraftFactory: type or name is null");
				if (p_type.equals("Helicopter"))
						return (new Helicopter(getId(), p_name, p_coordinate));
				else if (p_type.equals("JetPlane"))
						return (new JetPlane(getId(), p_name, p_coordinate));
				else if (p_type.equals("Baloon"))
						return (new Baloon(getId(), p_name, p_coordinate));
				else
						throw new Exception("Error: AircraftFactory: " +  p_type +
							" is an unknown Aircraft");
		}
}
