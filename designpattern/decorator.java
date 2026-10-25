public interface Coffee {
    String getDescription();
    double cost();
}

public class SimpleCoffe implements Coffee {
    @Override
    String getDescription();

    @OVerride
    double cost() {
        return 5;
    }
}

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
}

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    public double cost() {
        return decoratedCoffee.cost() + 2;
    }
}

public class SaltDecorator extends CoffeeDecorator {

    public SaltDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Salt";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1;
    }
}