package parcial.app;

/**
 * Hello world!
 *
 */
public class fizzBuss 
{
    /**
     * a
     */
    public static void main(String[] args) {
        String resultado = (multiploTres(9));
        System.out.println(resultado + " " + (resultado == "Fizz") );
    }

    public static String calculate( int numero ) {
        String resultadoTres = multiploTres(numero);
        String resultadoCinco = multiploCinco(numero);
        String resultado = (resultadoTres == "Fizz") ? resultadoTres: Integer.toString(numero);
        resultado = (resultadoCinco == "Buzz") ? resultadoCinco : Integer.toString(numero);
        resultado = (resultadoTres == "Fizz" && resultadoCinco == "Buzz" ) ? resultadoTres + resultadoCinco: Integer.toString(numero);
        return resultado;

    }

    public static String multiploTres( int numero ) {
        return (numero % 3 == 0) ? "Fizz" : Integer.toString(numero);
    }

    public static String multiploCinco( int numero ) {
        return (numero % 5 == 0) ? "Buzz" : Integer.toString(numero);
    }
}
