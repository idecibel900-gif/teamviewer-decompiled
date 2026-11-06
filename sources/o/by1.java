package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class by1 extends vy1 {
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by1(String str) {
        super(sl7.m, R.string.contact_invitation_success_snackbar);
        str.getClass();
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof by1) && im3.n(this.d, ((by1) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return fx3.g("ContactInvitationSuccess(email=", this.d, ")");
    }

    @Override // o.vy1
    public final String x(Context context) {
        context.getClass();
        String string = context.getString(this.a, this.d);
        string.getClass();
        return string;
    }
}
