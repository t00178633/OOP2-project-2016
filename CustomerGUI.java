/**

 * This is the main class for adding a Customer

 * @author Liam McGovern

 * @version 1.0

 */
 
 //import statments needed to use to save the file, use JOption to display a message box, display textbox
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;
//declaring the name of the file and "extends JFrame implements ActionListener" needed or the various buttons won't work
public class CustomerGUI extends JFrame implements ActionListener{
//attributes
  private JPanel customer;
  private JTextField forenamefield, surnamefield, addressfield, telephonefield;
  private JLabel forename,surname,address,telephone;
  private JButton register;
    
    
   
    
   public CustomerGUI()
   {   //Constructor 
       //This sets the title of the GUI name, size and location on the screen 
 		setTitle("Customer Details");
 		setSize(500,300);
 		setLocation(500,300);
 		//When the JFrame closes ".HIDE_ON_CLOSE" will get rid of the JFrame but will not close the program
 		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 		
 
        //From here the container background, layout size and location is set for the JLabels and TextFields
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
    
        register = new JButton("Register");
        register.setSize(95,40);
        register.setLocation(340,180);
  
         
        
 		register.addActionListener(this);
    	pane.add(register);
   
    	
    }
//event handler action performed = when a button is pressed what will happen
public void actionPerformed(ActionEvent event) {
        
        
        if (event.getSource()==register)
        {
        String forename= forenamefield.getText();
   		String surname= surnamefield.getText();
   		String address=addressfield.getText();
		double telephone=Double.parseDouble(telephonefield.getText());
		
		
		Customer cust= new Customer(forename,surname, address, telephone);
		Project.customers.add(cust);
		JOptionPane.showMessageDialog(null,"Customer has been registered");
	
        }
        
        
    }//end of event handler
 	 
}