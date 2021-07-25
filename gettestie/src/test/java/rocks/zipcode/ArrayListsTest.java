package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsTest {

    @Test
    public void ArrayListTest(){
        //given
        String[] coop = {"the","try","guys"};
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(coop));
        String expected="try";
        //when
        String actual=list.get(1);
        //then
        Assert.assertEquals(expected,actual);


    }
}
