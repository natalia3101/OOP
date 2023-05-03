import Items.BottleOfWater;
import Items.HotDrink;
import Items.Item;
import vending_machines.VendingMachine;


public class App {
    public static void main(String[] args) throws Exception {
        Item i1 = new Item("cola", 88.0);
        i1.setPrice(98.0);
        // System.out.println(i1.toString());

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(i1);
        itemMachine.addProduct(new Item("chips", 60.0));
        itemMachine.addProduct(new Item("oil", 50.0));
        itemMachine.addProduct(new Item("bread", 40.0));
        itemMachine.addProduct(new Item("juice", 20.0));
        itemMachine.addProduct(new BottleOfWater("sparkle water", 40.0, 500));
        itemMachine.addProduct(new BottleOfWater("still water", 37.0, 500));
        itemMachine.addProduct(new HotDrink("coffee", 87.0, 90, 250));
        itemMachine.addProduct(new HotDrink("tea", 51.0, 100, 250));
        



        for(Item prod: itemMachine.getProdAll())
        {
            System.out.println(prod.toString());
        }
    }
}
