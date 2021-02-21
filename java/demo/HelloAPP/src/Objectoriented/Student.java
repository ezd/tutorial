package Objectoriented;

public class Student extends Member{

    int graduationYear;

    Student(String subject,String name,int graduationYear){
        super(subject,name);// it has to be first
        this.graduationYear = graduationYear;
    }

    String report(){
        return "Learning "+super.getSubject()+" Will be graduated on "+this.graduationYear;
    }

}
