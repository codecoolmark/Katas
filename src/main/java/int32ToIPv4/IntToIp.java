package int32ToIPv4;

public class IntToIp {

    private static final long FIRST_BYTE_MASK =     0b11111111000000000000000000000000;
    private static final long SECOND_BYTE_MASK =    0b00000000111111110000000000000000;
    private static final long THIRD_BYTE_MASK =     0b00000000000000001111111100000000;
    private static final long FOURTH_BYTE_MASK =    0b00000000000000000000000011111111;



    public static String longToIP(long ip) {
        var first = (short) Long.rotateRight(ip & FIRST_BYTE_MASK, 24);
        var second = (short) Long.rotateRight(ip & SECOND_BYTE_MASK, 16);
        var third = (short) Long.rotateRight(ip & THIRD_BYTE_MASK, 8);
        var fourth = (short) ip & FOURTH_BYTE_MASK;

        return first + "." + second + "." + third + "." + fourth; // do it!
    }
}
