package model.door.builder;

import model.Color;
import model.Material;
import model.door.Door;
import model.door.strategy.OpenCloseDoorStrategy;
import model.lock.Lock;

public class DefaultDoorBuilder implements DoorBuilder {

    private OpenCloseDoorStrategy openCloseDoorStrategy;
    private Double width;
    private Double length;
    private Double depth;
    private Material material;
    private Color color;
    private Lock lock;

    public DefaultDoorBuilder() {
        super();
    }

    @Override
    public DoorBuilder fixWidth(Double width) {
        this.width = width;
        return this;
    }

    @Override
    public DoorBuilder fixLength(Double length) {
        this.length = length;
        return this;
    }

    @Override
    public DoorBuilder fixDepth(Double depth) {
        this.depth = depth;
        return this;
    }

    @Override
    public DoorBuilder fixColor(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public DoorBuilder fixOpenCloseDoorStrategy(OpenCloseDoorStrategy openCloseDoorStrategy) {
        this.openCloseDoorStrategy = openCloseDoorStrategy;
        return this;
    }

    @Override
    public DoorBuilder fixMaterial(Material material) {
        this.material = material;
        return this;
    }

    @Override
    public DoorBuilder fixLock(Lock lock) {
        this.lock = lock;
        return this;
    }

    @Override
    public Door build() {
        Door door = new Door(openCloseDoorStrategy, width, length, depth, material, color, lock);
        if(validateDoor()){
            return door;
        }

        throw new NullPointerException("Замок не создан, ошибка в поле lockType: null");
    }

    private boolean validateDoor() {
        return (width != null && length != null && depth != null && material != null && color != null && openCloseDoorStrategy != null);
    }
}
