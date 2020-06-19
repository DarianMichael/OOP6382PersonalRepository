package ec.edu.espe.objectsandclasses.view;

import ec.edu.espe.objectsandclasses.model.Chicken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author DARIAN
 */
public class ColecctionsAndArrays {

    public static void main(String[] args) {
        Collection things;
        things = new ArrayList();
        Chicken chicken = new Chicken("Lucy", "brown", 2, false);

        System.out.println("things ArrayList size ---->" + things.size());

        things.add(1000);
        things.add("Hello ESPE guys");
        things.add(2567.25F);
        things.add(true);
        things.add("D");
        things.add(chicken);
        things.add(new Chicken("Maria", "white", 1, true));
        things.add(new Chicken("Junior", "black", 1, false));
        things.add(5);
        things.add(5);
        things.add(5);
        things.add(5);

        System.out.println("Our list elements are --->" + things);
        System.out.println("things Arraylist size --->" + things.size());

        Object[] thingsArray = new Object[things.size()];
        thingsArray = things.toArray();
        System.out.println("thinsArray 6to element--->" + thingsArray[5]);

        things.remove(1000);

        System.out.println("thinsArray 6to element--->" + things);
        System.out.println("value returned when removing at chicken---->"
                + things.remove(chicken));

        things.remove(5);

        System.out.println("Our list elements are --->" + things);
        System.out.println("things Arraylist size --->" + things.size());

        System.out.println("thinsArray 6to element--->" + things);
        System.out.println("value returned when removing at chicken---->"
                + things.remove(chicken));

        Collection<Chicken> chickens = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            chickens.add(new Chicken("chickensito" + (i + 1), "white_" + (i + 1), i, true));
        }

        chickens.forEach((chick) -> {
            System.out.println(chick);
        });
        
        Iterator<Chicken> it = chickens.iterator();
        while(it.hasNext()){
            Chicken temporal = it.next();
            System.out.println(temporal);
        } 
    }

}
