package	com.top_software;

import com.top_software.*;
import java.io.*;
import java.util.ArrayList;

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
			System.out.println(nextLine);
		}
		return output;
	}


	public static void main(String[] args)
	{
			if (args.length != 1)
			{
					if (args.length < 1)
					{
						System.out.println("Error: You need to specify the path and name of your scenario file");
						System.exit(1);
					}
					else
					{
						System.out.println("Error: Too many arguments");
						System.exit(1);
					}
			}
			System.out.println("Yeah, open and read now " + args[0]);
			try
			{
				readScenarioFile(args[0]);
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.exit(1);
			}
			System.exit(0);
	}
}
