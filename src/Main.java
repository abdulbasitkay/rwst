public class Main {

    static String[] buzz = {"continuous testing", "continuous integration", "continuous deployment", "continuous delivery", "automation"};
    static String[] adjectives = {"complete", "modern", "automated", "integrated", "end-to-end"};
    static String[] adverbs = {"remarkably", "enormously", "substantially", "significantly","seriously"};
    static String[] verbs = {"accelerates", "improves", "enhances", "revamps", "boosts"};

    public static void main(String[] args) {
        System.out.println(generateRandom());
    }

    private static String generateRandom() {
        int i = (int) (Math.random() * 4);
        return String.join(" ", adjectives[rad()], buzz[rad()], adverbs[rad()], verbs[rad()], buzz[rad()]);
    }
    private static int rad(){
        return (int) (Math.random() * 4);
    }

}
