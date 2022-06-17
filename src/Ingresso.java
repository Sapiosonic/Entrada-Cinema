public class Ingresso {
    private String filme;
    private int qtde;
    private double valor;

    public String getFilme() {
        return filme;
    }

    public int getQtde() {
        return qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularTotal(){
        return this.qtde * this.valor;
    }

    public void show(){
        System.out.printf(
            "Filme: %s\n"+
            "Qtde: %d\n"+
            "Valor: %.2f\n"+
            "Total: %.2f\n",getFilme(),getQtde(),getValor(),calcularTotal()
        );
    }
    
}
