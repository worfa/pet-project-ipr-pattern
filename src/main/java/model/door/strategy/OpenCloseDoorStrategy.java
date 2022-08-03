package model.door.strategy;

import model.Strategy;

public interface OpenCloseDoorStrategy extends Strategy {

    void open();

    void closed();
}
