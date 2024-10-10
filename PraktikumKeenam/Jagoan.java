public class Jagoan{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private boolean isAlive;

    // Ini adalah object member
    private Jubah armor;
    private Senjata weapon;

    public Jagoan(String name){
        this.name = name;
        this.baseHealth = 250;
        this.baseAttack = 100;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Health\t\t: " + this.getHealth() +"/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower());
        System.out.println("Alive\t\t: " + this.isAlive + "\n");
    }

    public void attack(Jagoan opponent){
        // hitung damage
        int damage = this.getAttackPower();
        // print event
        System.out.println(this.name + " menyerang " + opponent.getName() + " dengan " + damage + " damage");
        // attack si opponent
        opponent.defence(damage);

    }

    public void defence(int damage){

        // receive damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " perlindungan = "+ defencePower + " defence power");
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        
        System.out.println("Mendapatkan damage = " + deltaDamage + " damage" + "\n");
        
        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }
    
    private int getAttackPower(){
        return this.baseAttack + this.incrementAttack + this.weapon.getAttack();
    }

    public void setJubah(Jubah armor){
        this.armor = armor;
    }

    public void setSenjata(Senjata weapon){
        this.weapon = weapon;
    }

    public int maxHealth(){
        return this.baseHealth + this.incrementHealth + this.armor.getAddHealth();
    }
}