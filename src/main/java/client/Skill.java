public class Skill {
    private int id;
    private String name;
    private int level;

    public Skill(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        this.level++;
    }

    public void levelDown() {
        if (this.level > 0) {
            this.level--;
        }
    }
}
