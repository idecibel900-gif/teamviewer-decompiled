package o;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lo/ud7;", "Lo/ut2;", "Lo/oq0;", "Lo/w05;", "<init>", "()V", "Lo/kp5;", "postPurchaseState", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class ud7 extends ut2 implements oq0 {
    public bb5 p0;
    public final bg5 q0 = h57.p(Boolean.FALSE);

    /* JADX INFO: renamed from: A0 */
    public abstract ce7 getS0();

    /* JADX INFO: renamed from: B0 */
    public abstract int getR0();

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(r0(), null, 6);
        composeView.setViewCompositionStrategy(new l07(L()));
        composeView.setContent(new yy0(-694971156, true, new sd7(this, (byte) 0)));
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
        int iB0 = getR0();
        KeyEvent.Callback callbackC = C();
        id3 id3Var = callbackC instanceof id3 ? (id3) callbackC : null;
        byte b = 1;
        if (id3Var != null) {
            id3Var.f(Integer.valueOf(iB0), true, null, false);
            id3Var.a();
        }
        G().f0("iap_login_complete", this, new ar(new sd7(this, b), (byte) 9));
    }
}
