import java.util.Scanner;
public class ArrayNumbers{

    public static int [] numberList(){
    Scanner input = new Scanner(System.in);
    int [] numbers = new int [10];
    for(int index = 0; index < numbers.length; index++){
    System.out.print("Enter a number: ");
    numbers[index] = input.nextInt();
    }
    return numbers;
    }
    
    public static int [] evenNumbers(int[] numberList){
     int evenCount = 0;
     for(int index = 0; index < numberList.length; index++){
       if (numberList[index] % 2 == 0){
            evenCount++;
       }
     }
     
      int evenIndex = 0;
      int[] evenNumbers = new int [evenCount];
      for (int index = 0; index < numberList.length; index++){
      if (numberList[index] % 2 == 0){
      evenNumbers[evenIndex] = numberList[index];
      evenIndex++;
      }
      }
      
      return evenNumbers;
    }
    
    public static int [] oddNumbers(int[] numberList){
     int oddCount = 0;
     for(int index = 0; index < numberList.length; index++){
       if (numberList[index] % 2 != 0){
            oddCount++;
       }
     }
     
      int oddIndex = 0;
      int[] oddNumbers = new int [oddCount];
      for (int index = 0; index < numberList.length; index++){
      if (numberList[index] % 2 != 0){
      oddNumbers[oddIndex] = numberList[index];
      oddIndex++;
      }
      }
      
      return oddNumbers;
    }
    
    public static int [] reverseArray (int[] numbers){

    int [] reverse = new int [numbers.length];
    
    for (int index = 0; index < numbers.length; index++){
    reverse[index] = numbers[numbers.length-1-index];
    }
    //System.out.print(java.util.Arrays.toString(reverse));
    return reverse;
    }
}
