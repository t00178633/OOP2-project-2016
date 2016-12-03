import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.io.*;

public class ViewPart extends JFrame implements ActionListener{

  private JPanel part;
  private JTextField partnamefield, partdetailsfield, partquantityfield;
  private JLabel partname, partdetails, partquantity;
  private JButton view; 
  	
  	public ViewPart()
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
 
   
   	    partdetails = new JLabel("Enter Part Details:");
 	    partdetails.setSize(300,100);
 	    partdetails.setLocation(20,110);
 	    pane.add(partdetails);
 	
 	    partdetailsfield = new JTextField();
 	    partdetailsfield.setColumns(15);
 	    partdetailsfield.setSize(150,40);
 	    add(partdetailsfield);
 	    partdetailsfield.setLocation(110,40);
      
        partquantity = new JLabel("Enter Parts Quantity:");
 	    partquantity.setSize(30,10);
 	    partquantity.setLocation(10,10);
 	    pane.add(partquantity);
 	
 	    partquantityfield = new JTextField();
 	    partquantityfield.setColumns(15);
 	    partquantityfield.setSize(150,60);
 	    add(partquantityfield);
 	    partquantityfield.setLocation(110,70);
    
    
        view = new JButton("View");
        view.setSize(95,40);
        view.setLocation(210,180);
  
         
        
 		view.addActionListener(this);
    	pane.add(view);
   
    	
    }	
	
	
	
	
	
	public void actionPerformed(ActionEvent event) {
        
        
        if (event.getSource()==view)
        {
        String partname= partnamefield.getText();
   		String partdetails= partdetailsfield.getText();
   		ArrayList <Part> part = Project.part;	
   		
   		JOptionPane.showMessageDialog(null,part);
   		for(int i=0;i<part.size();i++)
   		{
   			Part aPart = part.get(i);
   			if(partname.equals(aPart.getPartname()) && partdetails.equals(aPart.getPartdetails()))
   			{
   				JOptionPane.showMessageDialog(null,part);
   			}
   		
   		}
   		
        }
        
        
    }

    
    
}