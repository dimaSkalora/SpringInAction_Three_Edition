package part_1.head_03.springinaction.spring_idol.parent.vocal;

public class Vocalist implements Vocal {
    private String song;

    public Vocalist() {
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void playVocal() {
        System.out.println(getSong());
    }
}
