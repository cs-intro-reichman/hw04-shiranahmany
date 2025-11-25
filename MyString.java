public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        str = str.toLowerCase();
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        int l1 = 0;
        int l2 = 0;
        char c1 = ' ', c2 = ' ';
        if(str1 == "" || str2 == "") return false;
        if (str1.indexOf(str2.charAt(0)) == -1) return false;
        l1 = str1.indexOf(str2.charAt(0));
        boolean equals = false;
        while(l1 < str1.length()){
            c1 = str1.charAt(l1);
            c2 = str2.charAt(l2);
            if(c1 == c2){
               equals = true;
               l1++;
               l2++;
                while(l2 < str2.length()){
                    c1 = str1.charAt(l1);
                    c2 = str2.charAt(l2);
                    if(c1 != c2)  {
                        equals = false;
                        break;
                    } else {
                        l1++;
                        l2++;
                    }
               }
            }
            if(equals){
                break;
            } else {
                l2 = 0;
                l1++;
            }
        }
        return equals;
    }
}
