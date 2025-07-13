class Solution {
    public int matchPlayersAndTrainers(int[] player, int[] tire) {
        Arrays.sort(player);
        Arrays.sort(tire);
        int i = 0, j = 0, count = 0;
        while (i < player.length && j < tire.length) {
            if (player[i] <= tire[j]) {
                i++; count++;
            }
            j++;
        }
        return count;
    }
}
