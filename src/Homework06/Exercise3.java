package Homework06;

public class Exercise3 {

    static String getMiddleChars(String text)
    {

        if (text.length()%2==0)
        {
            text = String.format("%s%s",text.charAt(text.length() / 2 - 1), text.charAt(text.length() / 2 ) );
        }
        else
        {
            text = String.format("%s",text.charAt(text.length() / 2));
        }
        return text;
    }

    static int countWords (String text)
    {
        int numberOfWords = 0;

        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ')
            {
                numberOfWords++;
            }
            else if (text.charAt(i) == ' ' && text.charAt(i + 1) == ' ')
            {
                numberOfWords++;
                while (text.charAt(i)== ' ')
                {
                    i++;
                }
            }
        }

        return numberOfWords + 1;
    }
    // less code with no checks but works if there are no multiple blank spaces next to each other.
    static int countWordsAlternate (String text)
    {
        String [] textArr = text.split(" ");
        int wordCount = 0;
        for (int i = 0; i < textArr.length; i++)
        {
            if (textArr[i].length() > 1)
            {
                wordCount++;
            }
            else if (textArr[i].length() == 1 && !textArr[i].equals(" "))
            {
                wordCount++;
            }

        }
        return wordCount;

    }

    public static void main(String[] args) {

        System.out.println(getMiddleChars("12345"));
        System.out.println(getMiddleChars("123456"));

        System.out.println(countWords("hello   this is a sentence   with   eight words."));
        System.out.println(countWordsAlternate("hello   this is a sentence   with   eight words."));

    }
}
