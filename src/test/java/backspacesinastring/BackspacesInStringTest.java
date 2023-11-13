package backspacesinastring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BackspacesInStringTest {

    @ParameterizedTest
    @CsvSource(value = {
            "a, a",
            "a#, ''",
            "ab#, a",
            "ab##, ''",
            "a##, ''",
            "a🧐b##, a"
    })
    void cleanString(String example, String expectedResult) {
        var backspacesInString = new BackspacesInString();
        assertEquals(expectedResult, backspacesInString.cleanString(example));
    }
}