package model.door;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import model.Color;
import model.lock.Lock;
import model.Material;
import model.door.strategy.OpenCloseDoorStrategy;

@ToString
@Getter
@AllArgsConstructor
public class Door {

    private OpenCloseDoorStrategy openCloseDoorStrategy;

    private Double width;

    private Double length;

    private Double depth;

    private Material material;

    private Color color;

    private Lock lock;

    public void open() {
        openCloseDoorStrategy.open();
    }

    public void closed() {
        openCloseDoorStrategy.closed();
    }
}
