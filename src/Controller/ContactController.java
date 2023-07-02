/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class ContactController {
    
    public static boolean C_AddContact(String name,String phonenumber){
        boolean istrue;
        istrue=Model.ContactModel.M_AddContact(name, phonenumber);
        return istrue;
    }
    
    public static String C_ViewContact(String name){
        String phonenumber=null;
        phonenumber=Model.ContactModel.M_ViewContact(name);
        return phonenumber;
    }
    
    public static boolean C_DeleteContact(String name){
        boolean istrue;
        istrue=Model.ContactModel.M_DeleteContact(name);
        return istrue;
    }
    
}
