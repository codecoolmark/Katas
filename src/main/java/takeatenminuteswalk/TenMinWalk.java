package takeatenminuteswalk;

import java.util.HashMap;
import java.util.Map;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        if (walk.length != 10) {
            return false;
        }

        var directionCounter = new HashMap<>(Map.of('n', 0, 's', 0, 'w', 0, 'e', 0 ));

        for (char direction : walk) {
            directionCounter.compute(direction, (directionKey, oldCounter) -> oldCounter + 1);
        }

        return directionCounter.get('n') - directionCounter.get('s') == 0
                && directionCounter.get('w') - directionCounter.get('e') == 0;
    }
}
