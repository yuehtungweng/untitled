public class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("What you name?");
        String Name = sc.nextLine();

        System.out.print("How old are you?");
        Double Age = sc.nextDouble();

        System.out.println(Name + ",You are"+ Age +"years old.");


    }
}
