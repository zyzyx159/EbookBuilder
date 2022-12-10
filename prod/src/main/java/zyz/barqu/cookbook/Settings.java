package zyz.barqu.cookbook;

public class Settings {
    public Settings() {
    }

    public Settings(String title, String location, byte depth) {
        this.title = title;
        this.location = location;
        this.depth = depth;
    }

    private String title;
    private String location;
    private byte depth;

    @Override
    public String toString() {
        return "\nTitle: " + title + "\nLocation: " + location + "\nDepth: " + depth + "/n";
    }

}


    