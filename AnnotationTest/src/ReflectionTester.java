import java.lang.reflect.Method;

public class ReflectionTester {

	public static void main(String[] args) {
			
		//create the object with the annotated method:
		AnnotTest annotationTester=new AnnotTest();		
		Class<?> theclass=annotationTester.getClass();
		try {
			//get an object which represents the annotated method:
			//Method class is in reflexion package
			Method method=theclass.getMethod("testA");
			//get an object which represents the annotation for the annotated method:
			PersonAnnot personAnnot=method.getAnnotation(PersonAnnot.class);
			System.out.println("Values in annotation. Name: "+personAnnot.name()+" Age: "+personAnnot.age());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}