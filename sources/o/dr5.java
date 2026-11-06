package o;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class dr5 extends c76 {
    public final Drawable G;
    public final ColorStateList H;
    public final SparseArray I;
    public boolean J;
    public boolean K;

    public dr5(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.I = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(com.teamviewer.teamviewer.market.mobile.R.id.icon_frame, view.findViewById(com.teamviewer.teamviewer.market.mobile.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.G = view.getBackground();
        if (textView != null) {
            this.H = textView.getTextColors();
        }
    }

    public final View r(int i) {
        SparseArray sparseArray = this.I;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.m.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
