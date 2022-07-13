package Java_Project;
import java.util.ArrayList;
import java.util.LinkedList;


public class Album_name {
    public String album_no;
    public String movie_name;
    public ArrayList <Song> songs;
    public LinkedList <Song> playlist;
    
    public Album_name(String album, String movie){
        this.album_no=album;
        this.movie_name=movie;
        this.songs=new ArrayList<Song>();
        this.playlist=new LinkedList<>();
    }

    public Song findSong(String title){
        for(Song song_name : songs){
            if(song_name.getTitle().equals(title)) 
            return song_name;
        }
        return null;
    }

    public boolean addSong(String title, String location){
        if(findSong(title) == null){
            songs.add(new Song(title,location));
            //System.out.println(title + " successfully added to the list");
            return true;
        }
        else {
            System.out.println("Song with name "+ title+ " already exist in the list");
            return false;
        }
    }

    //Have to do it in a way to implement polymorphism
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for(Song song_name : this.songs){
            if (song_name.getTitle().equals(title)){
                PlayList.add(song_name);
                System.out.println("song added");
                return true;
            }
        }
        System.out.println("There is no such song");
        return false;
    }
}
 


    
    

