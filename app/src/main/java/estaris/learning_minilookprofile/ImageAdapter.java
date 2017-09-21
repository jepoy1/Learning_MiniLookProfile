/*  Works as a bridge between the UI components and the underlying data the adapter contains:
*   Just like ImageAdapter contains int array of thumbnail id's that will be used to return in getView()
*   The layout(GridView or any other View) will obtain the Adapter's getView() content to be shown in the layout(View)
* */
package estaris.learning_minilookprofile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Estaris on 9/21/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1,
            R.drawable.pic1, R.drawable.pic1
    };


}
