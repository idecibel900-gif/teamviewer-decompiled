package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ul implements do4 {
    public final /* synthetic */ ge8 a;
    public final /* synthetic */ LayoutNode b;

    public ul(ge8 ge8Var, LayoutNode layoutNode) {
        this.a = ge8Var;
        this.b = layoutNode;
    }

    @Override // o.do4
    public final int a(bm3 bm3Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ge8 ge8Var = this.a;
        ViewGroup.LayoutParams layoutParams = ge8Var.getLayoutParams();
        layoutParams.getClass();
        ge8Var.measure(iMakeMeasureSpec, xl.k(0, i, layoutParams.height));
        return ge8Var.getMeasuredWidth();
    }

    @Override // o.do4
    public final int b(bm3 bm3Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ge8 ge8Var = this.a;
        ViewGroup.LayoutParams layoutParams = ge8Var.getLayoutParams();
        layoutParams.getClass();
        ge8Var.measure(iMakeMeasureSpec, xl.k(0, i, layoutParams.height));
        return ge8Var.getMeasuredWidth();
    }

    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j) {
        ge8 ge8Var = this.a;
        int childCount = ge8Var.getChildCount();
        fa2 fa2Var = fa2.m;
        if (childCount == 0) {
            return fo4Var.u(r61.k(j), r61.j(j), fa2Var, new t2((byte) 26));
        }
        if (r61.k(j) != 0) {
            ge8Var.getChildAt(0).setMinimumWidth(r61.k(j));
        }
        if (r61.j(j) != 0) {
            ge8Var.getChildAt(0).setMinimumHeight(r61.j(j));
        }
        int iK = r61.k(j);
        int i = r61.i(j);
        ViewGroup.LayoutParams layoutParams = ge8Var.getLayoutParams();
        layoutParams.getClass();
        int iK2 = xl.k(iK, i, layoutParams.width);
        int iJ = r61.j(j);
        int iH = r61.h(j);
        ViewGroup.LayoutParams layoutParams2 = ge8Var.getLayoutParams();
        layoutParams2.getClass();
        ge8Var.measure(iK2, xl.k(iJ, iH, layoutParams2.height));
        return fo4Var.u(ge8Var.getMeasuredWidth(), ge8Var.getMeasuredHeight(), fa2Var, new ql(ge8Var, this.b, (byte) 2));
    }

    @Override // o.do4
    public final int d(bm3 bm3Var, List list, int i) {
        ge8 ge8Var = this.a;
        ViewGroup.LayoutParams layoutParams = ge8Var.getLayoutParams();
        layoutParams.getClass();
        ge8Var.measure(xl.k(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ge8Var.getMeasuredHeight();
    }

    @Override // o.do4
    public final int e(bm3 bm3Var, List list, int i) {
        ge8 ge8Var = this.a;
        ViewGroup.LayoutParams layoutParams = ge8Var.getLayoutParams();
        layoutParams.getClass();
        ge8Var.measure(xl.k(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return ge8Var.getMeasuredHeight();
    }
}
