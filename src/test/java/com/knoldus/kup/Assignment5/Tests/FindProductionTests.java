package com.knoldus.kup.Assignment5.Tests;
import com.knoldus.kup.Assignment4.FindProduction;
import junit.framework.Assert;
//import org.junit.Assert;
//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;

public class FindProductionTests {

    @Test
    public void shouldGetProduction(){
        long expected = 24;
        long output = FindProduction.getResult(1,4);
        Assert.assertTrue(expected==output);
        System.out.println("Test cases passed");
    }
}