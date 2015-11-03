import static java.lang.System.*; //Static import, tar in så vi alltid har tillgång till System-klassen

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface PersonAnnotation{ 
	String name(); //metoder skriver som abstrakta
	int age();
}

//marker Annotation
@interface Texts{
	
}


public class AnnotationTester {
	
	@PersonAnnotation(name="john", age=30) //metoder som skapas vid annotation deklareras som variabler
	private void testA(){
		
	}
	
	
	
	@Text
	private void testB(){
		out.println("testB");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	// för JUnit test se: http://www.vogella.com/tutorials/JUnit/article.html
	
	

}
