package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bg5 extends t97 implements Parcelable, a57 {
    public static final Parcelable.Creator<bg5> CREATOR = new ag5(0);
    public final c57 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b57 f422o;

    public bg5(Object obj, c57 c57Var) {
        this.n = c57Var;
        n47 n47VarH = v47.h();
        b57 b57Var = new b57(n47VarH.g(), obj);
        if (!(n47VarH instanceof lz2)) {
            b57Var.b = new b57(1L, obj);
        }
        this.f422o = b57Var;
    }

    @Override // o.px4
    public final Function1 c() {
        return new y46((Object) this, (byte) 22);
    }

    @Override // o.s97
    public final u97 d() {
        return this.f422o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // o.a57
    public final c57 e() {
        return this.n;
    }

    @Override // o.s97
    public final u97 f(u97 u97Var, u97 u97Var2, u97 u97Var3) {
        if (this.n.G(((b57) u97Var2).c, ((b57) u97Var3).c)) {
            return u97Var2;
        }
        return null;
    }

    @Override // o.i97
    public final Object getValue() {
        return ((b57) v47.s(this.f422o, this)).c;
    }

    @Override // o.px4
    public final Object j() {
        return getValue();
    }

    @Override // o.px4
    public final void setValue(Object obj) {
        n47 n47VarH;
        b57 b57Var = (b57) v47.f(this.f422o);
        if (this.n.G(b57Var.c, obj)) {
            return;
        }
        b57 b57Var2 = this.f422o;
        synchronized (v47.c) {
            n47VarH = v47.h();
            ((b57) v47.n(b57Var2, this, n47VarH, b57Var)).c = obj;
        }
        v47.l(n47VarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((b57) v47.f(this.f422o)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        xz2 xz2Var = xz2.P;
        c57 c57Var = this.n;
        if (c57Var.equals(xz2Var)) {
            i2 = 0;
        } else if (c57Var.equals(yl7.X)) {
            i2 = 1;
        } else {
            if (!c57Var.equals(yl7.T)) {
                hk0.l("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    @Override // o.s97
    public final void x(u97 u97Var) {
        this.f422o = (b57) u97Var;
    }
}
