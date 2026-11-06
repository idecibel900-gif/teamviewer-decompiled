package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class pm2 extends ViewGroup.MarginLayoutParams implements mm2 {
    public static final Parcelable.Creator<pm2> CREATOR = new dq8((byte) 13);
    public int m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f1747o;
    public int p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;

    @Override // o.mm2
    public final int a() {
        return ((ViewGroup.MarginLayoutParams) this).height;
    }

    @Override // o.mm2
    public final int b() {
        return ((ViewGroup.MarginLayoutParams) this).width;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // o.mm2
    public final int g() {
        return this.p;
    }

    @Override // o.mm2
    public final int getOrder() {
        return this.m;
    }

    @Override // o.mm2
    public final float h() {
        return this.f1747o;
    }

    @Override // o.mm2
    public final int i() {
        return this.r;
    }

    @Override // o.mm2
    public final void k(int i) {
        this.r = i;
    }

    @Override // o.mm2
    public final int l() {
        return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    @Override // o.mm2
    public final int m() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin;
    }

    @Override // o.mm2
    public final int n() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin;
    }

    @Override // o.mm2
    public final void o(int i) {
        this.s = i;
    }

    @Override // o.mm2
    public final float p() {
        return this.n;
    }

    @Override // o.mm2
    public final float r() {
        return this.q;
    }

    @Override // o.mm2
    public final int s() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // o.mm2
    public final int t() {
        return this.s;
    }

    @Override // o.mm2
    public final boolean v() {
        return this.v;
    }

    @Override // o.mm2
    public final int w() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        parcel.writeFloat(this.f1747o);
        parcel.writeInt(this.p);
        parcel.writeFloat(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }

    @Override // o.mm2
    public final int y() {
        return this.t;
    }
}
