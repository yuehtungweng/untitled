public class tem {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("輸入第一次成績");
        int a = sc.nextInt();
        System.out.println("輸入第二次成績");
        int b = sc.nextInt();
        System.out.println("輸入第次成績");
        int c = sc.nextInt();

        int d=a+b+c ;
        int e =(a+b+c)/3;
        int f =a*b;

        System.out.println(c+" " + d+" "+e);

    }
}