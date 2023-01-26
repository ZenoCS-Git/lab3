import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 3, 2, 5 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 5, 2, 3 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 1, 2, 3};
    assertArrayEquals(new int[]{ 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 1, 4, 2};
    assertEquals("2.0", ArrayExamples.averageWithoutLowest(input1));

    assertEquals("0.0", ArrayExamples.averageWithoutLowest(null));
  }

}
