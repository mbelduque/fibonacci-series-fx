package fibonacciseriesfx;

import java.math.BigInteger;

public class FiboMethods {

    /**
     * VERSION A : ALGORITMO ITERATIVO TIPICO hace una suma y tres asignaciones.
     * Por lo tanto su complejidad temporal es O(1), porque ejecuta un número
     * constante de operaciones. En general, todo programa que ejecute un número
     * constante de operaciones tiene complejidad temporal O(1) Finalmente la
     * complejidad del metodo es O(n) porque ejecuta un número de operaciones
     * que siempre esta por debajo de una constante multiplicada por n
     *
     * @param n Ejecuta el proceso n veces
     * @return a - Entrega el valor de la variable que almacena el resultado del
     * calculo
     */
    public static BigInteger serieFiboIterativa(int n) { // n >= 0
        BigInteger a = new BigInteger("0"), b = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            BigInteger c = a.add(b);    // La variable auxiliar c guarda el valor de a+b
            a = b;  //A la variable 'a' asígnele el valor de la variable 'b'
            b = c;  //A la variable 'b' asígnele el valor de la variable 'c'
        }
        return a;
    }

    // VERSION B : ALGORITMO RECURSIVO TIPICO
    public static BigInteger serieFiboRecursiva(int n) { // n >= 0
        switch (n) {
            case 0:
                return new BigInteger("0");
            case 1:
                return new BigInteger("1");
            default:
                // Si n >= 2
                return serieFiboRecursiva(n - 1).add(serieFiboRecursiva(n - 2));
        }
    }

}
