class Solution {
    private static int[] convertToIntArray(ArrayList<Integer> list) 
    {
        int[] intArray = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) 
        {
            intArray[i] = list.get(i);
        }

        return intArray;
    }
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 100; i <= 998; i += 2) {
            int a = i / 100, b = (i / 10) % 10, c = i % 10;
            int[] local = new int[10];
            local[a]++;
            local[b]++;
            local[c]++;
            boolean valid = true;
            for (int d = 0; d < 10; d++) {
                if (local[d] > freq[d]) {
                    valid = false;
                    break;
                }
            }
            if (valid) result.add(i);
        }
        int[] intArray = convertToIntArray(result);
        return intArray;
    }
}