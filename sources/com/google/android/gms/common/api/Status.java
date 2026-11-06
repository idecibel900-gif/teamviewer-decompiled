package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Arrays;
import o.a65;
import o.ep1;
import o.et1;
import o.pq8;
import o.q2;
import o.w41;
import o.xs1;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends q2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new pq8(6);
    public final int m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PendingIntent f34o;
    public final w41 p;

    public Status(int i, String str, PendingIntent pendingIntent, w41 w41Var) {
        this.m = i;
        this.n = str;
        this.f34o = pendingIntent;
        this.p = w41Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.m == status.m && xs1.G(this.n, status.n) && xs1.G(this.f34o, status.f34o) && xs1.G(this.p, status.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.m), this.n, this.f34o, this.p});
    }

    public final String toString() {
        a65 a65Var = new a65(this, (byte) 1);
        String string = this.n;
        if (string == null) {
            int i = this.m;
            switch (i) {
                case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                    string = "SUCCESS_CACHE";
                    break;
                case 0:
                    string = "SUCCESS";
                    break;
                case 1:
                case ep1.b /* 9 */:
                case 11:
                case ep1.d /* 12 */:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    string = sb.toString();
                    break;
                case 2:
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    string = "SERVICE_DISABLED";
                    break;
                case 4:
                    string = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    string = "INVALID_ACCOUNT";
                    break;
                case 6:
                    string = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    string = "NETWORK_ERROR";
                    break;
                case 8:
                    string = "INTERNAL_ERROR";
                    break;
                case ep1.c /* 10 */:
                    string = "DEVELOPER_ERROR";
                    break;
                case 13:
                    string = "ERROR";
                    break;
                case 14:
                    string = "INTERRUPTED";
                    break;
                case 15:
                    string = "TIMEOUT";
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    string = "CANCELED";
                    break;
                case 17:
                    string = "API_NOT_CONNECTED";
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    string = "DEAD_CLIENT";
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    string = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    string = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        a65Var.P(string, "statusCode");
        a65Var.P(this.f34o, "resolution");
        return a65Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        et1.a0(parcel, 1, 4);
        parcel.writeInt(this.m);
        et1.X(parcel, 2, this.n);
        et1.W(parcel, 3, this.f34o, i);
        et1.W(parcel, 4, this.p, i);
        et1.c0(parcel, iB0);
    }
}
