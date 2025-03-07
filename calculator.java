public class calculator {
    public int a;
    public int b;
    public calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
}    

  class add extends calculator{
     
        public int add(int a, int b) {
            return a + b;
            }
        }

    class sub extends add {
        public int sub(int a, int b) {
            return a - b;
            }
    }
        

    class multi extends sub {
        public int multi(int a, int b) {
            return a * b;
            }
    }

    class divi extends multi {
        public int divi(int a, int b) {
            if (b == 0) {
                return 0;
                }
                return a / b;
                }
    }

    public class calculator{
        public static void main(String[] args) {
            calculator c = new calculator(10, 2);
            add a = new add(10, 2);
            sub s = new sub(10, 2);
            multi m = new multi(10, 2);
            divi d = new divi(10, 2);
            System.out.println("Addition: " + a.add(10, 2));
            System.out.println("Subtraction: " + s.sub(10, 2));
            System.out println("multipcation: "+ m.mult(10,2));
            System.out.println("Division: " + d.divi(10, 2));
        }
    }
