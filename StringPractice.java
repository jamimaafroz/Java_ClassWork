public class StringPractice{
    String name;

    public StringPractice(String name) {
        this.name = name;
    }

    public static void main(String[] agrs){
        StringPractice sp = new StringPractice("Jamimaafroz123@gmail.com");
        System.out.println(sp.name);
        System.out.println(sp.name.length());
        System.out.println(sp.name.charAt(0));
    }
}