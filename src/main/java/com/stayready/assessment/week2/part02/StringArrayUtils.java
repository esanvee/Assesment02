package com.stayready.assessment.week2.part02;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        
        String[] newAry = new String[endingIndex-startingIndex];

        int newI= 0;
        for (int i = startingIndex; i < endingIndex; i++){
            newAry[newI] = arrayToBeSpliced[i];
            newI++;
        }
        
        return newAry;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        
        try{

            String[] newAry = new String[arrayToBeSpliced.length-startingIndex];


        }catch(Exception IndexOutOfBoundsException){
            
        }
        
        String[] newAry = new String[arrayToBeSpliced.length-startingIndex];

        int newI= 0;
        for (int i = startingIndex; i < arrayToBeSpliced.length; i++){
            newAry[newI] = arrayToBeSpliced[i];
            newI++;
        }
        
        return newAry;
    }
}
