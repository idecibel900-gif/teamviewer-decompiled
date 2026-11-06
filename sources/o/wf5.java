package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wf5 extends t97 implements Parcelable, a57, i97, px4 {
    public static final Parcelable.Creator<wf5> CREATOR = new dq8((byte) 29);
    public x47 n;

    public wf5(float f) {
        n47 n47VarH = v47.h();
        x47 x47Var = new x47(f, n47VarH.g());
        if (!(n47VarH instanceof lz2)) {
            x47Var.b = new x47(f, 1L);
        }
        this.n = x47Var;
    }

    public final void A(float f) {
        n47 n47VarH;
        x47 x47Var = (x47) v47.f(this.n);
        if (x47Var.c == f) {
            return;
        }
        x47 x47Var2 = this.n;
        synchronized (v47.c) {
            n47VarH = v47.h();
            ((x47) v47.n(x47Var2, this, n47VarH, x47Var)).c = f;
        }
        v47.l(n47VarH, this);
    }

    @Override // o.px4
    public final Function1 c() {
        return new y46((Object) this, (byte) 20);
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
        if (((x47) u97Var2).c == ((x47) u97Var3).c) {
            return u97Var2;
        }
        return null;
    }

    @Override // o.i97
    public final Object getValue() {
        return Float.valueOf(z());
    }

    @Override // o.px4
    public final Object j() {
        return Float.valueOf(z());
    }

    @Override // o.px4
    public final void setValue(Object obj) {
        A(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((x47) v47.f(this.n)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(z());
    }

    @Override // o.s97
    public final void x(u97 u97Var) {
        this.n = (x47) u97Var;
    }

    public final float z() {
        return ((x47) v47.s(this.n, this)).c;
    }
}
