package Collections;

import java.util.ArrayList;
import java.util.List;

public class a_ArrayList {

    private List<String> word = new ArrayList<>();

    public void addWorld(String wordList){
        word.add(wordList);
    }

    public List<String> getWord() {
        return word;
    }

    public void setWord(List<String> word) {
        this.word = word;
    }

    public static void main(String[] args) {

        a_ArrayList list = new a_ArrayList();

        list.addWorld("a");
        list.addWorld("b");
        list.addWorld("c");


        for(String w : list.word){
            System.out.println(w);
        }



    }

}
