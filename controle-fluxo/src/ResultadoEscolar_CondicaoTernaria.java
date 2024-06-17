public class ResultadoEscolar_CondicaoTernaria {

    /*public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
 
        System.out.println(resultado);
    }*/

    public static void main(String[] args) {
        int nota = 4;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}