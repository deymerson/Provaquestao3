package Atividade3;

public class Mensalidade {
    private double Mensalidade;
    private int numeroI;
  
    public Mensalidade(double Mensalidade, int  numeroI) {
      this.Mensalidade = Mensalidade;
      this. numeroI =  numeroI;
    }
  
    public double calculaMensalidade() {
      if (this. numeroI == 1) {
        return this.Mensalidade -= (this.Mensalidade * 0.05);
      } else if (this. numeroI == 2) {
        return this.Mensalidade -= (this.Mensalidade * 0.1);
      } else if (this. numeroI > 2) {
        return this.Mensalidade -= (this.Mensalidade * 0.15);
      } else {
        return this.Mensalidade;
      }
    }
  
  }

