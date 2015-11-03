
import static java.lang.System.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@interface PersonAnnot{
	
	String name();
	int age();
	
}

@interface Text{}

public class AnnotTest {
	
	@PersonAnnot(name="john",age=3)
	public void testA()
	{}
	
	@Text
	public void testB()
	{out.println("test");}

	@Override
	public String toString() {
		return "AnnotationTester [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}