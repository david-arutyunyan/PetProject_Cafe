package cafe;

import staff.Employee;

import java.util.List;

public class Cafe {
    private int tablesNumber; // Число столов в кафе

    private int availableTablesNumber;
    private int financialResult; // Фин. результат по окончании рабочего дня
    private List<Employee> employees; // Список работников
    private List<Order> orderList; // Лист с заказами, которые пополняют официанты и выполняют шеф-повары
    private Menu menu; // Актуальное меню

    public Cafe(int tablesNumber, int financialResult, List<Employee> employees, List<Order> orderList, Menu menu) {
        this.tablesNumber = tablesNumber;
        this.availableTablesNumber = tablesNumber;
        this.financialResult = financialResult;
        this.employees = employees;
        this.orderList = orderList;
        this.menu = menu;
    }

    public void increaseAvailableTablesNumber() {
        availableTablesNumber++;
    }

    public void decreaseAvailableTablesNumber() {
        availableTablesNumber--;
    }

    public boolean areThereAnyAvailableTables() {
        return availableTablesNumber > 0;
    }

    public int getTablesNumber() {
        return tablesNumber;
    }

    public void setTablesNumber(int tablesNumber) throws Exception {
        if (tablesNumber <= 0)
            throw new Exception("Число столов в кафе не может быть меньше 1!");

        this.tablesNumber = tablesNumber;
    }
}
