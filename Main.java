import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz!\n");

        // Question 1
        System.out.println("1. What does JVM stand for?");
        System.out.println("a) Java Very Machine");
        System.out.println("b) Java Virtual Machine");
        System.out.println("c) Java Verified Mode");
        System.out.println("d) Joint Variable Method");
        System.out.print("Your answer: ");
        String answer1 = sc.nextLine();

        if (answer1.equalsIgnoreCase("b")) {
            score++;
        }
 System.out.println("\n2. Which of these is not a Java keyword?");
        System.out.println("a) static");
        System.out.println("b) Integer");
        System.out.println("c) void");
        System.out.println("d) if");
        System.out.print("Your answer: ");
        String answer2 = sc.nextLine();

        if (answer2.equalsIgnoreCase("b")) {
            score++;
        }
    System.out.println("\n2. whiich of these is not an animal");
        System.out.println("a) dog");
        System.out.println("b) bird ");
        System.out.println("c) cat");
        System.out.println("d) fish");
        System.out.print("Your answer: ");
        String answer3 = sc.nextLine();

        if (answer3.equalsIgnoreCase("b")) {
            score++;
        }
      

       

        System.out.println("\nYour score is: " + score + "/3");
    
    }
    
}
