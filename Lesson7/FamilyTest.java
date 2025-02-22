import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {

    @Test
    public void testDeleteChild() {
        Human mother = new Human("Jane", "Doe", 30);
        Human father = new Human("John", "Doe", 35);
        Family family = new Family(mother, father);
        Human child1 = new Human("Alex", "Doe", 10);
        Human child2 = new Human("Anna", "Doe", 8);

        family.addChild(child1);
        family.addChild(child2);

        assertTrue(family.deleteChild(child1));
        assertEquals(1, family.countFamily() - 2);

        assertFalse(family.deleteChild(new Human("NonExistent", "Child", 5)));
        assertEquals(1, family.countFamily() - 2);
    }
}
