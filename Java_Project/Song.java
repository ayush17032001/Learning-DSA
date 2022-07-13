package Java_Project;

public class Song {
    String title;
    String location;

    public Song(String title, String location) {
        this.title=title;
        this.location=location;
    }

    public String getTitle(){
        return title;
    }

    public String getlocation(){
        return location;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\\' +
                ", location=" + location +
                '}';
    }
}

