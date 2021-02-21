package Objectoriented;

public class Instructor extends Member{

    String graduatedFrom;

    Instructor(String subject,String name, String graduatedFrom){
        super(subject,name);// it has to be first
        this.graduatedFrom=graduatedFrom;
    }

    String report(){
        return "Graduated from "+this.graduatedFrom+"Teaching "+super.getSubject();
    }


}
