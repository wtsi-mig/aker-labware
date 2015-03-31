package uk.ac.sanger.mig.aker.labware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author pi1
 * @since March 2015
 */
@SpringBootApplication
@ComponentScan
@EnableTransactionManagement
@PropertySource({
		"classpath:labware.properties"
})
public class LabwareStart {
	public static void main(String[] args) {
		SpringApplication.run(LabwareStart.class, args);
	}
}
