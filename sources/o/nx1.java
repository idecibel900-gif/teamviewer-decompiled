package o;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lo/nx1;", "Lo/ut2;", "Lo/oq0;", "Lo/w05;", "<init>", "()V", "", "hasInternet", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nx1 extends ut2 implements oq0 {
    public final void A0(ov1 ov1Var, ux2 ux2Var, int i) {
        ux2Var.Y(1139397469);
        int i2 = (ux2Var.d(ov1Var.ordinal()) ? 4 : 2) | i | (ux2Var.h(this) ? 32 : 16);
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new l51(p0());
                ux2Var.g0(objK);
            }
            l51 l51Var = (l51) objK;
            ut7.a(au8.O(-1858741251, new z8((Object) io1.z(i67.m(ux2Var)), (Object) ov1Var, (Object) this, (Object) et1.u(l51Var.b, Boolean.valueOf(l51Var.a()), ((LifecycleOwner) ux2Var.j(dd4.a)).getR(), m84.p, ba2.m, ux2Var, 0), (byte) 7), ux2Var), ux2Var, 48);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new mx1(this, ov1Var, i);
        }
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        KeyEvent.Callback callbackC = C();
        jd3 jd3Var = callbackC instanceof jd3 ? (jd3) callbackC : null;
        if (jd3Var != null) {
            ((MainActivity) jd3Var).Y();
        }
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        ov1 ov1VarA = nv1.A(sharedPreferences);
        ComposeView composeView = new ComposeView(r0(), null, 6);
        composeView.setContent(new yy0(-824385445, true, new mx1(this, ov1VarA)));
        return composeView;
    }

    @Override // o.bu2
    public final w05 a() {
        return w05.Partnerlist;
    }

    @Override // o.oq0
    public final void e(bb5 bb5Var) {
    }
}
