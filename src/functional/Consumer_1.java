package functional;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consumer_1 {
    @Test
    public void consumer_1()
    {
        List<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
        //  Consumer_1 consumer = (list1) -> list1.clear();
        Assert.assertEquals(list, new ArrayList<>());
    }
}
