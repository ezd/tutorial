package revision;

public class Employee {

    public static int count;

    public Employee(){

    }

    public Employee(String n, String l, int a, String s){
        this.firstName = n;
        this.lastName = l;
        this.age =a;
        this.sex=s;
    }

    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    public void setSex(String s){
        this.sex=s;
    }

    public String getSex(){
        return this.sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
