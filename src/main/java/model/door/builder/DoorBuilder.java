package model.door.builder;

import model.Color;
import model.Material;
import model.door.Door;
import model.door.strategy.OpenCloseDoorStrategy;
import model.lock.Lock;

public interface DoorBuilder {

    DoorBuilder fixWidth(Double width);

    DoorBuilder fixLength(Double length);

    DoorBuilder fixDepth(Double depth);

    DoorBuilder fixColor(Color color);

    DoorBuilder fixOpenCloseDoorStrategy(OpenCloseDoorStrategy openCloseDoorStrategy);

    DoorBuilder fixMaterial(Material material);

    DoorBuilder fixLock(Lock lock);

    Door build();
}
