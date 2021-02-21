package x;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;
import java.util.regex.Pattern;

import revision.Employee;

public class EmployeeInfo {
    public static void main(String[] args){

        SimpleDateFormat formatter= new SimpleDateFormat("YY/dd/mm");
        SimpleDateFormat formatter2= new SimpleDateFormat("YYYY/DD/MM");


        Date x=new Date();
        System.out.println(x);

        System.out.println(formatter.format(x));
        System.out.println(formatter2.format(x));



    }
}
