package cafe;

import java.util.HashMap;

public class Dish {
    private String name; // Название блюда
    private int cost; // Стоимость блюда
    private int cookingTime; // Базовое время приготовления блюда
    private HashMap<Ingredient, Integer> recipe; // Рецепт блюда (пара Ингредиент-Количество)
}
