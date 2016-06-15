/*
 * This file is part of SPINderella. It is subject to the license terms in
 * the LICENSE file found in the top-level directory of this distribution.
 * You may not use this file except in compliance with the License.
 */
package de.dfki.resc28.spinderella;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import de.dfki.resc28.spinderella.services.SPINderellaService;

/**
 * @author resc01
 *
 */
@ApplicationPath("/")
public class Server extends Application 
{
	@Override
	public Set<Class<?>> getClasses() 
	{
		super.getClasses();
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(SPINderellaService.class);
		return classes;
	}
}