import java.util.*;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        int n = coins.length;

        for(int i = n-1; i>=0 && amount > 0; i--){
            while(amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        if(amount == 0)
            return count;
        else
            return -1;
    }
    public static void main(String[] args) {
        int[] coinDenominations = {2,15,25};
        int totalAmount = 30;

        int numberOfCoins = coinChange(coinDenominations, totalAmount);
        if(numberOfCoins == -1){
            System.out.println(totalAmount + " could not be made up with change ");
        }
        else{
            System.out.println(totalAmount + " can be made up with " + numberOfCoins + " coins.");
        }

    }
}
