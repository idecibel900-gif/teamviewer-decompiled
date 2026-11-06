package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o.et1;
import o.nv1;
import o.pq8;
import o.q2;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends q2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new pq8(5);
    public final int m;
    public final String n;

    public Scope(int i, String str) {
        nv1.r(str, "scopeUri must not be null or empty");
        this.m = i;
        this.n = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.n.equals(((Scope) obj).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.X(parcel, 2, this.n);
        et1.c0(parcel, iB0);
    }
}
