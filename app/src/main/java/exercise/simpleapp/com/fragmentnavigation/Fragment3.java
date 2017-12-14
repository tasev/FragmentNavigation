package exercise.simpleapp.com.fragmentnavigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by tasev on 12/5/17.
 */

public class Fragment3 extends Fragment {

    @BindView(R.id.imageView)
    ImageView imageView;
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment3, null);
        mUnbinder = ButterKnife.bind(this,view);

//        imageView.setImageResource(R.drawable.brainster_and_code);
String imagePath = "http://www.freepngimg.com/download/jaguar/11-2-jaguar-png-hd.png";

        Picasso.with(getActivity())
                .load(imagePath)
                .fit()
                .centerInside()
                .into(imageView);
        return view;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}
