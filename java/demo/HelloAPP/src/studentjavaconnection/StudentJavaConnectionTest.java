package studentjavaconnection;

import java.sql.*;
import java.util.Scanner;

public class StudentJavaConnectionTest {


    private Connection connection=null;
    private Statement statement=null;
    private ResultSet resultSet=null;
    private PreparedStatement preparedStatement=null;

    public static void main(String[] args) {
        StudentJavaConnectionTest sjt= new StudentJavaConnectionTest();
        System.out.println("test");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sjt.connection = DriverManager.getConnection("jdbc:mysql://localhost/javadb?user=root&password=rootroot");

            Scanner scanner=new Scanner(System.in);
            System.out.print("Please insert student name:");
            String name=scanner.nextLine();
            System.out.print("Please insert age:");
            int age=scanner.nextInt();
            //insert
            sjt.preparedStatement=sjt.connection.prepareStatement("insert into student(name,age) values(?,?)");
            sjt.preparedStatement.setString(1,name);
            sjt.preparedStatement.setInt(2,age);
            sjt.preparedStatement.executeUpdate();

            //update
//            sjt.preparedStatement=sjt.connection.prepareStatement("update student set name=? where id=?");
//            sjt.preparedStatement.setString(1,"Jemal");
//            sjt.preparedStatement.setInt(2,3);
//            sjt.preparedStatement.executeUpdate();

            //delete
//            sjt.preparedStatement=sjt.connection.prepareStatement("delete from student where id=?");
//            sjt.preparedStatement.setInt(1,2);
//            sjt.preparedStatement.executeUpdate();


            //select
            sjt.statement=sjt.connection.createStatement();
            sjt.resultSet = sjt.statement.executeQuery("select * from student");
            while (sjt.resultSet.next()){
                System.out.println(sjt.resultSet.getInt("id")+":"+sjt.resultSet.getString("name")+":"+sjt.resultSet.getInt("age"));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
