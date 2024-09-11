package PracticePackage;

public class PracticeClass {
    public static void main(String[] args) {
        String dogBreed=new String("          Best Breed is Doberman Pincher");

        System.out.println(dogBreed.length());
        System.out.println(dogBreed.toLowerCase());
        System.out.println(dogBreed.toUpperCase());
        System.out.println(dogBreed.concat(" and this breed required so much more experience"));
        System.out.println(dogBreed.concat(" Furthermore this breed is so strong"));

        System.out.println(dogBreed.trim());

        int length=dogBreed.length();
        System.out.println(length);

        String s="I'm getting more experienced about coding";

        int len=s.length();
        System.out.println(len);

        System.out.println("==============================");
    }
}
