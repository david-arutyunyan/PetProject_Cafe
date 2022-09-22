package cafe;

import java.util.List;

public class Menu {
    private List<Dish> dishes; // Список блюд, находящихся в меню

    public List<Dish> getMenu() {
        return List.copyOf(dishes);
    }
}
