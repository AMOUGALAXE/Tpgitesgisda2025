public class text {
    private string nom;
    private string prenom;
    private  int age;

    public text (string nom, string prenom, int age) {
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
    public void afficher(){
        System.out.println("le nom est:" +nom);
        System.out.println("le prenom est:" +prenom;
        System.out.println("l'age est:" +age);
    }
    public static void main(String[] args){
        text t1=new text("deeven","dev",30);
        t1.getNom();
        t1.getPrenom();
        t1.getAge();
        t1.afficher();
        
        
    }
}
