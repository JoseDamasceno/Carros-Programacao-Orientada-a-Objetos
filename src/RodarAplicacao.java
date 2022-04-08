import java.util.Locale;

public class RodarAplicacao {
    public static void main(String[] args) {


        Carro carro1 = new Carro();

        carro1.setCor("prata");
        carro1.setLitrosTanque(47d);
        carro1.setModelo("Volkswagen Fox");


        System.out.println(carro1.getCor().toUpperCase());
        System.out.println(carro1.getModelo());
        System.out.printf("%.2f Litros",carro1.getLitrosTanque());
        System.out.println();
        System.out.printf("R$: %.2f ",carro1.totalValorTanque(6.699d));
        System.out.println();

        System.out.println(carro1.getLitrosTanque()+" Lt Tem a automonia de "+carro1.autonomia(14.7)+ "Km");
        System.out.println();

        Carro carro2 = new Carro( "preto", "Volkswagen e-Trons",0d );//Sobre carga no Construtor

        System.out.println("===========");
        System.out.println(carro2.getCor().toUpperCase());
        System.out.println(carro2.getModelo());
        System.out.printf("%.2f Litros",carro2.getLitrosTanque());
        System.out.println();
        System.out.printf("R$: %.2f ",carro2.totalValorTanque(6.699d));
        System.out.println();

    }
}
