package project;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SallesApp {
    public static void main(String[] args) {
        boolean sallContinue=true;
        do {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please choose from the menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Add employee");
            System.out.println("3. Add Customer");
            System.out.println("4. View Item");

            System.out.print("Please insert the number:");
            int option=scanner.nextInt();
            if(option==1){
                //adding item
                System.out.println("adding item");
            }else if(option==2){
               //add employee
                System.out.println("adding employee");
            }//up to all options end
            else if(option==3){
                System.out.println("adding customer");
            }else if(option==4){
                System.out.println("view items");
            }else{
                System.out.println("invalid option");
            }







            System.out.println("Do you want to coninue y/n");
            String doCont= scanner.next();
            if(doCont.equalsIgnoreCase("y")){
                sallContinue=true;
            }else if(doCont.equalsIgnoreCase("n")){
                sallContinue=false;
            }else{
                System.out.println("invalid option!");
                sallContinue=false;
            }

        }while(sallContinue);
        System.out.println("See you soon");
    }
}
