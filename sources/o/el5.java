package o;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public class el5 implements m02, ic1 {
    public static final /* synthetic */ el5 n = new el5(19);
    public final /* synthetic */ byte m;

    public /* synthetic */ el5(byte b) {
        this.m = b;
    }

    public static ml8 a(long j) {
        Set set = ol8.n;
        Set set2 = kj8.n;
        float fB = a42.b(j);
        if (w32.a(fB, 0.0f) < 0) {
            hk0.g("Width must not be negative");
            return null;
        }
        if (set.isEmpty()) {
            hk0.g("Must support at least one size class");
            return null;
        }
        List list = ol8.f1660o;
        int size = list.size();
        byte b = 0;
        for (int i = 0; i < size; i++) {
            ol8 ol8Var = (ol8) list.get(i);
            byte b2 = ol8Var.m;
            if (set.contains(ol8Var)) {
                Set set3 = ol8.n;
                if (w32.a(fB, n37.g(b2)) >= 0) {
                    b = b2;
                    break;
                }
                b = b2;
            }
        }
        Set set4 = kj8.n;
        float fA = a42.a(j);
        if (w32.a(fA, 0.0f) < 0) {
            hk0.g("Width must not be negative");
            return null;
        }
        if (set2.isEmpty()) {
            hk0.g("Must support at least one size class");
            return null;
        }
        List list2 = kj8.f1272o;
        int size2 = list2.size();
        byte b3 = 2;
        for (int i2 = 0; i2 < size2; i2++) {
            kj8 kj8Var = (kj8) list2.get(i2);
            byte b4 = kj8Var.m;
            if (set2.contains(kj8Var)) {
                Set set5 = kj8.n;
                if (w32.a(fA, o67.d(b4)) >= 0) {
                    b3 = b4;
                    break;
                }
                b3 = b4;
            }
        }
        return new ml8(b, b3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static sv7 b(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return sv7.q;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return sv7.p;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return sv7.f2061o;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return sv7.r;
            }
        } else if (str.equals("SSLv3")) {
            return sv7.s;
        }
        hk0.g("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static n47 c() {
        return (n47) v47.b.get();
    }

    public static Path d(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static n47 f(n47 n47Var) {
        if (n47Var instanceof e28) {
            e28 e28Var = (e28) n47Var;
            if (e28Var.t == o67.f()) {
                e28Var.r = null;
                return n47Var;
            }
        }
        if (n47Var instanceof f28) {
            f28 f28Var = (f28) n47Var;
            if (f28Var.i == o67.f()) {
                f28Var.h = null;
                return n47Var;
            }
        }
        n47 n47VarE = v47.e(n47Var, null, false);
        n47VarE.j();
        return n47VarE;
    }

    public static Object g(co1 co1Var, Function0 function0) {
        n47 e28Var;
        n47 n47Var = (n47) v47.b.get();
        if (n47Var instanceof e28) {
            e28 e28Var2 = (e28) n47Var;
            if (e28Var2.t == o67.f()) {
                Function1 function1 = e28Var2.r;
                Function1 function2 = e28Var2.s;
                try {
                    ((e28) n47Var).r = v47.i(co1Var, function1, true);
                    ((e28) n47Var).s = function2;
                    return function0.a();
                } finally {
                    e28Var2.r = function1;
                    e28Var2.s = function2;
                }
            }
        }
        if (n47Var == null || (n47Var instanceof ox4)) {
            e28Var = new e28(n47Var instanceof ox4 ? (ox4) n47Var : null, co1Var, null, true, false);
        } else {
            e28Var = n47Var.u(co1Var);
        }
        try {
            n47 n47VarJ = e28Var.j();
            try {
                Object objA = function0.a();
                n47.q(n47VarJ);
                e28Var.c();
                return objA;
            } catch (Throwable th) {
                n47.q(n47VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            e28Var.c();
            throw th2;
        }
    }

    public static void h(n47 n47Var, n47 n47Var2, Function1 function1) {
        if (n47Var != n47Var2) {
            n47Var2.getClass();
            n47.q(n47Var);
            n47Var2.c();
        } else if (n47Var instanceof e28) {
            ((e28) n47Var).r = function1;
        } else if (n47Var instanceof f28) {
            ((f28) n47Var).h = function1;
        } else {
            hk0.f(n47Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static ue8 k(zf8 zf8Var, Function0 function0) {
        return new ue8(zf8Var, new dl5(function0, (byte) 0));
    }

    public void e(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public void i(yo5 yo5Var, int i, int i2) {
    }

    @Override // o.ic1
    public /* synthetic */ Object j(bo7 bo7Var) throws IOException {
        if (bo7Var.k()) {
            return (Bundle) bo7Var.i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(bo7Var.h())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", bo7Var.h());
    }

    @Override // o.m02
    public void l() {
    }

    public String toString() {
        switch (this.m) {
            case 6:
                int iHashCode = hashCode();
                qf0.s(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return fx3.h("CreationExtras.Key@", string, "<", w86.a.b(ai6.class).f(), ">");
            case ep1.c /* 10 */:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
