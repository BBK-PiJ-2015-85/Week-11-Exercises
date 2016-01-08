public class Company {
	
	public static void main(String[] args) {
		EmployeeList empNameList = new EmployeeList();
		
		Employee<String> james = new Employee<>("James");
		Employee<String> dave = new Employee<>("Dave");
		Employee<String> sarah = new Employee<>("Sarah");
		empNameList.addEmployee(james);
		empNameList.addEmployee(dave);
		empNameList.addEmployee(sarah);
		empNameList.printList();
		
		EmployeeList empNatInNumberList = new EmployeeList();
		Employee<Integer> jamesNI = new Employee<>(43435322);
		Employee<Integer> daveNI = new Employee<>(45336329);
		Employee<Integer> sarahNI = new Employee<>(11112323);
		empNatInNumberList.addEmployee(jamesNI);
		empNatInNumberList.addEmployee(daveNI);
		empNatInNumberList.addEmployee(sarahNI);
		empNatInNumberList.printList();
		
	}
}