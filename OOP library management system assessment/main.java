import java.util.Scanner;

public class main{


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Password = 123;
        Boolean access = false;

        System.out.println("Welcome to the Library Database Management System. Please enter the password; ");
        int passinp = scanner.nextInt();

        while (access == false){
            if (passinp == Password){
                access = true;
            }
            else{
                System.out.println("Password Incorrect");
                passinp = scanner.nextInt();
            }
        }

        while (access == true){
            System.out.println("Access Granted. Please choose 1 of the following.");
            System.out.println("1: Retrieve record");
            System.out.println("2: Update record");
            System.out.println("3: Delete record");
            System.out.println("4: Exit database");
            int choice = scanner.nextInt();

            if (choice == 1){

            }

            if (choice == 2){

            }

            if (choice == 3){

            }

            if (choice == 4){
                access = false;
            }
        }

    }



}