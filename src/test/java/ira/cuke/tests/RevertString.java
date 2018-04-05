package ira.cuke.tests;

import org.junit.*;


public class RevertString {

    public static void main(String[] args) {

        String str = "to revert this";
        revertString(str);

    }

    private static String revertString(String originalString) {

        char[] original = originalString.toCharArray();

        char[] newArr = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            newArr[i] = original[original.length - i - 1];
        }

        System.out.println("Original string: " + originalString);
        System.out.println("Reverted string: " + String.copyValueOf(newArr));

        return String.copyValueOf(newArr);
    }

    @org.junit.Test
    public void testRevert() {
        String test = "Revert this string.";
        Assert.assertEquals(".gnirts siht treveR", revertString(test));
    }
}
