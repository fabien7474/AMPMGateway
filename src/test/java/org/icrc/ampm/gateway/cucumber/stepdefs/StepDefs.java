package org.icrc.ampm.gateway.cucumber.stepdefs;

import org.icrc.ampm.gateway.AmpmGatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AmpmGatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
