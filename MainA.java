public class MainA {
    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Cat(), new Dog(), new Wolf()};
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
        }
    }
}
