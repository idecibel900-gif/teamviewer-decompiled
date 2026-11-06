package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class fm6 extends m {
    public static final Parcelable.Creator<fm6> CREATOR = new ag5((byte) 6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f812o;

    public fm6(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f812o = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        return ua5.n("}", sb, this.f812o);
    }

    @Override // o.m, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f812o));
    }
}
