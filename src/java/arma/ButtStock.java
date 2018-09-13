
package arma;

/**
 *
 * @author arthur
 */
public class ButtStock extends Item {
    
    private int modRecoil;
    private String name;
    private float weight;

    public ButtStock(int modRecoil, String name, float weight, int id) {
        super(id);
        this.modRecoil = modRecoil;
        this.name = name;
        this.weight = weight;
    }

    public int getModRecoi() {
        return modRecoil;
    }

    public void setModRecoi(int modRecoi) {
        this.modRecoil = modRecoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("ButtStock{")
                .append("modRecoil=")
                .append(modRecoil)
                .append(", name=")
                .append(name)
                .append(", weight=")
                .append(weight)
                .append('}');
        return sb.toString();
    }
}
