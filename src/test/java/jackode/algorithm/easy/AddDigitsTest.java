package jackode.algorithm.easy;


import jackode.algorithm.math.easy.AddDigits;
import junit.framework.Assert;
import org.junit.Test;

public class AddDigitsTest {
    @Test
    public void testAddDigits(){
        AddDigits ad = new AddDigits();
        Assert.assertEquals(2, ad.addDigits(38));
        Assert.assertEquals(1, ad.addDigits(10));

        Assert.assertEquals(2, ad.addDigits01(38));
        Assert.assertEquals(1, ad.addDigits01(10));

        Assert.assertEquals(2, ad.addDigits02(38));
        Assert.assertEquals(1, ad.addDigits02(10));
    }
}
