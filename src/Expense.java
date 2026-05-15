public class Expense {

    String category;
    double amount;

    Expense(String category, double amount) {

        this.category = category;
        this.amount = amount;
    }

    void displayExpense() {

        System.out.println("Category: " + category);
        System.out.println("Amount: ₹" + amount);
        
    }
}