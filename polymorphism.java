interface music_player{
    String[] song_list();
    void volumecontroler();
    void Shuffle_songs();
    private void Project(){
        System.out.println("project Begins...");
    }
    default void phone(){                  // Default method in interface and 
                                        
        Project();                          // declaring private method and run it By default method.
        System.out.println("Building some features of smartphone");
    }
  }    
  interface Wifi{
    String[] networks();
    void network_connection();
  }    
  class cell_phone{
    void Pickcall(){
        System.out.println("picks up the incoming call.");
    }
    void Endcall(){
        System.out.println("ends the call when needed.");
    }
  }

  class SmartPhone extends cell_phone implements music_player,Wifi{
    public String[] song_list(){
        System.out.println("Choose the song you want to play from thw list.");
        String[] list={ "Hindi","PunjaBi","English"};
        return list;
    }
    public void volumecontroler(){
        System.out.println("Controls the volume of the song.");
    }
    public void Shuffle_songs(){
        System.out.println("if you want to shuffle the songs press it.");
    }

    public String[] networks(){
        System.out.println("Choose the network u want to connect.");
        String[]networklist={"paravdeep(5g)","bLAA Blaa (2.4g)","random(5g)"};
        return networklist;
    }
    public void network_connection(){
        System.out.println("connecting...");
    }

  }

public class polymorphism {
    public static void main(String[] args) {
        music_player mp =new SmartPhone();    // this is smartphone ,But use it as music_player
        // mp.network_connection();         not allowed we cannot access another inteface other than  which's refence is taken as oBject.

        String[] s=mp.song_list();
        for (String se : s) {
            System.out.println(se);
        }
        mp.Shuffle_songs();
        
    }
}
