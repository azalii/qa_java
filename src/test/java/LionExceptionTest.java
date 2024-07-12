import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionExceptionTest {
    private final String sex;
    private final Feline feline;

    public LionExceptionTest(String sex) {
        this.sex = sex;
        this.feline = new Feline();
    }

    @Parameterized.Parameters(name = "Пробуем создать льва с полом {0}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"test1"},
                {""}
        };
    }

    @Test
    public void exceptionMessageErrorTest() {
        try {
            new Lion(sex, feline);
        } catch (Exception e) {
            String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}