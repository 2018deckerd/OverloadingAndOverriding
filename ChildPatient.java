/**
 * Child Patient subclass for the patient management system
 * @author Dylan Decker
 *
 */
public class ChildPatient extends Patient {
	
	String parentName;
	
	public ChildPatient(String name, int age, String parentName) {
		super(name, age);
		this.parentName = parentName;
	}
	
	public double dosage() {
		return 300.0;
	}
	
	public String toString() {
		return "Patient " + getName() + " is " + getAge() + " years old and has parent " + parentName + ".";
	}

}
