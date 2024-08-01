public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal; // esse caso dá erro pq a variável numeroCurto2 é do tipo short
        // e está recebendo um int que tem a "capacidade" maior então nesse caso é recomendado o cast
        //que ficaria assim -> short numeroCurto2 = (short)numeroNormal;

        /**
         * Para constantes a convenção adota a definição das constantes sempre em CAIXA_ALTA
         * sendo precedida da palavra final
         */
        final double VALOR_DE_PI = 3.14;

        System.out.println("Esse é o valor de PI: "+VALOR_DE_PI);
    }
}
