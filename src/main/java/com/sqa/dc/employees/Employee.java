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
public class Employee extends AbstractPerson {

	/**
	 * @param address
	 * @param age
	 * @param jobTitle
	 * @param name
	 */
	public Employee(String name, String address, int age) {
		super();
		this.setAddress(address);
		this.setAge(age);
		this.setName(name);

	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " They also work for a living.";
	}

}
