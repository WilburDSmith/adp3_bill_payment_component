package za.ac.cput.adp3_bill_payment_component.domain;

public class User {
    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfor());


    }
}
