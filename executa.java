package carros;

public class executa {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro(1000, "mercedes", 6, 200, "ABC123", 0);
        carro1.setVelocidadeAtual(120);
        carro1.frear();
        carro1.parar();
        
        System.out.println(carro1.toString());
    }  
    
}