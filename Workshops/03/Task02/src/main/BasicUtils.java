package main;

public class BasicUtils
{
public static String reversed(String str)
{
        return ( str != null )
                ? new StringBuilder(str).reverse().toString()
                : null;
}

public static int vowelCount(String str)
{
        long count = str.toLowerCase().chars()
                .mapToObj(i -> (char) i)
                .filter(BasicUtils::isVowel)
                .count();

        return (int) count;
}

public static boolean isVowel(char c)
{
        return "aeiouy".contains(String.valueOf(c));
}
}
