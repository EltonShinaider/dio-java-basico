public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual é: " + smartTv.volume);

        System.out.println("Canal atual é: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual é: " + smartTv.canal);


        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual é: " + smartTv.canal);
        System.out.println("Volume atual é: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);
    }
}
