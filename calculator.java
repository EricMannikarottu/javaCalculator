import java.util.*;

public class calculator {

    public static int calcSum(int choice, int numbers[]){

        int result=0;
        if (choice == 1) { // Addition
            for (int num : numbers) {
                result += num;
            }
        } else if (choice == 2) { // Subtraction
            result = numbers[0]; // Start with the first element
            for (int i = 1; i < numbers.length; i++) {
                result -= numbers[i];
            }
        } else if (choice == 3) { // Multiplication
            result = 1; // Start with 1 for multiplication
            for (int num : numbers) {
                result *= num;
            }
        } else if (choice == 4) { // Division
            result = numbers[0]; // Start with the first element
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] != 0) {
                    result /= numbers[i];
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return 0; // Return 0 if division by zero is encountered
                }
            }
        } else {
            System.out.println("Invalid choice");
            return 0;
        }

        return result;


    }

    public static void main(String args[]){


        Scanner sc =new Scanner(System.in);//Creating new scanner 
        System.out.println("Enter how many numbers you want to operate with:");

        int size= sc.nextInt();//Noting how big the array is going to be

        int numbers[]=new int[size];//Creating array

        for(int i=0;i<size;i++){

            System.out.println("Enter "+ (i+1) +" number");
             numbers[i]= sc.nextInt();//Taking input from user
        }
        //Asking for operation from the user
        System.out.println("Choose 1 for addition");
        System.out.println("Choose 2 for substraction");
        System.out.println("Choose 3 for multiplication");
        System.out.println("Choose 4 for division");

        int choice= sc.nextInt();

        System.out.println("Your answer is " + calcSum(choice, numbers));

        sc.close();

    }

    
}
