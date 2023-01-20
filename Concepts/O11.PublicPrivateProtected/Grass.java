package O11.PublicPrivateProtected;


import O11.PublicPrivateProtected.world.Plant;

public class Grass extends Plant {
    public Grass() {

        // Won't work --- Grass not in same package as plant, even though it's a subclass
        // System.out.println(this.height);
    }
}
