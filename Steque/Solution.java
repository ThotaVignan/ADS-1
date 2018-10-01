import java.util.*;
class Node
{
	int data;
	Node adress;
	Node(int val)
	{
		data = val;
		adress = null;
	}
}
class Operations
{
	Node head = null;
	Node tail = null;
	static int count = 0;

	public void insert_Starting(int val)
	{
		count++;
		Node node = new Node(val);
		if(head == null)
		{
			tail = node;
		}
		node.adress=head;
		head = node;
		PrintList();
	}
	public void insert_ending(int val)
	{
		count++;
		Node node = new Node(val);
		if(head == null)
		{
			head = node;
			tail = node;
			PrintList();
			return;
		}
		tail.adress = node;
		tail = tail.adress;
		PrintList();
	}
	public void delete_starting()
	{
		if(count == 0)
		{
			System.out.println("Steque is empty.");
			return;
		}
		count--;
		head = head.adress;
		if(count == 0)
		{
			System.out.println("Steque is empty.");
			return;
		}
		PrintList();
		
	}
	public void delete_Ending()
	{
		count--;
		Node temp = head;
		while(temp.adress.adress != null)
		{
			temp = temp.adress;
		}
		temp.adress = null;
	}
	public void PrintList()
	{
		Node temp = head;
		if(count>2)
		{
			while(temp.adress!=null)
			{
				System.out.print(temp.data+", ");
				temp = temp.adress;
			}
			System.out.println(temp.data);

		}
		if(count == 1)
		{
			System.out.println(temp.data);
		}
		
	}
}

class Solution
{
	public static void main(String[] args) {
	Operations op = new Operations();
	Scanner ip = new Scanner(System.in);
	String n = ip.next();
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
		op.tail = null;
		System.out.println("\n");
	}
		
	}

}