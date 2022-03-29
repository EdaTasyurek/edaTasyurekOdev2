package com.company;

public class Main {

    public static void main(String[] args) {
        // Film classının içine film1 ve film2 açıldı. new ile constructor içindeki attiributelere uygun
        //özellikler atandı.
        Film film1 = new Film(1,"Gökdelen" , "Bilim" , 7);
        Film film2 = new Film(2,"Leto" ,"Dram" , 8);
        Film film3 = new Film(3,"Ragnorok" , "Aksiyon" , 9);
        Film film4 = new Film(4,"Pera Palas" , "Tarih" , 6);

        //Film arrayi oluşturuldu.Girilen filmlerin listelenmesi için for
        //döngüsü açıldı sırayla filmlerin isimleri verildi.
        Film[] films = {film1 , film2 , film3,film4};
        for(Film film : films) {
            System.out.println(film.getName());
        }

        //Film1,2,3 de verilen filmin istenilen özelliğini bastırma.
        System.out.println(film1.getCategory());
        System.out.println(film2.getImdb());
        System.out.println(film3.getId());

        //FilmManager adlı classda açılan addToList fonksiyonu çağırılarak
        //içine film1 değeri atandı.
        FilmManager filmManager = new FilmManager();
        filmManager.addToList(film2);

    }


}
