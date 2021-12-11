package com.techreturners.exercise003;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        int code = 0;
        for (int i = 0; i <= iceCreamFlavours().length - 1; i++) {
            if (iceCreamFlavours()[i].equals(iceCreamFlavour)) {
                code = i;
            }
        }
        return code;
    }

    String[] iceCreamFlavours() {
        String[] iceCreamFlavours = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};
        return iceCreamFlavours;
    }
}
