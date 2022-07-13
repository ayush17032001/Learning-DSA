package Java_Project;
import java.util.*;
import java.io.*;
import java.awt.*;

public class Main {

    static ArrayList <Album_name> albums=new ArrayList<>(); //An arraylist to store albums
    public static void main(String[] args) throws IOException {

        //ArrayList <Album_name> albums=new ArrayList<>(); //An arraylist to store albums

        Album_name album=new Album_name("Album-1","M.S. Dhoni");  //album is the first of albums in the ArrayList - Index 0
        album.addSong("Phir kabhi", "C:\\Album-1 (MS Dhoni)\\Phir kabhi.mp3");
        album.addSong("Parwah nahin", "C:\\Album-1 (MS Dhoni)\\Parwah nahin.mp3");
        album.addSong("Kaun tujhe", "C:\\Album-1 (MS Dhoni)\\Kaun tujhe.mp3");

        albums.add(album);

        album=new Album_name("Album-2", "Ae dil hai mushkil");  //album2 is the second of albums in the ArrayList - Index 1
        album.addSong("Buleya", "C:\\Album-2 (Ae dil hai mushkil)\\Buleya.mp3");
        album.addSong("Channa mereya","C:\\Album-2 (Ae dil hai mushkil)\\Channa Mereya.mp3" );
        album.addSong("title track","C:\\Album-2 (Ae dil hai mushkil)\\Title track.mp3" );

        albums.add(album);

        album=new Album_name("Album-3", "Aashiqui2");  //album3 is the third of albums in the ArrayList - Index 2
        album.addSong("Tum hi ho", "C:\\Album-3 (Ashiqui 2)\\Tum Hi Ho.mp3");
        album.addSong("Chahun main ya na", "C:\\Album-3 (Ashiqui 2)\\Chahun Main Ya Naa.mp3");
        album.addSong("Sunn raha hai", "C:\\Album-3 (Ashiqui 2)\\Sunn Raha Hai.mp3");

        albums.add(album); 

        LinkedList <Song> playList1=new LinkedList<>();
        
        albums.get(0).addToPlayList("Phir kabhi", playList1);
        albums.get(1).addToPlayList("title track", playList1);
        albums.get(2).addToPlayList("Sunn raha hai", playList1);
        albums.get(1).addToPlayList("Channa mereya", playList1);

        play(playList1);

    }

    private static void play(LinkedList<Song> playList) throws IOException{

        try(Scanner sc=new Scanner(System.in)){
            boolean check=false;
            printMenu();
            ListIterator <Song> songIterator=playList.listIterator();

            if(playList.size()==0){
                System.out.println("The playlist is empty");
            }

            else{
                System.out.println("Currently playing "+ songIterator.next().toString());
                Desktop.getDesktop().open(new File(songIterator.previous().getlocation()));
                songIterator.next();           
            }  

            while(!check){
                int switch_variable=sc.nextInt();
                sc.nextLine();

                switch(switch_variable){

                    case 0: 
                            System.out.println("Quitting playlist");
                            check=true;
                            break;

                    case 1:
                            if(songIterator.hasNext()){
                                System.out.println("Currently playing "+ songIterator.next().toString());
                                Desktop.getDesktop().open(new File(songIterator.previous().getlocation()));
                                songIterator.next();                          
                            }

                            else{
                                System.out.println("You have reached the end of playlist");
                            }

                            break;

                    case 2: 
                            if(songIterator.hasPrevious()){
                                songIterator.previous();
                                if(songIterator.hasPrevious()){
                                System.out.println("Currently playing "+ songIterator.previous().toString());
                                Desktop.getDesktop().open(new File(songIterator.next().getlocation()));
                                }
                                else{
                                    songIterator.next();
                                    System.out.println("This is the first song in the playlist");
                                }
                            }

                            else{
                                System.out.println("This is the first song in the playlist");
                            }
                            break;

                    case 3: 
                            if(songIterator.hasPrevious()){
                                Desktop.getDesktop().open(new File(songIterator.previous().getlocation()));
                                System.out.println("Currently playing "+ songIterator.next().toString());
                            }
                            break;

                    case 4: 
                            System.out.println("The entire playlist is here -");
                            printList(playList);
                            break;

                    case 5: 
                            printMenu();
                            break;
                    
                    case 6: 
                            if(!playList.isEmpty()){
                                songIterator.remove();
                                if(songIterator.hasNext()){
                                    System.out.println("Currently playing "+ songIterator.next().toString());
                                    Desktop.getDesktop().open(new File(songIterator.previous().getlocation()));
                                    songIterator.next();  
                                    break;                        
                                }

                                else{
                                    if(songIterator.hasPrevious()){
                                        songIterator.previous();
                                        if(songIterator.hasPrevious()){
                                        System.out.println("Currently playing "+ songIterator.previous().toString());
                                        Desktop.getDesktop().open(new File(songIterator.next().getlocation()));
                                        }
                                        else{
                                            System.out.println("This is the first song in the playlist");
                                        }
                                    } break;
                                }
                            }
                }
            }

        }
    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of all songs \n"+
                "5 - print all available options\n"+
                "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-----------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println("-----------------");
    }
    
}
        



