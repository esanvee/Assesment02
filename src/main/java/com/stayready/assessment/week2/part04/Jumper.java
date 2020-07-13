package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        int jump = 1;
        int height = j;

        while(height < k){
            height += height;
            jump++;

        }

        return jump;
    }
}
