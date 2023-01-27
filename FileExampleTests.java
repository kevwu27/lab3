import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class FileExampleTests{
    File start = new File("some-files");
    File one = new File("some-files/a.txt");
    File two = new File("some-files/more-files/b.txt");
    File three = new File("some-files/more-files/c.java");
    File four = new File("some-files/even-more-files/d.java");
    File five = new File("some-files/even-more-files/a.txt");


    @Test
    public void testSomeFiles() throws IOException{
        File[] expected = {one,two, three, four, five};
        assertArrayEquals(expected, FileExample.getFiles(start).toArray());
    }
}

