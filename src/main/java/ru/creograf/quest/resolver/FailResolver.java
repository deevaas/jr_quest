package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class FailResolver implements Resolver{
    public void resolve(Step step, boolean decision) {
        System.out.println("resolve fail");
    }
}
