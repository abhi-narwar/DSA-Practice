import java.util.LinkedList;
import java.util.Queue;
class dota2_senate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();

        int n = senate.length();

        
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                R.offer(i);
            } else {
                D.offer(i);
            }
        }

        
        while (!R.isEmpty() && !D.isEmpty()) {
            int rIndex = R.poll();
            int dIndex = D.poll();

            if (rIndex < dIndex) {
                
                R.offer(rIndex + n);
            } else {
              
                D.offer(dIndex + n);
            }
        }

        return R.isEmpty() ? "Dire" : "Radiant";
    }
}
