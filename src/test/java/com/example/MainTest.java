package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testNumber() {
        assertEquals(10, Main.getNumber10());
    }
}
