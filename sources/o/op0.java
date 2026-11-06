package o;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo/op0;", "Lo/ut2;", "Lo/oq0;", "Lo/w05;", "Lo/ca3;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class op0 extends ut2 implements oq0, ca3 {
    public bb5 p0;

    public abstract boolean A0();

    @Override // o.bu2
    public final w05 a() {
        return w05.Chat;
    }

    @Override // o.oq0
    public void e(bb5 bb5Var) {
        this.p0 = bb5Var;
    }

    @Override // o.ut2
    public void i0() {
        this.S = true;
        Context applicationContext = r0().getApplicationContext();
        applicationContext.getClass();
        new r55(applicationContext).a(6, null);
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        KeyEvent.Callback callbackC = C();
        jd3 jd3Var = callbackC instanceof jd3 ? (jd3) callbackC : null;
        if (jd3Var != null) {
            ((MainActivity) jd3Var).f0();
        }
        bb5 bb5Var = this.p0;
        if (bb5Var != null) {
            bb5Var.H0(A0());
        }
    }
}
