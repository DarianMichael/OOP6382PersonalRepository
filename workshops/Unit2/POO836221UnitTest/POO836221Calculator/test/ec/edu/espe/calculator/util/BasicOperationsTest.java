/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.calculator.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class BasicOperationsTest {
    
    private static BasicOperations basicOperations = new BasicOperations();
    
    public BasicOperationsTest() {
    }

    /**
     * Test of add method, of class BasicOperations.
     */
    @Test

    public void testAddOne() {
        float addend1 = 0.0F;
        float addend2 = 0.0F;
        float expectedResult = 0.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddTwo() {
        float addend1 = 1.0F;
        float addend2 = -1.0F;
        float expectedResult = 0.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddThree() {
        float addend1 = 1.9F;
        float addend2 = 1.1F;
        float expectedResult = 3.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddFour() {
        float addend1 = 5.0F;
        float addend2 = -7.0F;
        float expectedResult = -2.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddFive() {
        float addend1 = 100.0F;
        float addend2 = 0.0F;
        float expectedResult = 100.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddSix() {
        float addend1 = 1.20F;
        float addend2 = 3.40F;
        float expectedResult = 4.60F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddSeven() {
        float addend1 = 4.8F;
        float addend2 = -0.8F;
        float expectedResult = 4.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddEigth() {
        float addend1 = 3000.0F;
        float addend2 = 40.0F;
        float expectedResult = 3040.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddNine() {
        float addend1 = 150.0F;
        float addend2 = 10.0F;
        float expectedResult = 160.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
    @Test
    public void testAddTen() {
        float addend1 = 5.0F;
        float addend2 = -2.0F;
        float expectedResult = 3.0F;
        float actualResult;
        actualResult = basicOperations.add(addend1, addend2);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    /**
     * Test of subtract method, of class BasicOperations.
     */
    @Test

    public void testSubtractOne() {
        float minuend = 0.0F;
        float subtrahend = 0.0F;
        float expectedResult = 0.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);

    }

    @Test
    public void testSubtractTwo() {
        float minuend = 1.0F;
        float subtrahend = 1.0F;
        float expectedResult = 0.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testSubtractThree() {
        float minuend = 1.0F;
        float subtrahend = -1.0F;
        float expectedResult = 2.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testSubtractFour() {
        float minuend = 1.9F;
        float subtrahend = 1.1F;
        float expectedResult = 0.8F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testSubtractFive() {
        float minuend = -6.0F;
        float subtrahend = 1.0F;
        float expectedResult = -7.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testSubtractSix() {
        float minuend = -6.0F;
        float subtrahend = -1.0F;
        float expectedResult = -5.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testSubtractSeven() {
        float minuend = 8.0F;
        float subtrahend = 0.0F;
        float expectedResult = 8.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testSubtractEigth() {
        float minuend = 0.0F;
        float subtrahend = 150.0F;
        float expectedResult = -150.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testSubtractNine() {
        float minuend = 3.5F;
        float subtrahend = 0.5F;
        float expectedResult = 3.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testSubtractTen() {
        float minuend = 0.5F;
        float subtrahend = 3.5F;
        float expectedResult = -3.0F;
        float actualResult;
        actualResult = basicOperations.add(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    /**
     * Test of multiply method, of class BasicOperations.
     */
    @Test
    
    public void testMultiplyOne() {
        float multiplicand = 1.0F;
        float multiplier = 1.0F;
        float expectedResult = 1.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }

    @Test
    public void testMultiplyTwo() {
        float multiplicand = 4.0F;
        float multiplier = 0.0F;
        float expectedResult = 0.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }

    @Test
    public void testMultiplyThree() {
        float multiplicand = -1.0F;
        float multiplier = 1.0F;
        float expectedResult = -1.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }

    @Test
    public void testMultiplyFour() {
        float multiplicand = 2.0F;
        float multiplier = 2.0F;
        float expectedResult = 4.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }

    @Test
    public void testMultiplyFive() {
        float multiplicand = 2.0F;
        float multiplier = 0.5F;
        float expectedResult = 1.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }   

    @Test
    public void testMultiplySix() {
        float multiplicand = 4.0F;
        float multiplier = 0.5F;
        float expectedResult = 2.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }

    @Test
    public void testMultiplySeven() {
        float multiplicand = 150.0F;
        float multiplier = 1.3F;
        float expectedResult = 195.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }

    @Test
    public void testMultiplyEight() {
        float multiplicand = 245.0F;
        float multiplier = 1.0F;
        float expectedResult = 245.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }

    @Test
    public void testMultiplyNine() {
        float multiplicand = 2.3F;
        float multiplier = 7.8F;
        float expectedResult = 17.94F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }

    @Test
    public void testMultiplyTen() {
        float multiplicand = 0.0F;
        float multiplier = 0.0F;
        float expectedResult = 0.0F;
        float actualResult;
        actualResult = basicOperations.add(multiplicand, multiplier);
        assertEquals(expectedResult, actualResult, 1.0);
    }
    /**
     * Test of divide method, of class BasicOperations.
     */
    @Test
    public void testDivideOne() {
        float dividend = 4.0F;
        float divisor = 2.0F;
        float expectedResult = 2.0F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideTwo() {
        float dividend = 1.0F;
        float divisor = 1.0F;
        float expectedResult = 1.0F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideThree() {
        float dividend = 0.0F;
        float divisor = 100.0F;
        float expectedResult = 0.0F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideFour() {
        float dividend = 1.0F;
        float divisor = 0.0F;
        float expectedResult = 0.0F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideFive() {
        float dividend = 4.0F;
        float divisor = 0.5F;
        float expectedResult = 2.0F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideSix() {
        float dividend = 1.01F;
        float divisor = 0.1F;
        float expectedResult = 10.1F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideSeven() {
        float dividend = 1.0F;
        float divisor = 1000.0F;
        float expectedResult = 0.001F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideEigth() {
        float dividend = 0.5F;
        float divisor = 4.0F;
        float expectedResult = 0.125F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideNine() {
        float dividend = 250.0F;
        float divisor = 250.0F;
        float expectedResult = 1.0F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }

    @Test
    public void testDivideTen() {
        float dividend = 80.0F;
        float divisor = 0.8F;
        float expectedResult = 100.0F;
        float actualResult;
        actualResult = basicOperations.add(dividend, divisor);
        assertEquals(expectedResult, actualResult, 0.0);
    }
    
}
