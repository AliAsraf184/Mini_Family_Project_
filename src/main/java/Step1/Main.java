package Step1;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Carleone", 1955);
        Human father = new Human("Vito", "Carleone", 1953);
        Pet pet = new Pet("Dog", "Rock", (byte) 5, (byte) 50, new String[]{"eat", "drink", "sleep"});


        Human Michael = new Human("Michael", "Carleone", (int) 1971, (byte) 90, pet, mother, father);

        System.out.println(Michael);
        Michael.feedPet();
    }
}
