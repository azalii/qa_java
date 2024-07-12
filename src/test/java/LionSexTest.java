import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexTest {
    private final boolean haveMane;
    private final Lion lion;

    public LionSexTest(String sex, boolean expected) throws Exception {
        Feline feline = new Feline();
        this.haveMane = expected;
        this.lion = new Lion(sex, feline);
    }

    @Parameterized.Parameters(name = "{0} имеет гриву? {1}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test()
    public void createLionMaleTest() {
        assertEquals(haveMane, lion.doesHaveMane());
    }
}
