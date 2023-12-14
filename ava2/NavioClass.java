
package ava2;

/**
 *
 * @author mateus
 */
public class NavioClass extends Transportes{
    protected String nome;
    protected int numeroTripulantes;
    protected double preco;
    protected String dataLancamento; 
    double dividir;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    
    public void entradaNome(){
    System.out.println("Digite nome:");
    this.nome = scanner.next();
    
    }
    public void entradaNumeroTripulantes(){
    System.out.println("Digite o número de tripulantes:");
    this.numeroTripulantes = scanner.nextInt();
    if(numeroTripulantes > numeroPassageiros){
        throw new RuntimeException("O numero de tripulantes não deve ser maior que o ´numero de passageiros");
        
    }
    
    }
    public void entradaPreco(){
    System.out.println("Digite o preco:");
    this.preco = scanner.nextDouble();
    
    }
    public void entradaDataLancamento(){
    System.out.println("Digite a data de lancamento:");
    this.dataLancamento = scanner.next();
    
    }
    public void passageirosPorTripulantes(){
    int passageiros = getNumeroPassageiros();
    int tripulantes = getNumeroTripulantes();
    this.dividir = (passageiros / tripulantes);
    }
    
     public void inserir(){
    entradaNome();
    entradaPreco();
    
    entradaDataLancamento();
    
    
    }
    
    
    
    
    @Override
    public void imprimir(){
    super.imprimir();
    System.out.println("Nome: " + getNome());
    System.out.println("Numero de tripulantes: " + getNumeroTripulantes()); 
    System.out.println("Preco: " + getPreco());
    System.out.println("Data de lancamento: " + getDataLancamento());
    System.out.println("Há " + dividir + " passageiros por tripulante.");
    System.out.println(" " );
    }
}
