package pwsz.software.sec;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.backpack,
            R.drawable.luggage
    };

    public String[] headings = {
            " bagaż podręczny - self-luggage " ,
            " odloty - departures "
    };
    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    };

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
     //   return super.instantiateItem(container, position);
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideView1 = (ImageView) view.findViewById(R.id.slideView1);
        ImageView slideView2 = (ImageView) view.findViewById(R.id.slideView3);
        ImageView slideView3 = (ImageView) view.findViewById(R.id.slideView4);
        slideView1.setImageResource(slide_images[position]);
        slideView2.setImageResource(slide_images[position]);
        slideView3.setImageResource(slide_images[position]);

        TextView textView = (TextView) view.findViewById(R.id.textView5);
        TextView textView1 = (TextView) view.findViewById(R.id.textView7);
        TextView textView2 = (TextView) view.findViewById(R.id.textView8);
        textView.setText(headings[position]);
        textView1.setText(headings[position]);
        textView2.setText(headings[position]);

      //  textView.setText(headings[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       // super.destroyItem(container, position, object);
        container.removeView((RelativeLayout)object);
    }
}
