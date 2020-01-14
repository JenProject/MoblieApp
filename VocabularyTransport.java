package pwsz.software.sec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class VocabularyTransport extends AppCompatActivity {

    private ImageButton back;
    private ViewPager SlideViewPager;
    private LinearLayout LinLay;

    private TextView[] mDots;
    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_transport);
        back = (ImageButton) findViewById(R.id.btn_GetBack);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(VocabularyTransport.this, CategoryChosen1.class);
                startActivity(intent);
            }

        });

        SlideViewPager = (ViewPager) findViewById(R.id.ViewPager);
        LinLay = (LinearLayout) findViewById(R.id.LinLay) ;

        sliderAdapter = new SliderAdapter(this);

        SlideViewPager.setAdapter(sliderAdapter);
        addDots();
    }
    public void addDots(){
        mDots = new TextView[2];
        for( int i =0; i<mDots.length;i++)
        {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.White));
            LinLay.addView(mDots[i]);
        }
    }
}
