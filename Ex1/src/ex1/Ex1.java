package ex1;

import java.util.Scanner;

public class Ex1 {

    Scanner sc = new Scanner(System.in);
    int number;

    public void enterNum(){
        while (!(number >= 1 && number < 11)) {
            System.out.println("Please enter a number");
            while (!sc.hasNextInt()) {
                System.out.println("Enter a valid number");
                sc.next();
            }
            number = sc.nextInt();
            while (number < 1 || number > 10) {
                System.out.println("Enter a number between 1 and 10");
                while (!sc.hasNextInt()) {
                    System.out.println("Enter a valid number");
                    sc.next();
                }
                number = sc.nextInt();
            }
        }
        System.out.println("You typed: " + number);
        sc.close();
    }

}

        
        
            
        
                

