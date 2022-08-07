package model.door.builder;

import model.Color;
import model.Material;
import model.door.Door;
import model.door.builder.DefaultDoorBuilder;
import model.door.builder.DoorBuilder;
import model.door.strategy.Impl.OpenCloseDoorStrategySideways;
import model.lock.LockType;
import model.lock.factory.LockFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DefaultDoorBuilderTest {

    private DoorBuilder defaultDoorBuilder;
    private final String EXCEPTION_DONT_EQUALS = "Ошибки не совпадают!";
    private final String MESSAGE_EXCEPTION_DONT_EQUALS = "Сообщение ошибки не совпадает с проверямым!";

    private final String EXPECTED_MESSAGE = "Дверь не создана";

    @BeforeEach
    void initConstruct() {
        defaultDoorBuilder = new DefaultDoorBuilder();
    }

    @Test
    void doorBuilderAllConstructBuildTest(){
        Door actual = defaultDoorBuilder
                .fixDepth(10D)
                .fixLength(100D)
                .fixWidth(58D)
                .fixColor(Color.WHITE)
                .fixMaterial(Material.METAL)
                .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                .fixLock(LockFactory.getLock(LockType.CODE))
                .build();

        Door expected = new Door(
                new OpenCloseDoorStrategySideways(),
                58D,
                100D,
                10D,
                Material.METAL,
                Color.WHITE,
                LockFactory.getLock(LockType.CODE)
        );

        assertEquals(expected, actual, "Двери не совпадают");
    }

    @Test
    void doorBuilderTestThrowWithoutDepth(){
        Exception actual = Assertions.assertThrows(NullPointerException.class, () -> defaultDoorBuilder
                .fixLength(100D)
                .fixWidth(58D)
                .fixColor(Color.WHITE)
                .fixMaterial(Material.METAL)
                .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                .fixLock(LockFactory.getLock(LockType.CODE))
                .build(), EXCEPTION_DONT_EQUALS
        );


        String expected = EXPECTED_MESSAGE;

        assertEquals(expected, actual.getMessage(), MESSAGE_EXCEPTION_DONT_EQUALS);
    }

    @Test
    void doorBuilderTestThrowWithoutLength(){
        Exception actual = Assertions.assertThrows(NullPointerException.class, () -> defaultDoorBuilder
                .fixDepth(10D)
                .fixWidth(58D)
                .fixColor(Color.WHITE)
                .fixMaterial(Material.METAL)
                .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                .fixLock(LockFactory.getLock(LockType.CODE))
                .build(),EXCEPTION_DONT_EQUALS
        );


        String expected = EXPECTED_MESSAGE;

        assertEquals(expected, actual.getMessage(), MESSAGE_EXCEPTION_DONT_EQUALS);
    }

    @Test
    void doorBuilderTestThrowWithoutWidth(){
        Exception actual = Assertions.assertThrows(NullPointerException.class, () -> defaultDoorBuilder
                .fixLength(100D)
                .fixDepth(10D)
                .fixColor(Color.WHITE)
                .fixMaterial(Material.METAL)
                .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                .fixLock(LockFactory.getLock(LockType.CODE))
                .build(),EXCEPTION_DONT_EQUALS
        );


        String expected = EXPECTED_MESSAGE;

        assertEquals(expected, actual.getMessage(), MESSAGE_EXCEPTION_DONT_EQUALS);
    }

    @Test
    void doorBuilderTestThrowWithoutColor(){
        Exception actual = Assertions.assertThrows(NullPointerException.class, () -> defaultDoorBuilder
                .fixLength(100D)
                .fixDepth(10D)
                .fixWidth(58D)
                .fixMaterial(Material.METAL)
                .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                .fixLock(LockFactory.getLock(LockType.CODE))
                .build(),EXCEPTION_DONT_EQUALS
        );


        String expected = EXPECTED_MESSAGE;

        assertEquals(expected, actual.getMessage(), MESSAGE_EXCEPTION_DONT_EQUALS);
    }

    @Test
    void doorBuilderTestThrowWithoutOpenCloseDoorStrategy(){
        Exception actual = Assertions.assertThrows(NullPointerException.class, () -> defaultDoorBuilder
                .fixLength(100D)
                .fixDepth(10D)
                .fixWidth(58D)
                .fixMaterial(Material.METAL)
                .fixColor(Color.WHITE)
                .fixLock(LockFactory.getLock(LockType.CODE))
                .build(),EXCEPTION_DONT_EQUALS
        );


        String expected = EXPECTED_MESSAGE;

        assertEquals(expected, actual.getMessage(), MESSAGE_EXCEPTION_DONT_EQUALS);
    }

    @Test
    void doorBuilderTestThrowWithoutMaterial(){
        Exception actual = Assertions.assertThrows(NullPointerException.class, () -> defaultDoorBuilder
                .fixLength(100D)
                .fixDepth(10D)
                .fixWidth(58D)
                .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                .fixColor(Color.WHITE)
                .fixLock(LockFactory.getLock(LockType.CODE))
                .build(),EXCEPTION_DONT_EQUALS
        );


        String expected = EXPECTED_MESSAGE;

        assertEquals(expected, actual.getMessage(), MESSAGE_EXCEPTION_DONT_EQUALS);
    }

    @Test
    void doorBuilderTestThrowWithoutLock(){
        Door actual = defaultDoorBuilder
                .fixLength(100D)
                .fixDepth(10D)
                .fixWidth(58D)
                .fixMaterial(Material.METAL)
                .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                .fixColor(Color.WHITE)
                .build();

        assertNotNull(actual, "Дверь не создается без замка!");
    }
}
