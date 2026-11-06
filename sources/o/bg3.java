package o;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/bg3;", "Lo/ut2;", "Lo/oq0;", "Lo/w05;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bg3 extends ut2 implements oq0 {
    public bb5 p0;

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(r0(), null, 6);
        composeView.setViewCompositionStrategy(new l07(L()));
        composeView.setContent(g68.l);
        return composeView;
    }

    @Override // o.bu2
    public final w05 a() {
        w05 w05Var;
        Bundle bundle = this.r;
        return (bundle == null || (w05Var = (w05) pm8.w(bundle, "current_navigation_category", w05.class)) == null) ? w05.Partnerlist : w05Var;
    }

    @Override // o.oq0
    public final void e(bb5 bb5Var) {
        this.p0 = bb5Var;
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        bb5 bb5Var = this.p0;
        if (bb5Var != null) {
            bb5Var.H0(false);
        }
        KeyEvent.Callback callbackC = C();
        id3 id3Var = callbackC instanceof id3 ? (id3) callbackC : null;
        if (id3Var != null) {
            id3Var.f(null, true, Integer.valueOf(R.string.in_app_purchase_upgrade_plan_title), false);
            id3Var.a();
        }
    }
}
