package lab09;

import java.security.SecureRandom;
import java.util.ArrayList;


public class AnimalRacing {
    public static void main(String[] args) {
        Animal tiger=new Animal.Builder().setName("Tiger").setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(false).build();
        Animal eagle=new Animal.Builder().setName("Eagle").setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(true).build();
        Animal snake=new Animal.Builder().setName("Snake").setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(false).build();
        Animal falcon=new Animal.Builder().setName("Falcon").setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(true).build();

        ArrayList<Animal> animalArr=new ArrayList<>();
        animalArr.add(tiger);
        animalArr.add(eagle);
        animalArr.add(snake);
        animalArr.add(falcon);

        racing(animalArr);

    }
    public static void racing(ArrayList<Animal> animalArrayList){
        Animal winner=new Animal.Builder().setName("default_winner").setFlyable(false).setSpeed(0).build();
        ArrayList<Animal> co_winners=new ArrayList<>();
        co_winners.add(winner);

        for(int i=1;i< animalArrayList.size();i++){

            if(animalArrayList.get(i).isFlyable())
                continue;
            if(animalArrayList.get(i).getSpeed()>winner.getSpeed())
            {
                winner=animalArrayList.get(i);
                co_winners.clear();
                co_winners.add(winner);
            }
            else if(animalArrayList.get(i).getSpeed().equals(winner.getSpeed()))
                co_winners.add(animalArrayList.get(i));


        }

        System.out.println("Racing result:");
        if(co_winners.size()==1){
            if(co_winners.get(0).getName().equals("default_winner"))
                System.out.println("All animals is flyable!");
            else
                System.out.printf("Winner is <%s>, with speed: <%d>\n",co_winners.get(0).getName(),co_winners.get(0).getSpeed());
            return;
        }
        for(Animal i: co_winners){
            System.out.printf("Co-winner is <%s>, with speed: <%d>\n",i.getName(),i.getSpeed());
        }

    }
}
