import java.util.*;
class Solution
{
	public static void main(String[] args) {
	Operations op = new Operations();
	Scanner ip = new Scanner(System.in);
	int n = ip.nextInt();
	for(int i = 0; i<n; i++)
	{
		while(ip.hasNextLine())
		{
			String input[] = ip.nextLine().split(" ");
			switch(input[0])
			{
				case "push":
					op.insert_Starting(Integer.parseInt(input[1]));
					op.PrintList();
					break;

				case "pop":
					op.delete_starting();
					op.PrintList();
					break;

				case "enqueue":
					op.insert_ending(Integer.parseInt(input[1]));
					op.PrintList();
					break;
			}

		}
	}
		
	}

}