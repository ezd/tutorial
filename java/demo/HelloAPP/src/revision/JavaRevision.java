package revision;

public class JavaRevision {


    public static void main(String[] args){

//        Employee emp1=new Employee();
//        emp1.setFirstName("kebede");
//        emp1.setLastName("tesema");
//        emp1.setAge(44);
//        emp1.setSex("Male");

        Employee emp1=new Employee("Kebede","Tesema",33,"Male");

        System.out.println("Firs name is:"+emp1.getFirstName());
        System.out.println("Last name is:"+emp1.getLastName());
        System.out.println("Age  is:"+emp1.getAge());
        System.out.println("Sex is:"+emp1.getSex());
    }

}
