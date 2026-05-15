import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main_old {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("expenses.txt"));
            String line;
            while ((line = reader.readLine()) !=null) {
                String[] data = line.split("-");
                String fileCategory= data[0];
                double fileAmount = Double.parseDouble(data[1]);
                Expense expense = new Expense(fileCategory, fileAmount);
                expenses.add(expense);
            }
            reader.close();
        }catch (IOException e){
            System.out.println("No previous expense file found");
        }
        String choice = "yes";
        System.out.println("Welcome to Expense Predictor!");
        
        while(choice.equalsIgnoreCase("yes")){
            System.out.print("Enter expense category: ");
            String category = sc.nextLine();
            System.out.print("Enter expense amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            Expense expense1 = new Expense(category, amount);
            expenses.add(expense1);
            try {
                FileWriter writer = new FileWriter("expenses.txt",true);
                writer.write(category + " - " + amount + "\n");
                writer.close();
            }catch (IOException e){
                System.out.println("Error while saving expense.");
            }
            System.out.println("Do you want to add another expense? (yes/no):");
            choice = sc.nextLine();
        }
        System.out.println("\nExpense Added Successfully!");

        double totalExpense = 0;
        double foodExpense = 0;
        double highestAmount = 0;
        String highestCategory = "";
        
        for (Expense expense : expenses) {
            expense.displayExpense();
            totalExpense += expense.amount;
            if (expense.amount > highestAmount){
                highestAmount =expense.amount;
                highestCategory =expense.category;
            }
            if (expense.category.equalsIgnoreCase("Food")){
                foodExpense += expense.amount;
            }
        }
        System.out.println("\nTotal Expense: "+ totalExpense );
        System.out.printf("Food Expense : "+ foodExpense );
        System.out.println("\nHighest Expense Category: "+ highestCategory);
        System.out.println("\nHighest Expense Amount: "+ highestAmount);
        double predictedExpense = totalExpense / expenses.size();
        System.out.printf("Predicted Next Expense : %.2f\n", predictedExpense);
        
        sc.close();
    }
}