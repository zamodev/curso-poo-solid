package src.interfaceSegregation.practice.isp;

public class Television implements Volume{
    @Override
    public void volumeUp() {
        System.out.println("Volume up on Television");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down on Television");
    }
}
