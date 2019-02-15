package com.example.gougxl.androidviewsdemos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LinesLab{
    List<Line> mLinesList;
    private static LinesLab mLinesLab;


    public LinesLab(){
        mLinesList = new ArrayList<>();
        for (int i=0;i<100;i++){
            Line line = new Line();
            line.setLineword("can you feel it!？");
            mLinesList.add(line);
        }

    }

    public List<Line> getLinesList() {
        return mLinesList;
    }

    public void setLinesList(List<Line> linesList) {
        mLinesList = linesList;
    }

    public int size() {
        return mLinesList.size();
    }

    public Line getline(UUID uuid){
        for (Line line : mLinesList){
            if (uuid.equals(line.getLineid())){
                return line;
            }
        }
        return null;
    }



}
