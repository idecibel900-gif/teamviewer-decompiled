package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x10 implements Parcelable {
    public static final Parcelable.Creator<x10> CREATOR = new dq8((byte) 5);
    public final int[] m;
    public final ArrayList n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f2467o;
    public final int[] p;
    public final int q;
    public final String r;
    public final int s;
    public final int t;
    public final CharSequence u;
    public final int v;
    public final CharSequence w;
    public final ArrayList x;
    public final ArrayList y;
    public final boolean z;

    public x10(w10 w10Var) {
        int size = w10Var.a.size();
        this.m = new int[size * 6];
        if (!w10Var.g) {
            hk0.l("Not on back stack");
            throw null;
        }
        this.n = new ArrayList(size);
        this.f2467o = new int[size];
        this.p = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ev2 ev2Var = (ev2) w10Var.a.get(i2);
            int i3 = i + 1;
            this.m[i] = ev2Var.a;
            ArrayList arrayList = this.n;
            ut2 ut2Var = ev2Var.b;
            arrayList.add(ut2Var != null ? ut2Var.q : null);
            int[] iArr = this.m;
            iArr[i3] = ev2Var.c ? 1 : 0;
            iArr[i + 2] = ev2Var.d;
            iArr[i + 3] = ev2Var.e;
            int i4 = i + 5;
            iArr[i + 4] = ev2Var.f;
            i += 6;
            iArr[i4] = ev2Var.g;
            this.f2467o[i2] = ev2Var.h.ordinal();
            this.p[i2] = ev2Var.i.ordinal();
        }
        this.q = w10Var.f;
        this.r = w10Var.i;
        this.s = w10Var.t;
        this.t = w10Var.j;
        this.u = w10Var.k;
        this.v = w10Var.l;
        this.w = w10Var.m;
        this.x = w10Var.n;
        this.y = w10Var.f2362o;
        this.z = w10Var.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.m);
        parcel.writeStringList(this.n);
        parcel.writeIntArray(this.f2467o);
        parcel.writeIntArray(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        TextUtils.writeToParcel(this.u, parcel, 0);
        parcel.writeInt(this.v);
        TextUtils.writeToParcel(this.w, parcel, 0);
        parcel.writeStringList(this.x);
        parcel.writeStringList(this.y);
        parcel.writeInt(this.z ? 1 : 0);
    }

    public x10(Parcel parcel) {
        this.m = parcel.createIntArray();
        this.n = parcel.createStringArrayList();
        this.f2467o = parcel.createIntArray();
        this.p = parcel.createIntArray();
        this.q = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.u = (CharSequence) creator.createFromParcel(parcel);
        this.v = parcel.readInt();
        this.w = (CharSequence) creator.createFromParcel(parcel);
        this.x = parcel.createStringArrayList();
        this.y = parcel.createStringArrayList();
        this.z = parcel.readInt() != 0;
    }
}
