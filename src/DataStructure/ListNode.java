package DataStructure;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yasiru
 */
public class ListNode 
{
    private Contact contact;//contact type object for store data
    private ListNode next; //Listnaode type object for store nextnode

    public ListNode(Contact contact, ListNode next) //parameterized constructor
    {
        this.contact = contact; //
        this.next = next;
    }

    public Contact getContact() //return contact
    {
        return contact;
    }

    public ListNode getNext() //return next node
    {
        return next;
    }

    public void setNext(ListNode next) //set values for next node
    {
        this.next = next;
    }
    
}
