public class Saddle {
    public static int avg_saddle(int[][] nums) {
        return -1;
    }
    public static void test() {
        int[][]demo = {
            {  1,  20,  2,  3, 100,  4},
            { 90,  60, 80,  8,  90, 40},
            {  5,  40, 6,   7, 240,  8}
        };
        // saddles: 60, 8, 90
        // edge saddles (do not consider): 40, 20
        int correct = 52; // note integer average truncates away fractional part
        int ans = avg_saddle(demo);

        System.out.println("Saddle test gives "+ans+" should be "+correct);
    }
}
