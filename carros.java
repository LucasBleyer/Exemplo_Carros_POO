package carros;

public class carros {//atributos privados para proteger dados, usando o private
    private float peso;
    private String marca;
    private int totalMarchas;
    private float velocidadeFinal;
    private String placa;
    private float velocidadeAtual;
    
//construtor
    public carros(float peso, String marca, int totalMarchas, float velocidadeFinal, String placa, float velocidadeAtual) {
        this.peso = peso;
        this.marca = marca;
        this.totalMarchas = totalMarchas;
        this.velocidadeFinal = velocidadeFinal;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }    

    carros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void frear(){
        velocidadeAtual = velocidadeAtual - 10;
        if (velocidadeAtual < 0){
            velocidadeAtual = 0;
        }
    }
    
    public void acelerar(){
        velocidadeAtual = velocidadeAtual + 5;
    }
    
    public void parar(){
        velocidadeAtual = 0;
    }
    
//sets = atualizar  gets = consultar
    public float getPeso() {
        return peso;
    }

    public String getMarca() {
        return marca;
    }

    public int getTotalMarchas() {
        return totalMarchas;
    }

    public float getVelocidadeFinal() {
        return velocidadeFinal;
    }

    public String getPlaca() {
        return placa;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTotalMarchas(int totalMarchas) {
        if (totalMarchas < 0) {
            totalMarchas = 0;
        }
        this.totalMarchas = totalMarchas;
    }

    public void setVelocidadeFinal(float velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override //mostrar o estado atual do objeto
    public String toString() {
        return "Carro{" + "peso=" + peso + ", Marca=" + marca + ", totalMarchas=" + totalMarchas + ", velocidadeFinal=" + velocidadeFinal + ", placa=" + placa + ", velocidadeAtual=" + velocidadeAtual + '}';
    }  
}