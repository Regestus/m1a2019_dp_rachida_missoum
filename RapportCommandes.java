import java.util.Iterator;

public class RapportCommandes implements IVisitor {
    void visit(Client c){
        System.out.println("Visitor is Client"+c.getName());
    }
    void visit(Ligne o){
        System.out.println("Visitor is Ligne"+o.getName());
    }
    void visit(Commande m){
        System.out.println("Visitor is Commande"+m.getName());
    }
    void afficherCommandes(){
     //   for( Client.Iterator<IVisitable> it = c.iterator())
        System.out.println("affichage des commandes");
    }
}
