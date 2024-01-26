package Cases;

/**
 * Pajak 10% dari harga makanan dan service 5% dari harga makanan.
 * Total person = 4
 * Allergic = 1
 * Non-allergic = 3
 *
 *  Makanan yang dipesan:
 * 	1. Tuna Sandwich		42K (mengandung ikan)
 * 	2. Spaghetti Carbonara	50K
 * 	3. Tea pitcher			30K
 * 	4. Pizza				70K
 * 	5. Salad				30K
 *
 * 	format input (42000, 1)
 *
 * 	menu = {price, 1 = containsFish | 0 = noFish}
 *
 */
public class SplitBill {
    public static void main(String[] args) {
        int[][] menu = new int[][]{
                {42000,1},
                {50000,0},
                {30000,0},
                {70000,0},
                {30000,0}
        };

        int totalPerson = 4;
        int allergicPerson = 1;

        splitBill(menu,totalPerson,allergicPerson);
    }


    /**
     *
     * sum without fish
     * fish
     *
     * allergic = sum without fish/(totalPeople)
     * non allergic = allergic + fish/(totalPeople-allergic)
     */

    private static float[] caseSplitBill(int[][] menu,int totalPerson, int allergicPerson){
        float allergicBill = 0;
        float nonAllergicBill = 0;
        float allergicSum = 0;
        float nonAllergicSum = 0;

        for (int i = 0; i < menu.length; i++) {
            if(menu[i][1]==1){
                allergicSum += countTaxAndService(menu[i][0]);
            }else{
                nonAllergicSum += countTaxAndService(menu[i][0]);
            }
        }
        allergicBill = nonAllergicSum/(totalPerson);
        nonAllergicBill = allergicBill + (allergicSum/(totalPerson-allergicPerson));

        return new float[]{allergicBill,nonAllergicBill};
    }


    private static float countTaxAndService(int price){
        return price+(price*15/100);
    }

    public static void splitBill(int[][] menu,int totalPerson, int allergicPerson){
        float[] bill = caseSplitBill(menu,totalPerson,allergicPerson);
        System.out.println("Bill for non-allergic: " + bill[1]);
        System.out.println("Bill for allergic: " + bill[0]);
    }

}
