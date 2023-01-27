import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {

    public StringChecker sc;

    @Before
    public void setUp() throws Exception {
        sc = new ListExamples();
        
    }

    @Test
    public void testFilter(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hi");
        list.add("um");
        list.add("boo");
        list.add("hate");
        list.add("boo");

        
        String[] expected  = {"hi", "boo", "boo"};
        assertArrayEquals(expected, ListExamples.filter(list, sc).toArray());
    }

    @Test
    public void testMerge(){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("book");
        list1.add("dog");
        list2.add("apple");
        list2.add("hello");
        list1.add("evening");

        assertArrayEquals(new String[]{"apple", "book", "dog", "evening", "hello"}, ListExamples.merge(list1, list2).toArray());

    }





}