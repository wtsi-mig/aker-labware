package uk.ac.sanger.mig.aker.labware.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import uk.ac.sanger.mig.aker.labware.domain.Size;

/**
 * @author pi1
 * @since March 2015
 */
@Repository
@RepositoryRestResource(path = "sizes")
public interface SizeRepository extends PagingAndSortingRepository<Size, Long> {

	@RestResource(exported = false)
	Size findByName(@Param("name") String name);

}
