package io.sentry.android.core;

import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import o.ax8;
import o.be8;
import o.fb7;
import o.fq4;
import o.h7;
import o.j00;
import o.jp4;
import o.l7;
import o.lz7;
import o.mf8;
import o.nd;
import o.nf8;
import o.s28;
import o.sk8;
import o.tr8;
import o.yc4;
import o.yl7;
import o.yp7;
import o.yq4;

/* JADX INFO: loaded from: classes.dex */
public class u0 implements mf8, fq4 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f127o;

    public u0(nd ndVar) {
        this.m = (byte) 3;
        this.f127o = ndVar;
        this.n = true;
    }

    public void a(Function0 function0) {
        if (this.n) {
            function0.a();
        } else {
            this.f127o = new WeakReference(function0);
        }
    }

    @Override // o.fq4
    public void b(jp4 jp4Var, boolean z) {
        l7 l7Var;
        lz7 lz7Var = (lz7) this.f127o;
        if (this.n) {
            return;
        }
        this.n = true;
        ActionMenuView actionMenuView = lz7Var.O.a.m;
        if (actionMenuView != null && (l7Var = actionMenuView.F) != null) {
            l7Var.g();
            h7 h7Var = l7Var.G;
            if (h7Var != null && h7Var.b()) {
                h7Var.i.dismiss();
            }
        }
        lz7Var.P.onPanelClosed(108, jp4Var);
        this.n = false;
    }

    public boolean c() {
        return this.n;
    }

    public void d() {
        Function0 function0;
        WeakReference weakReference = (WeakReference) this.f127o;
        if (weakReference == null || (function0 = (Function0) weakReference.get()) == null) {
            this.n = true;
        } else {
            function0.a();
        }
    }

    @Override // o.mf8
    public sk8 e(View view, sk8 sk8Var, nf8 nf8Var) {
        boolean z = this.n;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f127o;
        boolean z2 = bottomSheetBehavior.m;
        bottomSheetBehavior.r = sk8Var.d();
        WeakHashMap weakHashMap = be8.a;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (z2) {
            int iA = sk8Var.a();
            bottomSheetBehavior.q = iA;
            paddingBottom = iA + nf8Var.d;
        }
        if (bottomSheetBehavior.n) {
            paddingLeft = (z3 ? nf8Var.c : nf8Var.a) + sk8Var.b();
        }
        if (bottomSheetBehavior.f41o) {
            paddingRight = sk8Var.c() + (z3 ? nf8Var.a : nf8Var.c);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (z) {
            bottomSheetBehavior.k = sk8Var.a.k().d;
        }
        if (!z2 && !z) {
            return sk8Var;
        }
        bottomSheetBehavior.J();
        return sk8Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean f(int i, CharSequence charSequence) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            yq4.f();
            return false;
        }
        if (((yl7) this.f127o) == null) {
            return c();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            u0 u0Var = yp7.a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return c();
        }
        return false;
    }

    public void g() {
        this.n = false;
    }

    public void h(byte b) {
        ((nd) this.f127o).t(String.valueOf(b));
    }

    public void i(char c) {
        nd ndVar = (nd) this.f127o;
        ndVar.h(ndVar.n, 1);
        char[] cArr = (char[]) ndVar.f1562o;
        int i = ndVar.n;
        ndVar.n = i + 1;
        cArr[i] = c;
    }

    public void j(int i) {
        ((nd) this.f127o).t(String.valueOf(i));
    }

    public void k(long j) {
        ((nd) this.f127o).t(String.valueOf(j));
    }

    public void l(short s) {
        ((nd) this.f127o).t(String.valueOf(s));
    }

    public void m(String str) {
        byte b;
        str.getClass();
        nd ndVar = (nd) this.f127o;
        ndVar.h(ndVar.n, str.length() + 2);
        char[] cArr = (char[]) ndVar.f1562o;
        int i = ndVar.n;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = fb7.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    ndVar.h(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = fb7.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) ndVar.f1562o)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = fb7.a[cCharAt];
                        str2.getClass();
                        ndVar.h(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) ndVar.f1562o, i4);
                        int length3 = str2.length() + i4;
                        ndVar.n = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) ndVar.f1562o;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        ndVar.n = i4;
                    }
                }
                ndVar.h(i4, 1);
                ((char[]) ndVar.f1562o)[i4] = '\"';
                ndVar.n = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        ndVar.n = i3 + 1;
    }

    @Override // o.fq4
    public boolean m0(jp4 jp4Var) {
        ((lz7) this.f127o).P.onMenuOpened(108, jp4Var);
        return true;
    }

    public void n() {
    }

    public void o() {
    }

    public void p(ax8 ax8Var) {
        if (this.n) {
            tr8.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((yc4) this.f127o).S(new j00(ax8Var, null));
        } catch (Throwable unused) {
            tr8.h("BillingLogger", "logging failed.");
        }
    }

    public String toString() {
        switch (this.m) {
            case 4:
                return this.n ? "FALL_THROUGH" : String.valueOf(this.f127o);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u0(byte b, Object obj, boolean z) {
        this.m = b;
        this.n = z;
        this.f127o = obj;
    }

    public /* synthetic */ u0(Object obj, byte b) {
        this.m = b;
        this.f127o = obj;
    }

    public /* synthetic */ u0(byte b) {
        this.m = b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0() {
        this((byte) 1, null, false);
        this.m = (byte) 1;
    }

    public u0(boolean z, String[] strArr) {
        this.m = (byte) 0;
        this.n = z;
        this.f127o = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u0(s28 s28Var, int i) {
        this.m = (byte) 8;
        this.f127o = s28Var;
        this.n = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0(yl7 yl7Var, boolean z) {
        this((Object) yl7Var, (byte) 6);
        this.m = (byte) 6;
        this.n = z;
    }
}
