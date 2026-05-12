/*PSEUDOCODE
Create an array to take 10 elements, between 10-100... including 10 and 100
-1 shows that an array is empty
remove duplicate elements from the array
if the value of array element equals -1, do not display the array element
else print the content of the array, to show that the elements has been removed*/

import java.util.Scanner;
public class DuplicateElimination{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int [] numbers = new int[10];

    for(int index = 0; index < numbers.length; index++){      
        System.out.print("Enter a number: ");
            int userNumber = input.nextInt();
        if (userNumber >= 10 && userNumber <= 100){
           numbers[index] = userNumber;
        }
        else{
            System.out.print("Invalid input!");
        }
    }
    
    System.out.print(java.util.Arrays.toString(numbers));
    
/*    while(userNumber != 0){

        if (userNumber >= 10 && userNumber <= 100){

        }
    }*/
        

    
    }
}
