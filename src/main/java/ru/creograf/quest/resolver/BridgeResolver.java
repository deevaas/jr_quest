package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class BridgeResolver extends AbstractResolver {
    public BridgeResolver(Resolver fail) {
        super(fail, Step.BRIDGE);
    }

    @Override
    protected String doResolve(boolean decision) {
        return """
        <html><body><p>You accepted the challenge. Are you going up to the captain's bridge?</p>
        <a href="/jr_query_war/step?step=CAPTAIN&decision=true" class="button">Go to bridge</a>
        <a href="/jr_query_war/step?step=CAPTAIN&decision=false" class="button">Cancel</a>
        """;
    }
}
