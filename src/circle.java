public class circle extends shape implements resizeable {
    private double radius;
    public circle(){
    }
    public circle(double raidus){
        this.radius = raidus;
    }

    public double getRaidus() {
        return radius;
    }

    public void setRaidus(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }
    @Override
    public void resize(double percent){
        this.radius = percent * this.radius/100;
    }
    @Override
    public String toString(){
        return "circle{ "
                + "radius = " + radius
                + "area = " + this.getArea()
                + " }";
    }
}
