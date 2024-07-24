package assignment1;

abstract class Processor {
    protected int data;
    
    public void showData() {
        System.out.println("Data: " + data);
    }
    
    abstract void process();
}