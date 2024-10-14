public class MaxWealth {
    public static void main(String[] args) {
        int accounts[][] = {
                { 23, 4, 1 },
                { 18, 12, 5, 8 },
                { 94, 23 },
                { 8, 8, 12, 14, 8 }
        };

        //Maximum wealth of person.
        int ans = maximumWealth(accounts);
        System.out.println("Maximum Wealth is:" + ans);
    }

    //Maximum wealth of a person.
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
               sum += accounts[person][account];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
