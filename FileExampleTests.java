import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;

public class FileExampleTests{
    File start, one, two, three, four, five;

    @Before
    public void setUp(){
        /*start = new File("./some-files");
        one = new File("some-files/a.txt");
        two = new File("some-files/more-files/b.txt");
        three = new File("some-files/more-files/c.java");
        four = new File("some-files/even-more-files/d.java");
        five = new File("some-files/even-more-files/a.txt");*/

        start = new File("./testTop");
        one = new File("./testTop/testFile1");
        two = new File("./testTop/testInside1");
        three = new File("./testTop/testInside1");
        four = new File("some-files/even-more-files/d.java");
        five = new File("some-files/even-more-files/a.txt");
    }


    @Test
    public void testSomeFiles() throws IOException{
        File[] expected = {start,one,two, three, four, five};
        assertArrayEquals(expected, FileExample.getFiles(start).toArray());
    }
}

