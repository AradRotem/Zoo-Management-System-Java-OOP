package yahav_eliyahu_matanya_cohen_arad_rotem;

public class Animal {
    private static int nextId = 1; // מחולל גלובלי
    private final int id;
    protected int age;


    public Animal(int age) {
        this.id = nextId++;
        this.age = age;
    }
    
    public Animal(){
        this.id = nextId++;
    }
    
    public int getId() { return id; }
    public int getAge() {return age; }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "ID=" + id + ", Age=" + age;
    }
}

