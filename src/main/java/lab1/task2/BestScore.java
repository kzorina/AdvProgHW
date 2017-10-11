package lab1.task2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by zorka_000 on 10/11/2017.
 */
public class BestScore implements Serializable {
    public List<Score> bestScores = new ArrayList<Score>();
    private int bestScoreLength = 5;

    private class Score implements Serializable {
        private Integer score;
        private String name;

        public Integer getScore() {
            return score;
        }

        public Score(Integer score, String name) {
            this.score = score;
            this.name = name;
        }

        @Override
        public String toString() {
            return score+"\t\t"+name+"\n";
        }
    }
    @Override
    public String toString() {
        String mes ="";
        for (Score i: bestScores){
            mes+=i;
            //System.out.println(i);
        }

        return mes;
    }

    public void addScore(Integer score, String name){
        boolean inserted = false;

        for (Score i : bestScores) {
            int index = bestScores.indexOf(i);
            if (score > i.getScore()) {
                bestScores.add(index, new Score(score, name));
                inserted = true;
                break;
            }
        }
        if (!inserted&&(bestScores.size()<bestScoreLength)) {
            bestScores.add(new Score(score, name));
        }
        if (bestScores.size()>bestScoreLength){
            bestScores.remove(bestScores.size()-1);
        }

    }




}
