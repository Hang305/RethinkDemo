package pages.purchasePage.policyData;

import locators.purchaseLocators.policyDataLocators.YourPreferencesForYourPolicyAndCoverageLocators;
import net.serenitybdd.core.pages.PageObject;
import support.actions.Actions;
import support.check.Check;

public class YourPreferencesForYourPolicyAndCoveragePage extends PageObject {

    YourPreferencesForYourPolicyAndCoverageLocators yourPreferencesLocators;
    Actions action;
    Check check;

    //Title
    public void titleElement(String expectedText) {
        check.checkContainText(yourPreferencesLocators.titleSelector, expectedText, "The title is displayed wrong");
    }

    //Frequency of payment
    // -- Default frequency of payment - yearly
    public void defaultOfFrequencyOfPaymentElement(String expectedText) {
        check.checkContainText(yourPreferencesLocators.yearlySelector,expectedText,"The Yearly of frequency of payment is displayed wrong");
        check.checkElementSelected(yourPreferencesLocators.yearlySelector,"The Yearly of frequency of payment does not selected");
    }
    // -- Check the yearly
    public void yearlyFrequencyOfPaymentElement() {
        action.clickElement(yourPreferencesLocators.yearlySelector);
    }
    // -- Check the monthly
    public void monthlyFrequencyOfPaymentElement() {
        action.clickElement(yourPreferencesLocators.monthlySelector);
    }

    //BA + Full Omnium
    // -- Check the checkbox is disabled
    public void ba_FullOmniumElement() {
        check.checkElementSelected(yourPreferencesLocators.BA_FullOmniumCheckboxSelector,"The BA + Full Omnium does not selected");
    }
    //-- Check question is displayed correctly
    public void ba_FullOmniumSuggestionElement(String expectedText) {
        action.clickElement(yourPreferencesLocators.BA_FullOmniumSuggestionSelector);
        check.checkContainText(yourPreferencesLocators.BA_FullOmniumSuggestionSelector,expectedText,"The suggestion of The BA + Full Omnium is displayed wrong");
    }
    // -- Check the price
    public void ba_FullOmniumPriceElement(String expectedText) {
        check.checkContainText(yourPreferencesLocators.BA_FullOmniumResultSelector,expectedText,"The result of The BA + Full Omnium is displayed wrong");
    }

    //Legal Assistance
    // -- The default checkbox of legal assistance is displayed correctly from showroom page
    public void legalAssistanceSelectedElement() {
        check.checkElementSelected(yourPreferencesLocators.legalCheckboxSelector,"The Legal assistance is displayed wrong");
    }

    // -- Click on the checkbox
    public void legalAssistanceClickElement() {
        action.clickElement(yourPreferencesLocators.legalCheckboxSelector);
    }

    // -- Check question is displayed correctly
    public void legalAssistanceSuggestionElement(String expectedText) {
        action.clickElement(yourPreferencesLocators.legalSuggestionSelector);
        check.checkContainText(yourPreferencesLocators.legalSuggestionSelector,expectedText,"The suggestion of The legal assistance is displayed wrong");
    }

    // -- Check the price
    public void legalAssistancePriceElement(String expectedText) {
        check.checkContainText(yourPreferencesLocators.legalResultSelector,expectedText,"The result of The legal assistance is displayed wrong");
    }

    //Physical Damage
    // -- The default checkbox of Physical damage is displayed correctly from showroom page
    public void physicalDamageSelectedElement() {
        check.checkElementSelected(yourPreferencesLocators.physicalCheckboxSelector,"The Physical damage is displayed wrong");
    }
    //-- Check the checkbox
    public void physicalDamageClickElement() {
        action.clickElement(yourPreferencesLocators.physicalCheckboxSelector);
    }

    //-- Check question is displayed correctly
    public void physicalDamageSuggestionElement(String expectedText) {
        action.clickElement(yourPreferencesLocators.physicalSuggestionSelector);
        check.checkContainText(yourPreferencesLocators.physicalSuggestionSelector,expectedText,"The suggestion of The physical damage is displayed wrong");
    }

    // -- Check the price
    public void physicalDamagePriceElement(String expectedText) {
        check.checkContainText(yourPreferencesLocators.physicalResultSelector,expectedText,"The result of The physical damage is displayed wrong");
    }

    //Roadside Assistance
    // -- The default checkbox of roadside assistance is displayed correctly from showroom page
    public void roadsideAssistanceSelectedElement() {
        check.checkElementSelected(yourPreferencesLocators.roadSideCheckboxSelector,"The Roadside assistance is displayed wrong");
    }
    //-- Click on the checkbox
    public void roadsideAssistanceClickElement() {
        action.clickElement(yourPreferencesLocators.roadSideCheckboxSelector);
    }

    //-- Check question is displayed correctly
    public void roadsideAssistanceSuggestionElement(String expectedText) {
        action.clickElement(yourPreferencesLocators.roadSideSuggestionSelector);
        check.checkContainText(yourPreferencesLocators.roadSideSuggestionSelector,expectedText,"The suggestion of The roadside assistance is displayed wrong");
    }

    // -- Check the price
    public void roadsideAssistancePriceElement(String expectedText) {
        check.checkContainText(yourPreferencesLocators.roadSideResultSelector,expectedText,"The result of The roadside assistance is displayed wrong");
    }

    //Equipment
    // -- The default checkbox of equipment is displayed correctly from showroom page
    public void equipmentSelectedElement() {
        check.checkElementSelected(yourPreferencesLocators.equipmentCheckboxSelector,"The Equipment is displayed wrong");
    }
    //-- Click on the checkbox
    public void equipmentClickElement() {
        action.clickElement(yourPreferencesLocators.equipmentCheckboxSelector);
    }

    //-- Check question is displayed correctly
    public void equipmentSuggestionElement(String expectedText) {
        action.clickElement(yourPreferencesLocators.equipmentSuggestionSelector);
        check.checkContainText(yourPreferencesLocators.equipmentSuggestionSelector,expectedText,"The suggestion of The Equipment is displayed wrong");
    }

    // -- Check the price
    public void equipmentPriceElement(String expectedText) {
        check.checkContainText(yourPreferencesLocators.equipmentSuggestionSelector,expectedText,"The result of The Equipment is displayed wrong");
    }
    //Total
    public void totalPriceElement(String expectedText) {
        check.checkContainText(yourPreferencesLocators.totalResultSelector,expectedText,"The total result is displayed wrong");
    }

    //Finally
    // -- The default checkbox of finally
    public void defaultAgreeElement(String expectedText) {
        check.checkElementSelected(yourPreferencesLocators.agreeCheckboxSelector,"The agree checkbox is selected");
    }

    // -- The checkbox is selected
    public void defaultAgreeClick(String expectedText) {
       action.clickElement(yourPreferencesLocators.agreeCheckboxSelector);
    }
}
