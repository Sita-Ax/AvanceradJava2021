import javax.swing.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Lists implements Serializable {
    private ArrayList<O1> o1List;
    private ArrayList<O2> o2List;
    private String filenamn = "myFile";

    public Lists(){
        o1List = new ArrayList<>();
        o2List = new ArrayList<>();
}
    public  void add(O1 o){
        o1List.add(o);
    }
    public  void add(O2 o){
        o2List.add(o);
    }

    public void show(){
        System.out.println("List1: " + o1List);
        System.out.println("List2: " + o2List);
    }

    //Med JFileChooser
    public Lists load() {
    JFileChooser fc = new JFileChooser(); // <-- Lätt till starpath som argument ("/myfilepath")
    fc.showOpenDialog(null);
    File file = fc.getSelectedFile();
    this.filenamn = file.getName();


    Lists list = this;
    FileInputStream fis = null;
    try {
        fis = new FileInputStream(this.filenamn);
        ObjectInputStream ois = new ObjectInputStream(fis);
        list = (Lists) ois.readObject();                    //      <--- Noter att vi MÅSTE casta till List


    } catch (IOException e) {

    } catch (ClassNotFoundException e) {

    }
    return list;
}


//Utan JFileChooser (test att lägga till sjäv!)
    public void save(){
        try {
            FileOutputStream fos = new FileOutputStream(this.filenamn);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}