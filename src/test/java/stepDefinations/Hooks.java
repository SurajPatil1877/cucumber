package stepDefinations;

import io.cucumber.java.Before;

public class Hooks {

    @Before("@NetBanking")
    public void netBankingSetup() {
        System.out.println("****************");
        System.out.println("Setup the entries in NetBanking DB");
    }

    @Before("@Mortgage")
    public void netMortgageSetup() {
        System.out.println("****************");
        System.out.println("Setup the entries in Mortgage DB");
    }


    @Before("@NetBanking")
    public void netBankingTearDown() {
        System.out.println("****************");
        System.out.println("Tear Down the entries in NetBanking DB");
    }

    @Before("@Mortgage")
    public void netMortgageTearDown() {
        System.out.println("****************");
        System.out.println("Tear Down the entries in Mortgage DB");
    }

}
