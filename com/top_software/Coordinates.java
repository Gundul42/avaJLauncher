package com.top_software;

public class Coordinates
{
		private int		longitude;
		private int		latitude;
		private int		height;

		Coordinates(int p_longitude, int p_latitude, int p_height)
			throws Exception
		{
				if (p_longitude < 0 || p_latitude < 0 || p_height < 0)
					throw new Exception("Error: Coordinates must be >= 0");

				this.longitude = p_longitude;
				this.latitude = p_latitude;
				setHeight(p_height);

		}

		public int getLongitude()
		{
				return this.longitude;
		}

		public int getLatitude()
		{
				return this.latitude;
		}

		public int getHeight()
		{
				return this.height;
		}

		public void setLongitude(int value)
		{
			this.longitude = value;
		}

		public void setLatitude(int value)
		{
			this.latitude = value;
		}

		public void setHeight(int value)
		{
			// requirements is height cannot be larger than 100
			this.height = value > 100 ? 100 : value;
		}
}
