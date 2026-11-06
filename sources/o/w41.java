package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Arrays;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final class w41 extends q2 {
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PendingIntent f2376o;
    public final String p;
    public final Integer q;
    public static final w41 r = new w41(0, null, null);
    public static final Parcelable.Creator<w41> CREATOR = new xf5((byte) 28);

    public w41(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.m = i;
        this.n = i2;
        this.f2376o = pendingIntent;
        this.p = str;
        this.q = num;
    }

    public static String c(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case ep1.b /* 9 */:
                return "SERVICE_INVALID";
            case ep1.c /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                        return "SERVICE_UPDATING";
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w41)) {
            return false;
        }
        w41 w41Var = (w41) obj;
        return this.n == w41Var.n && xs1.G(this.f2376o, w41Var.f2376o) && xs1.G(this.p, w41Var.p) && xs1.G(this.q, w41Var.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.n), this.f2376o, this.p, this.q});
    }

    public final String toString() {
        a65 a65Var = new a65(this, (byte) 1);
        a65Var.P(c(this.n), "statusCode");
        a65Var.P(this.f2376o, "resolution");
        a65Var.P(this.p, "message");
        a65Var.P(this.q, "clientMethodKey");
        return a65Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.a0(parcel, 2, 4);
        parcel.writeInt(this.n);
        et1.W(parcel, 3, this.f2376o, i);
        et1.X(parcel, 4, this.p);
        Integer num = this.q;
        if (num != null) {
            et1.a0(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        et1.c0(parcel, iB0);
    }

    public w41(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
