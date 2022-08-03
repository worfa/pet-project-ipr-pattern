package model.lock.processor;

import model.Key;
import model.lock.Lock;
import model.lock.LockType;

public class AuthKeyProcessor extends AuthProcessor{

    public AuthKeyProcessor(AuthProcessor nextAuthProcessor) {
        super(nextAuthProcessor);
    }

    @Override
    public boolean isAuthorized(Lock lock, Key keyUser) {
        if(LockType.KEY.equals(lock.getLockType()) && keyUser != null) {
            System.out.println("Пытаемся вставить ключ");
            return lock.getKey().equals(keyUser);
        } else if(nextAuthProcessor != null){
            return nextAuthProcessor.isAuthorized(lock, keyUser);
        }

        return false;
    }
}
