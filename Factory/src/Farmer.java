public class Farmer implements Npc {


    @Override
    public boolean attackable() {
        return false;
    }

    @Override
    public String name() {
        return "Farmer";
    }

    @Override
    public int hitPoints() {
        return 25;
    }

    @Override
    public void showData() {
        System.out.println("A Farmer");
    }
}
