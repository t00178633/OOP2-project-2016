//Project.java
/*Java Project - This Project is based on a Repair shop system.
 *It's classes will include Customers, Parts and Repairs
 *In Customers, you should be able to register a new customer, delete a customer and list all customers
 *In Parts, you should be able to add a new part, remove a part and search/list parts
 *In Repairs, you should be able to log a new repair and view the current status of a current repair*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class Project extends JFrame implements ActionListener
{
	JMenu Customers;
	JMenu Parts;
	JMenu Repairs;
	JMenu Exit;
	
	public static void main (String args []) 
	{
		Project mainmenu = new Project();
		mainmenu.setVisible(true);
		
	}
	
	public Project()
	{ 
		
		JLabel opening;
        Container mainbackground;
        
		setTitle("Garage Repairs");
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	    mainbackground = getmainbackground();
        mainbackground.setBackground (Color.gray);
        mainbackground.setLayout(null);
        
        createCustomers();
        createParts();
        createRepairs();
        createExit();
        
        JMenuBar menuTop = new JMenuBar();
        setJMenuBar(menuTop);
        menuTop.setBackground(Color.orange);
        menuTop.add(Customers);
        menuTop.add(Parts);
        menuTop.add(Repairs);
        menuTop.add(Exit);
        
        opening = new JLabel("Hello, Welcome to Garage Repairs.");
        opening.setSize(250, 50); 
        mainbackground.add(opening);
        
        opening = new JLabel("Hello" );
        opening.setSize(250, 50);
        mainbackground.add(opening);
	}
	
	 public void actionPerformed(ActionEvent event) {
        String  menu;
        JLabel opening;
        menu = event.getActionCommand();
        if (menu.equals("Exit")) {
           System.exit(0);
        }
        
        else {
        	 opening.setText( menu );
        }
        }
	
	    public void createCustomers() {
        JMenuItem Customer;
        
        Customer = new JMenu("Customers");
       
        Customer = new JMenuItem("Add New Customer");   
        Customer.addActionListener( this );
        Customer.add(Customer);

        Customer = new JMenuItem("Remove Customer");  
        Customer.addActionListener( this );
        Customer.add(Customer);

        Customer = new JMenuItem("View All Customers");
        Customer.addActionListener( this );
        Customer.add(Customer);

        Customer = new JMenuItem("Exit");      
        Customer.addActionListener( this );
        Customer.add(Customer);
    }

}