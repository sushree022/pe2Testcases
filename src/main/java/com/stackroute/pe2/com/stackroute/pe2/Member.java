package com.stackroute.pe2;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Member {

//    A Member's data
    String name;
    int age;
    double salary;

}
class MemberDetails extends Member {

//    Created instance Member class
    Member member=new Member();

//    Method to intilalise Member class varaible name through our class
   public String memberName(String name){
       member.name=name;
       return "Member's Name: ".concat(member.name);
   }

    //    Method to intilalise Member class varaible age through our class
    public String memberAge(int age){
       if (age>0 && age<=150) {
           member.age = age;
           return "Member's Age: ".concat(String.valueOf(member.age));
       }
       else return "age has a limit";
    }

    //    Method to intilalise Member class varaible salary through our class
    public String memberSalary(double salary){

            member.salary = salary;
            return "Member's Salary: ".concat(String.valueOf(member.salary));


    }
}
