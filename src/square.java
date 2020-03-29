public class square extends shape implements resizeable {
    private double size;
    private String name = "HV";
    public square(){
    }
    public square(double size){
        this.size =size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public double getArea(){
        return this.size * this.size;
    }
    @Override
    public void resize(double percent){
        this.size = percent * this.size/100;
    }
    @Override
    public String toString(){
        return "HV{ "
                + "Side = " + this.size
                + " area = " + this.getArea()
                +"}";
    }
}
