public class BookmarkTest {
    public static void main(String[] args) {
        BookmarkEntry[] bm = new BookmarkEntry[5];
        bm[0] = new BookmarkEntry("Google", "www.google.com");
        bm[1] = new BookmarkEntry("Facebook", "www.facebook.com");
        bm[2] = new BookmarkEntry("Gmail", "www.gmail.com");
        bm[3] = new BookmarkEntry("Amazon", "www.amazon.com");
        bm[4] = new BookmarkEntry("Bing", "www.bing.com");

        // ToString
        for(int i=0; i<bm.length; i++){
            System.out.println(bm[i]);
        }
    }
}
