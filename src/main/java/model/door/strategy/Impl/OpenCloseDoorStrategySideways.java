package model.door.strategy.Impl;

import model.door.strategy.OpenCloseDoorStrategy;

public class OpenCloseDoorStrategySideways implements OpenCloseDoorStrategy {
    @Override
    public void open() {
        System.out.println("Дверь открылась в бок");
    }

    @Override
    public void closed() {
        System.out.println("Дверь закрылась в бок");
    }

    @Override
    public String getStrategy() {
        return "Стратегия открытия в права, закрытия в лево";
    }
}
