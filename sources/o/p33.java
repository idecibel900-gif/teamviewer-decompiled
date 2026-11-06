package o;

import android.os.Bundle;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/p33;", "Lo/q;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p33 extends q {
    public t33 q0;
    public long r0;

    @Override // o.q
    public final n93 A0() {
        if (zu1.c == null) {
            hk0.g("Required value was null.");
            return null;
        }
        t33 t33Var = this.q0;
        if (t33Var == null) {
            im3.e0("type");
            throw null;
        }
        dl5 dl5Var = new dl5(new gl((byte) 1, this.r0, t33Var), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(r33.class);
        String strC = wt3VarB.c();
        if (strC != null) {
            return (n93) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // o.q
    public final int B0() {
        t33 t33Var = this.q0;
        if (t33Var != null) {
            return o33.a[t33Var.ordinal()] == 1 ? R.drawable.device_icon : R.drawable.user_placeholder_image;
        }
        im3.e0("type");
        throw null;
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        t33 t33Var;
        long jLongValue;
        if (bundle == null || (t33Var = (t33) pm8.w(bundle, "memberType", t33.class)) == null) {
            Bundle bundle2 = this.r;
            t33Var = bundle2 != null ? (t33) pm8.w(bundle2, "memberType", t33.class) : null;
            if (t33Var == null) {
                t33Var = t33.n;
            }
        }
        this.q0 = t33Var;
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("memberId")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle3 = this.r;
            jLongValue = bundle3 != null ? bundle3.getLong("memberId") : 0L;
        }
        this.r0 = jLongValue;
        super.X(bundle);
    }

    @Override // o.ut2
    public final void h0(Bundle bundle) {
        bundle.putLong("memberId", this.r0);
        t33 t33Var = this.q0;
        if (t33Var != null) {
            bundle.putSerializable("memberType", t33Var);
        } else {
            im3.e0("type");
            throw null;
        }
    }
}
