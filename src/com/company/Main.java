package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int usersInt;
    public static boolean noError = false;
    public static void main(String[] args) {
        gettingUserInput();
        findingAndPrintingTheFactors();

    }
    public static void gettingUserInput(){
        Scanner usersInput = new Scanner(System.in);
        while(!noError){
            try{
                System.out.println("Enter the number you want to find the factors of: ");
                usersInt = usersInput.nextInt();
                noError = true;
            }catch(InputMismatchException ex){
                System.out.println("This is not an integer!, Try again!");
                noError = false;
                gettingUserInput();

            }
        }
    }
    public static void findingAndPrintingTheFactors(){
        System.out.println("The factors of " + usersInt + " are: ");
        for(int i = 1; i <= usersInt; i++){
            if (usersInt % i==0){
                System.out.print(i + " ");
            }
        }
    }
}

