package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class CaptainResolver extends AbstractResolver {
    public CaptainResolver(Resolver fail) {
        super(fail, Step.CAPTAIN);
    }

    protected void doResolve(boolean decision) {
        System.out.println("captain resolver");
    }
}
