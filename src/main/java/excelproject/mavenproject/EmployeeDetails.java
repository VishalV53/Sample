package excelproject.mavenproject;

public class EmployeeDetails {
	String employeeName;
	int empId;
	long  contactNumber;
	String designation;
	String dateOfBirth;
	String bloodGroup;
	String dateOfJoining;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public EmployeeDetails(String employeeName, int empId, long contactNumber, String designation, String dateOfBirth,
			String bloodGroup, String dateOfJoining) {
		super();
		this.employeeName = employeeName;
		this.empId = empId;
		this.contactNumber = contactNumber;
		this.designation = designation;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.dateOfJoining = dateOfJoining;
	}
	
	

}
