
package ava2;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class Transportes {
    protected int capacidadeTanque; 
    protected int numeroPassageiros; 
    Scanner scanner = new Scanner (System.in);

    
    public void entradaCapacidadeTanque(){
    System.out.println("Digite a capacidade do tanque:");
    this.capacidadeTanque = scanner.nextInt();
    
    }
    public void entradaNumeroPassageiro(){
    System.out.println("Digite o numero de passageiros:");
    this.numeroPassageiros = scanner.nextInt();
    
    }
    
    
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int CapacidadeTanque) {
        this.capacidadeTanque = CapacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int NumeroPassageiros) {
        this.numeroPassageiros = NumeroPassageiros;
    }
    
    public void imprimir(){
    System.out.println("Capacidade do tanque: " + getCapacidadeTanque());
    System.out.println("Numero de passageiros: " + getNumeroPassageiros()); 
    
    }
    
    
    
    
    
}
