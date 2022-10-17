import javax.swing.JOptionPane;
        
public class first {
    public static void main(String args[]){
        String firstNum = JOptionPane.showInputDialog("Enter first number !");
        if(firstNum == null){
            JOptionPane.showMessageDialog(null,"Bye");
            return;
        }
        String secondNum = JOptionPane.showInputDialog("Enter second number !");
        if(secondNum == null){
            JOptionPane.showMessageDialog(null,"Bye");
            return;
        }
        double sum = Double.valueOf(firstNum) + Double.valueOf(secondNum);
        JOptionPane.showMessageDialog(null,"Sum is " + sum);
    }
}
