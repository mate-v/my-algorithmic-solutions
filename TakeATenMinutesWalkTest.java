import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeATenMinuteWalkTest {

    @Test
    public void arbitraryTest() {
        assertEquals(true, TakeATenMinuteWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals(false, TakeATenMinuteWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals(false, TakeATenMinuteWalk.isValid(new char[] {'w'}));
        assertEquals(false, TakeATenMinuteWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }

}
