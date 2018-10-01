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
			PrintList();
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
class linkedlist
{
	public static void main(String[] args) {
		Operations op = new Operations();
		// op.insert_Starting(5);
		// op.insert_Starting(6);
		// op.insert_Starting(7);
		// op.insert_Starting(8);
		// op.insert_ending(10);
		// op.insert_ending(11);
		// op.insert_ending(12);
		// op.delete_Ending();
		// op.delete_starting();
		// op.PrintList();
		// System.out.println(op.count);
	}
}
