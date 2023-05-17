package ProgramacionDeclarativa;

import java.util.function.BiFunction;

public class NumerosLamba {
    public static void main(String[]args){
        BiFunction<Double,Double,Double> potencia =(base, exponente )-> Math.pow(base, exponente);

        double resultado = potencia.apply(6.0,4.0);
        System.out.println(resultado);

    }

}
