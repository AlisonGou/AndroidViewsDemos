package com.example.gougxl.androidviewsdemos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LinesFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private LineAdaptor mLineAdaptor;
    String line;

    //initialize the View of MVC
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lineslistfragment,container,false);
        mRecyclerView = view.findViewById(R.id.recycler_container);

        //layoutmanger is used to screen scroll
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        line = "can you feel it?!";
        List linelist = new ArrayList();
        for (int i=0;i<100;i++){
            linelist.add(line);

        }
        mLineAdaptor=new LineAdaptor(linelist);
        mRecyclerView.setAdapter(mLineAdaptor);

        //updateUI();
        return view;
    }

    //initialize the lineholder which is used to holer view
    private class LineHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public LineHolder(View itemview){
            super(itemview);
            mTextView = (TextView)itemview;

        }
    }

    //
    private class LineAdaptor extends RecyclerView.Adapter<LineHolder>{
        private List<Line> mLinesList;
        private LineAdaptor(List<Line> lines){
            mLinesList=lines;
        }

        @NonNull
        @Override
        public LineHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1,viewGroup,false);
            return new LineHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull LineHolder lineHolder, int i) {
            //Line line = mLinesList.get(i);
            //lineHolder.mTextView.setText(line.getLineword());
            lineHolder.mTextView.setText(line);

        }

        @Override
        public int getItemCount() {
            System.out.println("linelist size is :"+mLinesList.size());
            return mLinesList.size();

        }
    }

    /*public void updateUI(){
        LinesLab linesLab = new LinesLab();
        List<Line> lines = linesLab.getLinesList();
        mLineAdaptor= new LineAdaptor(lines);
        mRecyclerView.setAdapter(mLineAdaptor);
    }*/
}
