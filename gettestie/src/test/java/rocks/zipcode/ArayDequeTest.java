package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArayDequeTest {

    @Test
    public void testArrayDeque(){
        //given
        Integer expectedFirst =23;
        Integer expectedLast=93;
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.addFirst(expectedFirst);
        numbers.addLast(expectedLast);
        //when
        Integer actualFirwst= numbers.getFirst();
        Integer actualLast =numbers.getLast();
        //then
        Assert.assertEquals(actualFirwst,expectedFirst);
        Assert.assertEquals(actualLast, expectedLast);

    }
    @Test
    public void testArrayDeque2(){
        //given
        Integer wes=89;
        Integer expectedFirst =23;
        Integer expectedLast=93;
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.addFirst(expectedFirst);
        numbers.addFirst(wes);
        numbers.addLast(expectedLast);
        //when
        Integer actualFirwst= numbers.getFirst();
        Integer actualLast =numbers.getLast();
        //then
        Assert.assertNotEquals(expectedFirst,actualFirwst);
        Assert.assertEquals(expectedLast,actualLast);
        Assert.assertFalse(numbers.isEmpty());

    }
}
