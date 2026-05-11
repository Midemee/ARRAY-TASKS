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
}
