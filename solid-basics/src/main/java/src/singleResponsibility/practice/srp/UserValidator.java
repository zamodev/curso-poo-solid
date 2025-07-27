package src.singleResponsibility.practice.srp;

public class UserValidator {
    public Boolean valdiateEmail(String email){
        return email.contains("@");
    }
}
