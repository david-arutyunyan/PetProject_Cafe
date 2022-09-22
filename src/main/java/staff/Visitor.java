package staff;


import cafe.Menu;
import cafe.Order;

public class Visitor extends Person {
    private int patience; // Терпение посетителя
    private int happiness; // Счастье посетителя
    private double tipsCoeff; // Коэффициент мажорности (сколько чаевых он может оставить) [1.0 ... 2.0]

    public Visitor(int patience, int happiness, double tipsCoeff) {
        this.patience = patience;
        this.happiness = happiness;
        this.tipsCoeff = tipsCoeff;
    }

    public Order chooseDishes(Menu menu) {
        return null;
    }

    public int payForOrder() {
        return 0;
    }
}
