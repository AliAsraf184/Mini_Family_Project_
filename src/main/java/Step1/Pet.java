package Step1;

import java.util.Arrays;

public class Pet {
    public Pet() {
    }
    String species;
    String nickame;
    byte age;
    int tricklevel;
    String [] habits ;

    public Pet(String species, String nickame) {
        this.species = species;
        this.nickame = nickame;
    }

    public Pet(String species, String nickame, byte age, byte tricklevel, String[] habits) {
        this.species = species;
        this.nickame = nickame;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.printf("Hello, owner. I am -%s. I miss you!",nickame);
    }
public void foul(){
    System.out.println("I need to cover it up");
}

    @Override
    public String toString() {
        return species+"{" +
                ", nickame='" + nickame + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
