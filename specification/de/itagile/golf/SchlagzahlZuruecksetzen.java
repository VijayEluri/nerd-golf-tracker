package de.itagile.golf;

import org.junit.Ignore;

import de.itagile.golf.jbehave.BaseScenario;

@Ignore("in Arbeit")
public class SchlagzahlZuruecksetzen extends BaseScenario {

	public SchlagzahlZuruecksetzen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new NerdGolfTrackerSteps(driver),
				 new SchlagzahlZuruecksetzenSteps(driver)
		);
	}
}