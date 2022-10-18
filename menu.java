package lab_ques;
import java.util.*;
class Node{			
	private int data;
	private Node link;
	
	public Node() {
		link=null;
		data=0;
	}
	
	
	public Node(int d, Node n){
		data = d;	
		link = n;
	}
	
	 
	public void SetLink(Node n){
		link = n;
	}    
	
	public void SetData(int d){
		data = d;
	}    
	
	public Node GetLink(){
		return link;
	}    
	
	public int GetData(){
		return data;
	}
}

class linkedlist{
	private Node start;
	public int size;
	
	
	public linkedlist() {
		start = null;
		size = 0;
	} 
	
	 
	public void insertatfirst(int val) {   
	   Node new_node = new Node(val,null);
	   if(start==null) {
		   start = new_node;
	   }
	   else {
		   new_node.SetLink(start);
		   start=new_node;
	   }
	   return;
	}
	
	//val is data for new node
	public void insertatlast(int val) {
		Node new_node = new Node(val,null);
		Node ptr = start;
		if(start==null) {
			start=new_node;
			return;
		}
		new_node.SetLink(null);
		while(ptr.GetLink()!=null) {
			ptr=ptr.GetLink();
		}
		ptr.SetLink(new_node);
		return;
	}
	
	//no parameter is needed
	public void deletionatfirst() {
		if(start==null) {
			System.out.println("underflow");
			return;
		}
		else {
			start=start.GetLink();
		}
	}
	
	
	public void deletionafter(int val) {
		Node ptr = start; 
		Node pptr ;
		if(start==null) {
			System.out.println("Underflow");
		}
		else {
			while(ptr!=null) {
				if(ptr.GetData()==val) {
					pptr=ptr.GetLink();
					ptr.SetLink(pptr.GetLink());
				}
				ptr=ptr.GetLink();
			}
		}
		return;
	}
	
	public void deletionbefore(int val) {
		Node ptr = start;
		Node pptr = start;
		if(start==null) {
			System.out.println("underflow");
		}
		else {
			while(ptr!=null) {
				if(ptr.GetLink().GetData()==val) {
					pptr.SetLink(ptr.GetLink());
					break;
				}
				pptr=ptr;
				ptr=ptr.GetLink();
			}
		}
		return;
	}
	
}

public class menu{
	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		char ch;
		do {
			System.out.println("Select which operation you want to perform in singlylinklist");
			System.out.println("1. To perform inseration at first node");
			System.out.println("2. To perform insertion at last node");
			System.out.println("3. Insert a node such that Linked List is in ascending order.");
			System.out.println("4. To perform deletion at first node");
			System.out.println("5. To perform deletion before a before node");
			System.out.println("6. To perform deletion after a given node");
			System.out.println("7. To perform traversal of linkedlist");
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int operation = input.nextInt();
			switch (operation){
			case 1:
				System.out.println("Enter the integer data/value which you want to insert in linklist");
				list.insertatfirst(input.nextInt());
				break;
				
			case 2:
				System.out.println("Enter the integer data/value which you want to insert in linklist");
				list.insertatlast(input.nextInt());
				break;
		
			case 3:
				
				break;
				
			case 4:
				System.out.println("Deletion at first is performed");
				list.deletionatfirst();
				break;
		
			case 5:
				System.out.println("Enter the data/value before which you want to delete in linklist");
				list.deletionbefore(input.nextInt());
				break;
				
			case 6:
				System.out.println("Enter the data/value after which you want to delete in linklist");
				list.deletionafter(input.nextInt());
				break;
			
			case 7:
				list.display();
				break;
			}
			
			System.out.println();
			System.out.println("Do you want to continue? Type yes or no");
			ch=input.next().charAt(0);
		
		}while(ch=='y' || ch=='Y');	
	}
}
