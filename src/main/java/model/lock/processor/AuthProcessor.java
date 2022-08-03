package model.lock.processor;

import lombok.AllArgsConstructor;
import model.Key;
import model.lock.Lock;

@AllArgsConstructor
public abstract class AuthProcessor {

    AuthProcessor nextAuthProcessor;

    public abstract boolean isAuthorized(Lock lock, Key keyUser);
}
