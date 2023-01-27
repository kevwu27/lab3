import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests{
    Node node3;
    LinkedList list, list2;
    @Before
    public void setUp() throws Exception{
        list = new LinkedList();
        node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        
        list.root = node1;

        list2 = new LinkedList();
        
    }

    @Test
    public void testPrepend(){
        list.prepend(0);
        assertEquals("0 1 2 3 ", list.toString());
        list2.prepend(0);
        assertEquals("0 ", list2.toString());
    }

    @Test
    public void testAppend(){
        list.append(4);
        list2.append(4);
        assertEquals("1 2 3 4 ", list.toString());
        assertEquals("4 ", list2.toString());
    }

    @Test
    public void testFirst(){
        assertEquals(1, list.first());
    }

    @Test
    public void testLast(){
        assertEquals(3, list.last());
        assertEquals(3, list2.last());
    }

    @Test
    public void testLength(){
        assertEquals(3, list.length());
        assertEquals(0, list2.length());
        list2.root = node3;
        assertEquals(1, list2.length());

    }
}