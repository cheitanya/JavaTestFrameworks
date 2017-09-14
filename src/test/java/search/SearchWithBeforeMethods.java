package search;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by shivalis on 11/19/16.
 */
public class SearchWithBeforeMethods {

    @BeforeMethod
    public void verifyBeforeMethod()
    {
        System.out.println("I'm before method");
    }


    @BeforeTest
    public void verifyBeforeTest()
    {
        System.out.println("I'm before Tests");
    }

    @Test
    public void verifySearchValidProduct()
    {

    }

    @BeforeTest
    public void verifyBeforeTestofProductSearch()
    {
        System.out.println("I'm before Testsa");
    }

    @Test
    public void verifyInvalidProdcutsSearch()
    {
        amIndependentMethod();
    }


    public void amIndependentMethod()
    {
        System.out.println("I'm called");
    }

    @Test
    public void verifySerachByCategories()
    {

    }

    @Test
    public void verifySerachByBrand()
    {

    }

}
