package lab08.bai2;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger() {
        super.setName(Tiger.class.getSimpleName());
        super.setSpeed(new SecureRandom().nextInt(100));
    }
}
