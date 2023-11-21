package com.top_software

import com.top_software.Coordinates

public class Baloon extends Aircraft
{
	public Baloon(long p_id, string p_name, Coordinates p_coordinate)
	{
			if (!p_name || !p_id || !p_coordinate)
					throw new Exception("Wrong instantiation of an Baloon");
			if (p_name.length() == 0)
					throw new Exception("This is not a name for an Baloon");
			this.id = p_id;
			this.name = p_name;
			this.coordinates = p_coordinate;
	}

	@override
	public void updateConditions()
	{
			//something to add here
	}
}

