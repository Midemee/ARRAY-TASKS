/*take 10 integers from user
store in array
reverse the array.... without creating new array*/

import java.util.Scanner;
public class ReversedArray{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int [] numbers = new int [10];
    int count = 0;
    
    for (int index = 0; index < numbers.length; index++){
        System.out.print("Enter a number: ");
        numbers[index] = input.nextInt();
    }


    int left = 0;
    int right = numbers.length-1;
    
    while (left < right) {
            int temporary = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temporary;
            
            left++;
            right--;
        }
        
        System.out.println(java.util.Arrays.toString(numbers));
  
    }

}


