import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class ViewCustomer extends JFrame implements ActionListener{

  private JPanel viewcustomer;
  private JTextField forenamefield, surnamefield, addressfield;
  private JLabel forename,surname,address;
  private JButton view; 
  	
  	public ViewCustomer()
   {    
        
 		setTitle("Customer Details");
 		setSize(500,300);
 		setLocation(500,300);
 	
 		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    
    	Container pane= getContentPane();	
    	pane.setBackground(Color.GRAY);
 		setLayout(new FlowLayout());
        forename = new JLabel("Enter Customer's Forename:");
 	    forename.setSize(30,10);
 	    forename.setLocation(10,110);
 	    pane.add(forename);
 	    
 	    forenamefield = new JTextField(50);
 	    forenamefield.setColumns(15);
 	    forenamefield.setSize(150,20);
 	    add(forenamefield);
 	    forenamefield.setLocation(110,210);
 
   
   	    surname = new JLabel("Enter Customer's Surname:");
 	    surname.setSize(300,100);
 	    surname.setLocation(20,110);
 	    pane.add(surname);
 	
 	    surnamefield = new JTextField();
 	    surnamefield.setColumns(15);
 	    surnamefield.setSize(150,40);
 	    add(surnamefield);
 	    surnamefield.setLocation(110,40);
      
        address = new JLabel("Enter Customer's Address:");
 	    address.setSize(30,10);
 	    address.setLocation(10,10);
 	    pane.add(address);
 	
 	    addressfield = new JTextField();
 	    addressfield.setColumns(15);
 	    addressfield.setSize(150,60);
 	    add(addressfield);
 	    addressfield.setLocation(110,70);
    
    
        view = new JButton("View");
        view.setSize(95,40);
        view.setLocation(210,180);
  
         
        
 		view.addActionListener(this);
    	pane.add(view);
   
    	
    }	
	
	
	
	
	
	public void actionPerformed(ActionEvent event) {
        
        
        if (event.getSource()==view)
        {
        String forename= forenamefield.getText();
   		String surname= surnamefield.getText();
   		String address=addressfield.getText();
   		ArrayList <Customer> customers = Project.customers;
   		boolean found=false;
   		
   		//Customer cust1 = new Customer("Liam","McGovern","Tralee",123);
   		//Customer cust2 = new Customer("John","Brosnan","Ardfert",234);
   		
   		//customers.add(cust1);
   		//customers.add(cust2);
   		
   		
   		//JOptionPane.showMessageDialog(null,customers.get(0));
   		
   		for(int i=0;i<customers.size();i++)
   		{
   			Customer aCustomer = customers.get(i);
   			if(forename.equals(aCustomer.getForename()) && surname.equals(aCustomer.getSurname()) && address.equals(aCustomer.getAddress()))
   			{
   				found=true;
   				JOptionPane.showMessageDialog(null,aCustomer);
   				break;
   			}
   		
   		}
   		
   		if(!found)
   			JOptionPane.showMessageDialog(null,"This customer has not been registered!!");
   		
        }
        
        
    }

    
    
}