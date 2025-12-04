import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void addTest_WhenOneAndTwo_ShouldReturnThree() {
        //GIVEN
        int a = 1;
        int b = 2;

        //WHEN
        int result = Main.add(a, b);

        //THEN
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void addTest_WhenMinusOneAndMinusTwo_ShouldReturnMinusThree() {
        //GIVEN
        int a = -1;
        int b = -2;

        //WHEN
        int result = Main.add(a, b);

        //THEN
        int expected = -3;
        assertEquals(expected, result);
    }
}
