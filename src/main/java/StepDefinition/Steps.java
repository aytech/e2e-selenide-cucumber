package StepDefinition;

import io.cucumber.java.en.Given;

public class Steps {

    @Given("Open the application")
    public void openApplication() {
        System.out.println("This step will open application URL");
    }

    @Given("Enter the username and password")
    public void enterUsernameAndPassword() {
        System.out.println("This sep will enter username and password");
    }

    @Given("Reset the credentials")
    public void resetCredentials() {
        System.out.println("This sep will reset credentials");
    }
}
