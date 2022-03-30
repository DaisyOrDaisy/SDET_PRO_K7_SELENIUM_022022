package lab08.bai2;

import java.util.ArrayList;

public class AnimalRacing {
    public static void main(String[] args) {
        Animal horse=new Horse();
        Animal tiger=new Tiger();
        Animal dog=new Dog();

        ArrayList<Animal> animalArrayList=new ArrayList<>();

        animalArrayList.add(horse);
        animalArrayList.add(tiger);
        animalArrayList.add(dog);
        racing(animalArrayList);



    }
    public static void racing(ArrayList<Animal> animalArrayList){
        Animal winner=animalArrayList.get(0);
        ArrayList<Animal> co_winners=new ArrayList<>();
        co_winners.add(winner);

        for(int i=1;i< animalArrayList.size();i++){
            if(animalArrayList.get(i).speed()>winner.speed())
            {
                winner=animalArrayList.get(i);
                co_winners.clear();
                co_winners.add(winner);
            }
            else if(animalArrayList.get(i).speed().equals(winner.speed()))
                co_winners.add(animalArrayList.get(i));


        }

        System.out.println("Racing result:");
        if(co_winners.size()>1)
            System.out.printf("there are %d winners:",co_winners.size());
        for(Animal i: co_winners){
            System.out.printf("Winner is <%s>, with speed: <%d>\n",i.getName(),i.getSpeed());
        }

    }

}
