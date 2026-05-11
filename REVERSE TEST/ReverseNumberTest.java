import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayNumbersTest{
    
    @Test
    public void testThatArrayCollectsTenIntegersAndReturnsIt(){
    int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int [] actual = ArrayNumbers.numberList();
    assertEquals(actual, expected);
    }

}
