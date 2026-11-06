package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class dw4 extends View.BaseSavedState {
    public final int m;
    public final LinkedList n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw4(Parcelable parcelable, int i, LinkedList linkedList) {
        super(parcelable);
        linkedList.getClass();
        this.m = i;
        this.n = linkedList;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m);
        parcel.writeSerializable(this.n);
    }
}
