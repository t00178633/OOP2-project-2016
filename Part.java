/*This class is the Customer class, from here, the code is entered to add a new customer, view an registered customer, 
 *update a current customers details and view a current customer*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class Part {


	private String partname;
   	private String partdetails;
	private double partquantity;

      
	public  Part( String partname,String partdeails, double partquantity ){
		partname = "";
		partdeails = "";
		partquantity = partquantity;
	}
	
	public  Part( String partname ){
		partname = partname;
 		partdetails = partdetails;
		partquantity = partquantity;
	}
	
	public  Part( ){
		partname = "partname";
		partdetails = "partdetails";
		partquantity = partquantity;
	}
	
	public void setPartname(String partname){
		partname = partname;
	}
	
	public void setPartdetails(String partdetails){
		partdetails = partdetails;
	}
	
	public void setPartquantity(double partquantity){
		partquantity = partquantity;
	}
	
	public String getPartname(){
	  return partname;	
	}
	
	public String getPartdetails(){
	  return partdetails;	
	}

	public double getPartquantity(){
	  return partquantity;	
	}
	
	public String toString() {
		return partname + " " + partdetails + " " + partquantity;
	}

      
     public static void main(String[] args)
     {
     	new Part();
     }
}	 
   
    
    
    
