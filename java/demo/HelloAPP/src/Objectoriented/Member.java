package Objectoriented;

 public class Member {
     private String name;
     private String subject;
     public Member(String subject,String name){
         this.name=name;
         this.subject=subject;
     }
     String report(){
         return "Attending "+this.subject;
     }

     public String getName() {
         return name;
     }

     public String getSubject() {
         return subject;
     }
 }
