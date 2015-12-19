/**
 *   File Name: IPerson.java<br>
 *
 *   Chow, Daisy<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Dec 19, 2015
 *
 */

package com.sqa.dc.employees;

/**
 * IPerson
 *
 * @author Chow, Daisy
 * @version 1.0.0
 * @since 1.0
 *
 */
public interface IPerson {

	final static int MAX_AGE = 110;

	public String getName();

	public boolean move();

}
