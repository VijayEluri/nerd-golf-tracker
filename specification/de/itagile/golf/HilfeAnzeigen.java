package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;

public class HilfeAnzeigen extends BaseScenario {
	
	public HilfeAnzeigen() {
        TrackerDriver driver = new TrackerDriver();
        addSteps(new StarteNerdGolfTrackerSteps(driver),
                new HilfeAnzeigenSteps(driver));
	}
}