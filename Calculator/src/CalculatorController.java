
public class CalculatorController implements CalculatorService {

	public int add(int i,int j){
		
		return i+j;
	}
	public int multiply(int i,int j){
		
		return i*j;
	}
	public double divide(double i,double j)throws Exception{
		return i/j;
	}
	public int power(int i){
		
		return i*i;
		
	}
	@Override
	public int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}
}
