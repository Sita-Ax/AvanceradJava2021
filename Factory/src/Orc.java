public class Orc implements Npc{

    int hp;

    public Orc(){
       this.hp = (int)(Math.random()*20)+1;

    }
    @Override
    public boolean attackable() {

        return true;
    }

    @Override
    public String name() {
        return "Orc";
    }

    @Override
    public int hitPoints() {
        return this.hp;
    }
    @Override
    public void showData(){
        System.out.println("a Orc with hp: " +this.hp);
    }

}
