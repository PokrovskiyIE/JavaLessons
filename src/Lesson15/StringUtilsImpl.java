package Lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils{

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Один из аргументов пустой");
        }
        double num1 = 0;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Первое значение не число");
        }
        double num2 = 0;
        try {
            num2 = Integer.parseInt(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Второе значение не число");
        }
        if (num2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        return  num1 / num2;
    }


    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null) {
            throw new NullPointerException("Пустая строка!");
        }
        ArrayList<Integer> resultArray = new ArrayList<>();
        String textLow = text.toLowerCase();
        String wordLow = word.toLowerCase();
        int index = 0;

        while (index != -1) {
            index = textLow.indexOf(wordLow, index);
            if (index != -1) {
                resultArray.add(index);
                index += wordLow.length();
            }
        }
        int[] result = new int[resultArray.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultArray.get(i);
        }
        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
       ArrayList<Integer> indexes = new ArrayList<>();
       ArrayList<Integer> lengths = new ArrayList<>();
        if (Character.isDigit(text.charAt(0))) {
            indexes.add(0);
        }
       for (int i = 1; i < text.length(); i++) {
           if (Character.isDigit(text.charAt(i)) && !Character.isDigit(text.charAt(i - 1))) {
               indexes.add(i);
           }
       }
       for (int i = 0; i < text.length() - 1; i++) {
           if (Character.isDigit(text.charAt(i))) {
               int count = 1;
               while (Character.isDigit(text.charAt(i)) && ((i + 1) < text.length()) && Character.isDigit(text.charAt(i + 1))) {
                   count++;
                   i++;

               }
               lengths.add(count);
           }
       }
       double[] result = new double[indexes.size()];
       for (int j = 0; j < result.length; j++) {
           result[j] = Double.parseDouble(text.substring(indexes.get(j), (indexes.get(j) + lengths.get(j))));
           System.out.println(Arrays.toString(result));
       }
        return result;
    }
}

//    Pattern p = Pattern.compile("(\\d+(?:\\.\\d+))");
//    Matcher m = p.matcher(str);
//    while(m.find()) {
//        double d = Double.parseDouble(m.group(1));
//        System.out.println(d);
//        }