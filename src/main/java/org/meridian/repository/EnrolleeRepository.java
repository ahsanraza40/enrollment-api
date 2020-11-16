/**
 * 
 */
package org.meridian.repository;

import java.util.List;

import org.meridian.model.Enrollee;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Ahsan Raza
 *
 */

public interface EnrolleeRepository extends PagingAndSortingRepository<Enrollee, Integer> {
	
	 List<Enrollee> findByName(String name);

}
