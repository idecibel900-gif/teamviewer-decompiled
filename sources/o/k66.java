package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class k66 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ androidx.recyclerview.widget.a b;

    public /* synthetic */ k66(androidx.recyclerview.widget.a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    public final int a(View view) {
        int iL;
        int i;
        switch (this.a) {
            case 0:
                m66 m66Var = (m66) view.getLayoutParams();
                iL = androidx.recyclerview.widget.a.L(view);
                i = ((ViewGroup.MarginLayoutParams) m66Var).rightMargin;
                break;
            default:
                m66 m66Var2 = (m66) view.getLayoutParams();
                iL = androidx.recyclerview.widget.a.J(view);
                i = ((ViewGroup.MarginLayoutParams) m66Var2).bottomMargin;
                break;
        }
        return iL + i;
    }

    public final int b(View view) {
        int iK;
        int i;
        switch (this.a) {
            case 0:
                m66 m66Var = (m66) view.getLayoutParams();
                iK = androidx.recyclerview.widget.a.K(view);
                i = ((ViewGroup.MarginLayoutParams) m66Var).leftMargin;
                break;
            default:
                m66 m66Var2 = (m66) view.getLayoutParams();
                iK = androidx.recyclerview.widget.a.M(view);
                i = ((ViewGroup.MarginLayoutParams) m66Var2).topMargin;
                break;
        }
        return iK - i;
    }

    public final int c() {
        int i;
        int paddingRight;
        byte b = this.a;
        androidx.recyclerview.widget.a aVar = this.b;
        switch (b) {
            case 0:
                i = aVar.z;
                paddingRight = aVar.getPaddingRight();
                break;
            default:
                i = aVar.A;
                paddingRight = aVar.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    public final int d() {
        byte b = this.a;
        androidx.recyclerview.widget.a aVar = this.b;
        switch (b) {
            case 0:
                return aVar.getPaddingLeft();
            default:
                return aVar.getPaddingTop();
        }
    }
}
