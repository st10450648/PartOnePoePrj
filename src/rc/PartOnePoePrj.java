/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class PartOnePoePrj {

    static Register objRegister = new Register();
    
    public static void main(String[] args) {
        
         getUserInput();
        
    }
    
    //asking users to input their details
    public static void getUserInput(){
        objRegister.setFirstName(JOptionPane.showInputDialog("Please enter your first name"));
        objRegister.setLastName(JOptionPane.showInputDialog("Please enter your last name"));
        objRegister.setUserName(JOptionPane.showInputDialog("Please enter your user name, username must contain an underscore"));
        objRegister.setPassword(JOptionPane.showInputDialog("Please enter password,password must start with a lowercase followed by an uppercase followed by any number from 1 to 9 lastly any of these special charecters(*&^%$#@!|?/)"));
        
     //loop to repeat asking user to compile a username within parameters
        while (!isTrue(objRegister.userName)){
            JOptionPane.showMessageDialog(null,"Invalid username! username must contain an underscore");
         objRegister.userName = JOptionPane.showInputDialog("enter username");
        }
        JOptionPane.showMessageDialog(null,"username success!");
        
      //loop to repeat asking user to compile a password within parameters
        while (!isCorrect(objRegister.password)){
            JOptionPane.showMessageDialog(null,"Invalid password! password must start with a lowercase followed by an uppercase followed by any number from 1 to 9 lastly any of these special charecters(*&^%$#@!|?/)");
         objRegister.password = JOptionPane.showInputDialog("enter password");
        }
        JOptionPane.showMessageDialog(null,"password success!");
        
    }
    
    // matcher and pattern methods for determining if password and username is up to standards
    public static boolean isTrue (String userName){
        
        Pattern a = Pattern.compile("_");
        Matcher b = a.matcher(userName);
        
        return b.find();
        
    }
    
    public static boolean isCorrect (String password){
        
        Pattern c = Pattern.compile("([a-z][A-Z][1-9][*&^%$#@!|?/])");
        Matcher d = c.matcher(password);
        
        return d.find();
        
    }
    
    
    
    
 
    
}
