public class StringPractice{
    String name;

    public StringPractice(String name) {
        this.name = name;
    }

    void classifyChar(){
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;
        int symbolCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = Character.toLowerCase(name.charAt(i));
             if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
           else if (c>='0' && c<='9')
           {
               digitCount++;
           }
           else {
            symbolCount++;
           }
        }

        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of Consent: " +  consonantCount);
        System.out.println("Total number of Digits: " +  digitCount);
        System.out.println("Total number of Symbols: " +  symbolCount);

    }

    public static void main(String[] agrs){
        StringPractice sp = new StringPractice("Jamimaafroz123@gmail.com");
        System.out.println(sp.name);
        System.out.println(sp.name.length());
        System.out.println(sp.name.charAt(0));
        sp.classifyChar();

    
}
}
