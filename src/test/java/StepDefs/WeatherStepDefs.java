package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    @Given("city id: {int}")
    public void set_city_id(int cityId) {

    }

    @When("we are requesting weather data")
    public void request_weather() {

    }

    @Then("lon is {double}")
    public void check_lon(double lon) {

    }

    @Then("lat is {double}")
    public void check_lat(double lat) {

    }


    @And("weather id is {int}")
    public void check_weather_id (int weatherId) {
    }


    @And("main is {string}")
    public void check_main(String main) {
    }

    @And("description is {string}")
    public void check_description(String description) {
    }

    @And("icon is {string}")
    public void check_icon(String icon) {
    }

    @And("base is {string}")
    public void check_base(String base) {
    }

    @And("weather main is:")
    public void weather_main_is(Map<String, String> main) {
    }

    @And("weather visibility is {int}")
    public void weather_visibility_is(int visibility) {
    }

    @And("wind is:")
    public void wind_is(Map<String, String> wind) {
    }

    @And("clouds all is {int}")
    public void clouds_all_are(int clouds) {
    }

    @And("weather dt is {int}")
    public void check_weather_dt(int dt) {
    }

    @And("weather sys is:")
    public void weather_sys_is(Map<String, String> sys) {
    }

    @And("id is {int}")
    public void check_id(int id) {
    }

    @And("name is {string}")
    public void check_name(String name) {
    }

    @And("cod is {int}")
    public void check_cod(int cod) {
    }
}
