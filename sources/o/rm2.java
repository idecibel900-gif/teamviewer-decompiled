package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class rm2 extends m66 implements mm2 {
    public static final Parcelable.Creator<rm2> CREATOR = new dq8((byte) 14);
    public float q;
    public float r;
    public int s;
    public float t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;

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
        return this.s;
    }

    @Override // o.mm2
    public final int getOrder() {
        return 1;
    }

    @Override // o.mm2
    public final float h() {
        return this.r;
    }

    @Override // o.mm2
    public final int i() {
        return this.u;
    }

    @Override // o.mm2
    public final void k(int i) {
        this.u = i;
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
        this.v = i;
    }

    @Override // o.mm2
    public final float p() {
        return this.q;
    }

    @Override // o.mm2
    public final float r() {
        return this.t;
    }

    @Override // o.mm2
    public final int s() {
        return ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    @Override // o.mm2
    public final int t() {
        return this.v;
    }

    @Override // o.mm2
    public final boolean v() {
        return this.y;
    }

    @Override // o.mm2
    public final int w() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.q);
        parcel.writeFloat(this.r);
        parcel.writeInt(this.s);
        parcel.writeFloat(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }

    @Override // o.mm2
    public final int y() {
        return this.w;
    }
}
