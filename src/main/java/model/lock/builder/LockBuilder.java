package model.lock.builder;

import model.Key;
import model.lock.Lock;
import model.lock.LockType;

public interface LockBuilder {

    LockBuilder fixLockType(LockType lockType);

    LockBuilder fixKeyLock(Key keyLock);

    Lock build();
}
