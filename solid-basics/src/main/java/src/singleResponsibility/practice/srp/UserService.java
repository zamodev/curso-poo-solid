package src.singleResponsibility.practice.srp;

public class UserService {

    UserValidator validator = new UserValidator();

    public void crateUser(String name, String email){
        if(validator.valdiateEmail(email)){
            UserSRP userSRP = new UserSRP(name, email);
            System.out.println("Usuario creado" + " " + userSRP.getName());
        }else {
            System.out.println("Email no valido");
        }
    }
}
