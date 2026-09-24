public class User {

    private int Id;
    private String name;
    private float bal;

    public User(int i, String name, float bal) {
        this.Id = i;
        this.name = name;
        this.bal = bal;
    }
    public User(){

    }

    public void setId(int id){
        this.Id = id;
    }
    public int getId(){
        return Id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBal(float bal){
        this.bal = bal;
    }
    public float getBal(){
        return bal;
    }
}
