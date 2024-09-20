/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_4;

/**
 *
 * @author Lenovo
 */
import java.util.*;
class allcourses{
    private int course_code;
    private String course_name;
    private String description;
    private int capacity;
    private String schedule;
    private int fees;
    private int duration;
    private int available_slots;
    
    public allcourses(int course_code,String course_name,String description,int capacity,String schedule,int fees,int duration,int available_slots){
        this.course_code=course_code;
        this.course_name=course_name;
        this.description=description;
        this.capacity=capacity;
        this.schedule=schedule;
        this.fees=fees;
        this.duration=duration;
        this.available_slots=available_slots;
    }
    public int getcoursecode(){
        return course_code;
    }
    public String getcoursename(){
        return course_name;
    }
    public String getdescription(){
        return description;
    }
    public int getcapacity(){
        return capacity;
    }
    public String getschedule(){
            return schedule;
} 
    public int getfees(){
        return fees;
    }
    public int getduration(){
        return duration;
    }
public int getslots(){
    return available_slots;
}
}

class coursedb{
    ArrayList<allcourses>course;
    
    public coursedb(){
        course=new ArrayList<>();
    }
    public void addcourse(allcourses Course){
        course.add(Course);
    }
    public void printcourse(){
        for(allcourses Course : course){
            System.out.println("Course code: "+Course.getcoursecode()+" | Course Name: "+Course.getcoursename()+" | Description: "+Course.getdescription()+" | Capacity: "+Course.getcapacity()+" | Schedule: "+Course.getschedule()+" | Fees: Rs."+Course.getfees()+" | Duration: "+Course.getduration()+" | Months | Avaialable slots: "+Course.getslots());
        }
    }
}
class allstudents{
    private int id;
    private String name;
    private String course;
    private String city;
    private int dob;
 
    public allstudents(int id,String name,String course,String city,int dob){
        this.id=id;
        this.name=name;
        this.course=course;
        this.city=city;
        this.dob=dob;
        
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getcourse(){
        return course;
    }
    public String getcity(){
        return city;
    }
    public int getdob(){
        return dob;
    }
   
    @Override
    public String toString(){
    return "ID: "+id+" | Name: "+name+" | Course: "+course+" | City: "+city+" | D.O.B: "+dob;
}
}

 class studentdb{
    ArrayList<allstudents>students;
    private coursedb cdb;
    public studentdb(coursedb cdb){
        students=new ArrayList<>();
        this.cdb=cdb;
    }
    public void addstudent(int id,String name, String course,String city,int dob){
        if(validcourse(course) && nosamedetails(id)){
        allstudents one_student=new allstudents(id,name,course,city,dob);
        students.add(one_student);
       printstudent();
            System.out.println("Student added successfully!!!");
        }else if(validcourse(course)==false){
        System.out.println("WE DON'T HAVE THIS COURSE!!!");
        }else if(nosamedetails(id)==false) {
             System.out.println("ID SHOULD BE DIFFERENT FOR NEW STUDENT!!!");
        }
    }
    
    public void printstudent(){
        if(students.isEmpty()){
            System.out.println("No student added yet");
        }else{
            for(allstudents one_student : students){
                System.out.println(one_student);
            }
        }
    }
    
    boolean nosamedetails(int id){
       for(allstudents one_student : students){
           if(one_student.getid()==id){
               return false;
           }
       } 
        return true;    
    }
    
    public void dropcourse(int id, String name){
        for(int i=0;i<students.size();i++){
        allstudents one_student = students.get(i);
            if(one_student.getid()==id && one_student.getname().equalsIgnoreCase(name)){
          students.remove(i);
          printstudent();
                System.out.println();
                System.out.println("Course dropped successfully for "+name+" !!!");
            return;
            }}
                System.out.println("No student of this ID or name!!!");
          
            }
    
   boolean validcourse(String course){
      for(allcourses Course : cdb.course){
          if(Course.getcoursename().equalsIgnoreCase(course)){
              return true;
          }
      }
      return false;
    }
}

public class Task_4{
    public static void main(String[] args) {
        coursedb cdb=new coursedb();
        cdb.addcourse(new allcourses(94893,"Cybersecurity","In this course, you will study about the fundamentals of protecting networks, systems, and data from cyber threats. Key topics include network security, cryptography, ethical hacking, securing operating systems, identity and access management.",20,"2pm-4pm",1000,1,5));
         cdb.addcourse(new allcourses(48933,"Data Science with Python","In this course, you learn to analyze and interpret data using Python. Topics include data manipulation (with libraries like Pandas), data visualization (using Matplotlib or Seaborn), statistical analysis, machine learning (with libraries like Scikit-learn), and handling large datasets.",70,"5pm-6pm",2000,2,6));
          cdb.addcourse(new allcourses(40902,"Artificial Intelligence and Machine Learning","In this course, you study how to create systems that mimic human intelligence. Topics include machine learning, neural networks, natural language processing, search algorithms, and robotics.",200,"1pm-3pm",800,3,2));
           cdb.addcourse(new allcourses(10192,"Advanced Data Analytics","In this course, you learn to analyze complex data sets using advanced statistical methods and machine learning techniques. Topics include predictive modeling, data mining, big data analytics, and using tools like R or Python.",50,"3pm-4pm",1500,1,10));
           System.out.println("AVAILABLE COURSES:");
           cdb.printcourse();
           studentdb sdb=new studentdb(cdb);
            sdb.printstudent();
        Scanner s=new Scanner(System.in);
      
          while(true){
        System.out.print("Press 1 to register a student or press 2 to drop an existing student's course: ");
        int num=s.nextInt();
        switch(num){
            case 1:
                System.out.print("Enter ID of student: ");
        int id=s.nextInt();
        s.nextLine();
       System.out.print("Enter name of student: ");
       String name=s.nextLine();
        System.out.print("Enter course: ");
       String course=s.nextLine();
       System.out.print("Enter city: ");
       String city=s.nextLine();
       System.out.print("Enter date of birth: ");
       int dob=s.nextInt();
        System.out.println();
       sdb.addstudent(id,name,course,city,dob);
      System.out.println();
       break;
       
            case 2:
                System.out.print("Enter ID of the student for whom you want to drop course: ");
               int id2=s.nextInt();
                s.nextLine();
                System.out.print("Enter name of the student: ");
               String name2=s.nextLine();
               sdb.dropcourse(id2,name2);
               sdb.printstudent();
               break;
        
          default:
          System.out.println("INVALID CHARACTER ENTERED!!!");
        }}}}
         
    

