package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class GreetingResolver extends AbstractResolver{

    public GreetingResolver(Resolver fail) {
        super(fail, Step.GREETINGS);
    }

    @Override
    protected String doResolve(boolean decision) {
        return """
        <html><body><p>You have lost your memory. Accept the ufo challenge?</p>
        <a href="/jr_query_war/step?step=BRIDGE&decision=true" class="button">Accept</a>
        <a href="/jr_query_war/step?step=BRIDGE&decision=false" class="button">Cancel</a>
        """;
    }
}
