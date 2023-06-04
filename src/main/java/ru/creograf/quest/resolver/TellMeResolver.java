package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class TellMeResolver extends AbstractResolver{
    public TellMeResolver(Resolver fail) {
        super(fail, Step.TELL_ME_ABOUT_YOU);
    }

    protected void doResolve(boolean decision) {
        System.out.println("Tell me resolver");
    }
}
