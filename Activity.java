public class ACTIVITY {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Zamiel");
        dog.setNumberOfPuppies(3);

        dog.doggo[0] = "kajik";
        dog.doggo[1] = "Ali";
        dog.doggo[2] = "Yvo";

        System.out.println(dog.name());
        System.out.println(dog.bark());
        System.out.println(dog.showNumberOfPuppies());

        for (int i = 0; i < 3; i++) {
            System.out.println("Puppy: " + dog.doggo[i]);
        
    }
}
}
