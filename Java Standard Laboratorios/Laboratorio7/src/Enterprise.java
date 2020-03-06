import java.util.ArrayList;

public class Enterprise {
	/**
	 * g. para realizar el punto e. armar un método con la siguiente firma: public
	 * static ArrayList obtenerDatosDeEmpleadosMenosDe30(ArrayList losEmpleados) De
	 * ser posible reutilizar el método informarDatosDeEmpleados()
	 */
	public static void showEmployeesData(ArrayList<Employee> a) {
		for (int i = 0; i < a.size(); i++) {
			a.get(i).showEmployeeData();
		}
	}

	public static ArrayList<Employee> showEmployeesDataLessThan30(ArrayList<Employee> a) {
		ArrayList<Employee> employeesLessThan30 = new ArrayList<Employee>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getAge() < 30) {
				employeesLessThan30.add(a.get(i));
			}
		}
		return employeesLessThan30;
	}

	public static void main(String[] args) {
		// creation of objects
		Employee michael = new Employee("Michael", "12354", 30);
		Employee robert = new Employee("Robert", "12357", 32);
		Employee alan = new Employee("Alan", "112359", 33);
		Employee christian = new Employee("Christian", "111123", 42);
		Employee justin = new Employee("Justin", "222331", 21);
		Employee richard = new Employee("Richard", "223344", 25);

		// ArrayList is an Array which has the property that his length could be
		// increased
		// in average is the option that offers the best performance
		// Collection -> List -> ArrayList

		// adding Employees to theEmployees ArrayList

		ArrayList<Employee> theEmployees = new ArrayList<>();
		theEmployees.add(michael);
		theEmployees.add(robert);
		theEmployees.add(alan);
		theEmployees.add(christian);
		theEmployees.add(justin);
		theEmployees.add(richard);

		// printing theEmployees data or showing if you wish...

		for (int i = 0; i < theEmployees.size(); i++) {
			theEmployees.get(i).showEmployeeData();
		}

		// printing how many employees does theEmployees has

		System.out.println(theEmployees.size());
		for (int i = 0; i < theEmployees.size(); i++) {
			Employee e = theEmployees.get(i);
			if (e.getAge() < 30) {
				e.showEmployeeData();
			}
		}
	}

}
