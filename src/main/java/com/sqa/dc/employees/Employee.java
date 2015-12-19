/**
 *   File Name: Employee.java<br>
 *
 *   Chow, Daisy<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Dec 18, 2015
 *
 */

package com.sqa.dc.employees;

/**
 * Employee
 *
 * @author Chow, Daisy
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Employee {

	private String address;
	private String age;
	private String jobTitle;
	private String name;

	/**
	 * @param address
	 * @param age
	 * @param jobTitle
	 * @param name
	 */
	public Employee(String address, String age, String jobTitle, String name) {
		super();
		this.address = address;
		this.age = age;
		this.jobTitle = jobTitle;
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return this.age;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [address=" + this.address + ", age=" + this.age + ", jobTitle=" + this.jobTitle + ", name="
				+ this.name + "]";
	}

}
