package cs1102;


interface Testing {
    public void printFlavor();
}
class Pepper implements Testing {
    public void printFlavor() { System.out.println("spicy"); }
}