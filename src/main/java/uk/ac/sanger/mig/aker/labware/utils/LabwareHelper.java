package uk.ac.sanger.mig.aker.labware.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author pi1
 * @since March 2015
 */
public class LabwareHelper {

	public static String getBarcode(long id, int size) {
		return "WTSI/LBW/" + StringUtils.leftPad(String.valueOf(id), size, '0');
	}

}
