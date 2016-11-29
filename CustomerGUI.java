import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class CustomerGUI extends JFrame {
  private JPanel customer;
  private JFrame frame;
  private JTextField forenamefield, surnamefield, addressfield, telephonefield;
  private JLabel forename,surname,address,telephone;
  private JButton register;
    
    
   
    
   public static void AddCustomer(ArrayList<Customers> custs)
   { 
  // AddCustomer = new AddCustomer();
  //  AddCustomer.build();
    
    	frame = new JFrame("Customers ");
 		frame.getContentPane().setBackground(Color.gray);
 		frame.setSize(500,300);
 		frame.setLocation(500,300);
 		frame.setLayout(null);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
    	
    	//customer = new JPanel();
    	//customer.setBackground(Color.gray);
    	
    	//register = new JButton("Register");
    	//forename = new JLabel("Forename");
    	//surname =  new JLabel ("Surname");
    	//address =  new JLabel("Address");
    	//telephone = new JLabel("Telephone");
    	
        forename = new JLabel("Enter Customer's Forename:");
 	    forename.setSize(30,10);
 	    forename.setLocation(10,10);
 	    
 	    forenamefield = new JTextField();
 	    forenamefield.setColumns(15);
 	    forenamefield.setSize(150,20);
 	    frame.add(forenamefield);
 	    forenamefield.setLocation(110,10);
 
   
   	    surname = new JLabel("Enter Customer's Surname:");
 	    surname.setSize(300,100);
 	    surname.setLocation(10,30);
 	
 	    surnamefield = new JTextField();
 	    surnamefield.setColumns(15);
 	    surnamefield.setSize(150,20);
 	    frame.add(surnamefield);
 	    surnamefield.setLocation(110,40);
 
        address = new JLabel("Enter Customer's Address:");
 	    address.setSize(30,10);
 	    address.setLocation(10,10);
 	
 	    addressfield = new JTextField();
 	    addressfield.setColumns(15);
 	    addressfield.setSize(150,60);
 	    frame.add(addressfield);
 	    addressfield.setLocation(110,70);
    
    
        telephone = new JLabel("Enter Customer's Telephone:");
 	    telephone.setSize(30,10);
 	    telephone.setLocation(10,10);
 	
 	    telephonefield = new JTextField();
 	    telephonefield.setColumns(15);
 	    telephonefield.setSize(150,20);
 	    frame.add(telephonefield);
 	    telephonefield.setLocation(110,140);
    
        register = new JButton("Register");
        register.setSize(95,40);
        register.setLocation(140,180);
        //put listener on button
         
        frame.add(register);
 
    	
    	frame.add(forename);
    	frame.add(surname);
    	frame.add(address);
    	frame.add(telephone);
    	frame.add(register);
    	frame.add(customer);
    	
        frame.setVisible(true);
    	 	
    }
    
    //event-handling code here
    
    //when button pressed grab all details from text-field
    //and then create a new Customer object using Customer constructor
    //and then add the new Custiomer object to array list
    
 public static void main(String[] args){
 	new CustomerGUI();
 } 
 	 
}