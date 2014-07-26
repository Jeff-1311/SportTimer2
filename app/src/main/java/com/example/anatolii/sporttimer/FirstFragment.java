package com.example.anatolii.sporttimer;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by anatolii on 15.07.2014.
 */
public class FirstFragment extends Fragment {
    public int variable;
    public TextView textView;

    public TextView methodGetTextView() {
        return textView;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        final String TAG = "SportTimer";
        View root = inflater.inflate(R.layout.first_fragment, container, false);
        textView = (TextView) root.findViewById(R.id.textView1);

        textView.setText("222");

        android.util.Log.d(TAG, "variable " + variable);
        final int coutOfRounds = 3;
        final int countOfSecond = 1000;


        final MyTimer myTimer = new MyTimer( countOfSecond * coutOfRounds, countOfSecond);

        Button buttonStart = (Button) root.findViewById(R.id.buttonStart);

        buttonStart.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {

                                               android.util.Log.d(TAG, "button start");

                                               textView.setText("333");
                                               myTimer.start();

                                           }
                                       }
        );


        return root;
    }


}
