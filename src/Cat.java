public class Cat extends PatAnimal implements Comparable<Cat> {
    public int  caughtMiceCount;

    public Cat(String name, int yearOfBirth, int caughtMiceCount) {
        super(name, yearOfBirth);
        this.caughtMiceCount = Math.max(caughtMiceCount, 0);
    }
    public void sleep() {
        System.out.println("Task1.Cat " + this.name + " sleep");
    }

    public int getCaughtMiceCount() {
        return caughtMiceCount;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow!");
    }
    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.caughtMiceCount, o.caughtMiceCount);
    }

    @Override
    public String toString() {
        return "Cat " + getName() + " caught " + getCaughtMiceCount() + " mice";
    }
}
