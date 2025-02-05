public class Subsecuence {




    public static boolean hasSubsequence(String a, String b) {

        int i = 0;
        int j = 0;



        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j))
            {
                i++;
            }
            j++;
        }

        return i == a.length();
    }


    public static void main(String[] args) {

        String a = "abc";
        String b = "afhgbjksdfc";

        System.out.println(hasSubsequence(a,b));

    }
}
