package StepDefs;

import io.cucumber.java.en.Given;

public class StepDeffinitions {
    @Given("Printed Hello World")
    public void print_hello_world(){
        System.out.println("Hello world!");
    }
}
