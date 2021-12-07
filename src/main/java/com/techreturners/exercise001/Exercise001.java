package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String capitalizedWord = Character.toUpperCase(word.charAt(0))+word.substring(1);
        return capitalizedWord;
    }

    public String generateInitials(String firstName, String lastName) {
        String initials = firstName.charAt(0)+"."+lastName.charAt(0);
        return initials;
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = Math.round((originalPrice + (vatRate/100)*originalPrice)*100.0)/100.0;
        return vat;
    }

    public String reverse(String sentence) {
        StringBuffer sb = new StringBuffer(sentence);
        String revString = sb.reverse().toString();
        return revString;
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for(int i=0;i<=users.size()-1;i++) {
            if (users.get(i).getType().equals("Linux")) {
                count++;
            }
        }
        return count;
    }
}
