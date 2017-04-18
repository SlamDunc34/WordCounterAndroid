package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    private EditText enterEditText;
    private TextView textView;
    private Button countWordsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        enterEditText = (EditText) findViewById(R.id.phrase);
        textView = (TextView) findViewById(R.id.word_count);

    }

    public void onButtonClicked(View view) {
        String sentence = enterEditText.getText().toString();
        int count =  WordCount.countWords(sentence);
        textView.setText("The count is: " + count);
    }



}
