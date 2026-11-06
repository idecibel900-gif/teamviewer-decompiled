package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ny1 extends vy1 {
    public final String d;

    public ny1(String str) {
        super(sl7.m, R.string.service_queue_assign_to_me_success_snackbar, g37.m);
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny1) && im3.n(this.d, ((ny1) obj).d);
    }

    public final int hashCode() {
        String str = this.d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return fx3.g("ServiceQueueAssignToMeSuccess(sessionName=", this.d, ")");
    }

    @Override // o.vy1
    public final String x(Context context) {
        context.getClass();
        String string = this.d;
        if (string == null) {
            string = context.getString(R.string.session_default_name);
            string.getClass();
        }
        String string2 = context.getString(this.a, string);
        string2.getClass();
        return string2;
    }
}
