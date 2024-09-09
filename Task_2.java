/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_2;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.print("Enter name of the student: ");
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        System.out.print("Enter marks in Maths out of 100: ");
        double maths=s.nextDouble();
        System.out.print("Enter marks in Physics out of 100: ");
        double physics=s.nextDouble();
        System.out.print("Enter marks in Chemistry out of 100: ");
        double chemistry=s.nextDouble();
        System.out.print("Enter marks in English out of 100: ");
        double english=s.nextDouble();
        System.out.print("Enter marks in Computer out of 100: ");
        double computer=s.nextDouble();
        
        if(maths>100 || chemistry>100 || physics>100 || english>100 || computer>100){
            System.out.println();
                        System.out.println("INVALID MARKS ENTERED !!!");
                    }
        else{
        double total_marks=maths+physics+chemistry+english+computer;
        double avg_percentage=total_marks/5;
        System.out.println();
        System.out.println("Results:");
        System.out.println("------------------------------------------");
        System.out.println("Name of the student: "+name);
        System.out.println("Total Marks obtained: "+total_marks);
        System.out.println("Average Percentage obtained: "+avg_percentage+"%");
        
        if(avg_percentage>=0 & avg_percentage<=40){
            System.out.println("Grade: F");
            System.out.println("YOU ARE FAILED !!!"); 
           }
         if(avg_percentage>40 & avg_percentage<=45){
            System.out.println("Grade: D(-)");
            }
          if(avg_percentage>45 & avg_percentage<=50){
            System.out.println("Grade: D");
           }
           if(avg_percentage>50 & avg_percentage<=55){
            System.out.println("Grade: D(+)");
           }
            if(avg_percentage>55 & avg_percentage<=60){
            System.out.println("Grade: C(-)");
            }
             if(avg_percentage>60 & avg_percentage<=65){
            System.out.println("Grade: C");
             }
              if(avg_percentage>65 & avg_percentage<=70){
            System.out.println("Grade: C(+)");
              }
               if(avg_percentage>70 & avg_percentage<=75){
            System.out.println("Grade: B(-)");
               }
                if(avg_percentage>75 & avg_percentage<=80){
            System.out.println("Grade: B");
                }
                 if(avg_percentage>80 & avg_percentage<=85){
            System.out.println("Grade: B(+)");
                 }
                  if(avg_percentage>85 & avg_percentage<=90){
            System.out.println("Grade: A(-)");
                  }
                   if(avg_percentage>90 & avg_percentage<=95){
            System.out.println("Grade: A");
                   }
                    if(avg_percentage>95 & avg_percentage<=100){
            System.out.println("Grade: A(+)");
                    }                 
    }}}