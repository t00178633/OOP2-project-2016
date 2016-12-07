/*This class is the Customer class, from here, the code is entered to add a new customer, view an registered customer, 
 *update a current customers details and view a current customer*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class Repair {


	private String forename;
   	private String surname;
	private String address;
	private String partname;

      
	public  Repair( String forename,String surname, String address, String partname ){
		this.forename = forename;
		this.surname = surname;
		this.address=address;
		this.partname = partname;
	}
	
	public  Repair( String forename ){
		forename = forename;
 		surname = surname;
		address = address;
		partname = partname;
	}
	
	public  Repair( ){
		forename = "forename";
		surname = "surname";
		address = "address";
		partname = "partname";
		
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
	
	public void setPartname(String partname){
		partname = partname;
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
	
	public String getPartname(){
		return partname;
	}
	
	public String toString() {
		return "Forename: "+forename + " " + "\nSurname: " + surname + " " + "\nAddress: " + address + " " + "\nParts Required: " + partname;
	}

      
     public static void main(String[] args)
     {
     	new Repair();
     }
}	 
   
    
    
    
