
package ava2;

/**
 *
 * @author mateus
 */
public class AVA2 {

   
    public static void main(String[] args) {
       
         
        
       int[] v  = new int[10];
       
       for(int i= 0; i< v.length; i++){
       AviaoClass aviao = new AviaoClass();
       //System.out.println("Insira os dados do Aviao N° " + (i + 1));
       //aviao.entradaCapacidadeTanque(); 
       //aviao.entradaNumeroPassageiro();
       //aviao.inserir();
       //System.out.println("------Dados do Aviao N° " + (i + 1) +"------");
       //aviao.reajustarPreco();
       //aviao.imprimir();
       } 
       
       for(int c= 0; c< v.length; c++){
       NavioClass navio = new NavioClass();
       System.out.println("Insira os dados do Navio N° " + (c + 1));
       navio.entradaCapacidadeTanque(); 
       navio.entradaNumeroPassageiro();
       navio.inserir();
       
       try {
           navio.entradaNumeroTripulantes();
           navio.passageirosPorTripulantes();
           
       }
       catch (RuntimeException n){
           System.out.println(n.getMessage());
           navio.entradaNumeroTripulantes();
       }
       System.out.println("------Dados do Aviao N° " + ( + 1) +"------");
       
       navio.imprimir();
       }
    }
    
}
