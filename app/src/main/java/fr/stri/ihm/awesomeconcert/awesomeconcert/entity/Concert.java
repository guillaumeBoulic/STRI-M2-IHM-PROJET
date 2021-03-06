package fr.stri.ihm.awesomeconcert.awesomeconcert.entity;


/**
 * Projet IHM - AwesomeConcert
 *
 * Cette classe correspond à un concert.
 *
 * Seeheim : Partie traitement des données
 *
 * Auteur : Guillaume BOULIC
 * Auteur : Rémi BARBASTE
 *
 * Date : 22/11/2016
 */
public class Concert {
    private int id;
    private String concertName;
    private String concertDate;
    private int price;
    private int artistId;

    public Concert(int id, int artistId, String name, String date, int price) {
        concertName = name;
        concertDate = date;
        this.artistId = artistId;
        this.price = price;
        this.id = id;
    }

    public String getConcertName() {
        return concertName;
    }

    public String getConcertDate() {
        return concertDate;
    }

    public int getArtistId() {
        return artistId;
    }

    public int getPrice() { return price; }

    public int getId() {
        return id;
    }
}
