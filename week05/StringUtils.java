import java.util.Arrays;



public class StringUtils {

    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1 ; i>= 0; i--)
        {

            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();
    }

    public static String exploded(String a)
    {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < a.length(); i++)
        {
            for (int j = 0; j <= i; j++)
            {
                newStr.append(a.charAt(j));
            }
        }

        return newStr.toString();
    }

    public static String sorting(String b)
    {
        char[] sortedArray = b.toCharArray();
        Arrays.sort(sortedArray);
        return  new String(sortedArray);

//        for (int i = 0; i < sortedArray.length; i++)
//        {
//            for (int j = 0; j < sortedArray.length - i - 1; j++)
//            {
//                if (sortedArray[j]>sortedArray[j+1]){
//                    char temp = sortedArray[j];
//                    sortedArray[j] = sortedArray[j+1];
//                    sortedArray[j+1] = temp;
//
//                }
//
//            }
//        }
//
//        return new String(sortedArray);
    }

    public static boolean anagrams(String s1, String s2)
    {
        String n_s1 = sorting(s1);
        String n_s2 = sorting(s2);

        return n_s1.equals(n_s2);

    }

    public static String swap(String s1)
    {
        StringBuilder sb = new StringBuilder();

        String[] s_array =  s1.split(" ");
        for (int i = 0; i < s_array.length; i++)
        {
            char[] c = s_array[i].toCharArray();
            char temp = c[0];
            c[0] = c[c.length - 1];
            c[c.length - 1] = temp;
            sb.append(c);
            sb.append(" ");
        }

        return sb.toString();
    }



    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "Baku";
        System.out.println(reverse(s1));

        System.out.println(exploded(s1));
        System.out.println(sorting(s1));
        System.out.println(anagrams(s1,s2));
        System.out.println(swap(s1));

    }
}
