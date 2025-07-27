package src.interfaceSegregation.practice.isp;

public class SmartTelevision implements Volume, SmartTv {
    @Override
    public void volumeUp() {
        System.out.println("Volume up on Smart Television");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down on Smart Television");
    }

    @Override
    public void showApps() {
        System.out.println("Mostrando apps, youtube, netflix, etc. en Smart Television");
    }
}
