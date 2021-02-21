package Objectoriented;

public class OOPTest {

    public static void main(String[] args){
        Student studentkebede = new Student("English","Kebede",2020);
        Member studentAlemu=new Member("Chemistry","Alemu");

        Member studentMember=new Student("Maths","Mathiyas",2021);
        Member instructorMember=new Instructor("Biology", "Tomas","AAU");

        System.out.println(studentkebede.getName()+" report is "+studentkebede.report());
        System.out.println(studentAlemu.getName()+" report is "+studentAlemu.report());
        System.out.println(studentMember.getName()+" report is "+studentMember.report());
        System.out.println(instructorMember.getName()+" report is "+instructorMember.report());


    }

}
