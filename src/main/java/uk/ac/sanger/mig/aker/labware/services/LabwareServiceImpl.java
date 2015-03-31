package uk.ac.sanger.mig.aker.labware.services;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import uk.ac.sanger.mig.aker.labware.domain.Labware;
import uk.ac.sanger.mig.aker.labware.repositories.LabwareRepository;

/**
 * @author pi1
 * @since March 2015
 */
@Service
public class LabwareServiceImpl implements LabwareService {

	@Resource
	private LabwareRepository repository;

	@Override
	public Labware create(Labware labwareRequest) {
		return null;
	}

	@Override
	public Page<Labware> findAll(String owner) {
		return null;
	}
}
