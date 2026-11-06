package o;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.teamviewer.remotecontrolviewlib.layout.ExpandablePanel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da implements View.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f601o;

    public /* synthetic */ da(byte b, int i, Object obj) {
        this.m = b;
        this.f601o = obj;
        this.n = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        byte b = this.m;
        int i = this.n;
        Object obj = this.f601o;
        switch (b) {
            case 0:
                ExpandableListView expandableListView = ((ea) obj).a;
                if (expandableListView.isGroupExpanded(i)) {
                    expandableListView.collapseGroup(i);
                    return;
                } else {
                    expandableListView.expandGroup(i);
                    return;
                }
            case 1:
                ((be) ((de) obj).e).n(i);
                return;
            default:
                ExpandablePanel expandablePanel = (ExpandablePanel) obj;
                int i2 = expandablePanel.p;
                TextView textView = expandablePanel.m;
                if (expandablePanel.n) {
                    int i3 = expandablePanel.f68o;
                    if (textView == null) {
                        im3.e0("expandableText");
                        throw null;
                    }
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(textView, "maxLines", i3);
                    objectAnimatorOfInt.setDuration(i2);
                    objectAnimatorOfInt.start();
                    z = false;
                } else {
                    if (textView == null) {
                        im3.e0("expandableText");
                        throw null;
                    }
                    ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(textView, "maxLines", i);
                    objectAnimatorOfInt2.setDuration(i2);
                    objectAnimatorOfInt2.start();
                    z = true;
                }
                expandablePanel.n = z;
                return;
        }
    }
}
