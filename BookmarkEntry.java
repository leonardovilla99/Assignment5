public class BookmarkEntry {
    // Fields
    String title,webAddress;

    // Constructor
    public BookmarkEntry(){
        title = "";
        webAddress = "";
    }
    public BookmarkEntry(String title,String webAddress){
        this.title = title;
        this.webAddress = webAddress;
    }

    // Accessors
    public String getTitle(){
        return title;
    }
    public String getAddress(){
        return webAddress;
    }

    // Mutators
    public void setTitle(String title){
        this.title = title;
    }
    public void setAddress(String webAddress){
        this.webAddress = webAddress;
    }

    public String toString(){
        String msg = "The book mark is " + title + " and its on the following website: " + webAddress;
        return msg;
    }
}
