package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class my1 extends vy1 {
    public final String d;

    public my1(String str) {
        super(sl7.f2030o, R.string.service_queue_assign_to_me_failure_snackbar, g37.m);
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my1) && im3.n(this.d, ((my1) obj).d);
    }

    public final int hashCode() {
        String str = this.d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return fx3.g("ServiceQueueAssignToMeFailure(sessionName=", this.d, ")");
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
