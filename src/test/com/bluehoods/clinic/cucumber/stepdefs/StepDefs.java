package com.bluehoods.clinic.cucumber.stepdefs;

import com.bluehoods.clinic.ClinicApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ClinicApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
