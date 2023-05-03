package pbo_uts_3;

//using namespace std;   ga pake using namespcae

class character{
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;
    // membuat constructor
    character(String nama, int heal, String weapon, int attackp, int mana){ 
        this.nama = nama;
        this.heal = heal; 
        this.weapon = weapon;
        this.attackP = attackp;
        this.mana = mana;
        //print(nama);          ga perlu pribnt
    }
    void attack(){
        mana -=50;              //ga pake this
        System.out.println(nama+" menyerang si sotong");
        System.out.println("sotong terkena demage sebanyak "+this.attackP );

    }
    void demage(int attackP){
        System.out.println("ucup terkena demage sebanyak " + attackP);
        heal -= attackP;          //ga pake this
    }
    void print(){
        System.out.println("nama: "+nama);  
        System.out.println("heal: "+ heal);
        System.out.println("weapon: "+weapon);
        System.out.println("attack power: " + attackP);
        System.out.println("mana : " +mana);
    }
}
/**
 *
 * @author ACER
 */
public class PBO_UTS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        character character1 = new character("ucup",100,"pedang excalibur",5,100);
        character1.attack();
        character1.demage(10);
        character1.print();
        }
    
}
