package tnsif_packagedemo;

public class Scanner_demo {

    private String name;
    private int income;
    private int tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Scanner_demo [name=" + name + ", income=" + income + ", tax=" + tax + "]";
    }

    public static void main(String[] args) {

        Scanner_demo obj = new Scanner_demo();
        obj.setName("Sneha");
        obj.setIncome(50000);
        obj.setTax(5000);

        System.out.println(obj);
    }
}
