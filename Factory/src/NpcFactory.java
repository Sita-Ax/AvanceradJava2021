import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class NpcFactory {
    public Npc createNpc(String type){
        type.toLowerCase();
        if (type.equals("farmer")){
            return new Farmer();
        }
        if (type.equals("orc")){
            return new Orc();
        }
        return null;

    }
    public ArrayList<Npc> getOrcGroup(int size){
        ArrayList<Npc> returnList = new ArrayList<>();

        for (int i = 0; i<size; i++){
            returnList.add(createNpc("orc"));
        }
        return returnList;


    }
}
