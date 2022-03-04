import java.util.*;
public class  listafdelete
{  
    class Node
    {  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) 
        {  
            this.data = data;  
        }  
    }    
    Node head, tail = null;   
    public static void main(String[] args) 
    {  
        Scanner obj = new Scanner(System.in);
        
        listafdelete ob = new listafdelete();   
        ob.addNode(1);  
        ob.addNode(2);  
        ob.addNode(3);  
        ob.addNode(4);  
        ob.addNode(5);  
        ob.display();  
        System.out.println("enter the element to be deleated");
        int item = obj.nextInt();
        ob.delete(item);
        System.out.println("element after  deleted");
        ob.display();  
    }  
    public void addNode(int data) 
    {    
        Node newNode = new Node(data);   
        if(head == null) 
        {    
            head = tail = newNode;    
            head.previous = null;    
            tail.next = null;  
        }  
        else
        {  
            tail.next = newNode;   
            newNode.previous = tail;   
            tail = newNode;  
            tail.next = null;  
        }  
    }  
     public void delete(int item)
     {
        Node current = head;  
        while(current!=null && current.data!=item)
         {
            current = current.next;
         }
        if(current == null)
         {
            System.out.println("the given element is not in the list");
            return;
         }
         else
         {
            if(current.previous == null)
              head= current.next;
            else
             current.previous.next=current.next;
            if(current.next == null)
              tail=current.previous;
            else
              current.next.previous=current.previous;
           
         }   
       }    
        
   
   public void display() 
    {    
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) 
        {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
   
}  
