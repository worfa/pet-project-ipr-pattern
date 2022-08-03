package model.lock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import model.Key;
import model.lock.processor.AuthCodeKeyProcessor;
import model.lock.processor.AuthKeyProcessor;
import model.lock.processor.AuthKnobProcessor;
import model.lock.processor.AuthProcessor;

@ToString
@Getter
@AllArgsConstructor
public class Lock {

    private Key key;
    private LockType lockType;
    private StateLock stateLock;

    private static final AuthProcessor chainOfAuthProcessor =
            new AuthCodeKeyProcessor(
                new AuthKnobProcessor(
                    new AuthKeyProcessor(null)));

    private void changeStateLock(){
        if(StateLock.CLOSED.equals(this.stateLock)) {
            System.out.println("Замок открылся!");
            this.stateLock = StateLock.OPEN;
        } else {
            System.out.println("Замок закрылся!");
            this.stateLock = StateLock.CLOSED;
        }
    }

    public void openClosed(Key keyUser) {
        if(chainOfAuthProcessor.isAuthorized(this, keyUser)) {
            changeStateLock();
        } else {
            System.out.println("Ключ не подошел.");
        }
    }
}
