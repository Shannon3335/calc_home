package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calcTest {
    calc new_calc;
    @BeforeEach
    void setUp() {
         new_calc = new calc();
    }

    @Test
    void test_add()
    {
        assertEquals(1,new_calc.add(0,1));
    }

    @Test
    void test_subtract(){ assertEquals(0,new_calc.subtract(0,0));}

    @Test
    void test_mult(){ assertEquals(10000,new_calc.mult(10000,1));}

    @AfterEach
    void tearDown() {

    }
}