package model.door.strategy.Impl;

import model.door.strategy.OpenCloseDoorStrategy;

public class OpenCloseDoorStrategyDown implements OpenCloseDoorStrategy {
    @Override
    public void open() {
        System.out.println("Дверь открылась вниз");
    }

    @Override
    public void closed() {
        System.out.println("Дверь закрылась вверх");
    }

    @Override
    public String getStrategy() {
        return "Стратегия открытия вниз, закрытия вверх";
    }
}
