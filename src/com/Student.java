/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author madhunepal
 */
public class Student {
    private String name;
    private int age, roll;
    private char grade;
    private Academic academic =new Academic();
    private Sport sport=new Sport();

    public Academic getAcademic() {
        
        return academic;
    }

    public void setAcademic(Academic academic) {
        this.academic = academic;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", roll=" + roll + ", grade=" + grade + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
public float getPercent(Student s){
    float totalmarks= s.getAcademic().getEnglish()+ s.getAcademic().getMathmark()+s.getAcademic().getSciencemark()+ s.getSport().getCricketmark()+s.getSport().getFootballmark();        
        float percentmark =(totalmarks/5);
return percentmark;
}
    public char getGrade(Student s) {
        float totalmarks= s.getAcademic().getEnglish()+ s.getAcademic().getMathmark()+s.getAcademic().getSciencemark()+ s.getSport().getCricketmark()+s.getSport().getFootballmark();        
        float percentmark =(totalmarks/5);
       // System.out.println(totalmarks);

       if (percentmark >= 90.00 && percentmark<100){
           return 'A'; }
       
       
           else if (percentmark >= 80.00 && percentmark<90){
           return 'B';
                  
       }
        else if (percentmark >= 70.00 && percentmark<80){
           return 'C';
                  
       }
        else if (percentmark >= 60.00&& percentmark<70){
           return 'D';
                  
       }
       else {
           return 'F';}
       
       
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    
}
