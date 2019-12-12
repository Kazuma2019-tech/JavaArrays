/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

//import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author k00245120
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
// FOR EVEN NUMBERS

//        int[] height = new int[100];
//        int totalEven= 0;
//        
//        for (int i = 0; i < 100; i++) {
//            height[i] = ThreadLocalRandom.current().nextInt(1, 50);
//
//            if (i % 5 == 0) {
//                System.out.println("");
//            }
//            System.out.print(height[i] + " ");
//            if (height[i] % 2 == 0) {
//                totalEven+=height[i];
//            }
//        }
//        System.out.println(totalEven);
//________________________________________________
//        
//FOR ODD NUMBERS
        int[] height = new int[100];//Creating array of size 100
        int totalODD = 0;//creating variables to store the total sum of odd and even numbers generated
        int totalEven = 0;
        for (int i = 0; i < 100; i++) {//looping 100 times starting with 0
            
            height[i] = ThreadLocalRandom.current().nextInt(1, 50);//generating a random number between 1-50

            if (i % 5 == 0) {//checking to see if we are divisable by 5 to drop down a line for printing
                System.out.println("");
            }
            System.out.print(height[i] + " ");//printing out numbers
            if (height[i] % 2 != 0) {//checking if current number in loop is not divisable by two or odd
                totalODD += height[i];
            }
            if (height[i] % 2 == 0) {//doing the opposite off above
                totalEven+=height[i];
        


            }

        }
        System.out.println("");
        System.out.println("Odd "+totalODD);//printing out sums
        System.out.println("even "+totalEven);
    }

}