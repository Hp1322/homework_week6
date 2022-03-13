package programme4;

public class Instance2Static {

        //instance variables
        int x=12;
        String name1 = "Yogi";
        //static variables
        static int y = 14;
        static String name2 = "UP";

        //instance method
        public void post1(){
            System.out.println(x); //declaring instance variables into instance method
            System.out.println(name1);
        }
        //static method
        public static void post2(){
            System.out.println(y); //declaring static variables into static method
            System.out.println(name2);
        }
        //main method
        public static void main(String[] args) {   //calling instance and static methods
                                                  // into main method
            Instance2Static obj = new Instance2Static();
            obj.post1();
            post2();

        }

    }


