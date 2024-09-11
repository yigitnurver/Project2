package OOPSConcepts;

import javax.sound.midi.spi.SoundbankReader;

public class E10StringDemo {
    public static void main(String[] args) {
        String str="FEFWEFwfwefwe!!!##$$%23432";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[A-Za-z]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Z]","*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[\\s]","*"));
        System.out.println(str.replaceAll(" ","*"));



    }
}
