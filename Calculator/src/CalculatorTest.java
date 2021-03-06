import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	CalculatorService service = new CalculatorController();
	
	int result;
	int i,j;
	@Before
	public void setup(){
		i=5;
		j=10;
	}
	@Test
	public void testAdd(){
		result = service.add(i,j);
		Assert.assertEquals(i+j, result);
		
	}
	@Test
	public void testMultiply(){
		result = service.multiply(i, j);
		Assert.assertEquals(i*j, result);
	}
	
	@Test
	public void testPower(){
		result = service.power(i);
		Assert.assertEquals(i*i, result);
	}

	@Test
	public void testDivide() throws Exception{
		double dv = service.divide(i,j);
		Assert.assertEquals((double)i/j, dv,0.0);
	}
	@Test
	public void testSubtract(){
		result = service.subtract(i, j);
		Assert.assertEquals(i-j, result);
	}
}
