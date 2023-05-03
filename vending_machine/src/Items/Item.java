package Items;

// базовы  продукт
public class Item{
    // инкапсуляция данных
// наименование продукта
    private String name; 
    // цена продукта
    private double price;



    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
// получаем продукт
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
// устанавливаем цену
    public void setPrice(Double value) {
        if (value <= 0) 
        {
            throw new IllegalStateException(String.format("the price is incorrect", value));

        }
        this.price = value;
    }

    // переобпеределение вывода продукта
    @Override
    public String toString()
    {
        return "Item {" +
        "name = '" + name + '\'' +
        ", cost = " + price +
        '}';
    }

}