package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class hp5 extends kp5 {
    public static final hp5 q = new hp5(R.string.active_license_message_title, R.string.active_license_message_description, R.string.active_license_primary_button_label, null);
    public static final Parcelable.Creator<hp5> CREATOR = new xf5((byte) 2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hp5);
    }

    public final int hashCode() {
        return -667235360;
    }

    public final String toString() {
        return "ActiveLicense";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
