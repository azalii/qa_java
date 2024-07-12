import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalFoodTest {
    private final Animal animal;
    private final String kind;
    private final List<String> expectedFood;

    public AnimalFoodTest(String kind, List<String> expectedFood) {
        this.expectedFood = expectedFood;
        this.kind = kind;
        this.animal = new Animal();
    }

    @Parameterized.Parameters(name = "{0} кушает {1}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test()
    public void createLionMaleTest() {
        try {
            assertEquals(expectedFood, animal.getFood(kind));
        }  catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
