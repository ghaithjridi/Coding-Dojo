import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;

        }
        return sum;

    }

    public double getOrderTotal(double[] prices){
        double sum=0;
        for (int i = 0; i <= prices.length-1; i++) {
            sum += prices[i];

            
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i<menuItems.size();i++){
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("hello"+username);
        System.out.println("There are"+customers.size()+" people in front of you");
        customers.add(username);
        System.out.println(customers);
    }

}