package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class CaptainResolver extends AbstractResolver {
    public CaptainResolver(Resolver fail) {
        super(fail, Step.CAPTAIN);
    }

    protected String doResolve(boolean decision) {
        return """
                <html><body><p>You have come the bridge. Who are you?</p>
                <a href="/jr_query_war/step?step=TELL_ME_ABOUT_YOU&decision=true" class="button">Tell the truth</a>
                <a href="/jr_query_war/step?step=TELL_ME_ABOUT_YOU&decision=false" class="button">Lie</a>
                """;
    }
}
