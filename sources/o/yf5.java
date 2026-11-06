package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yf5 extends t97 implements Parcelable, a57, i97, px4 {
    public static final Parcelable.Creator<yf5> CREATOR = new xf5((byte) 0);
    public y47 n;

    public yf5(int i) {
        n47 n47VarH = v47.h();
        y47 y47Var = new y47(i, n47VarH.g());
        if (!(n47VarH instanceof lz2)) {
            y47Var.b = new y47(i, 1L);
        }
        this.n = y47Var;
    }

    public final void A(int i) {
        n47 n47VarH;
        y47 y47Var = (y47) v47.f(this.n);
        if (y47Var.c != i) {
            y47 y47Var2 = this.n;
            synchronized (v47.c) {
                n47VarH = v47.h();
                ((y47) v47.n(y47Var2, this, n47VarH, y47Var)).c = i;
            }
            v47.l(n47VarH, this);
        }
    }

    @Override // o.px4
    public final Function1 c() {
        return new ma(this, (byte) 4);
    }

    @Override // o.s97
    public final u97 d() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // o.a57
    public final c57 e() {
        return yl7.X;
    }

    @Override // o.s97
    public final u97 f(u97 u97Var, u97 u97Var2, u97 u97Var3) {
        if (((y47) u97Var2).c == ((y47) u97Var3).c) {
            return u97Var2;
        }
        return null;
    }

    @Override // o.i97
    public final Object getValue() {
        return Integer.valueOf(z());
    }

    @Override // o.px4
    public final Object j() {
        return Integer.valueOf(z());
    }

    @Override // o.px4
    public final void setValue(Object obj) {
        A(((Number) obj).intValue());
    }

    public final String toString() {
        return ua5.l("MutableIntState(value=", ((y47) v47.f(this.n)).c, hashCode(), ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(z());
    }

    @Override // o.s97
    public final void x(u97 u97Var) {
        this.n = (y47) u97Var;
    }

    public final int z() {
        return ((y47) v47.s(this.n, this)).c;
    }
}
