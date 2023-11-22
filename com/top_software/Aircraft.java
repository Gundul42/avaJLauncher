package com.top_software;

import com.top_software.*;

public class Aircraft extends Flyable
{
		protected long			id;
		protected String		name;
		protected Coordinates	coordinates;

		protected Aircraft(long p_id, String p_name, Coordinates p_coordinate) throws Exception
		{
				if (p_name == null || p_coordinate == null)
						throw new Exception("Wrong instantiation of an Aircraft");
				if (p_name.length() == 0)
						throw new Exception("This is not a name for an Aircraft");
				this.id = p_id;
				this.name = p_name;
				this.coordinates = p_coordinate;
		}

		public void updateConditions()
		{}
}
