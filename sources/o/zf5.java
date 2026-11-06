package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zf5 extends t97 implements Parcelable, a57, i97, px4 {
    public static final Parcelable.Creator<zf5> CREATOR = new xf5((byte) 1);
    public z47 n;

    public zf5(long j) {
        n47 n47VarH = v47.h();
        z47 z47Var = new z47(n47VarH.g(), j);
        if (!(n47VarH instanceof lz2)) {
            z47Var.b = new z47(1L, j);
        }
        this.n = z47Var;
    }

    public final void A(long j) {
        n47 n47VarH;
        z47 z47Var = (z47) v47.f(this.n);
        if (z47Var.c != j) {
            z47 z47Var2 = this.n;
            synchronized (v47.c) {
                n47VarH = v47.h();
                ((z47) v47.n(z47Var2, this, n47VarH, z47Var)).c = j;
            }
            v47.l(n47VarH, this);
        }
    }

    @Override // o.px4
    public final Function1 c() {
        return new y46((Object) this, (byte) 21);
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
        if (((z47) u97Var2).c == ((z47) u97Var3).c) {
            return u97Var2;
        }
        return null;
    }

    @Override // o.i97
    public final Object getValue() {
        return Long.valueOf(z());
    }

    @Override // o.px4
    public final Object j() {
        return Long.valueOf(z());
    }

    @Override // o.px4
    public final void setValue(Object obj) {
        A(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((z47) v47.f(this.n)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(z());
    }

    @Override // o.s97
    public final void x(u97 u97Var) {
        this.n = (z47) u97Var;
    }

    public final long z() {
        return ((z47) v47.s(this.n, this)).c;
    }
}
