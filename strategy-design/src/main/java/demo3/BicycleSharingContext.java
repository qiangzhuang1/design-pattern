package demo3;

public class BicycleSharingContext {
    private IBicycleSharing iBicycleSharing;

    public BicycleSharingContext(IBicycleSharing iBicycleSharing) {
        this.iBicycleSharing = iBicycleSharing;
    }

    public void contextMethod(){
        iBicycleSharing.bicycle();
    }
}