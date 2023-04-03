package be.intecbrussel;

public class ArrayDeel01 {
    public static void main(String[] args) {

        //Een array is zoals een parkeerplek
        //Belangrijk: een array is een object. Kan primitieve en object opslaan.
        //Je moet altijd een grote aangeven van een array.

        //declareren en initialiseren van een array

        int[] numbers = new int[10];

        //printen → als er geen waarden zijn ingegeven, krijgen we de default
        System.out.println(numbers[1]);
        //Waardes toekennen aan een element.
        // Op plek 5 is de waarde 5
        numbers[5] = 5;
        System.out.println(numbers[5]);
        System.out.println("-----------------------------------------------------");
        //manier 2 om een array te maken
        double[] douNum = {5, 10.8, 20.4, 11};
        System.out.println(douNum[2]);
        douNum[2] = 500.67;
        System.out.println(douNum[2]);
        //length telt vanaf 1
        System.out.println("Lengte van een array: " + douNum.length);

        //bad practise!!
        //na de datatype => [] en dus niet na de naam
        //maakt het onduidelijk
        byte num[] = new byte[3];




    }


}
