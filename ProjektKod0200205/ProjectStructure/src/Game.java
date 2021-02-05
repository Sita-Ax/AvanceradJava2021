public class Game {
    private Gui gui;
    private Room room1, room2;
    private Room[] map ;

    public Game(){
        //Skapa rum!
        room1 = new Room("Vardagsrum","Stor och fult med en soffa");
        room2 = new Room("Hall", "liten, trång med ful tapet");
        map = new Room[2];
        map[0] = room1;
        map[1] = room2;

        //Gameobjects
        GameObject lampa = new GameObject("Taklampa", false);
        GameObject kanin = new GameObject("Liten vit kanin",true);
        Container box = new Container("En blå låda", false, true);
        room1.addObject(kanin);
        room1.addObject(box);
        room2.addObject(lampa);
        room2.addObject(box);
        Person otto = new Person("Otto",0);
        room1.addNpc(otto);
        otto.getInventory().addObject(lampa);

        System.out.println(otto);
        Inventory inventory = new Inventory(5);
        System.out.println(inventory);
        inventory.addObject(kanin);
        inventory.addObject(lampa);
        inventory.addObject(lampa);
        inventory.addObject(lampa);
        inventory.addObject(lampa);
        inventory.addObject(lampa);
        System.out.println(inventory);

        /*
        System.out.println(lampa);
        System.out.println(lampa.isMoveable());
        System.out.println(kanin);
        System.out.println(kanin.isMoveable());
*/
        //[room1, room2]
        //Starta guit!
        this.gui = new Gui();
        //System.out.println(map[1]);
        //gui.setShowRoom(map[1].toString());
        int position = 0;
        gui.setShowRoom(map[position].toString());
//[r1, r2, r3]
        while (true) {

            String command = gui.getCommand();
            if (!command.equals("-1")) {

                if (command.equals("1")) {
                    position = 0;

                }
                if (command.equals("2")) {
                    position = 1;
                }

            }

            gui.setShowRoom(map[position].toString());
            gui.setShowInventory(inventory);
            if (map[position].getPersons() != null) {
                gui.setPerson(map[position].getPersons());
            }

        }

        /*
        while (true) {
            String command = gui.getCommand();
            System.out.println(command);
        }*/
    }



}
