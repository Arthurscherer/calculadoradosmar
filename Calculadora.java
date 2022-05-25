package calculadora;
        
import static org.junit. Assert.assertEquals; 
import org.junit. Test;
        
public class Test Calculadora (

    @Test
    public void testGetAdicao() {
        Calculadora calculadora = new Calculadora (4.0, 2.0); 
        double retornoEsperado = 6.0; 
        double retornoFeito = calculadora.getAdicao(); 
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}




























import junit.framework.JUnit4TestAdapter; 
import org.junit.runner.RunWith; 
import org.junit.runners.Suite; 
import org.junit.runners.Suite.SuiteClasses;

import calculadora. Test Calculadora;

@RunWith(Suite.class) 
@Suiteclasses({ Test Calculadora.class}) 
public class TesteSuite {
    
    public static junit.framework. Test suite() {
        return new JUnit4 Test Adapter (TesteSuite.class);
    }
}