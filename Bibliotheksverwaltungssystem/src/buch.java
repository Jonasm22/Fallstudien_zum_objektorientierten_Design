public class buch {

    private String titel;
    private String author;
    private boolean ausgeliehen;

    public buch(String author, String titel) {
        this.author = author;
        this.titel = titel;
        this.ausgeliehen = false;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAusgeliehen() {
        return ausgeliehen;
    }

    public void setAusgeliehen(boolean ausgeliehen) {
        this.ausgeliehen = ausgeliehen;
    }
}
