package com.top_software

import java.util.ArrayList


public class Tower
{
		Tower()
		{
				this.observers = new ArrayList<>;
		}

		private List<Flyable> observers;

		public void register(Flyable p_flyable)
		{
				if (!p_flyable)
						throw new Exception("Tried to register nil as flyable to tower");
				if (!observers.add(p_flyable))
						throw new Exception("Could not register flyable to tower");
		}

		public void unregister(Flyable p_flyable)
		{
				if (!p_flyable)
						throw new Exception("Tried to unregister a nil from tower");
				if (!observers.remove(p_flyable))
						throw new Exception("This flyable is not registered at the tower");

		protected void conditionChanged()
		{
				//change whatever conditions
		}
}
