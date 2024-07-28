class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {


      boolean isVulnerable() {
        return false;
    }
    
   
    public String toString() {
        return "Fighter is a Warrior";
    }

    
    int getDamagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10: 6;
    }
}

class Wizard extends Fighter {

    private boolean hasPreparedSpell = false;
    
    
    boolean isVulnerable() {
        return !hasPreparedSpell;
    }

    
    int getDamagePoints(Fighter warrior) {
        return hasPreparedSpell ? 12 : 3;
    }

    void prepareSpell() {
        hasPreparedSpell = true; 
    }

      
    
    public String toString() {
        return "Fighter is a Wizard";
    }

}
