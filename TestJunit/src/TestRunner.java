import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
	public static void main(String ar[]){
		Result result = JUnitCore.runClasses(TestJunit.class);
		for(Failure failure : result.getFailures()){
			System.out.print(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		
	}
	
}