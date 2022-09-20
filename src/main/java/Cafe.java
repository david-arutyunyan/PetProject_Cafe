import staff.Employee;

import java.util.List;

public class Cafe {
    private int tablesNumber;
    private List<Employee> employees;
    private Menu menu;

    public int getTablesNumber() {
        return tablesNumber;
    }

    public void setTablesNumber(int tablesNumber) {
        this.tablesNumber = tablesNumber;
    }
}
