import java.util.HashMap;
import java.util.Random;

public class WordGame{

  public HashMap<String,String> wordsWithTranslation;
    public String[] words;
    public HashMap<String,Integer> scores;
    Random random= new Random();

    public boolean check(String word, String translationToCheck){
       String rightTranslation= wordsWithTranslation.get(word);
       return rightTranslation.equals(translationToCheck); }

    public WordGame(HashMap<String, String> wordsWithTranslation, HashMap<String, Integer> scores) {
        this. wordsWithTranslation = wordsWithTranslation;
        this. scores = scores;
    }

    public String nextWord(){
        int index = random.nextInt(words.length);
        return words[index];
    }
public WordGame(){
        this.wordsWithTranslation=new HashMap<>();
        this.wordsWithTranslation.put("make ", " делать");
    this.wordsWithTranslation.put("cake ", " торт");
    this.wordsWithTranslation.put("egs ", " яйца");
    this.wordsWithTranslation.put("fence ", " забор");
    this.wordsWithTranslation.put("diagonal pliers ", " пласкогубцы");
this.scores=new HashMap<>();

words = new String[wordsWithTranslation.size()];
int i=0;
    for(String current:this.wordsWithTranslation.keySet()) {
        this.scores.put(current,0);
        words[i]= current;
        i++;
}}

    }

