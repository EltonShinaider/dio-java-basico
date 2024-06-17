public class SistemaMedida_SwitchCase {
    /*public static void main(String[] args) {
        String sigla = "G";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }                
            case "G": {
                System.out.println("GRANDE");
                break;
            }      
            default:
                System.out.println("INDEFINIDO");
        }*/
    public static void main(String[] args) {
        String plano = "M"; //PEGA O QUE ESTÁ ABAIXO DELE, JÁ QUE NÃO TEM O "break"

        switch (plano) {
            case "T":{
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }                
            case "B": {
                System.out.println("100 minutos de ligação");
            }      
        }
    }
}
