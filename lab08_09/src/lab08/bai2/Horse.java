package lab08.bai2;

import java.security.SecureRandom;

public class Horse extends Animal{
    public Horse() {
        super.setName(Horse.class.getSimpleName());

        super.setSpeed(new SecureRandom().nextInt(75));
    }
}
