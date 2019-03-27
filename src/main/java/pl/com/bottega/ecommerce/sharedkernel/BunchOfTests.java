package pl.com.bottega.ecommerce.sharedkernel;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.hamcrest.CoreMatchers.instanceOf;
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

    @Test public void testAdd() {
        double a = 20;
        double b = 30;
        Money valueA = new Money(a);
        Money valueB = new Money(b);

        Money testValue = new Money(a + b);

        Assert.assertThat(valueA.add(valueB), is(testValue));
    }

    @Test public void testSubstract() {
        double value = 30;
        double substractor = 10;

        Money testValue = new Money(value);
        Money substractorValue = new Money(substractor);
        Money result = new Money(value - substractor);

        Assert.assertThat(testValue.subtract(substractorValue), is(result));
    }

    @Test public void testGetCurrency(){
        Money first = new Money(4.5, "EUR");
        //Money second = new Money(7.5, "PLN");
        Assert.assertThat(first.getCurrency(), instanceOf(Currency.class));
    }

}
