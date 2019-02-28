/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import pl.math.uni.lodz.kalkulator.Kalkulator;

/**
 *
 * @author Patryk
 */
public class KalkulatorTest {
    
    Kalkulator kalkulator;
  
    @Before
    public void setUp() {
        kalkulator = new Kalkulator();
    }
    
     @Test
     public void add() {
         assertEquals(0.0, kalkulator.add(0.0,0.0), "0 + 0 = 0");
         assertEquals(2.0, kalkulator.add(1.0,1.0), "1 + 1 = 2");
         assertEquals(2.8, kalkulator.add(1.5,1.3), "1.5 + 1.3 = 2.8");
         assertEquals(-1.0, kalkulator.add(1.0,-2.0), "1 + (-2) = -1");
         assertEquals(-2.0, kalkulator.add(-1.0,-1.0), "(-1) + (-1) = -2");
     }
     @Test
     public void substraction() {
         assertEquals(0.0, kalkulator.subtraction(0.0,0.0), "0 - 0 = 0");
         assertEquals(5.0, kalkulator.subtraction(8.0,3.0), "8 - 3 = 5");
         assertEquals(-2.0, kalkulator.subtraction(2.0,4.0), "2 - 4 = -2");
         assertEquals(-6.0, kalkulator.subtraction(-1.0,5.0), "-1 - 5 = -6");
         assertEquals(1.0, kalkulator.subtraction(-3.0,-4.0), "-3 - (-4) = 1");
     }
     @Test
     public void multiplication() {
         assertEquals(0.0, kalkulator.multiplication(0.0,0.0), "0 * 0 = 0");
         assertEquals(0.0, kalkulator.multiplication(1.0,0.0), "1 * 0 = 0");
         assertEquals(6.0, kalkulator.multiplication(2.0,3.0), "2 * 3 = 6");
         assertEquals(6.0, kalkulator.multiplication(-2.0,-3.0), "-2 * (-3) = 6");
         assertEquals(-2.25, kalkulator.multiplication(1.5,-1.5), "1.5 * (-1.5) = -2.25");
     }
     @Test
     public void division() {
         assertEquals(4, kalkulator.division(8.0,2.0), "8 / 2 = 4");
         assertEquals(0.75, kalkulator.division(6.0,8.0), "6 / 8 = 0.75");
         assertEquals(-0.75, kalkulator.division(6.0,-8.0), "6 / (-8) = -0.75");
     }

}
