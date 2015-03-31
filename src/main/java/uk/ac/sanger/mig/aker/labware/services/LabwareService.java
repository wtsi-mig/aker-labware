package uk.ac.sanger.mig.aker.labware.services;

import org.springframework.data.domain.Page;

import uk.ac.sanger.mig.aker.labware.domain.Labware;

/**
 * @author pi1
 * @since March 2015
 */
public interface LabwareService {

	Labware create(Labware labwareRequest);

	Page<Labware> findAll(String owner);
}
