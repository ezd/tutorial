package collectionstest;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionTester {

    public static void main(String[] args) {

        Student student1= new Student();
        student1.setName("Kebede");
        student1.setLname("Hagos");

        Student student2= new Student();
        student2.setName("Jemal");
        student2.setLname("Kemal");

        Student student3= new Student();
        student3.setName("Zelalem");
        student3.setLname("Abebe");

        Student student4= new Student();
        student4.setName("Lemlem");
        student4.setLname("Amare");

//        using list
//        List<Student> students= new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        students.add(student4);

//        linked list
//        LinkedList<Student> students = new LinkedList<Student>();
//        students.add(student1);
//        students.addFirst(student4);
//        students.addLast(student2);
//


//        using set
//        Set<Student> students= new HashSet<>();
//        students.add(student1);
//        students.add(student4);
//        students.add(student4);

// tree set for sorted set
//        TreeSet<Student> students = new TreeSet<Student>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//
//        for(Student s:students){
//            System.out.println("Student name:"+s.getName()+", "+s.getLname());
//        }


  //using stream
//        List<String> fullNames=students.stream()
//                .map(student -> getFullName(student))
//                .collect(Collectors.toList());
//
//        fullNames.stream()
//                .filter(st->st.contains("m"))
//                .forEach(st->{
//                    System.out.println(st);
//                });
//using iterator
//        Iterator it=students.iterator();
//        while(it.hasNext()){
//            System.out.println(((Student)it.next()).getName() + " "+ ((Student)it.next()).getLname());
//        }

//using enhanced forloop
//        for(Student student:students){
//            System.out.println(student.getName() + " "+ student.getLname());
//
//        }

//        using forloop
//        for(int x=0;x<students.size();x++){
//            System.out.println(students.get(x).getName() + " "+ students.get(x).getLname());
//        }



    }

    private static String getFullName(Student student) {
        return student.getName()+", "+student.getLname();
    }


}
