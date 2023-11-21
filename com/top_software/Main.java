package	com.top_software;

import com.top_software.*;

public class Main
{
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
			System.exit(0);
	}
}
