import java.util.Scanner;

/*
This is Quiz 1.1 for Y11 CS. This code prompts a user for their name, age, and favourite food and prints it out
Author: Alexis C
Date: 09-13-2023
 */

public class Main {

    public static void main(String[] args) {
        //Declare Variables
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String myFavouriteFood;
        //Asks user for their first name
        System.out.println("Please enter your first name: ");
        firstName = scanner.nextLine();
        //Asks user for their age
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        //Asks user for their favourite food
        System.out.println("Please enter your favourite food: ");
        myFavouriteFood = scanner.nextLine();
        //Prints the results
        System.out.println("\nYour Name is: " + firstName + "\nYour age is: " + age + "\nYour favourite food is: " + myFavouriteFood);

    }

}