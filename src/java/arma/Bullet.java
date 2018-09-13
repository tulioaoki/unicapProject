
package arma;

/**
 *
 * @author arthur
 */
public class Bullet extends Item{
    private String name;
    private int modDamage;
    private int modSound;
    private float weight;

    public Bullet(String name, int modDamage, int modSound, float weight, int id) {
        super(id);
        this.name = name;
        this.modDamage = modDamage;
        this.modSound = modSound;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModDamage() {
        return modDamage;
    }

    public void setModDamage(int modDamage) {
        this.modDamage = modDamage;
    }

    public int getModSound() {
        return modSound;
    }

    public void setModSound(int modSound) {
        this.modSound = modSound;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb
        .append("{")
        .append("name: ")
        .append(this.name)
        .append("\nID: ")
        .append(this.getId())
        .append("\nmod sound: ")
        .append(this.modSound)
        .append("\nmod damage: ")
        .append(this.modDamage)
        .append("\nweight: ")
        .append(this.weight)
        .append("}");
        return sb.toString();
    }
    
    
}
