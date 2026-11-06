package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class ed1 extends m {
    public static final Parcelable.Creator<ed1> CREATOR = new i57((byte) 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SparseArray f704o;

    public ed1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f704o = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f704o.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f704o;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f704o.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f704o.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
