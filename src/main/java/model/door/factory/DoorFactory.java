package model.door.factory;

import model.Color;
import model.Material;
import model.door.Door;
import model.door.builder.DefaultDoorBuilder;
import model.door.builder.DoorBuilder;
import model.door.strategy.Impl.OpenCloseDoorStrategyDown;
import model.door.strategy.Impl.OpenCloseDoorStrategySideways;
import model.door.strategy.Impl.OpenCloseDoorStrategyUp;
import model.lock.LockType;
import model.lock.factory.LockFactory;

public class DoorFactory {

    public static Door createDoor(Material materialDoor) {
        DoorBuilder doorBuilder = new DefaultDoorBuilder();

        return switch(materialDoor){
            case PLASTIC -> doorBuilder
                    .fixDepth(10D)
                    .fixLength(100D)
                    .fixWidth(58D)
                    .fixColor(Color.YELLOW)
                    .fixMaterial(Material.PLASTIC)
                    .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategyDown())
                    .fixLock(LockFactory.getLock(LockType.KEY))
                    .build();
            case WOOD -> doorBuilder
                    .fixDepth(10D)
                    .fixLength(100D)
                    .fixWidth(58D)
                    .fixColor(Color.BLACK)
                    .fixMaterial(Material.WOOD)
                    .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategyUp())
                    .fixLock(LockFactory.getLock(LockType.CODE))
                    .build();
            case GLASS -> doorBuilder
                    .fixDepth(10D)
                    .fixLength(100D)
                    .fixWidth(58D)
                    .fixColor(Color.WHITE)
                    .fixMaterial(Material.GLASS)
                    .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategyDown())
                    .fixLock(LockFactory.getLock(LockType.KNOB))
                    .build();
            case METAL -> doorBuilder
                    .fixDepth(10D)
                    .fixLength(100D)
                    .fixWidth(58D)
                    .fixColor(Color.WHITE)
                    .fixMaterial(Material.METAL)
                    .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                    .fixLock(LockFactory.getLock(LockType.CODE))
                    .build();
        };
    }
}
