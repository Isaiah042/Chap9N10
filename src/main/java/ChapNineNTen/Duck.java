package ChapNineNTen;

public class Duck extends Animal{
    int size;

    public Duck(){}

//    public Duck(int ducksize) {
//        System.out.println("Quack");
//
//        size = ducksize;
//
//        System.out.println("size is " + size);
//    }
//
    public Duck(int newSize) {
        if (newSize == 0) {
            size = 27;
        }else{
            size = newSize;
        }
    }
    public void setSize(int size) {
        this.size = size;
    }





}
