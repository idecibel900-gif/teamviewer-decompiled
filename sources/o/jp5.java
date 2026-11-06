package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class jp5 extends kp5 {
    public static final jp5 q = new jp5(R.string.payment_failed_message_title, R.string.payment_failed_message_description, R.string.payment_failed_primary_button_label, Integer.valueOf(R.string.payment_failed_secondary_button_label));
    public static final Parcelable.Creator<jp5> CREATOR = new xf5((byte) 4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jp5);
    }

    public final int hashCode() {
        return -998494279;
    }

    public final String toString() {
        return "PurchaseFailed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
