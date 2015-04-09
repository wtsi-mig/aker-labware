package uk.ac.sanger.mig.aker.labware.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.sanger.mig.aker.labware.domain.Labware;
import uk.ac.sanger.mig.aker.labware.services.LabwareService;

/**
 * @author pi1
 * @since March 2015
 */
@RestController
@RequestMapping("/labware")
public class LabwareController {

	@Autowired
	private LabwareService labwareService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	private Labware create(@ModelAttribute Labware labwareRequest) {
		return labwareService.create(labwareRequest);
	}

	@RequestMapping(value = "/get/{owner}", method = RequestMethod.GET)
	private Page<Labware> get(@PathVariable String owner) {
		return labwareService.findAll(owner);
	}

}
