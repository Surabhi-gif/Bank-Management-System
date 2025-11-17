import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{    

long Random;
JTextField PANfield,Adharfield; 
JRadioButton Syes,Sno,Eyes,Eno;
JComboBox religion,category,income,education,occupation;
String formno;
 
    SignupTwo(String formno){
      this.formno =formno;

    setLayout(null); 

    setTitle("New Account Application Form - Page 2");
 
  JLabel AdditionalDetails = new JLabel("Page 2 : Additional Details");
  AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
  AdditionalDetails.setBounds(290,80,400,30);
  add(AdditionalDetails);


  JLabel Religion = new JLabel("Religion:");
  Religion.setFont(new Font("Raleway",Font.BOLD,22));
  Religion.setBounds(100,140,100,30);
  add(Religion);

  String valReligion[]= {"Hindu","Muslim","Sikh","Christian","Other"};
   religion =new JComboBox(valReligion);
  religion.setBounds(300,140,400,30);
   add(religion);

  JLabel Category = new JLabel("Category: ");
  Category.setFont(new Font("Raleway",Font.BOLD,22));
  Category.setBounds(100,190,200,30);
  add(Category);

  String valCategory[]= {"Genral","SC","ST","OBC","Other"}; 
   category =new JComboBox(valCategory);
  category.setBounds(300,190,400,30);
   add(category);
 

  JLabel Income= new JLabel("Income: ");
  Income.setFont(new Font("Raleway",Font.BOLD,22));
  Income.setBounds(100,240,200,30);
  add(Income);

  String valIncome[]= {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"}; 
 income=new JComboBox(valIncome);
  income.setBounds(300,240,400,30);
   add(income);

 
  JLabel Education = new JLabel("Education ");
  Education.setFont(new Font("Raleway",Font.BOLD,22));
  Education.setBounds(100,290,200,30);
  add(Education);

  JLabel Qualification = new JLabel("Qualification: ");
  Qualification.setFont(new Font("Raleway",Font.BOLD,22));
  Qualification.setBounds(100,315,200,30);
  add(Qualification);

  String valEducation[]= {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"}; 
  education=new JComboBox(valEducation);
  education.setBounds(300,315,400,30);
   add(education);

   JLabel Occupation = new JLabel("Occupation");
   Occupation.setFont(new Font("Raleway",Font.BOLD,22));
   Occupation.setBounds(100,390,200,30);
   add(Occupation);
 

   String valOccupation[]= {"Salaried","Self-Employed","Bussiness","Student","Retierd","Other"}; 
   occupation= new JComboBox(valOccupation);
   occupation.setBounds(300,390,400,30);
    add(occupation);
 
  
 
  JLabel PAN  = new JLabel("PAN NO: ");
  PAN .setFont(new Font("Raleway",Font.BOLD,22));
  PAN .setBounds(100,440,200,30);
  add(PAN);
  
  PANfield  = new JTextField();
  PANfield.setFont(new Font("Raleway",Font.BOLD,14));
  PANfield.setBounds(300,440,400,30);
 add(PANfield);

  JLabel Adhar = new JLabel("Adhar No:");
  Adhar.setFont(new Font("Raleway",Font.BOLD,22));
  Adhar.setBounds(100,490,200,30);
  add(Adhar);

   Adharfield = new JTextField();
  Adharfield.setFont(new Font("Raleway",Font.BOLD,14));
  Adharfield.setBounds(300,490,400,30);
 add(Adharfield);

  JLabel SeniorCitizen= new JLabel("SeniorCitizen:");
  SeniorCitizen.setFont(new Font("Raleway",Font.BOLD,22));
  SeniorCitizen.setBounds(100,540,200,30);
  add(SeniorCitizen);


  Syes =new JRadioButton("Yes");
  Syes.setBounds(300,540,100,30);
  add(Syes);
 
   Sno =new JRadioButton("NO");
   Sno.setBounds(500,540,100,30);
  add(Sno);

   
  ButtonGroup seniorCitizen = new ButtonGroup();
  seniorCitizen.add( Syes);
  seniorCitizen.add(Sno);


 JLabel Exising= new JLabel("Exising Account:");
 Exising.setFont(new Font("Raleway",Font.BOLD,22));
 Exising.setBounds(100,590,200,30);
 add(Exising);

 Eyes =new JRadioButton("Yes");
 Eyes.setBounds(300,590,100,30);
 add(Eyes);

  Eno =new JRadioButton("NO");
  Eno.setBounds(500,590,100,30);
 add(Eno);

  
 ButtonGroup groupExising = new ButtonGroup();
 groupExising.add( Eyes);
 groupExising.add(Eno);


 JButton next = new JButton("NEXT");
 next.setBackground(Color.BLACK);
 next.setForeground(Color.WHITE);
 next.setFont(new Font("raleway",Font.BOLD, 14));
 next.setBounds(620,660,80,30);
 next.addActionListener(this);
 add(next);

 getContentPane().setBackground(Color.WHITE) ;

   setSize(850,800);
   setLocation(350,10);
   setVisible(true);

   
    }

    public void actionPerformed(ActionEvent ae){
  String formno = " " + Random;
  String sReligion = (String) religion.getSelectedItem();
  String sCategory= (String)category.getSelectedItem();
  String sIncome = (String)income.getSelectedItem();
  String sEducation= (String)education.getSelectedItem();
  String soccupation= (String)occupation.getSelectedItem();
  String seniorCitizen= null;
   String gender = null;
   if (Syes.isSelected()) {
    gender ="Yes"; 
   }else if (Sno.isSelected()) {
     gender ="No";   
   }

  
   String exising = null;
   if (Eyes.isSelected()) {
    exising= "Yes";
   }else if (Eno.isSelected()) {
    exising ="No";
   }
String sPAN  = PANfield.getText();
String sAdhar  = Adharfield.getText();

try{
    
       Conn c =new Conn();
       String query="insert into Signuptwo values ('"+formno+"','"+sReligion+"','"+sCategory+"','"+sIncome+"','"+sEducation+"','"+soccupation+"','"+sPAN+"','"+sAdhar +"','"+seniorCitizen+"','"+exising+"')";
       c.s.executeUpdate(query);

       setVisible(false);
       new SignupThree(formno).setVisible(true);
      
}catch (Exception e){
    
    System.out.println(e);
}
    }

    
public static void main(String[] args) {
    new SignupTwo("");
}
}
