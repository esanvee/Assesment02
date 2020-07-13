package com.stayready.assessment.week2.part02;

public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at
     *         the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        Integer[] newAry = new Integer[integerArray.length + 1];

        for (int i = 0; i < integerArray.length; i++) {
            newAry[i] = integerArray[i]; // clone array
        }

        newAry[newAry.length - 1] = valueToBeAdded; // add last element at the end

        return newAry;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number
     *         `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        Integer[] newAry = new Integer[integerArray.length];

        for (int i = 0; i < integerArray.length; i++) {

            if (i == indexToInsertAt) {//reach the index

                newAry[i] = valueToBeInserted;

            } else {//continue as usual

                newAry[i] = integerArray[i]; // clone array
            }
        }

        return newAry;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }




    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values
     *         decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        
        Integer[] newAry = new Integer[integerArray.length];

        for (int i = 0; i < newAry.length; i++) {

			if (integerArray[i] % 2 == 0) {

				newAry[i] = integerArray[i] + 1;

			}else{

                newAry[i] = integerArray[i] - 1;

            }	
		}

        
        return newAry;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] newAry = new Integer[integerArray.length];

        for (int i = 0; i < newAry.length; i++) {

			if (integerArray[i] % 2 == 0) {

				newAry[i] = integerArray[i] + 1;

			}else{

                newAry[i] = integerArray[i];

            }	
		}

        
        return newAry;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {

        Integer[] newAry = new Integer[input.length];

        for (int i = 0; i < newAry.length; i++) {

			if (input[i] % 2 == 0) {

				newAry[i] = input[i];

			}else{

                newAry[i] = input[i] - 1;

            }	
		}

        
        return newAry;
    
    }
}
