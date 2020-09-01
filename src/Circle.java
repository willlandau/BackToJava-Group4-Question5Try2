public class Circle {
    int rad;
    int middle;
    public Circle(int radius, int center){
        this.rad = radius;
        this. middle = center;
    }

    public int getMiddle() {
        return this.middle;
    }

    public int getRad() {
        return this.rad;
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public double ComputeArea(){
        return ((this.rad)*(this.rad))*Math.PI;
    }
}
