package backspacesinastring;

import java.util.Arrays;

public class BackspacesInString {
    public String cleanString(String s) {
        return Arrays.stream(s.split("")).reduce("", (result, character) -> {
            if (character.equals("#")) {
                return result.substring(0, Math.max(result.length() - 1, 0));
            }
            return result + character;
        });
    }
}
