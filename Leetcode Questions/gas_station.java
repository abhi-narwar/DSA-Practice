class gas_station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currTank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int balance = gas[i] - cost[i];
            totalTank += balance;
            currTank += balance;

            if (currTank < 0) {
                start = i + 1;  
                currTank = 0;
            }
        }

        return totalTank >= 0 ? start : -1;
    }
}
