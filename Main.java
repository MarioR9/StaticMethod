import javax.swing.*;

public class Main {
    public static void main(String[]args){
        double [] num = new double [3];
        num[0] = 6;num[1] = 6;num[2] = 6;
        JOptionPane.showMessageDialog(null,"the sum " + Math.round(Calculator.getSum(num)) +"\n" + "the Product " + Math.round(Calculator.getProduct(num)) +"\n"+ "The avarage " + Math.round(Calculator.getAverage(num)) + "\n"+ "The Factorial " +Math.round(Calculator.getFactorial(5)));

    }
}
