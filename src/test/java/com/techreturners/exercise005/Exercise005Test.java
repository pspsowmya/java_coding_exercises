package com.techreturners.exercise005;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @Before
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }

    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }

    @Test
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }

    @Test
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }

    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    //Additional Test cases

    @Test
    public void checkSentenceIsNotPangram() {
        assertFalse(ex005.isPangram("This is a test class"));
    }

    @Test
    public void checkSentenceIsPangram() {
        assertTrue(ex005.isPangram("a dog is running crazily on the ground who doesn't care about the world qwertyuioplkjhgfdsazxcvbnm"));
    }

    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsPangram() {
        assertTrue(ex005.isPangram("ABCDEfghijKLMNOpqrstUVwxyz"));
    }

    @Test
    public void checkSentenceWithMixedNumberIsPangram() {
        assertTrue(ex005.isPangram("ABC D2 Efg hi3 jKL MNO pqr st4 UVw xyz"));
    }

    @Test
    public void checkSentenceWithMixedNumberMissingLetterIsNotPangram() {
        assertFalse(ex005.isPangram("ABC D2 Efg hi3 jKL MN0 pqr st4 UVw xyz"));
    }

    @Test
    public void checkSentenceWithMixedSpecialCharactersIsPangram() {
        assertTrue(ex005.isPangram("zyx wvU $ts #rqp $onM lKj% ih* fge£ dc^ BA( "));
    }

    @Test
    public void checkSentenceWithMixedSpecialCharactersMissingLetterIsNotPangram() {
        assertFalse(ex005.isPangram("$ts #rqp $onM lKj% ih* fge£ dc^ BA("));
    }

}
