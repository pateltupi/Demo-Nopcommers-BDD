package com.demo.nopcommerce;
/*
 * Created By Trupti Patel on 2019-05-18
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"pretty","html:target/cucumber-reports"},
        tags = "@smoke,@regression,@navigation",
        monochrome = true
  )
public class CukeTest {
}
