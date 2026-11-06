package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.ep3;
import o.ip4;
import o.jp4;
import o.jq4;
import o.pp4;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements ip4, jq4, AdapterView.OnItemClickListener {
    public static final int[] n = {R.attr.background, R.attr.divider};
    public jp4 m;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ep3 ep3VarX = ep3.x(context, attributeSet, n, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) ep3VarX.f733o;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(ep3VarX.l(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(ep3VarX.l(1));
        }
        ep3VarX.B();
    }

    @Override // o.jq4
    public final void b(jp4 jp4Var) {
        this.m = jp4Var;
    }

    @Override // o.ip4
    public final boolean c(pp4 pp4Var) {
        return this.m.s(pp4Var, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        c((pp4) getAdapter().getItem(i));
    }
}
