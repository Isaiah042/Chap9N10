package ChapNineNTen;

public class StackRef {
    public void foof(){
        barf();
    }
    public void barf(){
        Duck d = new Duck();
    }

    // Reference variable d is called in the barf class so it stays with barf in the stack
}
