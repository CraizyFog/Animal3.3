public class Dog extends PatAnimal implements Comparable<Dog>{
    public int scaredOfThievesCount;

    public Dog(String name, int yearOfBirth, int scaredOfThievesCount) {
        super(name, yearOfBirth);
        this.scaredOfThievesCount = Math.max(scaredOfThievesCount,0);
    }
    public void sleep() {
        System.out.println("Task1.Dog " + this.name + " sleep");
    }

    public int getScaredOfThievesCount() {
        return scaredOfThievesCount;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
    @Override
    public int compareTo(Dog o) {
        return Integer.compare(this.scaredOfThievesCount, o.scaredOfThievesCount);
    }

    @Override
    public String toString() {
        return "Dog " + getName() + " scared of " + getScaredOfThievesCount() + " thieves";
    }
}
