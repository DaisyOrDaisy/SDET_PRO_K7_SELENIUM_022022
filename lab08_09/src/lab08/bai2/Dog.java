package lab08.bai2;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog() {
        super.setName(Dog.class.getSimpleName());
        super.setSpeed(new SecureRandom().nextInt(60));
    }
}
