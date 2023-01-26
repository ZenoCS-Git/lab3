import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
	@Test 
	public void testFilter() {
    ArrayList<String> test = new ArrayList<String>();
    test.add("apple");
    test.add("daughter");
    test.add("joe");
    test.add("laughter");
    test.add("joker");
    test.add("barrel");
    ArrayList<String> result = new ArrayList<String>();
    result.add("daughter");
    result.add("laughter");
    assertEquals(result, ListExamples.filter(test,(String s) -> (s.length()==8)));

	}


  @Test
  public void testMerge() {

    ArrayList<String> test = new ArrayList<String>();
    test.add("ab");
    test.add("cd");
    test.add("ee");
    test.add("gg");
    ArrayList<String> test2 = new ArrayList<String>();
    test2.add("aa");
    test2.add("ee");
    test2.add("ee");
    test2.add("ff");
    ArrayList<String> result = new ArrayList<String>();
    result.add("aa");
    result.add("ab");
    result.add("cd");
    result.add("ee");
    result.add("ee");
    test2.add("ee");
    result.add("ff");
    result.add("gg");
    assertEquals(result, 
            ListExamples.merge(test, test2));
  }

}
