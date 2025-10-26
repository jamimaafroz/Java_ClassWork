public class ReverseString {
    String name;

    public ReverseString(String name) {
        this.name = name;
    }
    
    void reverse(){
        String reversechar = " ";
        for(int i = name.length()-1 ; i>= 0 ; i--)
        {
            reversechar+= name.charAt(i);
        }
        System.out.println("Reverse String: "+reversechar); 
    }

    public static void main(String [] agrs){
        ReverseString sp = new ReverseString("Jamima Afroz");
        System.out.println(sp.name);
        sp.reverse();
    }
}
