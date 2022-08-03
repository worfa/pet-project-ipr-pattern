package model.lock.builder;

import model.Key;
import model.lock.Lock;
import model.lock.LockType;
import model.lock.StateLock;

public class DefaultLockBuilder implements LockBuilder{

    private LockType lockType;
    private Key key;
    private final StateLock stateLock = StateLock.CLOSED;

    public DefaultLockBuilder (){
        super();
    }

    @Override
    public LockBuilder fixLockType(LockType lockType) {
        this.lockType = lockType;
        return this;
    }

    @Override
    public LockBuilder fixKeyLock(Key key) {
        this.key = key;
        return this;
    }

    @Override
    public Lock build() {

        if (validateLock()) {
            return new Lock(
                    this.key,
                    this.lockType,
                    this.stateLock
            );
        }

        throw new NullPointerException("Замок не создан, ошибка в поле lockType: null");
    }

    private boolean validateLock()  {
        return (this.lockType != null);
    }
}
