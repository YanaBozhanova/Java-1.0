public class Task12 {
    public static void main(String[] args) {

        String s = "I like Java!!!";

        boolean x = s.contains("Java");
        boolean x1 = s.startsWith("I like");
        boolean x2 = s.endsWith("!!!");
        if ((x==true)&&(x1==true)&&(x2==true)) {
        System.out.println(s.toUpperCase());
        }
        String result = s.replace('a',  'o');
        String result1 = result.substring(7,11);
        System.out.println(result1);
    }
}

