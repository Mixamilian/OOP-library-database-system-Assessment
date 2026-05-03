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
            System.out.println("3: Add new record");
            System.out.println("4: Delete record");
            System.out.println("5: Exit database");
            int choice = scanner.nextInt();

            //Retrieval choice menu
            if (choice == 1){
                System.out.println("From which table Would you like to retrieve from;");
                System.out.println("1: book_management");
                System.out.println("2: member_management");
                System.out.println("3: borrowing_management");
                int Rchoice1 = scanner.nextInt();
                if (Rchoice1 == 1){

                }
                else if (Rchoice1 == 2){

                }
                else if (Rchoice1 == 3){

                }
            }

            //Update choice menu
            if (choice == 2){
                System.out.println("Which table would ou like to update;");
                System.out.println("1: book_management");
                System.out.println("2: member_management");
                System.out.println("3: borrowing_management");
                 int Uchoice1 = scanner.nextInt();
                if (Uchoice1 == 1){

                }
                else if (Uchoice1 == 2){

                }
                else if (Uchoice1 == 3){

                }
            }


            //new record Choice Menu
            if (choice == 3){
                System.out.println("Into which table would you like to create a new record;");
                System.out.println("1: book_management");
                System.out.println("2: member_management");
                System.out.println("3: borrowing_management");
                 int Nchoice1 = scanner.nextInt();
                if (Nchoice1 == 1){

                }
                else if (Nchoice1 == 2){

                }
                else if (Nchoice1 == 3){

                }
            }

            // Delete record choice menu
            if (choice == 4){
                System.out.println("From which table Would you like to delete a record from;");
                System.out.println("1: book_management");
                System.out.println("2: member_management");
                System.out.println("3: borrowing_management");
                int Dchoice1 = scanner.nextInt();
                 if (Dchoice1 == 1){

                }
                else if (Dchoice1 == 2){

                }
                else if (Dchoice1 == 3){

                }
            }

            //exit System choice
            if (choice == 5){
                access = false;
            }
        }

    }



}