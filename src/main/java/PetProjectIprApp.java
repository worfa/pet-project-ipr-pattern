import model.Color;
import model.Material;
import model.door.Door;
import model.door.builder.DoorBuilder;
import model.door.builder.DefaultDoorBuilder;
import model.door.factory.DoorFactory;
import model.door.strategy.Impl.OpenCloseDoorStrategySideways;

import static model.door.factory.DoorFactory.createDoor;

public class PetProjectIprApp {

    public static void main(String [] args){
        DoorBuilder doorBuilder = new DefaultDoorBuilder();

        Door door = doorBuilder
                .fixWidth(10D)
                .fixColor(Color.YELLOW)
                .fixDepth(10D)
                .fixLength(10D)
                .fixMaterial(Material.PLASTIC)
                .fixOpenCloseDoorStrategy(new OpenCloseDoorStrategySideways())
                .build();

        System.out.println(door.toString());

        door.open();
        door.closed();

        door = createDoor(Material.METAL);

        System.out.println(door.toString());

        door.open();
        door.closed();

        door = createDoor(Material.PLASTIC);

        System.out.println(door.toString());

        door.open();
        door.closed();

        door = createDoor(Material.GLASS);

        System.out.println(door.toString());

        door.open();
        door.closed();

        door = createDoor(Material.WOOD);

        System.out.println(door.toString());

        door.open();
        door.closed();
    }
}
