package jackode.algorithm.dataStructure.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by liujiankang on 12/21/14.
 */
public class MaxStackTest {
    @Test
    public void testMaxStack(){
        MaxStack<Integer> maxStack = new MaxStack<>();
        maxStack.push(2);
        maxStack.push(3);
        maxStack.push(1);
        maxStack.push(4);
        Assert.assertEquals(4, maxStack.max().intValue());
        Assert.assertEquals(4, maxStack.pop().intValue());
        Assert.assertEquals(3, maxStack.max().intValue());
    }

}
