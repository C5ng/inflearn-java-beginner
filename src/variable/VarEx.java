package variable;

public class VarEx {
    class VarEx1 {
        public static void main(String[] args) {
            int num1 = 4;
            int num2 = 3;

            System.out.println(num1 + num2);
            System.out.println(num1 - num2);
            System.out.println(num1 * num2);
        }
    }

    class VarEx2 {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;
            int sum = num1 + num2;

            System.out.println(sum);
        }
    }

    class VarEx3 {
        public static void main(String[] args) {
            long num = 10_000_000_000L;
            boolean flag = true;

            System.out.println(num);
            System.out.println(flag);
        }
    }
}
