package com.stepdefenition;

import com.base.LibGlobal;
import com.screen.LoginPage;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ProductSearch extends LibGlobal {
	public static LoginPage page;

	@Given("^user is opening the application$")
	public void user_is_opening_the_application() throws Throwable {
		appiumLaunch();
	}

	@When("^user is clicking the search button$")
	public void user_is_clicking_the_search_button() throws Throwable {
		page = new LoginPage();
		btnClick(page.getSearchBox());

	}

	@And("^user is entering the product \"([^\"]*)\"$")
	public void user_is_entering_the_product_something(String product) throws Throwable {
		page = new LoginPage();
		fill(page.getFillProduct(), product);

	}

	@And("^user is selecting the product from drop down$")
	public void user_is_selecting_the_product_from_drop_down() throws Throwable {
		page = new LoginPage();
		btnClick(page.getSelectProduct());

	}

}
