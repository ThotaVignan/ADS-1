import java.util.*;
class Solution
{
	public static void main(String[] args) {
	Operations op = new Operations();
	Scanner ip = new Scanner(System.in);
	String n = ip.nextLine();
	for(int i = 0; i<Integer.parseInt(n); i++)
	{
		while(ip.hasNext())
		{
			String input[] = ip.nextLine().split(" ");
			switch(input[0])
			{
				case "push":
					op.insert_Starting(Integer.parseInt(input[1]));
					break;

				case "pop":
					op.delete_starting();
					break;

				case "enqueue":
					op.insert_ending(Integer.parseInt(input[1]));
					break;
			}

		}
		op.head = null;
		System.out.println("\n");
	}
		
	}

}