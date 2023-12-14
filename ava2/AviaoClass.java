
package ava2;

/**
 *
 * @author mateus
 */
public class AviaoClass extends Transportes{
    protected String prefixo;
    protected double preco;
    protected String dataRevisao;
   
    
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }
    public void entradaPrefixo(){
    System.out.println("Digite o prefixo:");
    setPrefixo(scanner.next() );
    
    } 
    public void entradaPreco(){
    System.out.println("Digite o preco:");
    this.preco = scanner.nextDouble();
    
    }
    public void entradaDataRevisao(){
    System.out.println("Digite a data de revisao:");
    this.dataRevisao = scanner.next();
    
    }
    public void reajustarPreco(){
    double reajuste;
    System.out.println("Digite o  reajuste: ");
    reajuste = scanner.nextDouble();
     System.out.println("Preco com reajste: " + (getPreco()+((reajuste/100)+1)));
    }
    
    public void inserir(){
    entradaPrefixo();
    entradaPreco();
    entradaDataRevisao();
    
    
    }
    
    @Override
    public void imprimir(){
    super.imprimir();
    System.out.println("Prefixo: " + getPrefixo());
    System.out.println("Data de revisao: " + getDataRevisao());
    System.out.println(" " );
    }
    
}
