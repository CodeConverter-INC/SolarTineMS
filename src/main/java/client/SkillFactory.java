public class SkillFactory {

    private static final Map<Integer, Skill> skills = new HashMap<>();

    static {
        skills.put(1, new Skill(1, "Fireball", 1));
        skills.put(2, new Skill(2, "Ice Shard", 1));
        skills.put(3, new Skill(3, "Lightning Bolt", 1));
    }

    private SkillFactory() {
        // Private constructor to prevent instantiation
    }

    public static Skill getSkill(int id) {
        return skills.get(id);
    }

    public static void addSkill(int id, String name, int level) {
        skills.put(id, new Skill(id, name, level));
    }
}
