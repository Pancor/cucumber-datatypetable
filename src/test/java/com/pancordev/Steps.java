package com.pancordev;

import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    private Permission storedPermission;

    @DataTableType
    public Permission permissionDataTableType(String permission) {
        return Permission.of(permission);
    }

    @ParameterType(".*")
    public Permission permission(String permission) {
        return Permission.of(permission);
    }

    @When("^user receives (.*)$")
    public void user_receives(Permission permission) {
        storedPermission = permission;
    }

    @Then("^user has (.*) permission$")
    public void user_has_permission(Permission permission) {
        assert permission.equals(storedPermission);
    }

    @When("user gets hold on {permission}")
    public void user_gets_hold_on(Permission permission) {
        storedPermission = permission;
    }

    @Then("user got {permission} permission")
    public void user_got_permission(Permission permission) {
        assert permission.equals(storedPermission);
    }
}
