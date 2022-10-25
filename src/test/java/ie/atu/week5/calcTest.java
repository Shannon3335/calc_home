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

    @AfterEach
    void tearDown() {

    }
}