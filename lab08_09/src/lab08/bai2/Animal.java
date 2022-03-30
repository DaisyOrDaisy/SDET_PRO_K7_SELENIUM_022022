package lab08.bai2;

public class Animal {
    private String name;
    private Integer speed;


    public Animal() {
    }

    public Animal(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    public Integer speed(){
        return getSpeed();
    }
}
