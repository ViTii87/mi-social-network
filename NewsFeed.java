import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        this.messages = new ArrayList<>();
        this.photos = new ArrayList<>();
    }

    /**
     * Añade un mensaje
     */
    public void addMessagePost(MessagePost message){
        messages.add(message);
    }

    /**
     * Añade una foto
     */
    public void addPhotoPost(PhotoPost photo){
        photos.add(photo);
    }

    /**
     * Meotdo para mostrar todos los posts
     */
    public void show(){

        for(MessagePost text : messages){
            text.display();
            System.out.println("");
        }
        System.out.println("");
        for(PhotoPost photo : photos){
            photo.display();
            System.out.println("");
        }
    }
}
