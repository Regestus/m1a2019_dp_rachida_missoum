public interface IVisitor {
    void visit(GroupeCLient c);
    void visit(Ligne o);
    void visit(Client l);
    void visit(Commande m);
    void afficherCommandes();
}
