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

    public void resolve(Step step, boolean decision) {
        if(step==thisStep){
            resolveDecision(decision);
        } else {
            next.resolve(step, decision);
        }
    }

    private void resolveDecision(boolean decision){
        if(decision){
            doResolve(decision);
        } else {
            failResolver.resolve(thisStep, decision);
        }
    }

    protected abstract void doResolve(boolean decision);
}
