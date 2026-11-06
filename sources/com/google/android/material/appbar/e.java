package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import o.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends m {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f40o;
    public float p;
    public boolean q;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40o = parcel.readInt();
        this.p = parcel.readFloat();
        this.q = parcel.readByte() != 0;
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f40o);
        parcel.writeFloat(this.p);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
    }
}
