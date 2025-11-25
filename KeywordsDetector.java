public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    public static String[] toArr(String str) {
        // Replace this comment with your code
        String[] arr = str.split(" ");
        char c = ' ';
        int currI = 0;
        String word = "";
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);
            if(c != ' '){
                word = word + String.valueOf(c);
                if((i + 1) != str.length()){
                    if(str.charAt(i + 1) == ' '){
                        arr[currI] = word;
                        word = "";
                        currI++;
                    }
                } else {
                    arr[currI] = word;
                } 
            }
        }
        return arr;
    }

    public static boolean isKey(String[] words, String[] keywords) {
        // Replace this comment with your code
        boolean isKeyWord = false;
        for (int i = 0; i < words.length; i++){
            for(int j = 0; j < keywords.length; j++){
                if(words[i].toLowerCase().equals(keywords[j].toLowerCase())){
                    isKeyWord = true;
                }
            }
        }
        return isKeyWord;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        String[] currCheck;
        boolean isIn = false;
        for (int i = 0; i < sentences.length; i++){
            currCheck = toArr(sentences[i]);
            isIn = isKey(currCheck, keywords);
            if(isIn) System.out.println(sentences[i]);
        }
    }
}
