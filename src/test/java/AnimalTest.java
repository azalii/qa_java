import com.example.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal animal;

    @Before
    public void setup() {
        animal = new Animal();
    }

    @Test
    public void getFamilyTest() {
        String expectedMessage = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedMessage, animal.getFamily());
    }
}