// Ques . wap to buy chocolates under some specific condition #leetcode
import java. util. *;
    class a2 {
    public static void  main(String args[]){
            Scanner sc= new Scanner(System.in);
            int money= sc.nextInt();
            int buy = sc .nextInt();
            // Initialize the array's
            // size using user input
           int []prices=new int[100];
            // Take user elements for the array
            // System.out.println(
            //     "Enter the elements of the array: ");
            for (int i = 0; i <prices.length; i++) {
                if (sc.hasNextInt()) {
                    prices[i] = sc.nextInt();
                }
            }
            for(int i=0;i<prices.length;i++){
            if(money<prices[i]){
              buy= money -prices[i];
              if(buy==0){
              System.out.println("0");
              }
        }
      }
    }
}

// class Solution {
//     public int buyChoco(int[] prices, int money) {
//         Arrays.sort(prices);
//         int cost = prices[0] + prices[1];
//         return money < cost ? money : money - cost;
//     }
// }

	// class Solution {
  //   public int buychoco(int[] prices,int money){
  //     Arrays.sort(prices);
  //     int cost=prices[0]+prices[1];
  //     return money<cost?money: money-cost;
  //   }
  // }

    

