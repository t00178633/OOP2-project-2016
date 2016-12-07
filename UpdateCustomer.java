import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class UpdateCustomer extends JFrame implements ActionListener{
  private JPanel customer;
  private JTextField forenamefield, surnamefield, addressfield, telephonefield;
  private JLabel forename,surname,address,telephone;
  private JButton update;
    
    
   
    
   public UpdateCustomer()
   {    
        
 		setTitle("Customer Details");
 		setSize(500,300);
 		setLocation(500,300);
 		
 		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 		
 

    	Container pane= getContentPane();
    	pane.setBackground(Color.gray);
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
    
    
        telephone = new JLabel("Enter Customer's Telephone:");
 	    telephone.setSize(30,10);
 	    telephone.setLocation(10,10);
 		pane.add(telephone);
 		
 	    telephonefield = new JTextField();
 	    telephonefield.setColumns(15);
 	    telephonefield.setSize(150,100);
 	    add(telephonefield);
 	    telephonefield.setLocation(110,180);
    
        update = new JButton("Update");
        update.setSize(95,40);
        update.setLocation(340,180);
  
         
        
 		update.addActionListener(this);
    	pane.add(update);
   
    	
    }

public void actionPerformed(ActionEvent event) {
        
        
        if (event.getSource()==update)
        {
        String forename= forenamefield.getText();
   		String surname= surnamefield.getText();
   	    String address = addressfield.getText();
		double telephone=Double.parseDouble(telephonefield.getText());
		ArrayList <Customer> customers = Project.customers;
		boolean found=false;
		
			for(int i=0;i<customers.size();i++)
   		{
			Customer aCustomer = customers.get(i);
   			if(forename.equals(aCustomer.getForename()) && surname.equals(aCustomer.getSurname()))
   			{
   				found=true;
   				
   				Project.customers.remove(aCustomer);
	
   			}
   		
   		}
		
		Customer cust= new Customer(forename,surname, address, telephone);
		Project.customers.add(cust);
		JOptionPane.showMessageDialog(null,"Customer has been updated");
	
        }
        
        
    }
 	 
}