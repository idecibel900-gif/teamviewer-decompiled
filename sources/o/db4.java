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
public final class db4 extends LinearLayout {
    public GroupListElementViewModel m;
    public final vu2 n;

    public db4(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.listelementdetailgroupdown_item, (ViewGroup) this, false);
        addView(viewInflate);
        TextView textView = (TextView) r47.s(viewInflate, android.R.id.text1);
        if (textView == null) {
            yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(android.R.id.text1)));
            throw null;
        }
        this.n = new vu2(textView);
    }
}
