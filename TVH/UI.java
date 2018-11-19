import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
  
public class UI implements ActionListener{  
	JFrame f1,f2,f3,f4;  
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l15,l16,l17;
	JTextField pname,phone,p_age,dval,nop,pgc,bp,tsf,si,bmi,dpf,age;
	JRadioButton rb1,rb2,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t; 
	JButton sign_submit;
	
UI(){  
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
	
   //THIS IS THE page WHERE PATIENT SHALL ENTER DIABETES VALUES (frame f4)
   
   l5 = new JLabel("No. of times pregnant :");
   l5.setBounds(10,10,200,30);
   nop = new JTextField();
   nop.setBounds(160,10,100,30);

   l6 = new JLabel("Plasma glucose conc. :");
   l6.setBounds(350,10,200,30);
   pgc = new JTextField();
   pgc.setBounds(490,10,100,30);

   l7 = new JLabel("Blood pressure :");
   l7.setBounds(10,90,200,30);
   bp = new JTextField();
   bp.setBounds(160,90,100,30);

   l8 = new JLabel("Triceps skin fold :");
   l8.setBounds(350,90,200,30);
   tsf = new JTextField();
   tsf.setBounds(490,90,100,30);

   l9 = new JLabel("Serum insulin :");
   l9.setBounds(10,170,200,30);
   si = new JTextField();
   si.setBounds(160,170,100,30);

   l10 = new JLabel("Body mass index :");
   l10.setBounds(350,170,200,30);
   bmi = new JTextField();
   bmi.setBounds(490,170,100,30);

   l11 = new JLabel("Diabetes pedigree func :");
   l11.setBounds(10,250,200,30);
   dpf = new JTextField();
   dpf.setBounds(160,250,100,30);
   
   l12 = new JLabel("Age :");
   l12.setBounds(350,250,200,30);
   age = new JTextField();
   age.setBounds(490,250,100,30);
   
   JButton b4=new JButton("SUBMIT");
   b4.setBounds(230, 350, 150, 30);
   
   f4.add(l5); f4.add(nop);
   f4.add(l6); f4.add(pgc);
   f4.add(l7); f4.add(bp);
   f4.add(l8); f4.add(tsf);
   f4.add(l9); f4.add(si);
   f4.add(l10); f4.add(bmi);
   f4.add(l11); f4.add(dpf);
   f4.add(l12); f4.add(age); f4.add(b4);
    
   
   /* ***************************************** */

    b1.addActionListener(this);
    b2.addActionListener(this);
    b4.addActionListener(this);
    
    f1.setLayout(null);
    f2.setLayout(null);
    f3.setLayout(null);
    f4.setLayout(null);
    
    f1.setSize(500,500);
    f2.setSize(500,500);
    f3.setSize(1000,1000);
    f4.setSize(750,500);
    
    f1.setVisible(true);  
    
}  

public static void main(String[] args) {  
    new UI();  
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
