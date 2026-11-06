package o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class xc5 extends c76 {
    public final View G;
    public final rd0 H;
    public final TextView I;
    public final ImageView J;

    public xc5(View view, rd0 rd0Var) {
        super(view);
        this.G = view;
        this.H = rd0Var;
        View viewFindViewById = view.findViewById(R.id.group_name);
        viewFindViewById.getClass();
        this.I = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.group_shared);
        viewFindViewById2.getClass();
        this.J = (ImageView) viewFindViewById2;
    }
}
