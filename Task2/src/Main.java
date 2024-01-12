public class Main {
    public static void main(String[] args) {
        String print = textTransform("");
        System.out.println(print);
    }
    public static String textTransform(String text) {
        text = "In the serene tranquility of the early morning," +
                "the sun's gentle rays painted the sky with hues of pink and gold." +
                "Birds chirped a harmonious melody as they danced through the air." +
                "A gentle breeze whispered through the leaves," +
                "carrying the scent of blooming flowers. The world seemed to awaken slowly," +
                "embracing the promise of a new day. Amidst the quietude," +
                "thoughts meandered like a gentle stream, reflecting on dreams and aspirations." +
                "Nature's symphony played, a timeless composition that echoed through the heart." +
                "Each moment held a delicate beauty," +
                "a mosaic of fleeting instances that defined the poetry of existence.";
        String transform = text.replaceAll("\\W+", "\n").trim();
        return transform;




    }

}