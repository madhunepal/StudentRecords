/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecord;

import com.Student;
import java.util.Scanner;

/**
 *
 * @author madhunepal
 */
public class StudentRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
            
        
        Student student =new Student();
     /**   s.setName("Madhu");
        s.setAge(16);
        s.setRoll(19);
       // s.setGrade('A');
        s.getAcademic().setEnglish(40);
        s.getAcademic().setMathmark(50);
        s.getAcademic().setSciencemark(38);
        s.getSport().setCricketmark(55);
        s.getSport().setFootballmark(37);
        System.out.println(s.getGrade(s));
        * */
        
        
    //Testing for scanner 
             Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name:\t");
        String sName = scanner.nextLine();
        student.setName(sName);

        System.out.print("Enter" + sName + "'s  age:\t");
        student.setAge(scanner.nextInt());
        System.out.print("Enter" + sName + "'s  roll:\t");
        student.setRoll(scanner.nextInt());
        System.out.print("Enter" + sName + "'s  mathmark:\t");
        student.getAcademic().setMathmark(scanner.nextFloat());
        System.out.print("Enter" + sName + "'s  englishmark:\t");
        student.getAcademic().setEnglish(scanner.nextFloat());
        System.out.print("Enter" + sName + "'s  sciencemark:\t");
        student.getAcademic().setSciencemark(scanner.nextFloat());
        //System.out.println("Student Info"+ student.toString());
        System.out.print("Enter" + sName + "'s cricketmark:\t");
        student.getSport().setCricketmark(scanner.nextFloat());
         System.out.print("Enter" + sName + "'s footballmark:\t");
        student.getSport().setFootballmark(scanner.nextFloat());
        
        System.out.println("Following are the info for"+ sName);
        System.out.println("Name:"+student.getName());
        System.out.println("Roll:"+ student.getRoll());
       System.out.println("Student percent:"+ student.getPercent(student));
        System.out.println("Student grade: "+student.getGrade(student));
        
        System.out.println("*******************************************");
        
        
        
    }

         
    }    
        
        
    }
    

