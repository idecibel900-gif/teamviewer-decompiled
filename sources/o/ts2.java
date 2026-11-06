package o;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class ts2 {
    public final int a;
    public final int b;
    public final Notification c;

    public ts2(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ts2.class != obj.getClass()) {
            return false;
        }
        ts2 ts2Var = (ts2) obj;
        if (this.a == ts2Var.a && this.b == ts2Var.b) {
            return this.c.equals(ts2Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
