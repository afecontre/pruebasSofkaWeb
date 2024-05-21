package co.com.certification.testing.util;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ElementEnabled implements Question<Boolean> {

    private final Target target;

    public ElementEnabled(Target target) {
        this.target = target;
    }

    public static ElementEnabled forTarget(Target target) {
        return new ElementEnabled(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isEnabled();
    }
}