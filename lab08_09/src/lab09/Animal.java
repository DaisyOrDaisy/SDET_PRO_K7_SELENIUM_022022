package lab09;

import java.util.Locale;

public class Animal {
    private String name;
    private Integer speed;
    private boolean flyable;



    public Animal() {
    }
    protected Animal(Builder builder){
        this.name=builder.name;
        this.speed=builder.speed;
        this.flyable=builder.flyable;
    }

    public String getName() {
        return name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public static class Builder{
        private String name;
        private Integer speed;
        private boolean flyable;

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(Integer speed) {
            this.speed = speed;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
