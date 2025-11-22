package Practice15_ProjectPatterns.video.creational.fabricmethod.after;

public class SkyLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Plane();
    }
}