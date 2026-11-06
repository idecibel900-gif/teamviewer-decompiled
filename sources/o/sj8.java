package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sj8 implements View.OnApplyWindowInsetsListener {
    public final uu0 a;
    public sk8 b;

    public sj8(View view, uu0 uu0Var) {
        sk8 sk8VarB;
        this.a = uu0Var;
        WeakHashMap weakHashMap = be8.a;
        sk8 sk8VarA = td8.a(view);
        if (sk8VarA != null) {
            int i = Build.VERSION.SDK_INT;
            sk8VarB = (i >= 36 ? new fk8(sk8VarA) : i >= 35 ? new ek8(sk8VarA) : i >= 34 ? new dk8(sk8VarA) : i >= 31 ? new ck8(sk8VarA) : i >= 30 ? new bk8(sk8VarA) : i >= 29 ? new ak8(sk8VarA) : new yj8(sk8VarA)).b();
        } else {
            sk8VarB = null;
        }
        this.b = sk8VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = sk8.g(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        sk8 sk8VarG = sk8.g(windowInsets, view);
        pk8 pk8Var = sk8VarG.a;
        sk8 sk8VarA = this.b;
        if (sk8VarA == null) {
            WeakHashMap weakHashMap = be8.a;
            sk8VarA = td8.a(view);
            this.b = sk8VarA;
        }
        if (sk8VarA == null) {
            this.b = sk8VarG;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            uu0 uu0VarJ = tj8.j(view);
            if (uu0VarJ == null || !Objects.equals((sk8) uu0VarJ.n, sk8VarG)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                sk8 sk8Var = this.b;
                int i = 1;
                while (i <= 512) {
                    nj3 nj3VarI = pk8Var.i(i);
                    nj3 nj3VarI2 = sk8Var.a.i(i);
                    int i2 = nj3VarI.a;
                    int i3 = nj3VarI.d;
                    int i4 = nj3VarI.c;
                    int i5 = nj3VarI.b;
                    int i6 = nj3VarI2.a;
                    int i7 = nj3VarI2.d;
                    int[] iArr3 = iArr;
                    int i8 = nj3VarI2.c;
                    int i9 = nj3VarI2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = sk8VarG;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    sk8 sk8Var2 = this.b;
                    if ((i10 & 8) != 0) {
                        interpolator = tj8.e;
                    } else if ((i11 & 8) != 0) {
                        interpolator = tj8.f;
                    } else if ((i10 & 519) != 0) {
                        interpolator = tj8.g;
                    } else {
                        interpolator = (i11 & 519) != 0 ? tj8.h : null;
                    }
                    xj8 xj8Var = new xj8(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    xj8Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(xj8Var.a.b());
                    nj3 nj3VarI3 = pk8Var.i(i12);
                    nj3 nj3VarI4 = sk8Var2.a.i(i12);
                    int iMin = Math.min(nj3VarI3.a, nj3VarI4.a);
                    int i13 = nj3VarI3.b;
                    int i14 = nj3VarI4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = nj3VarI3.c;
                    int i16 = nj3VarI4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = nj3VarI3.d;
                    int i18 = nj3VarI4.d;
                    lh7 lh7Var = new lh7(nj3.b(iMin, iMin2, iMin3, Math.min(i17, i18)), nj3.b(Math.max(nj3VarI3.a, nj3VarI4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), (byte) 14);
                    tj8.g(view, xj8Var, sk8VarG, false);
                    duration.addUpdateListener(new rj8(xj8Var, sk8VarG, sk8Var2, i12, view));
                    duration.addListener(new k18((byte) 2, view, xj8Var));
                    d95.a(view, new dm0(view, xj8Var, lh7Var, duration));
                    this.b = sk8VarG;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
