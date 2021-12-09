package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"Between 200 and 300, 200, 300, 3",
            "Between 100 and 900, 100, 900, 21",
            "Between 100 and 10000, 100, 10000, 90",
            "Between 10 and 600, 10, 600, 15"})
    void SQRService(String name, int bottomNumber, int upperNumber, int expected) {
        SQRService service = new SQRService();

        int actual = service.SQRService(bottomNumber, upperNumber);

        assertEquals(expected, actual);

        System.out.println(actual);
    }
}