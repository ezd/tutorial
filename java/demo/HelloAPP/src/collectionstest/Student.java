package collectionstest;

public class Student implements Comparable {

    private String name;
    private String lname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    @Override
    public int compareTo(Object studentToCompare) {

        return ((Student)studentToCompare).name.compareTo(this.name);
    }
}
