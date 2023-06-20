package DataStructure;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yasiru
 */
public class Contact {
    private String name; //for contact name
    private String phoneNumber; //for contact no

    public Contact(String name, String phoneNumber)//parameterized constructor
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() //this method return contact name
    {
        return name;
    }

    public String getPhoneNumber() //this method return contact no
    {
        return phoneNumber;
    }
    
}
