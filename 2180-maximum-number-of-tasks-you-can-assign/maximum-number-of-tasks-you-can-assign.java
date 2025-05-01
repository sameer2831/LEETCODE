class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int m = tasks.length, n = workers.length;
        int start = 0, end = Math.min(m, n);
        while(start < end) {
            int mid = (end - start) / 2 + start;
            boolean isDone = true;  
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int w : workers) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
            int tries = pills;
            for(int i = mid; i >= 0; i--) {
                int w = map.lastKey();
                if(tasks[i] <= w) {// use the strongest workers for "easy tasks"
                    map.put(w, map.get(w) - 1);
                    if(map.get(w) == 0) map.remove(w);
                } else {   // use pill for qualify workers if the worker exists. If not, we exit the for-loop and try smaller size of tasks 
                    Integer w1 = map.ceilingKey(tasks[i] - strength);
                    if(w1 != null) {
                        tries --;
                        map.put(w1, map.get(w1) - 1);
                        if(map.get(w1) == 0) map.remove(w1);
                    } else {
                        isDone = false;
                        break;
                    }
                }
                if(tries < 0) {
                    isDone = false;
                    break;
                }
            }
            if(isDone) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}