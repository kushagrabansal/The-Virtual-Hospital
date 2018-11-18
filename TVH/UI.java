import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
  
public class BB2 implements ActionListener{  
JFrame f1,f2,f3,f4;  
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l15,l16,l17;
JTextField pname,phone,p_age,dval,nop,pgc;
JRadioButton rb1,rb2; 
JButton sign_submit;
	
BB2(){  
    f1=new JFrame(); //WELCOME PAGE 
    f2=new JFrame(); //ENTERING DETAILS
    f3=new JFrame(); //CANCER PATIENT DIAGNOSIS
    f4=new JFrame(); //DIABETES PATIENT DIAGNOSIS
    
    //THIS IS THE 1ST p_age THAT WILL OPEN UP . 
    
    l1 = new JLabel("WELCOME TO THE VIRTUAL HOSPITAL");
    l1.setBounds(140,50, 300,100);  
    JButton b1=new JButton("SIGN IN");
    b1.setBounds(180,150, 100, 30);
    //JButton b2=new JButton("SIGN UP");  
    //b2.setBounds(300,300,0,0);
    
    f1.add(b1);//f1.add(b2);
    f1.add(l1);
    
    /* **************************************** */
    
    //THIS IS THE 2nd p_age WHERE PATIENT SHALL ENTER DETAILS 
           
   l2 = new JLabel("PATIENT NAME :");
   l2.setBounds(150,50,180,30);
   pname = new JTextField();
   pname.setBounds(250,50,150,30);

   l3 = new JLabel("PHONE NUMBER :");
   l3.setBounds(150,100,150,30);
   phone = new JTextField();
   phone.setBounds(250,100,150,30);
   
   l4 = new JLabel("PATIENT AGE :");
   l4.setBounds(150,150,150,30);
   p_age = new JTextField();
   p_age.setBounds(250,150,150,30);
       
   rb1=new JRadioButton("1.) CANCER");    
   rb1.setBounds(150,200,100,30);    
   rb2=new JRadioButton("2.) DIABETES"); 
   rb2.setBounds(250,200,100,30);   
   ButtonGroup bg=new ButtonGroup();    
   bg.add(rb1);bg.add(rb2);    
              
   JButton b2=new JButton("SUBMIT DETAILS");
   b2.setBounds(180, 300, 150, 30);
   
   f2.add(l2);
   f2.add(pname);
   f2.add(l3);
   f2.add(phone);
   f2.add(l4);
   f2.add(p_age);
   f2.add(rb1);
   f2.add(rb2);
   f2.add(b2);
   
   /* ***************************************** */

    b1.addActionListener(this);
    b2.addActionListener(this);
    
    
    f1.setLayout(null);
    f2.setLayout(null);
    f3.setLayout(null);
    f4.setLayout(null);
    
    f1.setSize(500,500);
    f2.setSize(500,500);
    f3.setSize(500,500);
    f4.setSize(1000,1000);
    
    f1.setVisible(true);  
    
    
}  
public static void main(String[] args) {  
    new BB();  
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String lbl = e.getActionCommand();
	
	if (lbl.equalsIgnoreCase("sign in"))
	{
		f2.setVisible(true);
		f1.setVisible(false);
		
	}
	if (lbl.equalsIgnoreCase("submit details"))
	{
		if(rb1.isSelected()){   
		f3.setVisible(true);
		f2.setVisible(false);
		f1.setVisible(false);
		}
		else if(rb2.isSelected())
		{
			f4.setVisible(true);
			f2.setVisible(false);
			f1.setVisible(false);
		}
	}
		
}

}  
