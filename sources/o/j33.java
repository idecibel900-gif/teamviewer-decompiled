package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class j33 implements k33 {
    public static final Parcelable.Creator<j33> CREATOR = new dq8((byte) 21);
    public final UUID m;

    public j33(UUID uuid) {
        uuid.getClass();
        this.m = uuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j33) && im3.n(this.m, ((j33) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "Managed(uuid=" + this.m + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.m);
    }
}
