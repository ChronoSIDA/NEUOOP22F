public class HeadGear extends AbstractGear{
    public HeadGear(String Adjective, String noun, int defenseValue) {
        super(Adjective, noun, 0, defenseValue);
    }

    @Override
    protected Gear returnNewGear(String adj, String noun, int attack, int defense) {
        return new HandGear(adj, noun, defense);
    }

    @Override
    boolean checkType(Gear o) {
        if(o instanceof HeadGear){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return  "HeadGear"  + " " +
                "Name = '" + getGearName() + '\'' +
                ", AttackStrength = " + getGearAttackPoints() +
                ", DefenseStrength = " + getGearDefensePoints();
    }



}
