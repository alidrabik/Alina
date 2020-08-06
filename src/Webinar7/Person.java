package Webinar7;

public class Person {
    public static void main(String[] args) {

    Student pawel = new Student();
    pawel.imie = "Pawel";
    pawel.nazwisko = "Kowalski";
    pawel.wiek = 20;
    pawel.kierunek_studiow = "ekonomia";
    pawel.semestr = 2;
    pawel.isStudent = true;


    Teacher jan = new Teacher();
    jan.imie = "Jan";
    jan.nazwisko = "Nowak";
    jan.stopien_naukowy = "profesor";
    jan.specjalizacja = "historia";
    jan.pensja = 8000;
    jan.premia = jan.pensja * 12;
    jan.isTeacher = true;


    pawel.przedstawSie();
    jan.przedstawSie();




    }
}
