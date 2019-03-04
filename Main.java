import sun.reflect.generics.visitor.Visitor;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        IVisitable c1 = new Client("client rachida");
        IVisitable c2 = new Client("client pierre");
        IVisitable cm1 = new Commande("premiere commande");
        IVisitable cm2 = new Commande("deuxieme commande");
        IVisitable l1 = new Ligne("ligne1");
        IVisitable l2 = new Ligne("ligne2");
        GroupeCLient g = new GroupeCLient("groupe niche");
        g.addClient(c1);
        g.addClient(c2);
        ((Commande) cm1).addLigne(l1);
        ((Commande) cm2).addLigne(l2);
        ((Client) c1).addCommande(cm1);
        ((Client) c2).addCommande(cm2);

        IVisitor rp = new RapportCommandes();
        for(Iterator<IVisitable>it = g.iterator(); it.hasNext()){
            IVisitable i = it.next();
            i.accept(rp);
        }
    }
}
