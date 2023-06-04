package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public class FailResolver implements Resolver{
    public String resolve(Step step, boolean decision) {
        return """
        <html><body><p>You failed, game over.</p>
        <a href="/jr_query_war" class="button">Play again</a>  
        """;
    }
}
