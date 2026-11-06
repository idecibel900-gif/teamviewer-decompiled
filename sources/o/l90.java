package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class l90 extends m {
    public static final Parcelable.Creator<l90> CREATOR = new i57((byte) 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1343o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;

    public l90(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1343o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt() == 1;
        this.r = parcel.readInt() == 1;
        this.s = parcel.readInt() == 1;
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1343o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
    }

    public l90(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f1343o = bottomSheetBehavior.F;
        this.p = bottomSheetBehavior.d;
        this.q = bottomSheetBehavior.b;
        this.r = bottomSheetBehavior.C;
        this.s = bottomSheetBehavior.D;
    }
}
