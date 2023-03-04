package parcial.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class fizzBussTest {   
    
    @Test
    public void calculate_number2_expected2(){
        System.out.println(3 % 3);
        //Arrage
        fizzBuss result = new fizzBuss();
        //Act
        String respuesta = result.calculate(2);
        //Asert
        assertEquals(2, Integer.parseInt(respuesta));   
    }

    @Test
    public void calculate_number9_expectedFizz(){
        //Arrage
        fizzBuss result = new fizzBuss();
        //Act
        String respuesta = result.calculate(9);
        //Asert
        assertEquals("Fizz", respuesta);   
    }

    @Test
    public void calculate_number25_expectedBuzz(){
        //Arrage
        fizzBuss result = new fizzBuss();
        //Act
        String respuesta = result.calculate(25);
        //Asert
        assertEquals("Buzz", respuesta);   
    }

    @Test
    public void calculate_number45_expectedFizzBuzz(){
        System.out.println(3 % 3);
        //Arrage
        fizzBuss result = new fizzBuss();
        //Act
        String respuesta = result.calculate(45);
        //Asert
        assertEquals("FizzBuzz", respuesta);   
    }
}
