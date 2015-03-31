package uk.ac.sanger.mig.aker.labware.processors;

import org.springframework.data.rest.webmvc.RepositoryLinksResource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Component;

import uk.ac.sanger.mig.aker.labware.controllers.LabwareController;
import uk.ac.sanger.mig.aker.labware.controllers.SizesController;

/**
 * @author pi1
 * @since March 2015
 */
@Component
public class LabwareResourceProcessor implements ResourceProcessor<RepositoryLinksResource> {

	@Override
	public RepositoryLinksResource process(RepositoryLinksResource resource) {
		resource.add(ControllerLinkBuilder.linkTo(LabwareController.class).withRel("labware"));
		resource.add(ControllerLinkBuilder.linkTo(SizesController.class).withRel("sizes"));
		return resource;
	}
}
