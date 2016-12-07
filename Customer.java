/*This class is the Customer class, from here, the code is entered to add a new customer, view an registered customer, 
 *update a current customers details and view a current customer*/

/**This is an instantiable Customer class.
 @author Liam McGovern
 @version 1.0 */ 

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.text.*;
//import java.util.*;
//import java.io.*;

public class Customer {
    //attributes
	private String forename;
   	private String surname;
   	private String address;
	private double telephone;
    
    /** multiple argument constructor method
	 @param forename the first name of the Customer
	 @param surname the surname of the Customer
	 @param address the address of the Customer
	 @param telephone the telphone number of the Customer */
	public  Customer( String forename,String surname, String address, double telephone ){
	    this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
	}
	/** single argument constructor method
	 @param forename the forename, surname, address and telephone of the Customer */
	public  Customer( String forename ){
		forename = forename;
		surname = surname;
		address = address;
		telephone = telephone;
	}
	/** single argument constructor method
	 @param forename the forename, surname, address and telephone of the Customer */
	public  Customer( ){
		forename = "Forename";
		surname = "Surname";
		address = "Address";
	}
	
	/** mutator method to set the Customers forename
	 *@param forename the forename of the Customer */

	public void setForename(String forename){
		forename = forename;
	}

     /** mutator method to set the Customers surname
	 *@param surname the surname of the Customer */	
	public void setSurname(String surname){
		surname = surname;
	}
	/** mutator method to set the Customers address
	 *@param address the address of the Customer */
	public void setAddress(String address){
		address = address;
	}
	
	/** mutator method to set the Customers telephone number
	 *@param telephone the telephone number of the Customer */
	public void setTelephone(double telephone){
		telephone = telephone;
	}
	
	/** acessor method to return the Customer forename
	 *@return forename the forename of the Customer */

	public String getForename(){
	  return forename;	
	}
	
	/** acessor method to return the Customer surname
	 *@return surname the surname of the Customer */
	public String getSurname(){
	  return surname;	
	}
	
	/** acessor method to return the Customer address
	 *@return address the address of the Customer */
	public String getAddress(){
		return address;
	}
	
	/** acessor method to return the Customer telephone number
	 *@return telephone the telephone number of the Customer */
	public double getTelephone(){
	  return telephone;	
	}
	/** toString method to return the Customer details
	 *@return forename + " " + surname + " " + address + " " + telephone the forename, surname, address and telephone number of the Customer as a string */

	public String toString() {
		return "Forename: " + forename + " " + "\nSurname: " + surname + " " +"\nAddress: " + address + " " + "\nTelephone: " + telephone;
	}

      
     public static void main(String[] args)
     {
     	new Customer();
     }
}//end class	 
   
    
    
    
