package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOptions() {
        var dropdownPage = homePage.clickDropDown();
        dropdownPage.selectFromDropdown("Option 2");

        var selectedOption = dropdownPage.getSelectedOptions();
        assertEquals(selectedOption.size(), 1, "Incorrect number of selections!");

        String option = "Option 2";
        dropdownPage.selectFromDropdown(option);
        assertTrue(selectedOption.contains(option), "Option not selected!");

    }

}
