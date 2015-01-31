
// * To change this license header, choose License Headers in Project Properties.

package suam;

import javax.swing.JOptionPane;

/**
 *
 * @author 28
 */
public class Suam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n1, n2, s;
       n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
       n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
       s=n1+n2;
       JOptionPane.showMessageDialog(null,"La Suma es"+s);
    }
    
}
