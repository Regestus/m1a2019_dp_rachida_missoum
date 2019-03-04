import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client implements IVisitable {

    private String name;
    List<IVisitable> commandes = new ArrayList<IVisitable>();
    public Iterator<IVisitable> iterator(){
        return this.commandes.iterator();
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

    public void addCommande(IVisitable c){
        this.commandes.add(c);
    }


}
