package Decorator.DeveloperExample;

import Decorator.DeveloperExample.Developer;
import Decorator.DeveloperExample.DeveloperDecorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send weekly report to customers.";
    }

    public String makeJob() {
        return super.makeJob() + " " + sendWeekReport();
    }
}
