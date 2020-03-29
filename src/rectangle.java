public class rectangle extends shape implements resizeable {
    private double hei;
    private double wid;
    private String name = "HCN";
    public rectangle(){
    }
    public rectangle(double hei, double wid){
        this.hei = hei;
        this.wid = wid;
    }

    public double getHei() {
        return hei;
    }

    public double getWid() {
        return wid;
    }

    public void setHei(double hei) {
        this.hei = hei;
    }

    public void setWid(double wid) {
        this.wid = wid;
    }
    @Override
    public double getArea(){
        return hei * wid;
    }
    @Override
    public void resize(double percent){
        this.wid = percent * this.wid / 100;
        this.hei = percent * this.hei / 100;
    }
    @Override
    public String toString(){
        return "HCN {"
                +"width = " + wid
                +" height = " +hei
                +" area = " + this.getArea()
                + " }";
    }
}
