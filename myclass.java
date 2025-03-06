class myclass{

    static int count = 0;
    static final double pi = 3.14;

    public myclass() {
        count++; 
    }

    public void start() {
        System.out.println("Value of count : " + myclass.count);
        System.out.println("Value of PI: " + myclass.pi);
    }

    public void service() {
        System.out.println("Value of count : " + myclass.count);
        System.out.println("Value of PI: " + myclass.pi);
    }

    public void stop(){
        System.out.println("Value of count : " + myclass.count);
        System.out.println("Value of PI: " + myclass.pi);
    }

    public static void main(String[] args) {
        myclass obj1 = new myclass();
        obj1.start();
        myclass obj2 = new myclass();
        obj2.service();
        myclass obj3 = new myclass();
        obj3.stop();
    }
}