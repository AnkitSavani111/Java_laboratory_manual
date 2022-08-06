// Create a LOGIN Form using HTML

// Ankit Savani (21CE122)

public class Pr_2_5 {
    class sum {
        static int add(int n1, int n2) {
            return n1 + n2;
        }

        static int add(int n1, int n2, int c) {
            return n1 + n2 + c;
        }
    }

    class MethodOverloading {
        public static void main(String[] arguments) {
            System.out.println(sum.add(10, 20));
            System.out.println(sum.add(10, 20, 30));
        }
    }
}
