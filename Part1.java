public class Part1 {
    public static void main(String[] args) {
        int dice1, dice2;
        final int maxRolls = 100000;
        final int options = 6;
        for (int numRolls = 10; numRolls < maxRolls; numRolls*=10) {
            int count = 0;
            for (int i = 0; i < numRolls; i++) {
                dice1 = (int) (Math.random() * options) + 1;
                dice2 = (int) (Math.random() * options) + 1;
                if (dice1 == 1 & dice2 == 1)
                    count++;
            }
            System.out.println(numRolls + ": " + count + " snake eyes");
        }
    }
}
