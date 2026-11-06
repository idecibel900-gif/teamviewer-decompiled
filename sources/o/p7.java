package o;

import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class p7 {
    public final /* synthetic */ byte m = 0;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1709o;

    public p7(String str, boolean z) {
        this.f1709o = str;
        this.n = z;
    }

    public Integer b(p7 p7Var) {
        p7Var.getClass();
        im4 im4Var = ng8.a;
        if (this == p7Var) {
            return 0;
        }
        im4 im4Var2 = ng8.a;
        Integer num = (Integer) im4Var2.get(this);
        Integer num2 = (Integer) im4Var2.get(p7Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void c();

    public abstract View d();

    public String e() {
        return (String) this.f1709o;
    }

    public abstract jp4 f();

    public abstract MenuInflater g();

    public abstract CharSequence i();

    public abstract CharSequence j();

    public abstract void k();

    public abstract boolean l();

    public p7 m() {
        return this;
    }

    public abstract void n(View view);

    public abstract void o(int i);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i);

    public abstract void r(CharSequence charSequence);

    public abstract void s(boolean z);

    public String toString() {
        switch (this.m) {
            case 1:
                return e();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p7() {
    }
}
