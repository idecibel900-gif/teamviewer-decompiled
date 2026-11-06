package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r90 extends k90 {
    public final boolean a;
    public final boolean b;
    public final sk8 c;

    public r90(View view, sk8 sk8Var) {
        ColorStateList backgroundTintList;
        this.c = sk8Var;
        boolean z = (view.getSystemUiVisibility() & 8192) != 0;
        this.b = z;
        qn4 qn4Var = BottomSheetBehavior.x(view).i;
        if (qn4Var != null) {
            backgroundTintList = qn4Var.m.c;
        } else {
            WeakHashMap weakHashMap = be8.a;
            backgroundTintList = view.getBackgroundTintList();
        }
        if (backgroundTintList != null) {
            this.a = wo1.Q(backgroundTintList.getDefaultColor());
        } else if (view.getBackground() instanceof ColorDrawable) {
            this.a = wo1.Q(((ColorDrawable) view.getBackground()).getColor());
        } else {
            this.a = z;
        }
    }

    @Override // o.k90
    public final void a(View view) {
        c(view);
    }

    @Override // o.k90
    public final void b(View view, int i) {
        c(view);
    }

    public final void c(View view) {
        int top = view.getTop();
        sk8 sk8Var = this.c;
        if (top < sk8Var.d()) {
            int i = s90.C;
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(this.a ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            view.setPadding(view.getPaddingLeft(), sk8Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            int i2 = s90.C;
            int systemUiVisibility2 = view.getSystemUiVisibility();
            view.setSystemUiVisibility(this.b ? systemUiVisibility2 | 8192 : systemUiVisibility2 & (-8193));
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}
