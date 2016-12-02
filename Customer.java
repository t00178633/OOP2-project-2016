/*This class is the Customer class, from here, the code is entered to add a new customer, view an registered customer, 
 *update a current customers details and view a current customer*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class Customer {

//	private String addCustomer;
//	private String removeCustomer;
//	private String updateCustomer;
//	private String viewCustomer;
	private String forename;
   	private String surname;
   	private String address;
	private double telephone;

	 
	// public void addCustomer(){
      //	Customer cust = new Customer();
      	//cust.setforename(JOptionPane.showInputDialog("Forename:"));
      	//cust.setsurname(JOptionPane.showInputDialog("Surname:"));
      	//cust.settelephonename(JOptionPane.showInputDialog("Telephone:"));
      	//cust.add(cust);
      
	public  Customer( String forename,String surname, String address, double telephone ){
		forename = "";
		surname = "";
		address ="";
		telephone = telephone;
	}
	
	public  Customer( String forename ){
		forename = forename;
		surname = surname;
		address = address;
		telephone = telephone;
	}
	
	public  Customer( ){
		forename = "Forename";
		surname = "Surname";
		address = "Address";
	}
	
	public void setForename(String forename){
		forename = forename;
	}
	
	public void setSurname(String surname){
		surname = surname;
	}
	
	public void setAddress(String address){
		address = address;
	}
	
	public void setTelephone(double telephone){
		telephone = telephone;
	}
	
	public String getForename(){
	  return forename;	
	}
	
	public String getSurname(){
	  return surname;	
	}
	
	public String getAddress(){
		return address;
	}
	
	public double getTelephone(){
	  return telephone;	
	}
	
	public String toString() {
		return forename + " " + surname + " " + address + " " + telephone;
	}

      
     public static void main(String[] args)
     {
     	new Customer();
     }
}	 
   
    
    
    
