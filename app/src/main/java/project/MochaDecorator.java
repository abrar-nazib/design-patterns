package project;

public class MochaDecorator extends AddonDecorator {
    Beverage beverage;
    int item_cost;

    MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return this.beverage.cost() + 30;
    }
}
