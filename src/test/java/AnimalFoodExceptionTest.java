import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalFoodExceptionTest {
    private final Animal animal;
    private final String kind;

    public AnimalFoodExceptionTest(String kind) {
        this.kind = kind;
        this.animal = new Animal();
    }

    @Parameterized.Parameters(name = "{0}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"test1"},
                {""},
        };
    }

    @Test()
    public void createLionMaleTest() {
        try {
            animal.getFood(kind);
        }  catch (Exception e) {
            String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            assertEquals(expectedMessage, e.getMessage());
        }
    }
}
