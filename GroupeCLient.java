import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupeCLient implements Iterable<IVisitable>{
    private String name;
    private List<IVisitable> clients = new ArrayList<IVisitable>();
    public Iterator<IVisitable> iterator(){
        return this.clients.iterator();
    }
    public GroupeCLient(String name) {
        this.name = name;
    }

    public GroupeCLient() {
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void addClient(IVisitable c){
        this.clients.add(c);
    }

}
