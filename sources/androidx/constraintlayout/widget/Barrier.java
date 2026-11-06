package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.a30;
import o.n61;
import o.rz5;
import o.z51;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends z51 {
    public int t;
    public a30 u;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // o.z51
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        a30 a30Var = new a30();
        a30Var.p0 = new n61[4];
        a30Var.q0 = 0;
        a30Var.r0 = 0;
        a30Var.s0 = true;
        a30Var.t0 = 0;
        a30Var.u0 = false;
        this.u = a30Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rz5.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.u.s0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.u.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.p = this.u;
        j();
    }

    public boolean getAllowsGoneWidget() {
        return this.u.s0;
    }

    public int getMargin() {
        return this.u.t0;
    }

    public int getType() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000a  */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    @Override // o.z51
    public final void h(n61 n61Var, boolean z) {
        int i = this.t;
        if (z) {
            if (i == 5) {
                i = 1;
            } else if (i == 6) {
                i = 0;
            }
        } else if (i == 5) {
            i = 0;
        } else if (i == 6) {
            i = 1;
        }
        if (n61Var instanceof a30) {
            ((a30) n61Var).r0 = i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.u.s0 = z;
    }

    public void setDpMargin(int i) {
        this.u.t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.u.t0 = i;
    }

    public void setType(int i) {
        this.t = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
