package model.lock.processor;

import model.Key;
import model.lock.Lock;
import model.lock.LockType;

public class AuthKnobProcessor extends AuthProcessor{

    public AuthKnobProcessor(AuthProcessor nextAuthProcessor) {
        super(nextAuthProcessor);
    }

    @Override
    public boolean isAuthorized(Lock lock, Key keyUser) {

        if(LockType.KNOB.equals(lock.getLockType())) {
            System.out.println("Нажали на ручку");
            return true;
        } else if(nextAuthProcessor != null){
            return nextAuthProcessor.isAuthorized(lock, keyUser);
        }

        return false;
    }
}
