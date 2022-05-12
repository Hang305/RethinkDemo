package model.showroom;

import com.opencsv.bean.CsvBindByName;

public class CSVCalculatingInsurancePremium {
    public CSVCalculatingInsurancePremium(String q1, String q2, String q3, String q4, String q5, String q6, String q7, String q8, String q9, String q10, String q11, String q12, String totalPremium) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.q6 = q6;
        this.q7 = q7;
        this.q8 = q8;
        this.q9 = q9;
        this.q10 = q10;
        this.q11 = q11;
        this.q12 = q12;
        this.totalPremium = totalPremium;
    }

    // Question 1 - Birthdate
    @CsvBindByName
    private String q1;

    // Question 2 - Does the main driver have had their permanent driving license for a period longer than three years?
    @CsvBindByName
    private String q2;

    // Question 3 - Over the last three years, did you incur no more than one accident as a driver where you caused the accident? (moto of auto)
    @CsvBindByName
    private String q3;

    // Question 4 - Is your motorcycle younger than two years old? Or do you have an active omnium motorcycle insurance (up to 8 years old)?
    @CsvBindByName
    private String q4;

    // Question 5 - Choose what is applicable for you
    @CsvBindByName
    private String q5;

    // Question 6 - What is the catalog value of your motorcycle (excl. VAT and incl. options and accessories such as GPS or suitcases)?
    @CsvBindByName
    private String q6;

    // Question 7 - Please choose the type of motorcycle you want to insure:
    @CsvBindByName
    private String q7;

    // Question 8 - Do you want to insure your equipment such as helmet or driving suit ?
    @CsvBindByName
    private String q8;

    // Question 9 - Choose what coverage you prefer BA + Full omnium
    @CsvBindByName
    private String q9;

    // Question 10 - Would you like to insure possible physical damage to the driver?
    @CsvBindByName
    private String q10;

    // Question 11 - Would you like to insure possible legal assistance?
    @CsvBindByName
    private String q11;

    // Question 12 - Would you like to enjoy roadside assistance for your bike?
    @CsvBindByName
    private String q12;

    // Total price
    @CsvBindByName
    private String totalPremium;

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getQ5() {
        return q5;
    }

    public void setQ5(String q5) {
        this.q5 = q5;
    }

    public String getQ6() {
        return q6;
    }

    public void setQ6(String q6) {
        this.q6 = q6;
    }

    public String getQ7() {
        return q7;
    }

    public void setQ7(String q7) {
        this.q7 = q7;
    }

    public String getQ8() {
        return q8;
    }

    public void setQ8(String q8) {
        this.q8 = q8;
    }

    public String getQ9() {
        return q9;
    }

    public void setQ9(String q9) {
        this.q9 = q9;
    }

    public String getQ10() {
        return q10;
    }

    public void setQ10(String q10) {
        this.q10 = q10;
    }

    public String getQ11() {
        return q11;
    }

    public void setQ11(String q11) {
        this.q11 = q11;
    }

    public String getQ12() {
        return q12;
    }

    public void setQ12(String q12) {
        this.q12 = q12;
    }

    public String getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(String totalPremium) {
        this.totalPremium = totalPremium;
    }
}
