import java.util.Arrays;

public class Zadanie6 {
    public static void main (String[] args ){
        String text1 = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć.";
        String text2 = "1Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć.";
        String text6 = "Na wyścigach wyścigowych wyścigówek wyścigowych wyścigówka wyścigowa wyścignęła wyścigówkę wyścigową numer sześć.";
        String text4 = "Na wyscigach wyscigowych wyscigowek wyscigowych wyscigowka wyscigowa wyscignela wyscigowke wyscigowa numer szesc.";
        int number_w = 0;
        int number_o = 0;
        int [] policz = new int[12];



        if(text1==text2) {
            System.out.println(text1);
        } else {
            System.out.println("Nie są równe");
        }

        String [] text3=text4.split("");
        //System.out.println(Arrays.toString(text3));

        for (int i=0; i<text3.length; i++) {
            //System.out.println(text3[i]);
            if (text3[i].contains("w")) {
                number_w++;
            }
            if (text3[i].contains("o")) {
                number_o++;
            }
        }
        System.out.println("w=" + number_w );
        System.out.println("o=" + number_o);

        String [] text5=text4.split(" ");
        for (int i=0; i<text5.length; i++) {
            System.out.println(text5[i].length() );
            policz[i] = text5[i].length();

        }
        Arrays.sort(policz);
        System.out.println(Arrays.toString(policz));
        System.out.println(text1);
        System.out.println(text6.replace("wyścig", "nowa"));







    }
}

