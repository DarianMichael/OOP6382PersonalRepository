package ec.edu.espe.objectsandclasses.model;

public class Chicken {

    private static int indexCounter = 1000;

    int id;
    private String name;
    private String colour;
    private int age;
    private boolean isMolting;

    public Chicken() {
    }

    public Chicken(int id, String name, String colour, int age, boolean isMolting) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.isMolting = isMolting;
    }

    public Chicken(String name, String colour, int age, boolean isMolting) {
        if (this.indexCounter == 0) {
            this.id = 1;
            this.indexCounter = 1;
        } else {
            this.id = indexCounter + 1;
            this.indexCounter = this.indexCounter + 1;
        }
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.isMolting = isMolting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public void doStuff(int forTime) {
        cluck();
        wander();
    }

    private void cluck() {
        System.out.println("The chicken" + name + "is clucking");
    }

    private void wander() {
        System.out.println("The chicken" + name + "is wandering");
    }

    private void drink() {
        System.out.println("The chicken" + name + "is drinking");
    }

    private Poop poop() {
        Poop poopObject = new Poop();
        System.out.println("The chicken " + name + " is pooping");
        return poopObject;
    }

    private Egg layAnEgg() {
        Egg eggObect = new Egg(1);
        if (!isMolting) {
            System.out.println("The chicken" + name + "");
        }
        return null;
    }

    public int getIndexCounter() {
        return indexCounter;
    }

    @Override
    public String toString() {
        return " Chicken: " + " Id = " + id + "  Name = " + name
                + "  Colour = " + colour + "  Age = " + age
                + "  Molting = " + isMolting;
    }

    public String generateCsvData() {
        return id + " , " + name
                + " , " + colour + " , " + age
                + " , " + isMolting;
    }

}
