public class test {
    public static void main(String[] args) {
        shape[] shapes = new shape[2];
        shapes[0] = new circle(4);
        shapes[1] = new circle(6);
        for (shape shape : shapes){
            if (shape instanceof circle){
                resizeable resizeable = (circle) shape;
                resizeable.resize(60);
                System.out.println(resizeable.toString());
            }
            if (shape instanceof rectangle){
                resizeable resizeable = (rectangle) shape;
                resizeable.resize(40);
                System.out.println(resizeable.toString());
            }
            if (shape instanceof square){
                resizeable resizeable = (square) shape;
                resizeable.resize(100);
                System.out.println(resizeable.toString());
            }
        }
    }
}
