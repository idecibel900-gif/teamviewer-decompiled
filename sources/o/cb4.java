package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class cb4 extends LinearLayout {
    public GroupListElementViewModel m;
    public final vu2 n;

    public cb4(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spinner_buddylist_details, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate != null) {
            this.n = new vu2((TextView) viewInflate);
        } else {
            yq4.l("rootView");
            throw null;
        }
    }
}
