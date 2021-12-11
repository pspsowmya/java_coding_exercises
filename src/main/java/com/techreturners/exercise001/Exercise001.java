package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = Math.round((originalPrice + (vatRate / 100) * originalPrice) * 100.0) / 100.0;
        return vat;
    }

    public String reverse(String sentence) {
        StringBuffer sb = new StringBuffer(sentence);
        return sb.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = (int) users.stream().filter(u -> u.getType().equals("Linux")).count();
        return count;
    }
}
