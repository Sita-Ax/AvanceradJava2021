import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Npc> group;
        NpcFactory npcFactory = new NpcFactory();
        Npc myOrc = npcFactory.createNpc("orc");
       //myOrc.showData();
        group = npcFactory.getOrcGroup(4);

        for (Npc n : group){
            n.showData();
        }

    }
}
