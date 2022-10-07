package Atividade3;
import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Mensalidade mensalidade1 = new Mensalidade(1200, 1);
    JOptionPane.showMessageDialog(null, " Mensalidade" + mensalidade1.calculaMensalidade(), null, JOptionPane.INFORMATION_MESSAGE);
    Mensalidade mensalidade2 = new Mensalidade(1200, 2);
    JOptionPane.showMessageDialog(null, "Mensalidade" + mensalidade2.calculaMensalidade(), null, JOptionPane.INFORMATION_MESSAGE);
    Mensalidade mensalidade3 = new Mensalidade(1200, 5);
    JOptionPane.showMessageDialog(null, "Mensalidade" + mensalidade3.calculaMensalidade(), null, JOptionPane.INFORMATION_MESSAGE);
    Mensalidade mensalidade4 = new Mensalidade(1200, 0);
    JOptionPane.showMessageDialog(null, "Mensalidade" + mensalidade4.calculaMensalidade(), null, JOptionPane.INFORMATION_MESSAGE);
  }
}

