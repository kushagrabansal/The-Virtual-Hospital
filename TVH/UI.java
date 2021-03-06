import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class BB implements ActionListener{ 
	JFrame f1,f2,f3,f4,f5,f6,f7,f8;  
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
	JLabel la,lb,lc,ld,le,lf,lg,lh,li;
	JTextField pname,phone,p_age,dval,nop,pgc,bp,tsf,si,bmi,dpf,age;
	JRadioButton rb1,rb2,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,aa,ab,ac,ad,ae,af,ag,ah,ai,aj,ak,al,am,an,ao,ap,aq,ar,as,at,au,av,aw,ax,ay; 
	JButton back1,back2,back3;
	ButtonGroup bg,bg1,bg2,bg3,bg4,bg5,bg6,bg7,bg8,bg9;
	int flag=0;
	BB(){  
    f1=new JFrame(); //WELCOME PAGE 
    f2=new JFrame(); //ENTERING DETAILS
    f3=new JFrame(); //CANCER PATIENT DIAGNOSIS
    f4=new JFrame(); //DIABETES PATIENT DIAGNOSIS
    f5=new JFrame(); //FINAL REPORT FOR PATIENT OF CANCER TESTED POSITIVE
    f6=new JFrame(); //FINAL REPORT FOR PATIENT OF CANCER TESTED NEGATIVE
    f7=new JFrame(); //FINAL REPORT FOR PATIENT OF DIABETES TESTED POSITIVE
    f8=new JFrame(); //FINAL REPORT FOR PATIENT OF DIABETES TESTED NEGATIVE
    
    //THIS IS THE 1ST p_age THAT WILL OPEN UP .(frame f1) 
    
    l1 = new JLabel("WELCOME TO THE VIRTUAL HOSPITAL");
    l1.setBounds(140,80, 300,100);  
   // l1.setFont(new Font("Tahoma", Font.BOLD, 13));
	//l1.setForeground(Color.yellow);
	
    JButton b1=new JButton("SIGN IN");
    b1.setBounds(180,180, 100, 30);
    
    f1.add(b1);
    f1.add(l1);
    
    /* **************************************** */
    
    //THIS IS THE 2nd p_age WHERE PATIENT SHALL ENTER DETAILS (frame f2)
           
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
   
       
   rb1=new JRadioButton("CANCER");    
   rb1.setBounds(150,200,100,30);    
   rb2=new JRadioButton("DIABETES"); 
   rb2.setBounds(250,200,100,30);   
   ButtonGroup bg=new ButtonGroup();    
   bg.add(rb1);bg.add(rb2);    
              
   JButton b2=new JButton("SUBMIT DETAILS");
   b2.setBounds(180, 300, 150, 30);
   
   back1=new JButton("BACK");
   back1.setBounds(380,0,100,30);
   
   
   f2.add(l2);
   f2.add(pname);
   f2.add(l3);
   f2.add(phone);
   f2.add(l4);
   f2.add(p_age);
   f2.add(rb1);
   f2.add(rb2);
   f2.add(b2);
   f2.add(back1);
   
   
   /* ***************************************** */
 //THIS IS THE page WHERE PATIENT SHALL ENTER CANCER DATASET ATTRIBUT VALUES (frame f3)
   
   l13 = new JLabel("Age :");
   l13.setBounds(10,10,200,30); 
   a=new JRadioButton("10-19");    
   a.setBounds(90,10,60,30);   a.setActionCommand("10-19");
   b=new JRadioButton("20-29");
   b.setBounds(150,10,60,30);  b.setActionCommand("20-29");
   c=new JRadioButton("30-39"); 
   c.setBounds(210,10,60,30);  c.setActionCommand("30-39");   
   d=new JRadioButton("40-49"); 
   d.setBounds(290,10,60,30);  d.setActionCommand("40-49");
   e=new JRadioButton("50-59"); 
   e.setBounds(350,10,60,30);  e.setActionCommand("50-59");   
   f=new JRadioButton("60-69"); 
   f.setBounds(410,10,60,30);  f.setActionCommand("60-69");   
   g=new JRadioButton("70-79"); 
   g.setBounds(470,10,60,30);  g.setActionCommand("70-79");   
   h=new JRadioButton("80-89"); 
   h.setBounds(470,10,60,30);  h.setActionCommand("80-89");   
   i=new JRadioButton("90-99"); 
   i.setBounds(530,10,60,30);  i.setActionCommand("90-99");   
     
   bg1=new ButtonGroup();    
   bg1.add(a);bg1.add(b);bg1.add(c);bg1.add(d);bg1.add(e);bg1.add(f);bg1.add(g);bg1.add(h);    
   bg1.add(i);
   
   JButton b3=new JButton("SUBMIT");
   b3.setBounds(330, 350, 150, 30);
   
   l14=new JLabel("menopause : ");
   l14.setBounds(10,40,100,30);    
   j=new JRadioButton("lt40");    
   j.setBounds(90,40,60,30);  j.setActionCommand("lt40");    
   k=new JRadioButton("ge40"); 
   k.setBounds(150,40,60,30);  k.setActionCommand("ge40");   
   l=new JRadioButton("premeno"); 
   l.setBounds(210,40,100,30);  l.setActionCommand("premeno");   
  
   bg2=new ButtonGroup();    
   bg2.add(j);bg2.add(k);bg2.add(l);
   
   l15=new JLabel("tumor-size : ");
   l15.setBounds(10,70,80,30);  
   m=new JRadioButton("0-4");
   m.setBounds(90,70,60,30);  m.setActionCommand("0-4"); 
   n=new JRadioButton("5-9");
   n.setBounds(150,70,60,30);  n.setActionCommand("5-9"); 
   o=new JRadioButton("10-14");
   o.setBounds(210,70,60,30);  o.setActionCommand("10-14"); 
   p=new JRadioButton("15-19");
   p.setBounds(270,70,60,30);  p.setActionCommand("15-19"); 
   q=new JRadioButton("20-24");
   q.setBounds(330,70,60,30);  q.setActionCommand("20-24"); 
   r=new JRadioButton("25-29");
   r.setBounds(390,70,60,30);  r.setActionCommand("25-29"); 
   s=new JRadioButton("30-34");
   s.setBounds(450,70,60,30);  s.setActionCommand("30-34"); 
   t=new JRadioButton("35-39");
   t.setBounds(510,70,60,30);  t.setActionCommand("35-39"); 
   u=new JRadioButton("40-44");
   u.setBounds(570,70,60,30);  u.setActionCommand("40-44"); 
   v=new JRadioButton("45-49");
   v.setBounds(630,70,60,30);  v.setActionCommand("45-49"); 
   w=new JRadioButton("50-54");
   w.setBounds(690,70,60,30);  w.setActionCommand("50-54"); 
   x=new JRadioButton("55-59");
   x.setBounds(750,70,60,30);  x.setActionCommand("55-59"); 
   
   bg3=new ButtonGroup();    
   bg3.add(m);bg3.add(n);bg3.add(o);bg3.add(p);bg3.add(q);bg3.add(r);bg3.add(s);
   bg3.add(t);bg3.add(u);bg3.add(v);bg3.add(w);bg3.add(x);
   
   
   l16=new JLabel("node-caps : ");
   l16.setBounds(10,100,80,30);  
   y=new JRadioButton("yes");
   y.setBounds(90,100,60,30);  y.setActionCommand("yes"); 
   z=new JRadioButton("no");
   z.setBounds(150,100,60,30);  z.setActionCommand("no"); 
     
   bg4=new ButtonGroup();    
   bg4.add(y);bg4.add(z);
  
   l17=new JLabel("deg-malig : ");
   l17.setBounds(10,130,80,30);  
   aa=new JRadioButton("1");
   aa.setBounds(90,130,60,30);  aa.setActionCommand("1"); 
   ab=new JRadioButton("2");
   ab.setBounds(150,130,60,30);  ab.setActionCommand("2"); 
   ac=new JRadioButton("3");
   ac.setBounds(210,130,60,30);  ac.setActionCommand("3"); 
       
   bg5=new ButtonGroup();    
   bg5.add(aa);bg5.add(ab);bg5.add(ac);
   
   l18=new JLabel("Breast : ");
   l18.setBounds(10,160,80,30);   
   ad=new JRadioButton("left");
   ad.setBounds(90,160,60,30);  ad.setActionCommand("left"); 
   ae=new JRadioButton("right");
   ae.setBounds(150,160,60,30);  ae.setActionCommand("right"); 
   
   bg6=new ButtonGroup();    
   bg6.add(ad);bg6.add(ae);

   l19=new JLabel("breast-quad : ");
   l19.setBounds(10,190,80,30);  
   af=new JRadioButton("left_up");
   af.setBounds(90,190,80,30);  af.setActionCommand("left_up"); 
   ag=new JRadioButton("left_low");
   ag.setBounds(170,190,80,30);  ag.setActionCommand("left_low"); 
   ah=new JRadioButton("right_up");
   ah.setBounds(250,190,80,30);  ah.setActionCommand("right_up"); 
   ai=new JRadioButton("right_low");
   ai.setBounds(330,190,80,30);  ai.setActionCommand("right_low"); 
   aj=new JRadioButton("central");
   aj.setBounds(410,190,80,30); aj .setActionCommand("central"); 
   
   bg7=new ButtonGroup();    
   bg7.add(af);bg7.add(ag);bg7.add(ah);bg7.add(ai);bg7.add(aj);
   
   l20=new JLabel("irradiat : ");
   l20.setBounds(10,220,80,30);  
   ak=new JRadioButton("yes");
   ak.setBounds(90,220,80,30);  ak.setActionCommand("yes"); 
   al=new JRadioButton("no");
   al.setBounds(170,220,80,30);  al.setActionCommand("no"); 
   
   bg8=new ButtonGroup();    
   bg8.add(ak);bg8.add(al);  

   l21=new JLabel("inv-nodes : ");
   l21.setBounds(10,250,80,30);   
   am=new JRadioButton("0-2");
   am.setBounds(90,250,60,30);  am.setActionCommand("0-2");    
   an=new JRadioButton("3-5");
   an.setBounds(150,250,60,30);  an.setActionCommand("3-5"); 
   ao=new JRadioButton("6-8");
   ao.setBounds(210,250,60,30);  ao.setActionCommand("6-8"); 
   ap=new JRadioButton("9-11");
   ap.setBounds(270,250,60,30);  ap.setActionCommand("9-11"); 
   aq=new JRadioButton("12-14");
   aq.setBounds(330,250,60,30);  aq.setActionCommand("12-14"); 
   ar=new JRadioButton("15-17");
   ar.setBounds(390,250,60,30);  ar.setActionCommand("15-17"); 
   as=new JRadioButton("18-20");
   as.setBounds(450,250,60,30);  as.setActionCommand("18-20"); 
   at=new JRadioButton("21-23");
   at.setBounds(510,250,60,30);  at.setActionCommand("21-23"); 
   au=new JRadioButton("24-26");
   au.setBounds(570,250,60,30);  au.setActionCommand("24-26"); 
   av=new JRadioButton("27-29");
   av.setBounds(630,250,60,30);  av.setActionCommand("27-29"); 
   aw=new JRadioButton("30-32");
   aw.setBounds(690,250,60,30);  aw.setActionCommand("30-32"); 
   ax=new JRadioButton("33-35");
   ax.setBounds(750,250,60,30);  ax.setActionCommand("33-35"); 
   ay=new JRadioButton("36-39");
   ay.setBounds(810,250,60,30);  ay.setActionCommand("36-39"); 
   
   
   bg9=new ButtonGroup();    
   bg9.add(am);bg9.add(an);bg9.add(ao);bg9.add(ap);bg9.add(aq);bg9.add(ar);bg9.add(as);
   bg9.add(at);bg9.add(au);bg9.add(av);bg9.add(aw);bg9.add(ax);bg9.add(ay);
      
   
   f3.add(l13); f3.add(a); f3.add(b); f3.add(c); f3.add(d); f3.add(e);
   f3.add(f); f3.add(g); f3.add(h); f3.add(i);       
   f3.add(l14);f3.add(j);f3.add(k);f3.add(l);  
   f3.add(l15);f3.add(m);f3.add(n);f3.add(o);f3.add(p);f3.add(q);f3.add(r);f3.add(s);
   f3.add(t);f3.add(u);f3.add(v);f3.add(w);f3.add(x);
   f3.add(l16);f3.add(y);f3.add(z);
   f3.add(l17);f3.add(aa);f3.add(ab);f3.add(ac);
   f3.add(l18);f3.add(ad);f3.add(ae);
   f3.add(l19);f3.add(af);f3.add(ag);f3.add(ah);f3.add(ai);f3.add(aj);
   f3.add(l20);f3.add(ak);f3.add(al);
   f3.add(l21);f3.add(am);f3.add(an);f3.add(ao);f3.add(ap);f3.add(aq);f3.add(ar);f3.add(as);
   f3.add(at);f3.add(au);f3.add(av);f3.add(aw);f3.add(ax);f3.add(ay);
     
   f3.add(b3);
   
   back2=new JButton("BACK");
   back2.setBounds(800,0,100,30);
   f3.add(back2);
   
   /* ***************************************** */
   
 //THIS IS THE page WHERE PATIENT SHALL ENTER DIABETES DATASET ATTRIBUT VALUES (frame f4)
   
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
    
   back3=new JButton("BACK");
   back3.setBounds(650,0,100,30);
   f4.add(back3);
   

   /* ***************************************** */
 //PAGE TO DISPLAY IF CANCER TESTED POSITIVE (FRAMEf7)
    la = new JLabel("CANCER TESTED POSITIVE . ");
    la.setBounds(140,10, 300,10);  
    lb=new JLabel("YOUR DATA HAS BEEN RECORDED WITH US .");
    lb.setBounds(140,30, 300,10); 
    f5.add(la);
    f5.add(lb);

    /* ***************************************** */
 //PAGE TO DISPLAY IF CANCER TESTED POSITIVE (FRAMEf7)
    la = new JLabel("CANCER TESTED NEGATIVE .");
    la.setBounds(200,20, 300,10);  
    lb=new JLabel("YOUR DATA HAS BEEN RECORDED WITH US .");
    lb.setBounds(200,40, 300,10); 
    f6.add(la);
    f6.add(lb);
   
    /* ***************************************** */
  //PAGE TO DISPLAY IF DIABETES TESTED POSITIVE (FRAMEf7)
    la = new JLabel("DIABETES TESTED POSITIVE .");
    la.setBounds(200,20, 300,10);  
    lb=new JLabel("YOUR DATA HAS BEEN RECORDED WITH US .");
    lb.setBounds(200,40, 300,10); 
    
    f7.add(la);
    f7.add(lb);
    /* ***************************************** */
  //PAGE TO DISPLAY IF DIABETES TESTED POSITIVE (FRAMEf7)
     la = new JLabel("DIABETES TESTED NEGATIVE .");
     la.setBounds(200,20, 300,10);  
     lb=new JLabel("YOUR DATA HAS BEEN RECORDED WITH US .");
     lb.setBounds(200,40, 300,10); 
     
     f8.add(la);
     f8.add(lb);
     
     /* ***************************************** */
     
   
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    back1.addActionListener(this);
    back2.addActionListener(this);
    back3.addActionListener(this);
    
    
    
    f1.setLayout(null);
    f2.setLayout(null);
    f3.setLayout(null);
    f4.setLayout(null);
    f5.setLayout(null);
    f6.setLayout(null);
    f7.setLayout(null);
    f8.setLayout(null);
    
    
    
    f1.setSize(500,500);
    f2.setSize(500,500);
    f3.setSize(900,500);
    f4.setSize(750,500);
    f5.setSize(750,500);
    f6.setSize(750,500);
    f7.setSize(750,500);
    f8.setSize(750,500);
    
    f1.setVisible(true);  
    
}  
public static void main(String[] args)throws Exception {  
    new BB();  
}

@Override
public void actionPerformed(ActionEvent e)  {
	
	// 
	String lbl = e.getActionCommand();

	if (lbl.equalsIgnoreCase("back") && flag==1)
	{
		f2.setVisible(false);
		f1.setVisible(true);
		flag=0;
		
	}
	if (lbl.equalsIgnoreCase("back") && flag==2)
	{
		f3.setVisible(false);
		f2.setVisible(true);
		flag--;
		
	}
	if (lbl.equalsIgnoreCase("back") && flag==3)
	{
		f4.setVisible(false);
		f2.setVisible(true);
		flag-=2;
	}
	

	if (lbl.equalsIgnoreCase("sign in"))
	{
		f2.setVisible(true);
		f1.setVisible(false);
		flag++;
	
}
	if (lbl.equalsIgnoreCase("submit details"))
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String aaa="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tvh","root","");
			pstmt=con.prepareStatement("select max(pid) from patient");
			ResultSet result=pstmt.executeQuery();
			while(result.next()) {
			aaa=result.getString(1);
			
			} 
			aaa=""+(Integer.parseInt(aaa)+1);
			pstmt=con.prepareStatement("insert into patient values(?,?,?,?)");
			pstmt.setString(1, aaa);
			pstmt.setString(2,pname.getText());
			pstmt.setString(3, phone.getText());
			pstmt.setString(4, p_age.getText());
			
			 int x=pstmt.executeUpdate();
			  con.close();
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String temp=p_age.getText();
		if(rb1.isSelected()){   
		f3.setVisible(true);
		f2.setVisible(false);
		f1.setVisible(false);
		flag++;
		
		
		}
		else if(rb2.isSelected())
		{
			age.setText(temp);
			f4.setVisible(true);
			f2.setVisible(false);
			f1.setVisible(false);
			flag+=2;
			
		}
	}
	
	if(lbl.equalsIgnoreCase("submit") && rb1.isSelected())
	{
		CancerModelLoading dm=new CancerModelLoading();
		short ans=-1;
		try {
			ans = dm.ans_calc(bg1.getSelection().getActionCommand()+ "," +
					 bg2.getSelection().getActionCommand() + "," +
					 bg3.getSelection().getActionCommand() + "," +
					 bg9.getSelection().getActionCommand() + "," +
					 bg4.getSelection().getActionCommand() + "," +
					 bg5.getSelection().getActionCommand() + "," +
					 bg6.getSelection().getActionCommand() + "," +
					 bg7.getSelection().getActionCommand() + "," +
					 bg8.getSelection().getActionCommand()
					);
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}


		if(ans==1) {
			f5.setVisible(true);
			f4.setVisible(false);
			f2.setVisible(false);
			f1.setVisible(false);
			}
		if(ans==0) {
			f6.setVisible(true);
			f4.setVisible(false);
			f2.setVisible(false);
			f1.setVisible(false);
			}
		
	}
	if(lbl.equalsIgnoreCase("submit") && rb2.isSelected())
	{
		
		
		DiabetesModelLoading dm=new DiabetesModelLoading();
		short ans=-1;
		try {
			ans = dm.ans_calc(nop.getText()+ "," +pgc.getText()+"," +bp.getText()+"," +tsf.getText()+"," +si.getText()+"," +bmi.getText()+"," +dpf.getText()+"," +age.getText());
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}


		if(ans==1) {
			f7.setVisible(true);
			f4.setVisible(false);
			f2.setVisible(false);
			f1.setVisible(false);
			}
		if(ans==0) {
			f8.setVisible(true);
			f4.setVisible(false);
			f2.setVisible(false);
			f1.setVisible(false);
			}
			
	   }
	}


	 
	
}
