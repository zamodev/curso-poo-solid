package src.singleResponsibility.practice.nosrp;

public class UserNoSRP {
    private String name;
    private String email;

    public UserNoSRP(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserNoSRP() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean valdiateEmail(String email){
        return email.contains("@");
    }
    public void crateUser(String name, String email){
        if(valdiateEmail(email)){
            UserNoSRP userNoSRP = new UserNoSRP(name, email);
            System.out.println("Usuario creado" + userNoSRP.getName());
        }else {
            System.out.println("Email no valido");
        }
    }
}
