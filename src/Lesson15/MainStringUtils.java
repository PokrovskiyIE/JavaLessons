package Lesson15;

import java.util.Arrays;

public class MainStringUtils {
    public static void main(String[] args) throws CustomException {

        StringUtilsImpl utils = new StringUtilsImpl();
//        utils.div(null, "3");
//        utils.div("wer", "dfr");
//        utils.div("6", "0");
//        utils.div("4", "8");

        String text1 = "1mekhgmefeME";
        String text2 = null;
        String word = "me";

        //System.out.println(Arrays.toString(utils.findWord(text1, word)));
        //System.out.println(Arrays.toString(utils.findWord(text2, word)));

        String text3 = "a1a22";
        System.out.println(Arrays.toString(utils.findNumbers(text3)));
    }
}
