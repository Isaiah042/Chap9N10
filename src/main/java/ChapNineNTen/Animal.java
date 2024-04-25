package ChapNineNTen;

public abstract class Animal {
    private String name;

    public Animal () {
        System.out.println("Making an Animal");
    }

    public Animal(String thename){
        name = thename;
    }

    public String getName() {
        return name;
    }
}
