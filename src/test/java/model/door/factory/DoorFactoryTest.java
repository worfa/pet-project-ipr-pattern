package model.door.factory;

import model.Material;
import model.door.Door;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static model.door.factory.DoorFactory.createDoor;

public class DoorFactoryTest {

    private final String OBJECT_NOT_CREATE = "Объект не создан!";

    @Test
    void doorFactoryTestPlastic(){
        Door actual = createDoor(Material.PLASTIC);

        Assertions.assertNotNull(actual, OBJECT_NOT_CREATE);
    }

    @Test
    void doorFactoryTestWood(){
        Door actual = createDoor(Material.WOOD);

        Assertions.assertNotNull(actual, OBJECT_NOT_CREATE);
    }

    @Test
    void doorFactoryTestGlass(){
        Door actual = createDoor(Material.GLASS);

        Assertions.assertNotNull(actual, OBJECT_NOT_CREATE);
    }

    @Test
    void doorFactoryTestMetal(){
        Door actual = createDoor(Material.METAL);

        Assertions.assertNotNull(actual, OBJECT_NOT_CREATE);
    }
}
