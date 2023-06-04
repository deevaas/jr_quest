package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class BridgeResolver extends AbstractResolver {
    public BridgeResolver(Resolver fail) {
        super(fail, Step.BRIDGE);
    }

    @Override
    protected void doResolve(boolean decision) {
        System.out.println("bridge resolver");
    }
}
