package sg.edu.nus.iss;

import java.util.LinkedList;

public class linkedListExample {
    
    public void linkedListExample1() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("pikachu");
        linkedList.add("dedenne");
        linkedList.add("morpeko");
        linkedList.add("togedemaru");

        //System.out.println(linkedList);
        for (String itm : linkedList) {
            System.out.println(itm);
        }

    linkedList.remove("pikachu");
    System.out.println(linkedList);

    linkedList.addFirst("emolga");
    linkedList.addLast("pachirisu");
    System.out.println(linkedList);
    }
}
