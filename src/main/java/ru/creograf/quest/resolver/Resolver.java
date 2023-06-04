package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public interface Resolver
{
    String resolve(Step step, boolean decision);
}
