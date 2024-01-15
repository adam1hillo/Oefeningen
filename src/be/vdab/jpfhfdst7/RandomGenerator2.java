package be.vdab.jpfhfdst7;

import java.util.Arrays;

public class RandomGenerator2 {
    public static void main(String[] args) {
        var getallen = new int[100];


        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int)((Math.random() * 1000) + 1);
        }

        /*
        var swapped = true;
        var index = getallen.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < index; i++) {
                if (getallen[i] > getallen[i+1]){
                    var temp = getallen[i];
                    getallen[i] = getallen[i+1];
                    getallen[i+1] = temp;
                    swapped = true;
                }
            }
            index--;
        }
        */
        Arrays.sort(getallen);

        for (int i : getallen) {
            System.out.println(i);
        }
    }
}
