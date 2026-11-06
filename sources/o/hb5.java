package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class hb5 extends vy1 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb5(androidx.recyclerview.widget.a aVar, byte b) {
        super(aVar);
        this.d = b;
    }

    @Override // o.vy1
    public final int d(View view) {
        int iL;
        int i;
        switch (this.d) {
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

    @Override // o.vy1
    public final int e(View view) {
        int measuredWidth;
        int i;
        switch (this.d) {
            case 0:
                m66 m66Var = (m66) view.getLayoutParams();
                Rect rect = ((m66) view.getLayoutParams()).n;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) m66Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) m66Var).rightMargin;
                break;
            default:
                m66 m66Var2 = (m66) view.getLayoutParams();
                Rect rect2 = ((m66) view.getLayoutParams()).n;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) m66Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) m66Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // o.vy1
    public final int f(View view) {
        int measuredHeight;
        int i;
        switch (this.d) {
            case 0:
                m66 m66Var = (m66) view.getLayoutParams();
                Rect rect = ((m66) view.getLayoutParams()).n;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) m66Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) m66Var).bottomMargin;
                break;
            default:
                m66 m66Var2 = (m66) view.getLayoutParams();
                Rect rect2 = ((m66) view.getLayoutParams()).n;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) m66Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) m66Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // o.vy1
    public final int g(View view) {
        int iK;
        int i;
        switch (this.d) {
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

    @Override // o.vy1
    public final int h() {
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((androidx.recyclerview.widget.a) obj).z;
            default:
                return ((androidx.recyclerview.widget.a) obj).A;
        }
    }

    @Override // o.vy1
    public final int i() {
        int i;
        int paddingRight;
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) obj;
                i = aVar.z;
                paddingRight = aVar.getPaddingRight();
                break;
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) obj;
                i = aVar2.A;
                paddingRight = aVar2.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    @Override // o.vy1
    public final int j() {
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((androidx.recyclerview.widget.a) obj).getPaddingRight();
            default:
                return ((androidx.recyclerview.widget.a) obj).getPaddingBottom();
        }
    }

    @Override // o.vy1
    public final int k() {
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((androidx.recyclerview.widget.a) obj).x;
            default:
                return ((androidx.recyclerview.widget.a) obj).y;
        }
    }

    @Override // o.vy1
    public final int l() {
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((androidx.recyclerview.widget.a) obj).y;
            default:
                return ((androidx.recyclerview.widget.a) obj).x;
        }
    }

    @Override // o.vy1
    public final int m() {
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((androidx.recyclerview.widget.a) obj).getPaddingLeft();
            default:
                return ((androidx.recyclerview.widget.a) obj).getPaddingTop();
        }
    }

    @Override // o.vy1
    public final int n() {
        int paddingLeft;
        int paddingRight;
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) obj;
                paddingLeft = aVar.z - aVar.getPaddingLeft();
                paddingRight = aVar.getPaddingRight();
                break;
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) obj;
                paddingLeft = aVar2.A - aVar2.getPaddingTop();
                paddingRight = aVar2.getPaddingBottom();
                break;
        }
        return paddingLeft - paddingRight;
    }

    @Override // o.vy1
    public final int p(View view) {
        byte b = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Rect rect = (Rect) obj;
                ((androidx.recyclerview.widget.a) obj2).R(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((androidx.recyclerview.widget.a) obj2).R(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // o.vy1
    public final int q(View view) {
        byte b = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Rect rect = (Rect) obj;
                ((androidx.recyclerview.widget.a) obj2).R(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((androidx.recyclerview.widget.a) obj2).R(view, rect2);
                return rect2.top;
        }
    }

    @Override // o.vy1
    public final void r(int i) {
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((androidx.recyclerview.widget.a) obj).W(i);
                break;
            default:
                ((androidx.recyclerview.widget.a) obj).X(i);
                break;
        }
    }
}
