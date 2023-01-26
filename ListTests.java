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





}