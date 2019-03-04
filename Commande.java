import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Commande implements IVisitable {

    private String name;
    List<IVisitable> lignes = new ArrayList<IVisitable>();
    public Iterator<IVisitable> iterator(){
        return this.lignes.iterator();
    }

    public Commande(String name) {
        this.name = name;
    }

    public Commande(String name, List<IVisitable> lignes) {
        this.name = name;
        this.lignes = lignes;
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void addLigne(IVisitable l){
        this.lignes.add(l);

    }


}
