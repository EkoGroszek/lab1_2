package pl.com.bottega.ecommerce.sharedkernel;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;

public class BunchOfTests {

    //    @Test public void testOneElementIsInSequence() {
    //        int key = 3;
    //        int[] seq = {3};
    //        boolean testValue = true;
    //        SearchResult searchResult;
    //        searchResult = BinarySearch.search(key, seq);
    //
    //        Assert.assertThat(searchResult.isFound(), is(testValue));
    //        Assert.assertThat(seq[searchResult.getPosition()], is(key));
    //    }
    //
    //    @Test(expected = IllegalArgumentException.class) public void testEmptySequence() {
    //        BinarySearch.search(0, new int[0]);
    //    }

    @Test public void testMultiplyBy() {
        double value = 30;
        double multiplier = 3;
        Money testValue = new Money(value * multiplier);

        Money money = new Money(30);

        Assert.assertThat(money.multiplyBy(multiplier), is(testValue));
    }

    @Test public void testMultiplyByBigDecimal() {
        BigDecimal value = new BigDecimal(30);
        BigDecimal multiplier = new BigDecimal(3);
        Money testValue = new Money(value.multiply(multiplier));

        Money money = new Money(30);

        Assert.assertThat(money.multiplyBy(multiplier), is(testValue));
    }
}
