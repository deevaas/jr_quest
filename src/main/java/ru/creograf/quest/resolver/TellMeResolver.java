package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class TellMeResolver extends AbstractResolver{
    public TellMeResolver(Resolver fail) {
        super(fail, Step.TELL_ME_ABOUT_YOU);
    }

    protected String doResolve(boolean decision) {
        return """
        <html><body><p>You have been returned home. You win</p>
        <a href="/jr_query_war" class="button">Play again</a>  
        """;
    }
}
