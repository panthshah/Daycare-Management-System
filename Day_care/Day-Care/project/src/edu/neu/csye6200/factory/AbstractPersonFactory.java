/**
 * 
 */
package edu.neu.csye6200.factory;

import edu.neu.csye6200.model.Person;

/**
 * @author Group 5
 *
 */
public abstract class AbstractPersonFactory {

	public abstract Person getObject(String csvData);
	
	public abstract Person getObject();
}
