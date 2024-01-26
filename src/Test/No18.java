package Test;

import static Cases.BurningCalories.burningCalories;

public class No18 {
    public static void main(String[] args) {
        int[] inputHours = new int[]{9,13,15,17};
        int[] inputCalories = new int[]{30,20,50,80};
        int inputTime = 18;

        burningCalories(inputHours,inputCalories,inputTime);
    }
}
