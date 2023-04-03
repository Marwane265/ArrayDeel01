package be.intecbrussel;

public class Arr {
    public static void main(String[] args) {
        String[] myArr = {"Hi", "Hallo", "Bonjour", "Gutentag", "Buenos dias"};
        System.out.println(myArr[2]);


        //voor loops handig → die geef de lengte van een array
        System.out.println(myArr.length);


        //reverse printout array
        for (int counter = myArr.length - 1; counter >= 0; counter--) {
            System.out.println(myArr[counter] + "");
        }


        //for loop
        for (int index = 0; index < myArr.length; index++) {
            System.out.println(myArr[index]);
        }


        //for each => advanced for loop
        for (String elements : myArr) {
            System.out.println(elements);

        }


        String str = "Java is better then C#";
        for (int index = 0; index < str.length(); index++) {
            char[] myCharr = str.toCharArray();
            System.out.print(myCharr[index] + " | ");
        }

    }
}
