package IntroductionToInterfaces.AbschließendeAufgabe;

public interface Database {
    void connect(String url , String user, String password);
    void disconect();
    void insert(String table , String data);
    void update(String table , String data);
}

class mySQLDatabase implements Database{
    @Override
    public void connect(String url, String user, String password) {
        System.out.println("Verbindung hergestellt");
    }

    @Override
    public void disconect() {
        System.out.println("Disconnected");

    }

    @Override
    public void insert(String table, String data) {
        System.out.println("Daten in Table" + table + "eingefugt: " +data);
    }

    @Override
    public void update(String table, String data) {
        System.out.println("Daten in tabelle " +table + "aktilisiert" + data);
    }
}