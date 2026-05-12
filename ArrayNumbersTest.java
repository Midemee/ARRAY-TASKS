import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayNumbersTest{
    
    @Test
    public void testThatArrayCollectsTenIntegersAndReturnsIt(){
    int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int [] actual = ArrayNumbers.numberList();
    assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testThatArrayReturnsEvenArray(){
    int [] numberList = {4,6,7,8,3,9,5};
    int []expected = {4,6,8};
    int [] actual = ArrayNumbers.evenNumbers(numberList);
    assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testThatArrayReturnsOddArray(){
    int [] numberList = {4,6,7,8,3,9,5};
    int []expected = {7,3,9,5};
    int [] actual = ArrayNumbers.oddNumbers(numberList);
    assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testThatArrayReturnsReversedArray(){
    int [] numbers = {2, 4, 5, 8, 7, 9};
    int []expected = {9, 7, 8, 5, 4, 2};
    int [] actual = ArrayNumbers.reverseArray(numbers);
    assertArrayEquals(actual, expected);
    }

}
