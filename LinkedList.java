import java.util.Scanner;

public class LinkedList
{	
	// CREATING LINKEDLIST CLASS HAVING DATA AND NEX
	public class Node 
	{
		String data;
		Node next;
	}
	Node head;
	Node tail;
// CONSTRUCTOR IS CREATED
	public LinkedList() 
	{
		this.tail = null;
	}
public void insertAtLast(String data1)
{
	Node node = new Node();
	// IF LINKEDLIST IS EMPTY CREATE NEW ONE
	if (head == null) 
	{
		node.data = data1;
		node.next = null;
		head = node;
		tail = node;
	} 
	else 
	{
		node.data = data1;
		tail.next = node;
		node.next = null;
		tail = node;
	}
}
//INSERTING THE ELEMENT IN NODE AT START
public void insertAtStart(String data1) 
{
	Node node = new Node();
	// IF THE LINKEDLIST IS EMPTY CREATE A NEW ONE
	if (head == null) 
	{
		node.data = data1;
		node.next = null;
		head = node;
		tail = node;
	} 
	else 
	{
		node.data = data1;
		node.next = head;
		head = node;
	}
}		   
// PRINTING THE LINKEDLIST
public void displayFromStart() 
{			       
Node node = head;
	while (node != null)
	{			       
		System.out.println(node.data + "  ");
		node = node.next;
	}
}
public  void isEmpty()
{
	Node node = new Node();
	if (head == null) 
	{
		System.out.println("Linkedlist is empty");
	}
}
// Deleting node from start of the linklist
public void deleteFromStart() 
{
	Node node = new Node();
	if (head == null)
	{
		isEmpty();
	}
	else 
	{
		head = head.next;
	}
}
// deleting node from last of the linklist
public void pop()
{
	try 
	{
		Node node = new Node();
		if (head == null) 
		{
			isEmpty();
        } 
		else 
		{
			node = tail;
			while (node.next != head)
			{
				node = node.next;
			}
			node.next = null;
			head = node;
		}
	} 
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
// Size of Function
public  int size()
{
	int count=0;
	Node node =head;
	while( node.next != null)
	{
		node=node.next;
		count++;
	}
	System.out.println("size of Linked List :"+count);
	return count;
}
// Serching of a Word Function
public void searchData()
{ 
	Scanner sc=new Scanner(System.in);
	Node node = head;
	int count=0;
	System.out.println("Enter a String to Search");
	String s = sc.next();
	int flag=0;
	while(node.next != null)
	{
		count++;
		if( node.data.equals(s))
		{			                
			System.out.println(" String is found At "+count);
			System.out.println("Data Found");
			deleteFromStart();
			flag=1;
		}
		node=node.next;
		}
	if(flag == 0)
	{
		System.out.println("Data not found");
	}
	else
	{
		insertAtLast(sc.next());
		System.out.println("After Adding a List :");
		displayFromStart();
	}
} 
// CONVERTING THE LINKED TO STRING
public String toString() 
{
	Node node = head;
	String string = "";
	while (node.next != null)
	{
		string += node.data;
		string += " ";
		node = node.next;
	}
	return string;
	}
}
