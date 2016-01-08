
public class EmployeeList {
    
	private Employee head;
	private Employee tail;
	

    public EmployeeList() {
		this.head = null;
		this.tail = null;
    }

    //add a Employee to list

    public void addEmployee(Employee newEmployee) {
		
		if (head == null) {
			head = newEmployee;
			tail = newEmployee;
		} else {
			Employee temp = head;
			while (temp.getNextEmployee() != null) {
				temp = temp.getNextEmployee();
			}		
            temp.setNextEmployee(newEmployee);
            newEmployee.setPreviousEmployee(temp);
			tail = newEmployee;
		}
    }

	/**
	not worried about deleting employees for this exercise
	
    //delete a Employee from list

    public boolean deleteEmployee(Employee Employee) {

        if (this.nextEmployee == null) {
            //Employee to be removed was not found
            return false;
        } else if (this.nextEmployee.value.equals(Employee.value)) {
            //we found it...it is the next one...
            //now link this Employee to the one after the next
            this.nextEmployee = nextEmployee.nextEmployee;
            nextEmployee.previousEmployee = this;
            return true;
        } else {
            return this.nextEmployee.deleteEmployee(Employee);
        }

    }
	*/
	
	public void printList() {
		Employee temp = head;
		do {
			System.out.println(temp.getValue());
			temp = temp.getNextEmployee();
		} while (temp != null);
	}

}