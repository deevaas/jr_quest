package ru.creograf.quest;

import ru.creograf.quest.resolver.*;
import ru.creograf.quest.steps.Step;

public class Demo {
    public static void main(String[] args) {
        Resolver failResolver = new FailResolver();

        Resolver bridgeResolver = new BridgeResolver(failResolver);
        Resolver captainResolver = new CaptainResolver(failResolver);
        Resolver tellmeResolver = new TellMeResolver(failResolver);
        Resolver greetingResolver = new GreetingResolver(failResolver);

        ((AbstractResolver)greetingResolver).init(bridgeResolver);
        ((AbstractResolver)bridgeResolver).init(captainResolver);
        ((AbstractResolver)captainResolver).init(tellmeResolver);
        ((AbstractResolver)tellmeResolver).init(failResolver);

        greetingResolver.resolve(Step.TELL_ME_ABOUT_YOU, true);

    }
}
