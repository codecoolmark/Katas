package int32ToIPv4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IntToIpTest {

    @ParameterizedTest
    @CsvSource({"2154959208, 128.114.17.104",
            "0, 0.0.0.0",
            "2149583361, 128.32.10.1",
            "3237903234, 192.254.123.130"
    })
    void longToIP(Long ip, String result) {
        Assertions.assertEquals(result, IntToIp.longToIP(ip));
    }
}