package o;

import android.content.Context;
import android.view.ViewGroup;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wd6 extends ViewGroup {
    public final byte m;
    public final ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f2400o;
    public final a65 p;
    public int q;

    public wd6(Context context) {
        super(context);
        this.m = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2400o = arrayList2;
        this.p = new a65((byte) 16);
        setClipChildren(false);
        xd6 xd6Var = new xd6(context);
        addView(xd6Var);
        arrayList.add(xd6Var);
        arrayList2.add(xd6Var);
        this.q = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
