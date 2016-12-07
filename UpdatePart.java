import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class UpdatePart extends JFrame implements ActionListener{
  private JPanel part;
  private JTextField partnamefield, partdetailsfield, partquantityfield;
  private JLabel partname, partdetails, partquantity;
  private JButton update;
    
    
   
    
   public UpdatePart()
   {    
        
 		setTitle("Part Details");
 		setSize(500,300);
 		setLocation(500,300);
 		
 		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
 		
 

    	Container pane= getContentPane();
    	pane.setBackground(Color.gray);
 		setLayout(new FlowLayout());
        partname = new JLabel("Enter Parts name:");
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
        
        partquantity = new JLabel("Enter Parts Quantity:");
 	    partquantity.setSize(30,10);
 	    partquantity.setLocation(10,10);
 	    pane.add(partquantity);
 	
 	    partquantityfield = new JTextField();
 	    partquantityfield.setColumns(15);
 	    partquantityfield.setSize(150,60);
 	    add(partquantityfield);
 	    partquantityfield.setLocation(110,70);
    
        update = new JButton("Update");
        update.setSize(95,40);
        update.setLocation(340,180);
  
         
        
 		update.addActionListener(this);
    	pane.add(update);
   
    	
    }

public void actionPerformed(ActionEvent event) {
        
        
        if (event.getSource()==update)
        {
        String partname= partnamefield.getText();
   		String partdetails= partdetailsfield.getText();
		double partquantity=Double.parseDouble(partquantityfield.getText());
		
	    Part part= new Part(partname, partdetails, partquantity);
		Project.part.add(part);
		JOptionPane.showMessageDialog(null,"Part has been Updated", "Confirmation",JOptionPane.INFORMATION_MESSAGE);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
        }
        
        
    }
 	 
}