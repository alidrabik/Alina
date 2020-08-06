package Webinar7;

public class Teacher {

    String imie;
    String nazwisko;
    String stopien_naukowy;
    String specjalizacja;
    int pensja;
    int premia;
    boolean isTeacher;

    void przedstawSie(){
        System.out.println("Dzień dobry, jestem " + stopien_naukowy +" " + imie + " " + nazwisko + " o specjalizacji " + specjalizacja + " .");
    }


}
