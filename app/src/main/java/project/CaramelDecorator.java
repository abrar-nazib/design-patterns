package project;

public class CaramelDecorator extends AddonDecorator {
    Beverage beverage;
    int item_cost;

    CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return this.beverage.cost() + 20;
    }
}
