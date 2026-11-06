package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ip5 extends kp5 {
    public static final ip5 q = new ip5(R.string.payment_successful_message_title, R.string.payment_successful_message_description, R.string.payment_success_primary_button_label, null);
    public static final Parcelable.Creator<ip5> CREATOR = new xf5((byte) 3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ip5);
    }

    public final int hashCode() {
        return 551275794;
    }

    public final String toString() {
        return "PendingActivation";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
