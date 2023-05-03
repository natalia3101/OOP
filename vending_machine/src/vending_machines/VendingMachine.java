package vending_machines;

import Items.Item;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int volume;
    private List<Item> products;// = new ArrayList<Product>();
    private List<String> workLog;// = new ArrayList<String>();

    public VendingMachine(int volume)
    {
        this.volume = volume;
        products = new ArrayList<Item>();
        workLog = new ArrayList<String>();
    }

    public void addProduct(Item prod)
    {
        products.add(prod);
    }

    public void addSales(String line)
    {
        workLog.add(line);
    }

    public Item getProdByName(String name)
    {
        for(Item prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    public List<Item> getProdAll()
    {
        return products;
    }

}
