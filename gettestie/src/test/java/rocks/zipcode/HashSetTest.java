package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {

    @Test
    public void testHashSetAdd (){
        String expected = "Pizza";
        HashSet<String> set = new HashSet<>();
        set.add(expected);
        Assert.assertTrue(set.contains(expected));

    }
    @Test
    public void testHashSetRemove(){
        String expected = "Pizza";
        HashSet<String> set = new HashSet<>();
        set.add(expected);
        set.remove(expected);
        Assert.assertFalse(set.contains(expected));
    }

}
