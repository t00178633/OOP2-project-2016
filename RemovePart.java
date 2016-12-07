import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class RemovePart extends JFrame implements ActionListener{
  private JPanel part;
  private JTextField partnamefield, partdetailsfield, partquantityfield;
  private JLabel partname,partdetails, partquantity;
  private JButton delete;
    
    
   
    
   public RemovePart()
   {    
        
 		setTitle("Remove Part");
 		setSize(500,300);
 		setLocation(500,300);
 		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 		
    	Container pane= getContentPane();
    	pane.setBackground(Color.gray);
 		setLayout(new FlowLayout());
 		
        partname = new JLabel("Enter Part Name:");
 	    partname.setSize(30,10);
 	    partname.setLocation(10,110);
 	    pane.add(partname);
 	    
 	    partnamefield = new JTextField(50);
 	    partnamefield.setColumns(15);
 	    partnamefield.setSize(150,20);
 	    add(partnamefield);
 	    partnamefield.setLocation(110,210);
 
        JLabel blankLabel1 = new JLabel("                                             ");
        pane.add(blankLabel1);
   
   	    partdetails = new JLabel("Enter Part Details:");
 	    partdetails.setSize(300,100);
 	    partdetails.setLocation(20,110);
 	    pane.add(partdetails);
 	
 	    partdetailsfield = new JTextField();
 	    partdetailsfield.setColumns(15);
 	    partdetailsfield.setSize(150,40);
 	    add(partdetailsfield);
 	    partdetailsfield.setLocation(110,40);
    
       JLabel blankLabel2 = new JLabel("                                             ");
        pane.add(blankLabel2);
    
        partquantity = new JLabel("Enter Part Quantity:");
 	    partquantity.setSize(30,10);
 	    partquantity.setLocation(10,10);
 		pane.add(partquantity);
 		
 	    partquantityfield = new JTextField();
 	    partquantityfield.setColumns(15);
 	    partquantityfield.setSize(150,80);
 	    add(partquantityfield);
 	    partquantityfield.setLocation(110,140);
    
        delete = new JButton("Delete");
        delete.setSize(95,40);
        delete.setLocation(340,180);
  
         
        
 		delete.addActionListener(this);
    	pane.add(delete);
   
    	
    }
    
  
public void actionPerformed(ActionEvent event) {
        
        
        if (event.getSource()==delete)
        {
        String partname= partnamefield.getText();
   		String partdetails= partdetailsfield.getText();
		double partquantity=Double.parseDouble(partquantityfield.getText());
		
		
		Part part= new Part(partname, partdetails, partquantity);;
		Project.part.remove(part);
		JOptionPane.showMessageDialog(null,"Part has been Deleted", "Confirmation",JOptionPane.INFORMATION_MESSAGE);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        
        
    }

 	 
}