package functiontest;

import java.util.Scanner;

public class FunctionTest {

    public static void main(String[] args) {

        int a=33;
        int b=44;
        int s=sum(a,b);

        double i=33.333;
        double j=44.34;
        double k=sum(i,j);
        System.out.println(s);
        System.out.println(k);



// function call
        //parameter pass
        //function overload

        //accept student mark. return value
//        int studentMark=acceptStudentMark();
        //process mark. pass value
//        boolean isPassed=isStudentPassed(studentMark);
        //print a result
//        printStudentGrade(studentMark,isPassed);
//        processWithBones(10,studentMark);


    }

    static int sum(int x, int y){
        return x+y;
    }

    static double sum(double x, double y){
        return x+y;
    }

    //accept return
    static int acceptStudentMark(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please insert the student mark:");
        int mark=scanner.nextInt();
        return mark;
    }

    static boolean isStudentPassed(int x){
        if(x>50){
            return true;
        }else {
            return false;
        }
    }

    static void printStudentGrade(int mark){
        boolean isPassed = isStudentPassed(mark);
        System.out.println("The student mark is:"+mark);
        if(isPassed==true){
            System.out.println("The student has passed");
        } else {
            System.out.println("The student has failed");
        }

    }
    //get bones and print grad
    static void processWithBones(int bones,int mark){
        //process with mark only
        printStudentGrade(mark);
        System.out.println("_______________________");
        //process without bones
        boolean canPassWithBonus=isStudentPassed(mark+bones);
        if(canPassWithBonus) {
            printStudentGrade(mark + bones);
        }

    }


}
