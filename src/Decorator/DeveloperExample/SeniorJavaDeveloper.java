package Decorator.DeveloperExample;

import Decorator.DeveloperExample.Developer;
import Decorator.DeveloperExample.DeveloperDecorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }


    public String makeCodeReview() {
        return "Make code review.";
    }

    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}