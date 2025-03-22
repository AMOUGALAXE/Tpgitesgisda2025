public class Text {
    private String nom;
    private String prenom;
    private int age;

    public Text(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficher() {
        System.out.println("Le nom est : " + nom);
        System.out.println("Le prénom est : " + prenom);
        System.out.println("L'âge est : " + age);
    }

    public static void main(String[] args) {
        Text t1 = new Text("Deeven", "Dev", 30);


        System.out.println("Nom  : " + t1.getNom());
        System.out.println("Prénom  : " + t1.getPrenom());
        System.out.println("Âge  : " + t1.getAge());


        t1.afficher();
    }
}
