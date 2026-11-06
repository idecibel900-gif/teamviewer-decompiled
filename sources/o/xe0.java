package o;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.inapppurchase.InAppPurchaseActivity;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe0 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ xe0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                int i = ye0.s0;
                menuItem.getClass();
                bb5 bb5Var = ((ye0) obj).r0;
                if (bb5Var != null) {
                    if (it1.c == null) {
                        im3.e0("viewFactory");
                        throw null;
                    }
                    bb5Var.I0(new ve0(), true);
                }
                return true;
            case 1:
                ye0 ye0Var = (ye0) obj;
                int i2 = ye0.s0;
                menuItem.getClass();
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(i15.t);
                Context contextE = ye0Var.E();
                if (it1.c != null) {
                    ye0Var.y0(new Intent(contextE, (Class<?>) SettingsActivity.class));
                    return true;
                }
                im3.e0("viewFactory");
                throw null;
            case 2:
                ye0 ye0Var2 = (ye0) obj;
                int i3 = ye0.s0;
                menuItem.getClass();
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(fg3.p);
                int i4 = InAppPurchaseActivity.S;
                Intent intentJ = ct1.J(ye0Var2.C());
                if (intentJ != null) {
                    KeyEvent.Callback callbackC = ye0Var2.C();
                    bb3 bb3Var = callbackC instanceof bb3 ? (bb3) callbackC : null;
                    if (bb3Var != null) {
                        bb3Var.i(intentJ);
                    }
                }
                return true;
            default:
                n67.q(((RemoteAction) obj).getActionIntent());
                return true;
        }
    }
}
