public class Carro {

    String cor;
    String modelo;
    Double litrosTanque;




    Carro(){

    }


    Carro(String cor, String modelo, Double litrosTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.litrosTanque = litrosTanque;}



    void setCor(String cor) {
        this.cor = cor;
    }


    public String getCor() {
        return cor;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    Double getLitrosTanque() {
        return litrosTanque;
    }

    void setLitrosTanque(Double litrosTanque) {
        this.litrosTanque = litrosTanque;
    }


    double totalValorTanque(double precoCombustivel){
        return litrosTanque * precoCombustivel;

    }
    double autonomia(double kmPorLitro){
        return litrosTanque * kmPorLitro;
    }
    double consumo(double km){
        return litrosTanque / autonomia(700);
    }



}
