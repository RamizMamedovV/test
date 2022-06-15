package lesson6SkillF;

public class Animals {
    boolean isPets;
    boolean veq;
    String name;
    int favorite;

    Animals(boolean isPets, boolean veq, String name, int favorite) {
        this.isPets = isPets;
        this.veq = veq;
        this.name = name;
        this.favorite = favorite;
    }

    public String toString() {
        return "isPets = " + isPets + ", veq = " + veq + "\n"
                + "name = " + name + ", favorite = " + favorite;
    }

}
