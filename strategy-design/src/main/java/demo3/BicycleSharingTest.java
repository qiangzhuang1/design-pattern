package demo3;

public class BicycleSharingTest {
    public static void main(String[] args) {
        IBicycleSharing iBicycleSharing = new OfoBicycleSharing();
        BicycleSharingContext bicycleSharingContext = new BicycleSharingContext(iBicycleSharing);
        bicycleSharingContext.contextMethod();
    }
}