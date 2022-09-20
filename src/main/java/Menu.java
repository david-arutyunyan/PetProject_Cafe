import java.util.Collection;
import java.util.List;

public class Menu {
    private List<Dish> dishes;

    public List<Dish> getMenu() {
        return List.copyOf(dishes);
    }
}
