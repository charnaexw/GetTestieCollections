package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class MapTest {
    @Test
    public void testHashMap_Add(){
        //given
        HashMap<String, Integer> chocolate = new HashMap<String, Integer>();
        chocolate.put("Gaunche", 2);
        chocolate.put("Truffle", 4);
        Integer expected=2;
        //when
        Integer actual= chocolate.get("Gaunche");
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testHashMap_AddTwoElements(){
        //given
        HashMap<String, Integer> chocolate = new HashMap<>();
        chocolate.put("Gaunche", 2);
        chocolate.put("Truffle", 4);
        Integer expected=2;
        //when
        Integer actual= chocolate.size();
        //then
        Assert.assertEquals(expected, actual);

    }@Test
    public void testHashMap_RemoveElements(){
        //given
        HashMap<String, Integer> chocolate = new HashMap<>();
        chocolate.put("Gaunche", 2);
        chocolate.put("Truffle", 4);
        chocolate.remove("Gaunche", 2);
        Integer expected=1;
        //when
        Integer actual= chocolate.size();
        //then
        Assert.assertEquals(expected, actual);

    }
}
