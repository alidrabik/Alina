package Webinar7;

public class Teacher {

    String imie;
    String nazwisko;
    String stopien_naukowy;
    String specjalizacja;
    int pensja;
    boolean isTeacher;

    void przedstawSie(){
        System.out.println("Dzień dobry, jestem " + stopien_naukowy +" " + imie + " " + nazwisko + " o specjalizacji " + specjalizacja + " .");
    }

    void obliczPremie(){
        System.out.println("Moja roczna premia wynosi " + pensja*12*0.1);

    }


}
