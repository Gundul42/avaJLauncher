package	com.top_software;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class AvajLauncher
{
	private static ArrayList<String> readScenarioFile(String fname) throws Exception
	{
		File				file = new File(fname);
		ArrayList<String>	output = new ArrayList<String>();
		BufferedReader		br = new BufferedReader(new FileReader(file));
		String				nextLine;

		while ((nextLine = br.readLine()) != null)
		{
			output.add(nextLine);
		}
		return output;
	}
	
	private static void checkArgs(String[] args)
	{
		if (args.length != 1)
		{
				if (args.length < 1)
				{
						System.out.println("Error: You need to specify the path" + 
						" and name of your scenario file");
					System.exit(1);
				}
				else
				{
					System.out.println("Error: Too many arguments");
					System.exit(1);
				}
		}
	}

	private static Integer validateScenarioFile(ArrayList<String> file) throws Exception
	{
			Iterator	it = file.iterator();
			String		line = null;
			int			i = 0;
			Integer		iterations = null;
			String[]	newVehicle = null;
			Aircraft	flyable = null;
			AircraftFactory	factory = AircraftFactory.getInstance();
			Coordinates		coords = null;

			if (file.size() < 2)
				throw new Exception("Error: Scenario file: you need at least one vehicle");
			while (it.hasNext())
			{
				line = (String) it.next();
				if (i == 0)
				{
					iterations = Integer.parseInt(line);
					if (iterations < 1)
						throw new Exception("Error: Scenario file: Line 0 must hold" +
							" a positive number");
					i++;
					continue;
				}
				newVehicle = line.split(" ");
				if (newVehicle.length != 5)
					throw new Exception("Error: Scenario file: in line " + i);
				coords = new Coordinates(
					Integer.parseInt(newVehicle[2]),
					Integer.parseInt(newVehicle[3]),
					Integer.parseInt(newVehicle[4])
				);
				flyable = (Aircraft) factory.newAircraft(newVehicle[0], newVehicle[1], coords);
				i++;
				System.out.println(line + " : " + flyable.getId());
			}
			return (iterations);
	}



	public static void main(String[] args)
	{
			ArrayList<String>	scenario = null;

			checkArgs(args);
			try
			{
				scenario = readScenarioFile(args[0]);
				validateScenarioFile(scenario);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.exit(1);
			}
			System.exit(0);
	}
}
