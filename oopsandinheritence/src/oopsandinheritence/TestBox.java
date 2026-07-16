package oopsandinheritence;



class Box {

    int width, height, depth;

 
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

   
    int getVolume() {
        return width * height * depth;
    }
}

public class TestBox {
    public static void main(String[] args) {

        Box b = new Box(10, 5, 2);

        System.out.println("Volume of Box = " + b.getVolume());
    }
}