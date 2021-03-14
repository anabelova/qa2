package StepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    private int cityId;
    private WeatherResponse response;

    @Given("city id: {int}")
    public void set_city_id(int cityId) {
        this.cityId = cityId;

    }

    @When("we are requesting weather data")
    public void request_weather() throws JsonProcessingException {
        //call Weather Requester
        WeatherRequester requester = new WeatherRequester();
        response = requester.getWeather(cityId);

    }

    @Then("lon is {double}")
    public void check_lon(double lon) {
        Assertions.assertEquals(lon, response.getCoord().getLon(), "Wrong Lon");
    }

    @Then("lat is {double}")
    public void check_lat(double lat) {
        Assertions.assertEquals(lat, response.getCoord().getLat(), "Wrong lat");
    }


    @And("weather id is {int}")
    public void check_weather_id(int weatherId) {
       Assertions.assertEquals(weatherId, response.getWeathers().get(0).getId(), "Wrong weather Id");
    }


    @And("main is {string}")
    public void check_main(String main) {
      Assertions.assertEquals(main, response.getWeathers().get(1).getMain(), "Wrong main");
    }

    @And("description is {string}")
    public void check_description(String description) {
        Assertions.assertEquals(description, response.getWeathers().get(2).getDescription(), "Wrong desc");
    }

    @And("icon is {string}")
    public void check_icon(String icon) {
        Assertions.assertEquals(icon, response.getWeathers().get(3).getIcon(), "Wrong icon");
    }

    @And("base is {string}")
    public void check_base(String base) {
        Assertions.assertEquals(base, response.getBase(),"Wrong base");
    }

    @And("weather main is:")
    public void weather_main_is(Map<String, String> main) {
        Assertions.assertEquals(main, response.getMain(), "Wrong main");
    }

    @And("weather visibility is {int}")
    public void weather_visibility_is(int visibility) {
        Assertions.assertEquals(visibility, response.getVisibility(), "Wrong visibility");
    }

    @And("wind is:")
    public void wind_is(Map<String, String> wind) {
        Assertions.assertEquals(wind, response.getWind(), "Wrong wind");
    }

    @And("clouds all is {int}")
    public void clouds_all_are(int clouds) {
        Assertions.assertEquals(clouds, response.getClouds(), "Wrong clouds");
    }

    @And("weather dt is {int}")
    public void check_weather_dt(int dt) {
        Assertions.assertEquals(dt, response.getDt(), "Wrong dt");
    }

    @And("weather sys is:")
    public void weather_sys_is(Map<String, String> sys) {
        Assertions.assertEquals(sys, response.getSys(), "Wrong sys");
    }

    @And("id is {int}")
    public void check_id(int id) {
        Assertions.assertEquals(id, response.getId(), "Wrong id");
    }

    @And("name is {string}")
    public void check_name(String name) {
        Assertions.assertEquals(name, response.getName(), "Wrong name");
    }

    @And("cod is {int}")
    public void check_cod(int cod) {
        Assertions.assertEquals(cod, response.getCod(), "Wrong cod");
    }
}
