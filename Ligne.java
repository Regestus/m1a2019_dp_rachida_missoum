public class Ligne implements IVisitable{

    private String name;

    public Ligne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(IVisitor visitor){
        visitor.visit(this);
    }

}
