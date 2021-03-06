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
	static ArrayList <Customer> customers= new ArrayList<Customer>();
	static ArrayList <Part> part = new ArrayList<Part>();
	static ArrayList <Repair> repair = new ArrayList<Repair>();
	
	public static void main (String args []) 
	{
		Project mainmenu = new Project();
		mainmenu.setVisible(true);
		
	}
	
	// public void AddCustomer() {
    //  	customers = new ArrayList<Customer>();
    //    }
	
	public Project()
	{ 
		
		JLabel opening;
        Container mainbackground;
        
		setTitle("Garage Repairs");
		setSize(300,500);
		setLocation(700,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	    mainbackground = getContentPane();
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
        opening.setSize(250, 55); 
        mainbackground.add(opening);
        
       
	}
	
	
	    public void createCustomers() {
        JMenuItem AddCustomer,removeCustomer,viewCustomer, updateCustomer, saveCustomer, openCustomer;
        
        Customers = new JMenu("Customers");
       
        AddCustomer = new JMenuItem("Add New Customer");   
        AddCustomer.addActionListener( this );
        Customers.add(AddCustomer);

        removeCustomer = new JMenuItem("Remove Customer");  
        removeCustomer.addActionListener( this );
        Customers.add(removeCustomer);
        
        updateCustomer = new JMenuItem("Update Customer");
        updateCustomer.addActionListener( this );
        Customers.add(updateCustomer);
        
        viewCustomer = new JMenuItem("View Customer");
        viewCustomer.addActionListener( this );
        Customers.add(viewCustomer);
        
        openCustomer = new JMenuItem("Open");
        openCustomer.addActionListener(this);
        Customers.add(openCustomer);

        saveCustomer = new JMenuItem("Save");
        saveCustomer.addActionListener(this);
        Customers.add(saveCustomer);
        
        
    }
    
     public void createParts() {
        JMenuItem addParts, removeParts, ViewParts, updateParts;
        
        Parts = new JMenu("Parts");
       
        addParts = new JMenuItem("Add New Part");   
        addParts.addActionListener( this );
        Parts.add(addParts);

        removeParts = new JMenuItem("Remove Part");   
        removeParts.addActionListener( this );
        Parts.add(removeParts);
        
        updateParts = new JMenuItem("Update Part");      
        updateParts.addActionListener( this );
        Parts.add(updateParts);
        
        ViewParts = new JMenuItem("View Part");   
        ViewParts.addActionListener( this );
        Parts.add(ViewParts);

      
    }
    
    public void createRepairs() {
        JMenuItem LogRepairs, ViewRepairs;
        
        Repairs = new JMenu("Repairs");
       
        LogRepairs = new JMenuItem("Log New Repair");   
        LogRepairs.addActionListener( this );
        Repairs.add(LogRepairs);

        ViewRepairs = new JMenuItem("View Current Repairs");   
        ViewRepairs.addActionListener( this );
        Repairs.add(ViewRepairs);

 
    }
    
    public void createExit() 
    {
     Exit = new JMenu("Exit");
     JMenuItem exit = new JMenuItem("Exit System");
     exit.addActionListener( this );
     Exit.add(exit);
     //setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    
    public void save() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customers.dat"));
        oos.writeObject(customers);
        oos.close();
        
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("part.dat"));
        oos1.writeObject(customers);
        oos1.close();
        
        ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("repair.dat"));
        oos2.writeObject(customers);
        oos2.close();

    }
    
    public void open() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customers.dat"));
            customers = (ArrayList<Customer>) ois.readObject();
            ois.close();
            
            ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("part.dat"));
            customers = (ArrayList<Customer>) ois1.readObject();
            ois1.close();
            
            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("repair.dat"));
            customers = (ArrayList<Customer>) ois2.readObject();
            ois2.close();

            JOptionPane.showMessageDialog(null,"File is Opening","Open",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"File not found","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    
    public void actionPerformed(ActionEvent event) {
        String  menuitem;
        JLabel opening;
        menuitem = event.getActionCommand();
        
        if (menuitem.equals ("Add New Customer"))
        {
           CustomerGUI gui=new CustomerGUI();
 			gui.setVisible(true);
        }
       
        else if (menuitem.equals ("View Customer"))
        {
           ViewCustomer gui=new ViewCustomer();
 			gui.setVisible(true);
        }
        
       else if (menuitem.equals ("Remove Customer"))
        {
           DeleteCustomer gui=new DeleteCustomer();
 			gui.setVisible(true);
        }
        
        else if (menuitem.equals ("Update Customer"))
        {
           UpdateCustomer gui=new UpdateCustomer();
 			gui.setVisible(true);
        }
        
         else if (menuitem.equals ("Parts"))
        {
           createParts();
        }
         else if (menuitem.equals ("Add New Part"))
        {
           AddPart gui=new AddPart();
 			gui.setVisible(true);
        }
        
         else if (menuitem.equals ("Remove Part"))
        {
           RemovePart gui=new RemovePart();
 			gui.setVisible(true);
        }
        
        else if (menuitem.equals ("Update Part"))
        {
           UpdatePart gui=new UpdatePart();
 			gui.setVisible(true);
        }
        
        else if (menuitem.equals ("View Part"))
        {
        	ViewPart gui=new ViewPart();
 			gui.setVisible(true);
        }
        
        else if (menuitem.equals ("Repairs"))
        {
           createRepairs();  
        }
        
         else if (menuitem.equals ("Log New Repair"))
        {
        	LogNewRepair gui=new LogNewRepair();
 			gui.setVisible(true);
        }
        
        else if (menuitem.equals ("View Current Repairs"))
        {
        	ViewCurrentRepair gui=new ViewCurrentRepair();
 			gui.setVisible(true);
        }
        
        else if(menuitem.equals ("Open")) 
        {
            open();
        }
        
         else if(menuitem.equals ("Save")) {
              try{
              
                save();
                JOptionPane.showMessageDialog(null,"Data saved successfully","Saved",JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null,"Not able to save the file");
                e1.printStackTrace();
            }
         }
      else if (menuitem.equals("Exit System")) 
        {
           System.exit(0);
        } 
   
}
}