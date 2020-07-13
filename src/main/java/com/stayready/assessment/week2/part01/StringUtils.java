package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String result = "";

        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            result += " ";
        }

        result += stringToBePadded;

        return result;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String result = "";

        result += stringToBePadded;

        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            result += " ";
        }

        

        return result;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        String result = "";

        for(int i = 0; i < numberOfTimeToRepeat; i++){
            result += stringToBeRepeated;
        }

        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {

        String value = string.replace(" ", "");//remove spaces
        
        
        for (int i = 0; i < value.length(); i++){

            char ch = value.charAt(i);
            
            if (!(ch >= 'A' && ch <= 'z')){ //If NOT a letter
                return false;
            }
        }

        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        for (int i = 0; i < string.length(); i++){

            char ch = string.charAt(i);

            if(Character.isDigit(ch)){
                return true;
            }

        }

        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return null;
    }
}
