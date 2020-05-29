
package ec.edu.espe.objectsandclasses.model;


public class Chicken {

    private int id;
    private String name;
    private String colour;
    private int age;
    private boolean isMolting;

    public Chicken(int id, String name, String colour, int age, boolean molting) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.isMolting = molting;
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
    
    private void drink(){
        System.out.println("The chicken" + name + "is drinking");
    }
    
    private Poop poop(){
        Poop poopObject = new  Poop();
        System.out.println("The chicken "+ name+" is pooping");
        return poopObject;
    }
    private Egg layAnEgg(){
        Egg eggObect = new Egg(1);
        if(!isMolting){
            System.out.println("The chicken"+name+"");
        }
        return null;
    }

    @Override
    public String toString() {
        return " Chicken: " + "\n Id = " + id + "\n Name = " + name 
                + "\n Colour = " + colour + "\n Age = " + age 
                + "\n Molting = " + isMolting;
    }
    
    
}
