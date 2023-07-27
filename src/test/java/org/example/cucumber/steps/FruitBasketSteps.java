package org.example.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FruitBasketSteps {

    private int nApples;
    private int nOranges;
    private int nBananas;

    @Given("I have a fruit basket with {int} apples and {int} oranges")
    public void i_have_a_fruit_basket(int nApples, int nOranges) {

        this.nApples = nApples;
        this.nOranges = nOranges;
    }

    @When("I add {int} bananas to the basket")
    public void i_add_bananas(int nBananas) {

        this.nBananas = nBananas;
    }

    @Then("I should have {int} fruits in the basket")
    public void i_have_a_fruit_basket_with(int nFruitsExpected) {

        int totalActualFruits = nApples + nOranges + nBananas;
        Assert.assertEquals(totalActualFruits, nFruitsExpected);
    }
}
