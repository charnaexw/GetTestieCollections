package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void testLinkedList_Addd(){
        //given
        Integer expected= 26352;
        LinkedList list = new LinkedList();
        list.add(expected);

        //when
        boolean actual =  list.contains(expected);
        //then
        Assert.assertTrue(actual);
    }
}
