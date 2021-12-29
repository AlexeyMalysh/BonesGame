package gameCom.game.bonesgame;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.halil.ozel.rolldicegame.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random(); // Random nesnesi olusturduk.

    Button playGame; // button

    ImageView imgView1, imgView2; // image

    TextView textView2, textView3; // textview


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        playGame = findViewById(R.id.playGame);
        imgView1 = findViewById(R.id.imgView1);
        imgView2 = findViewById(R.id.imgView2);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

    }



    public void playGame(View view) {


        int value1 = randomDiceValues();
        int value2 = randomDiceValues();


        int picture1 = getResources().getIdentifier("bones" + value1, "drawable", getPackageName());
        int picture2 = getResources().getIdentifier("bones" + value2, "drawable", getPackageName());



        imgView1.setImageResource(picture1);
        imgView2.setImageResource(picture2);



        textView2.setText(String.valueOf(value1));
        textView3.setText(String.valueOf(value2));

    }


    public static int randomDiceValues() {


        return RANDOM.nextInt(6) + 1; // 1-6 значения


    }


}