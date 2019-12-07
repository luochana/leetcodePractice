package interviw_hot.GasStation_143;

public class Solution_java {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0; i < gas.length; ++i){
            int get = 0;
            boolean flag = true;
            for(int j = i; j < i + gas.length; j++){
                get = get + gas[j % gas.length] - cost[j % gas.length];
                if(get < 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return i;
        }
        return -1;
    }
}
