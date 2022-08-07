package model.door;

import lombok.*;
import model.Color;
import model.lock.Lock;
import model.Material;
import model.door.strategy.OpenCloseDoorStrategy;

@ToString
@Getter
@AllArgsConstructor
@EqualsAndHashCode
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
