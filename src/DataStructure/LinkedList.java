package DataStructure;
/**
 *
 * @author yasiru
 */
public class LinkedList 
{
    private ListNode head;//create headNode

    public void add(Contact contact)//LinkedList add method
    {
        if (head == null) //check headNode avalibility
        {
            head = new ListNode(contact, null);//set contact and nextNode(Next reference) to headNode
        } 
        else 
        {
            ListNode current = head;//if head is not null then,create current node and equal to head value
            while (current.getNext() != null) //while loop to check end place of linkedlist
            {
                current = current.getNext();
            }
            current.setNext(new ListNode(contact, null));//set contact and nextNode(Next reference) to current
        }
    }

    public void delete(String name) //LinkedList delete method
    {
        if (head == null)//find avaliability of headNode
        {
            return;
        }
        if (head.getContact().getName().equals(name))//if headnode is avaliable then check it matches for contact that received for delete method
        {
            head = head.getNext();//update headNode with newNode
            return;
        }
        //if head is not null or the received contact is not equal to headnode,then create current node and equal to head value
        ListNode current = head;
        
        //check until get current nodes' nextnode is not empty and current nodes' nextnode is not equal to contact that received for delete method 
        while (current.getNext() != null && !current.getNext().getContact().getName().equals(name)) 
        {                                                                                           
            current = current.getNext();//set current is equal to current nodes' nextnode in loop         
        }
        if (current.getNext() != null)//check availability of currentNodes' nextnode and it is not equal to null(It means Filled vith value) 
        {
            current.setNext(current.getNext().getNext());//then set currents nextNode with nextNode's nextnode 
        }
    }

    public Contact find(String name)//Linked List find method 
    {
        ListNode current = head; //create current node and it equals to current
        while (current != null) //run will loop until current is equal to null value
        {
            if (current.getContact().getName().equals(name)) //find current contact no is equal to received contact number to search
            {
                return current.getContact(); //if find contact which is match to received name,then return current node's contact no
            }
            current = current.getNext(); //set current node with currents' nextnode 
        }
        return null;
    }
    
}
