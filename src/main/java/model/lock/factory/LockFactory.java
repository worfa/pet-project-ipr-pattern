package model.lock.factory;

import model.Key;
import model.lock.Lock;
import model.lock.LockType;
import model.lock.builder.DefaultLockBuilder;
import model.lock.builder.LockBuilder;

public class LockFactory {

    public static Lock getLock(LockType lockType) {
        LockBuilder lockBuilder = new DefaultLockBuilder();

        return switch (lockType) {
            case KEY -> lockBuilder
                    .fixLockType(LockType.KEY)
                    .fixKeyLock(new Key("123456"))
                    .build();
            case CODE -> lockBuilder
                    .fixLockType(LockType.CODE)
                    .fixKeyLock(new Key("123456"))
                    .build();
            case KNOB -> lockBuilder
                    .fixLockType(LockType.KNOB)
                    .build();
        };
    }
}
