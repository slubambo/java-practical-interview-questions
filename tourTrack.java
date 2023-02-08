public static int truckTour(List<List<Integer>> petrolpumps) {
    // Write your code here
    final int size = petrolpumps.size();
    
    for (int start = 0; start < size; start++) {
        if (petrolpumps.get(start).get(0) < petrolpumps.get(start).get(1)) continue;
        
        long tank = 0;
        int position = start;
        int pumpCount = 0;
        
        while (true) {
            if (pumpCount == size) return start; // all pumps has been visited
            if (tank < 0) break;                 // not enough petrol to move further

            tank += petrolpumps.get(position % size).get(0) - petrolpumps.get(position % size).get(1);
            
            position++;
            pumpCount++;
        }
    }
    return -1;

    }