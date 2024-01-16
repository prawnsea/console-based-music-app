public class Artist {
    public Artist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    String name;
    String genre;
    public Artist(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
