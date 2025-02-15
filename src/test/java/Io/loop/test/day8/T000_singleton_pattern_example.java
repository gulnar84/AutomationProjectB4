package Io.loop.test.day8;

public class T000_singleton_pattern_example {
   // private constructor to prevent external instantiation
    private T000_singleton_pattern_example(){}

    private static String word;
       // public getter-(as it is private i need a public getter)
    public static String getword(){
        if(word== null){
            System.out.println("First time calling, object is null and assigning now");
            word="driver";
        }else{
            System.out.println(" word is already assigned and has value");
        }
        return word;
    }
}
