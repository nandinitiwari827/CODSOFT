/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_3;

/**
 *
 * @author Lenovo
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class Task_3 extends Frame implements ActionListener{
    Label l1,l1a,q1,q2,q3,q4,q5,r1,r2,r3,r4,r5,r1a,r2a,r3a,r4a,r5a,x,y,t1,t2,t3,t4,t5;
    Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
    CheckboxGroup g1,g2,g3,g4,g5;
    Button b1,b2,b2a,b2b,b2c,b3;
    Timer ta,tb,tc,td,te;
    int timeleft1=6;
    int timeleft2=6;
    int timeleft3=6;
    int timeleft4=6;
    int timeleft5=6;
       int score=0;
    public Task_3(){
        Color a1=new Color(0XDE1A22);
        Color a2=new Color(0X29ED14);
       Font f1a = new Font("calibri",Font.BOLD,42);
        Font f1 = new Font("aharoni",Font.PLAIN,23);
         Font f2 = new Font("calibri",Font.PLAIN,18);
          Font f3 = new Font("calibri",Font.BOLD,22);
           Font f4 = new Font("calibri",Font.BOLD,28);
        
        l1=new Label("This is an animal quiz having 5 questions.");
        l1.setBounds(38,60,520,30);
        l1.setFont(f1);
        
        
        l1a=new Label("You have to answer each question within 05 seconds.");
        l1a.setBounds(38,110,560,30);
        l1a.setFont(f1);
      
        
        b1=new Button("START");
        b1.setBounds(210,220,160,70);
        b1.setFont(f1a);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.ORANGE);
                
        q1=new Label("1. Which animal is the largest mammal on Earth?");
        q1.setFont(f2);
        q1.setBounds(50,120,500,30);
        q1.setVisible(false);
        
        g1=new CheckboxGroup();
        c1 = new Checkbox("Tiger",g1,false);
        c1.setBounds(70,170,100,30);
        c1.setFont(f2);
        c1.setVisible(false);
        c2 = new Checkbox("Lion",g1,false);
        c2.setBounds(70,210,100,30);
        c2.setFont(f2);
        c2.setVisible(false);
        c3 = new Checkbox("Elephant",g1,false);
        c3.setBounds(70,250,100,30);
        c3.setFont(f2);
        c3.setVisible(false);
        
        q2=new Label("2. Which is the fastest land animal?");
        q2.setFont(f2);
        q2.setBounds(50,120,500,30);
        q2.setVisible(false);
        
        g2=new CheckboxGroup();
        c4 = new Checkbox("Lion",g2,false);
        c4.setBounds(70,170,100,30);
        c4.setFont(f2);
        c4.setVisible(false);
        c5 = new Checkbox("Cheetah",g2,false);
        c5.setBounds(70,210,100,30);
        c5.setFont(f2);
        c5.setVisible(false);
        c6 = new Checkbox("Horse",g2,false);
        c6.setBounds(70,250,100,30);
        c6.setFont(f2);
        c6.setVisible(false);
        
        q3=new Label("3. What type of animal is a Komodo dragon?");
        q3.setFont(f2);
        q3.setBounds(50,120,500,30);
        q3.setVisible(false);
        
        g3=new CheckboxGroup();
        c7 = new Checkbox("Mammal",g3,false);
        c7.setBounds(70,170,100,30);
        c7.setFont(f2);
        c7.setVisible(false);
        c8 = new Checkbox("Reptile",g3,false);
        c8.setBounds(70,210,100,30);
        c8.setFont(f2);
        c8.setVisible(false);
        c9 = new Checkbox("Amphibian",g3,false);
        c9.setBounds(70,250,100,30);
        c9.setFont(f2);
        c9.setVisible(false);
        
        q4=new Label("4. Which animal is known to sleep while standing up?");
        q4.setFont(f2);
        q4.setBounds(50,120,500,30);
        q4.setVisible(false);
        
        g4=new CheckboxGroup();
        c10 = new Checkbox("Cow",g4,false);
        c10.setBounds(70,170,100,30);
        c10.setFont(f2);
        c10.setVisible(false);
        c11 = new Checkbox("Dog",g4,false);
        c11.setBounds(70,210,100,30);
        c11.setFont(f2);
        c11.setVisible(false);
        c12 = new Checkbox("Horse",g4,false);
        c12.setBounds(70,250,100,30);
        c12.setFont(f2);
        c12.setVisible(false);
        
        q5=new Label("5. Which bird is known for its ability to mimic sounds?");
        q5.setFont(f2);
        q5.setBounds(50,120,500,30);
        q5.setVisible(false);
        
         g5=new CheckboxGroup();
        c13 = new Checkbox("Parrot",g5,false);
        c13.setBounds(70,170,100,30);
        c13.setFont(f2);
        c13.setVisible(false);
        c14 = new Checkbox("Owl",g5,false);
        c14.setBounds(70,210,100,30);
        c14.setFont(f2);
        c14.setVisible(false);
        c15 = new Checkbox("Penguin",g5,false);
        c15.setBounds(70,250,100,30);
        c15.setFont(f2);
        c15.setVisible(false);
        
        b2=new Button("Question 2->");
        b2.setBounds(380,400,150,50);
        b2.setFont(f3);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.WHITE);
        b2.setVisible(false);
        
          b2a=new Button("Question 3->");
        b2a.setBounds(380,400,150,50);
        b2a.setFont(f3);
        b2a.setBackground(Color.ORANGE);
        b2a.setForeground(Color.WHITE);
        b2a.setVisible(false);
        
          b2b=new Button("Question 4->");
        b2b.setBounds(380,400,150,50);
        b2b.setFont(f3);
        b2b.setBackground(Color.ORANGE);
        b2b.setForeground(Color.WHITE);
        b2b.setVisible(false);
        
          b2c=new Button("Question 5->");
        b2c.setBounds(380,400,160,50);
        b2c.setFont(f3);
        b2c.setBackground(Color.ORANGE);
        b2c.setForeground(Color.WHITE);
        b2c.setVisible(false);
        
        b3=new Button("Submit");
        b3.setBounds(380,400,110,50);
        b3.setFont(f3);
        b3.setBackground(Color.ORANGE);
        b3.setForeground(Color.WHITE);
        b3.setVisible(false);
        
         x=new Label("THANK YOU!!!");
       x.setFont(f4);
        x.setBounds(200,80,500,30);
        x.setVisible(false);
        
         y=new Label("");
       y.setFont(f3);
       y.setForeground(a2);
        y.setBounds(225,120,500,30);
        y.setVisible(false);
        
         r1a=new Label("1. Correct answer: Elephant");
        r1a.setFont(f2);
        r1a.setBounds(50,190,500,30);
        r1a.setVisible(false);
        
        r1=new Label("");
        r1.setFont(f2);
        r1.setBounds(70,220,500,30);
        r1.setVisible(false);
        
        r2a=new Label("2. Correct answer: Cheetah");
        r2a.setFont(f2);
        r2a.setBounds(50,260,500,30);
        r2a.setVisible(false);
        
        r2=new Label("");
        r2.setFont(f2);
        r2.setBounds(70,290,500,30);
        r2.setVisible(false);
        
        r3a=new Label("3. Correct answer: Reptile");
        r3a.setFont(f2);
        r3a.setBounds(50,330,500,30);
        r3a.setVisible(false);
        
        r3=new Label("");
        r3.setFont(f2);
        r3.setBounds(70,360,500,30);
        r3.setVisible(false);
        
        r4a=new Label("4. Correct answer: Horse");
        r4a.setFont(f2);
        r4a.setBounds(50,400,500,30);
        r4a.setVisible(false);
        
        r4=new Label("");
        r4.setFont(f2);
        r4.setBounds(70,430,500,30);
        r4.setVisible(false);
        
        r5a=new Label("5. Correct answer: Parrot");
        r5a.setFont(f2);
        r5a.setBounds(50,470,500,30);
        r5a.setVisible(false);
        
        r5=new Label("");
        r5.setFont(f2);
        r5.setBounds(70,500,500,30);
        r5.setVisible(false);
        
        t1=new Label("");
        t1.setForeground(a1);
        t1.setBounds(410,220,130,30);
        t1.setVisible(false);
        
         t2=new Label("");
        t2.setForeground(a1);
        t2.setBounds(410,220,130,30);
        t2.setVisible(false);
        
         t3=new Label("");
        t3.setForeground(a1);
        t3.setBounds(410,220,130,30);
        t3.setVisible(false);
        
         t4=new Label("");
        t4.setForeground(a1);
        t4.setBounds(410,220,130,30);
        t4.setVisible(false);
        
         t5=new Label("");
        t5.setForeground(a1);
        t5.setBounds(410,220,130,30);
        t5.setVisible(false);
   
       
       this.add(l1a); 
       this.add(l1);
       this.add(q1);
       this.add(q2);
       this.add(q3);
       this.add(q4);
       this.add(q5);
       this.add(c1);
       this.add(c2);
       this.add(c3);
       this.add(c4);
       this.add(c5);
       this.add(c5);
       this.add(c6);
       this.add(c7);
       this.add(c8);
       this.add(c9);
       this.add(c10);
       this.add(c11);
       this.add(c12);
       this.add(c13);
       this.add(c14);
       this.add(c15);
       this.add(b1);
       this.add(b2);
       this.add(b2a);
       this.add(b2b);
       this.add(b2c);
       this.add(b3);
       this.add(r1);
       this.add(r2);
       this.add(r3);
       this.add(r4);
       this.add(r5);
       this.add(r1a);
       this.add(r2a);
       this.add(r3a);
       this.add(r4a);
       this.add(r5a);
       this.add(x);
       this.add(y);
       this.add(t1);
       this.add(t2);
       this.add(t3);
       this.add(t4);
       this.add(t5);
       
       this.setLayout(null);
       this.setVisible(true);
       this.setSize(630,550);
       this.setTitle("QUIZ");    


      b1.addActionListener(new ActionListener(){
    @Override
 public void actionPerformed(ActionEvent e){
 if (e.getSource()==b1) {
       t1.setVisible(true);
     l1a.setVisible(false);
     l1.setVisible(false);
     b1.setVisible(false);
     q1.setVisible(true);
     c1.setVisible(true);
     c2.setVisible(true);
     c3.setVisible(true);
     b2.setVisible(true);
     
    timeleft1=6;
  Timer ta=new Timer();
        ta.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                timeleft1--;
                t1.setText("Time left: "+timeleft1+" seconds");
                if(timeleft1==0){
                    ta.cancel();
                     c1.setEnabled(false);
                     c2.setEnabled(false);
                     c3.setEnabled(false);
                       
    
        }}},1000,1000); 
 }}});

       b2.addActionListener(new ActionListener(){
    @Override
 public void actionPerformed(ActionEvent e){
       if (e.getSource() == b2) {
           if(ta!=null){ta.cancel();ta=null;}
            timeleft2=6;
     Timer tb=new Timer();
        tb.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                timeleft2--;
                t2.setText("Time left: "+timeleft2+" seconds");
                if(timeleft2==0){
                    tb.cancel();
                   c4.setEnabled(false);
                   c5.setEnabled(false);
                   c6.setEnabled(false);
                }
            }
        },1000,1000);     
     
        t1.setVisible(false);
     t2.setVisible(true);
           b2.setVisible(false);
     b2a.setVisible(true);
      q2.setVisible(true);
     c4.setVisible(true);
     c5.setVisible(true);
     c6.setVisible(true);
      q1.setVisible(false);
     c1.setVisible(false);
     c2.setVisible(false);
     c3.setVisible(false);
       if(c3.getState()) {score++; r1.setForeground(a2);}else{r1.setForeground(a1);}
        Checkbox selected1=g1.getSelectedCheckbox();
         if(selected1==null){
                             r1.setText("No answer");
                         }else{r1.setText("Your answer: "+selected1.getLabel());}
 }}});
       
       b2a.addActionListener(new ActionListener(){
    @Override
 public void actionPerformed(ActionEvent e){
      if(e.getSource() == b2a) {
            if(tb!=null){tb.cancel();tb=null;}
           timeleft3=6;
     Timer tc=new Timer();
        tc.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                timeleft3--;
                t3.setText("Time left: "+timeleft3+" seconds");
                if(timeleft3==0){
                      tc.cancel();
                      c7.setEnabled(false);
                      c8.setEnabled(false);
                      c9.setEnabled(false);
             }
            }
        },1000,1000); 
        
          t2.setVisible(false);
          t3.setVisible(true);
     b2a.setVisible(false);
     b2b.setVisible(true);
      q3.setVisible(true);
     c7.setVisible(true);
     c8.setVisible(true);
     c9.setVisible(true);
      q2.setVisible(false);
     c4.setVisible(false);
     c5.setVisible(false);
     c6.setVisible(false);
      if(c5.getState()) {score++; r2.setForeground(a2);}else{r2.setForeground(a1);} 
      Checkbox selected2=g2.getSelectedCheckbox();
      if(selected2==null){
                             r2.setText("No answer");
                         }else{r2.setText("Your answer: "+selected2.getLabel());}
 }}});
       
       b2b.addActionListener(new ActionListener(){
    @Override
 public void actionPerformed(ActionEvent e){
      if(e.getSource() == b2b) {
            if(tc!=null){tc.cancel();tc=null;}
           timeleft4=6;
     Timer td=new Timer();
        td.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                timeleft4--;
                t4.setText("Time left: "+timeleft4+" seconds");
                if(timeleft4==0){
                     td.cancel();
                     c10.setEnabled(false);
                     c11.setEnabled(false);
                     c12.setEnabled(false);
                                      
  }}},1000,1000);
        
            t3.setVisible(false);
     t4.setVisible(true);
     b2b.setVisible(false);
     b2c.setVisible(true);
      q4.setVisible(true);
     c10.setVisible(true);
     c11.setVisible(true);
     c12.setVisible(true);
      q3.setVisible(false);
     c7.setVisible(false);
     c8.setVisible(false);
     c9.setVisible(false);
       if(c8.getState()) {score++; r3.setForeground(a2);}else{r3.setForeground(a1);}
        Checkbox selected3=g3.getSelectedCheckbox();
         if(selected3==null){
                             r3.setText("No answer");
                         }else{r3.setText("Your answer: "+selected3.getLabel());}
 }}});
       
       b2c.addActionListener(new ActionListener(){
    @Override
 public void actionPerformed(ActionEvent e){
     if(e.getSource() == b2c) {
           if(td!=null){td.cancel();td=null;}
          timeleft5=6;
     Timer te=new Timer();
        te.scheduleAtFixedRate(new TimerTask(){
            public void run(){
                timeleft5--;
                t5.setText("Time left: "+timeleft5+" seconds");
                if(timeleft5==0){
                    te.cancel();          
           c13.setEnabled(false);
                     c14.setEnabled(false);
                     c15.setEnabled(false);
                         
                }}},1000,1000);
        
         t4.setVisible(false);
         t5.setVisible(true);
     b2c.setVisible(false);
     b3.setVisible(true);
      q5.setVisible(true);
     c13.setVisible(true);
     c14.setVisible(true);
     c15.setVisible(true);
      q4.setVisible(false);
     c10.setVisible(false);
     c11.setVisible(false);
     c12.setVisible(false);
      if(c12.getState()) {score++; r4.setForeground(a2);}else{r4.setForeground(a1);}
       Checkbox selected4=g4.getSelectedCheckbox();
        if(selected4==null){
                             r4.setText("No answer");
                         }else{r4.setText("Your answer: "+selected4.getLabel());}
     }}});
       
       b3.addActionListener(new ActionListener(){
    @Override
 public void actionPerformed(ActionEvent e){
      if(e.getSource() == b3) {
            if(te!=null){te.cancel();te=null;}
           t5.setVisible(false);
           b3.setVisible(false);
      q5.setVisible(false);
     c13.setVisible(false);
     c14.setVisible(false);
     c15.setVisible(false);
          x.setVisible(true);
          y.setVisible(true);
          r1a.setVisible(true);
          r2a.setVisible(true);
          r3a.setVisible(true);
          r4a.setVisible(true);
          r5a.setVisible(true);
          r1.setVisible(true);
          r2.setVisible(true);
          r3.setVisible(true);
          r4.setVisible(true);
          r5.setVisible(true);
      
     if(c13.getState()) {score++; r5.setForeground(a2);}else{r5.setForeground(a1);}
                         Checkbox selected5=g5.getSelectedCheckbox();
     
                         if(selected5==null){
                             r5.setText("No answer");
                         }else{r5.setText("Your answer: "+selected5.getLabel());}
                         y.setText("Your score: "+score);
                         
     }}});
       this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }});
        }

    public static void main(String[] args) {
        new Task_3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}