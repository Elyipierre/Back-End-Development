package week2;

import javax.swing.*;

public class bodyMassIndexApp {
    public static void main(String args[]) {
        int height;
        int weight;
        String getweight;
        getweight = JOptionPane.showInputDialog(null, "Please enter your weight in Kilograms");
        String getheight;
        getheight = JOptionPane.showInputDialog(null, "Please enter your height in Centimeters");
        weight = Integer.parseInt(getweight);
        height = Integer.parseInt(getheight);
        double bmi;
        bmi = (weight/((height/100)^2));
        JOptionPane.showMessageDialog(null, "Your BMI is: " + bmi);
    }
}
	
	