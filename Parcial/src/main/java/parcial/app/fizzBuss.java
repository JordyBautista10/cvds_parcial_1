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
        String resultado = (multiploCinco(9));
        System.out.println(resultado + " " + (resultado == "Fizz") );
    }

    public static String calculate( int numero ) {
        String resultadoTres = multiploTres(numero);
        String resultadoCinco = multiploCinco(numero);
        String resultado = (resultadoTres == "Fizz") ? resultadoTres: Integer.toString(numero);
        resultado = (resultadoCinco == "Buzz") ? resultadoCinco : resultado;
        resultado = (resultadoTres == "Fizz" && resultadoCinco == "Buzz" ) ? resultadoTres + resultadoCinco: resultado;
        return resultado;

    }

    public static String multiploTres( int numero ) {
        return (numero % 3 == 0) ? "Fizz" : Integer.toString(numero);
    }

    public static String multiploCinco( int numero ) {
        return (numero % 5 == 0) ? "Buzz" : Integer.toString(numero);
    }
}
