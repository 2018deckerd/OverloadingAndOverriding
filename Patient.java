/**
 * Patient class for patient management system
 * @author Dylan Decker
 *
 */
public class Patient {
	
	private String name;
	private int age;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double dosage() {
		return 600.0;
	}
	
	public double bmi(double heightInMeters, double weightInKilograms) {
		return weightInKilograms / (heightInMeters * heightInMeters);
	}
	
	public double bmi(double height, String heightUnits, double weight, String weightUnits) {
		
		if (heightUnits.equalsIgnoreCase("cm")) {
			height = height / 100;
		} else if (heightUnits.equalsIgnoreCase("in")){
			height = height / 39.3700787;
		}
		
		if (weightUnits.equalsIgnoreCase("lbs")) {
			weight = weight / 2.2046226218488;
		} else if (weightUnits.equalsIgnoreCase("stone")) {
			weight = weight * 6.35029;
	}
		
		return weight / (height * height);
	}
	
	public String toString() {
		return "Patient " + getName() + " is " + getAge() + " years old.";
	}

}
