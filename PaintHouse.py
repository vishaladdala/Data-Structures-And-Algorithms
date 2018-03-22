class Solution {
    public int minCost(int[][] costs) {
        int mincost=0;
        
        if(costs.length == 0 || costs[0].length == 0){
            return mincost;
        }
        
        for(int i = 1; i < costs.length; i++){
            
            costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
            
        }
        int lastrow = costs.length -1;
        
        return Math.min(Math.min(costs[lastrow][0],costs[lastrow][1]),costs[lastrow][2]);
        
    }
}