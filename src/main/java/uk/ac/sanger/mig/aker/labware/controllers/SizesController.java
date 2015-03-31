package uk.ac.sanger.mig.aker.labware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.sanger.mig.aker.labware.domain.Size;
import uk.ac.sanger.mig.aker.labware.repositories.SizeRepository;

/**
 * @author pi1
 * @since March 2015
 */
@RestController
@RequestMapping("/sizes")
public class SizesController {

	@Autowired
	private SizeRepository sizeRepository;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	private Resource<Size> create(@PathVariable("name") String name) {
		final Size size = sizeRepository.findByName(name);
		return size != null ? new Resource<>(size) : null;
	}

}
