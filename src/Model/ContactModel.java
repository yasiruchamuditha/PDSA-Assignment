/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DataStructure.Contact;
import DataStructure.LinkedList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class ContactModel
{
    private static final LinkedList phoneBook = new LinkedList(); //create Linkedlist class object
    
    public static boolean M_AddContact(String name,String phonenumber) //Model Method for Add Contact
    {
          boolean result=true;
          boolean isSucces=true;
          Contact contact = phoneBook.find(name); // find received contact is not stored in the LinkedList
          result=Model.ContactModel.M_Search(name);
          if(contact == null && result ==false) 
          {
            Contact contact1 = new Contact(name, phonenumber); 
            phoneBook.add(contact1); //Add contact to LinkedList
            isSucces=true;
            try//Add Contact to database
            {
                Statement st=dbConnection.createDbConnection().createStatement();
                int row_count=st.executeUpdate("insert into contact values('"+name+"','"+phonenumber+"')");
                if(row_count>0)
                {
                 isSucces=true;   
                } 
                else
                {
                 isSucces=false;
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
          }
          else 
          {
             isSucces=false;
          }
          return isSucces;
    }

    public static String M_ViewContact(String name)//Model Method for View Contact
    {
     String ContactNo=null;
     String phonenumber=null;
     Contact contact = phoneBook.find(name); //find the Contact in Linked list
     ContactNo=Model.ContactModel.M_SearchContactNo(name);
     if(contact == null || ContactNo == null ) 
     {
            phonenumber=null;
     }
     else if(contact != null)
     {
            phonenumber=contact.getPhoneNumber(); //set phonenumber
     }
     else if(ContactNo != null)
     {
         phonenumber=ContactNo;
     }
     return phonenumber;
    }

    public static boolean M_DeleteContact(String name) //Model Method for Delete Contact
    {
          boolean isSucces=true;
          Contact contact = phoneBook.find(name); //find Contact before Delete contact
          if(contact == null) 
          {
            isSucces=false;
          }
          else 
          {
            phoneBook.delete(name); //if contact is available then delete it
            isSucces=true;
             try//delete Contact from database
            {
                Statement st=dbConnection.createDbConnection().createStatement();
                int row_count=st.executeUpdate("delete from contact where name='"+name+"' ");
                if(row_count>0)
                {
                 isSucces=true;   
                } 
                else
                {
                 isSucces=false;
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
          }
          return isSucces;
    }
    
    public static boolean M_Search(String name)//method for search phone number is avalable
    {
        boolean isValid=true;
          try
          {
            Statement st=dbConnection.createDbConnection().createStatement();
            String sql="Select * from contact where name='"+name+"' ";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                isValid=true;
            }
            else
            {
                isValid=false;
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
          return isValid;
    }
    
     public static String M_SearchContactNo(String name)//method for get contact no
     {
        String phoneNo=null;
          try
          {
            Statement st=dbConnection.createDbConnection().createStatement();
            String sql="Select * from contact where name='"+name+"' ";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                   phoneNo = rs.getString("ContactNo");
            }
            else
            {
                   phoneNo=null;
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
          return phoneNo;
    }
}
