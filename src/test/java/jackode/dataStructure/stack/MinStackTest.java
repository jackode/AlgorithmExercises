package jackode.dataStructure.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by liujiankang on 12/21/14.
 */
public class MinStackTest {
    @Test
    public void testMaxStack(){
        MinStack<Integer> minStack = new MinStack<>();
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        minStack.push(1);
        Assert.assertEquals(1, minStack.min().intValue());
        Assert.assertEquals(1, minStack.pop().intValue());
        Assert.assertEquals(2, minStack.min().intValue());
    }

}
