package model.lock.processor;

import model.Key;
import model.lock.Lock;
import model.lock.LockType;

import java.util.Scanner;

public class AuthCodeKeyProcessor extends AuthProcessor{

    public AuthCodeKeyProcessor (AuthProcessor nextAuthProcessor) {
        super(nextAuthProcessor);
    }

    @Override
    public boolean isAuthorized(Lock lock, Key keyUser) {

        if(LockType.CODE.equals(lock.getLockType())) {
            System.out.print("Введите код: ");
            return lock.getKey() == null ?
                    lock.getKey().getSecretKod().equals(getPasswordFromConsole()) : lock.getKey().equals(keyUser);
        } else if(nextAuthProcessor != null){
            return nextAuthProcessor.isAuthorized(lock, keyUser);
        }

        return false;
    }

    private String getPasswordFromConsole(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()) {
            String input = scanner.nextLine();
            scanner.close();
            return input;
        } else {
            scanner.close();
            return null;
        }
    }
}
