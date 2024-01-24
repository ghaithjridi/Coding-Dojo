import java.util.ArrayList;
public class TestCafe {

    public static void main(String[] args) {
        
        CafeUtil CafeGhaith= new CafeUtil();
        
        int testCafe= CafeGhaith.getStreakGoal();

        double[] prices = new double[]{3.5,4.5,5.5,2};
        double testCafee=CafeGhaith.getOrderTotal(prices);

        ArrayList<String> myStr= new ArrayList<String>();
        myStr.add("drip coffe");
        myStr.add("cappucino");
        myStr.add("latte");
        myStr.add("mocha");
        CafeGhaith.displayMenu(myStr);

        ArrayList<String> myStrr= new ArrayList<String>();
        myStrr.add("ghatih");
        myStrr.add("morta");
        myStrr.add("nawfel");
        

        CafeGhaith.addCustomer(myStrr);


        
        

        System.out.println(testCafe);
        System.out.println(testCafee);
    }







}