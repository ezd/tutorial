package x;

public class Students {

    private String name;
    public String lname;
    int age;

    public Students(){

    }

    public Students(String n, String ln, int x){
        this.name=n;
        this.lname=ln;
        this.age=x;

    }


    public void donamesetting(String a){
        this.name=a;
    }

    public String dogettname(){
        return this.name;
    }
}
