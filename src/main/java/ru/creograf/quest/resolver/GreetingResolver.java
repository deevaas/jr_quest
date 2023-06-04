package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class GreetingResolver extends AbstractResolver{

    public GreetingResolver(Resolver fail) {
        super(fail, Step.GREETINGS);
    }

    @Override
    protected void doResolve(boolean decision) {
        System.out.println("resolve greetings");
    }
}
