public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        // Estado atual da SmartTV
        System.out.println("Smart Tv - Ligada? :" + smartTv.ligada);
        System.out.println("Smart Tv - Canal Atual: " + smartTv.canal);
        System.out.println("Smart Tv - Volume Atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Smart Tv - Novo Status Ligada? :" + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Smart Tv - Novo Volume :" + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Smart Tv - Novo Volume :" + smartTv.volume);

        System.out.println("Smart Tv - Canal Atual :" + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Smart Tv - Canal Atual :" + smartTv.canal);

        smartTv.desligar ();
        System.out.println("Smart Tv - Novo Status Ligada? :" + smartTv.ligada);

    }
}
