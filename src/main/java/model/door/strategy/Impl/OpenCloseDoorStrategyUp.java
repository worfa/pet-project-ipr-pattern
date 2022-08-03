package model.door.strategy.Impl;

import model.door.strategy.OpenCloseDoorStrategy;

public class OpenCloseDoorStrategyUp implements OpenCloseDoorStrategy {

    @Override
    public void open() {
        System.out.println("Дверь открылась вверх");
    }

    @Override
    public void closed() {
        System.out.println("Дверь закрылась вниз");
    }

    @Override
    public String getStrategy() {
        return "Стратегия открытия вверх, закрытия вниз";
    }
}
