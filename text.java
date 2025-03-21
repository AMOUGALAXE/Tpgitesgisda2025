public class text {
    private string nom;
    private string prenom;
    private  int age;

    public text(string nom, string prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public string getNom() {
        return nom;
    }

    public void setNom(string nom) {
        this.nom = nom;
    }

    public string getPrenom() {
        return prenom;
    }

    public void setPrenom(string prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
