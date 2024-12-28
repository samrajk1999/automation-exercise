package org.hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import base_pack.base;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class screenshot_failed_cases extends base{

	WebDriver driver;
	
	public screenshot_failed_cases() {
		
		this.driver= super.driver;
	}
	
	
	@After
	public void failed_screenshot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			try {
				screen_shot("failed testcase");
			} catch (IOException e) {
				 e.printStackTrace();
			}
		}
	}
}
