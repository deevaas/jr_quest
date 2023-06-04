package ru.creograf.quest;

import ru.creograf.quest.resolver.*;
import ru.creograf.quest.steps.Step;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StepServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String stepString = req.getParameter("step");
        String decisionString = req.getParameter("decision");
        boolean decision = false;
        if(decisionString.equals("true")){
            decision = true;
        }


        Resolver failResolver = new FailResolver();

        AbstractResolver bridgeResolver = new BridgeResolver(failResolver);
        AbstractResolver captainResolver = new CaptainResolver(failResolver);
        AbstractResolver tellmeResolver = new TellMeResolver(failResolver);
        AbstractResolver greetingResolver = new GreetingResolver(failResolver);

        greetingResolver.init(bridgeResolver);
        bridgeResolver.init(captainResolver);
        captainResolver.init(tellmeResolver);
        tellmeResolver.init(failResolver);

       String responseString = switch (stepString) {
           case "GREETINGS" ->
               greetingResolver.resolve(Step.GREETINGS, decision);
           case "BRIDGE" ->
               bridgeResolver.resolve(Step.BRIDGE, decision);
           case "CAPTAIN" ->
               captainResolver.resolve(Step.CAPTAIN, decision);
           case "TELL_ME_ABOUT_YOU" ->
               tellmeResolver.resolve(Step.TELL_ME_ABOUT_YOU, decision);
           default -> bridgeResolver.resolve(Step.GREETINGS, decision);
       };
        resp.getOutputStream().print(responseString);

        //resp.getOutputStream().print(stepString);
        //resp.getOutputStream().print(decision);

    }
}
