package ru.netology.squares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldCountNumberOfSquaresWithinLimit() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.SquareCounter (200, 300);

            assertEquals(expected, actual);
    }
}