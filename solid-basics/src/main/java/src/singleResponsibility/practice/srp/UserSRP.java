package src.singleResponsibility.practice.srp;

public class UserSRP {
    private String name;
    private String email;

    public UserSRP(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserSRP() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
