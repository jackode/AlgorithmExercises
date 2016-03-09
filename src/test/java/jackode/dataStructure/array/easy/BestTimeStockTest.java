package jackode.dataStructure.array.easy;


import org.junit.Assert;
import org.junit.Test;

public class BestTimeStockTest {
    @Test
    public void testCase1(){
        BestTimeStock bts = new BestTimeStock();
        int[] pricies1 = new int[]{1, 7, 2, 5, 3};
        int[] pricies2 = new int[]{1, 2, 7, 5, 3};
        int[] pricies3 = new int[]{1, 2, 5, 3, 7};
        int[] pricies4 = new int[]{7, 2, 5, 3, 1};

        Assert.assertEquals(6, bts.maxProfit(pricies1));
        Assert.assertEquals(6, bts.maxProfit(pricies2));
        Assert.assertEquals(6, bts.maxProfit(pricies3));
        Assert.assertEquals(3, bts.maxProfit(pricies4));
    }
}
