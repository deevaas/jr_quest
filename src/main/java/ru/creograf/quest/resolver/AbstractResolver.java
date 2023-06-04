package ru.creograf.quest.resolver;

import ru.creograf.quest.steps.Step;

public abstract class AbstractResolver implements Resolver{
    protected Resolver next;
    protected Resolver failResolver;

    protected Step thisStep;

    public AbstractResolver(Resolver fail, Step thisStep) {
        this.next = next;
        this.failResolver = fail;
        this.thisStep = thisStep;
    }

    public void init(Resolver next){
        if(this.next == null){
            this.next = next;
            return;
        }
        throw new IllegalStateException("Init method should be called only once");
    }

    public String resolve(Step step, boolean decision) {
        if(step==thisStep){
            return resolveDecision(decision);
        } else {
            return next.resolve(step, decision);
        }
    }

    private String resolveDecision(boolean decision){
        if(decision){
            return doResolve(decision);
        } else {
            return failResolver.resolve(thisStep, decision);
        }
    }

    protected abstract String doResolve(boolean decision);
}
