import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    
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
        int choice;
        System.out.println("Welcome to Expense Predictor!");
        
        while(true){
            System.out.println("\n==== Expense Predictor Menu ====");

            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Show Analytics");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            choice= sc.nextInt();
            sc.nextLine();

            if(choice ==1){
                System.out.print("Enter expense category: ");
                String category = sc.nextLine();
                System.out.print("Enter expense amount: Rs. ");
                double amount = sc.nextDouble();
                sc.nextLine();
                Expense expense1 = new Expense(category, amount);
                expenses.add(expense1);
                try{ 
                    FileWriter writer = new FileWriter("expenses.txt",true);
                    writer.write(category + " - " + amount + "\n");
                    writer.close();
                }
                catch (IOException e){
                    System.out.println("Error while saving expense.");
                }
            }
            else if(choice ==2){
                System.out.println("\n==== ALL EXPENSES ====");
                for(Expense expense : expenses){
                    System.out.printf(
                        "%s - Rs. %.2f\n",
                        expense.category,
                        expense.amount
                    );
                }
            }
            else if(choice == 3){
                double totalExpense = 0;
                double foodExpense = 0;
                double highestAmount = 0;
                String highestCategory ="";
                for (Expense expense : expenses) {
                    expense.displayExpense();
                    totalExpense += expense.amount;
                    if (expense.amount > highestAmount){
                        highestAmount = expense.amount;
                        highestCategory = expense.category;
                    }
                    if (expense.category.trim().equalsIgnoreCase("Food")) {
                        foodExpense +=expense.amount;
                    }
                }
                System.out.println("\nTotal Expense: Rs. "+ totalExpense );
                System.out.printf("Food Expense : Rs. "+ foodExpense );
                System.out.println("\nHighest Expense Category: "+ highestCategory);
                System.out.println("\nHighest Expense Amount: Rs. "+ highestAmount);
                double predictedExpense = totalExpense / expenses.size();
                System.out.printf("Predicted Next Expense : Rs. %.2f\n", predictedExpense);
            }
            else if(choice == 4){
                System.out.println("Exiting Expense Predictor...");
                break;
            }
        }  
        //sc.close();
    }
}