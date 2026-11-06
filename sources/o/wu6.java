package o;

import android.app.Notification;
import android.net.Network;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.teamviewer.teamviewer.market.mobile.application.SessionTimeoutService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wu6 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ wu6(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                SessionTimeoutService sessionTimeoutService = (SessionTimeoutService) obj;
                int i = SessionTimeoutService.v;
                ye4.a("SessionTimeoutService", "show notification again");
                Notification notificationA = sessionTimeoutService.a(sessionTimeoutService.p);
                if (notificationA != null) {
                    try {
                        sessionTimeoutService.startForeground(5, notificationA);
                    } catch (RuntimeException e) {
                        e41.s("Unable to show again connection notification: ", e.getMessage(), "SessionTimeoutService");
                        return;
                    }
                }
                break;
            case 1:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 2:
                int[] iArr = SwipeRefreshLayout.W;
                ((SwipeRefreshLayout) obj).l();
                break;
            case 3:
                pn5 pn5Var = (pn5) obj;
                gk7 gk7Var = (gk7) pn5Var.m;
                if (ct1.a != null) {
                    ik7.b((b6) pn5Var.p, new r02(gk7Var, p02.Negative));
                }
                gk7Var.N0();
                break;
            case 4:
                ye4.a("TVChangeResolutionPreferenceViewModel", "remote setting changed - refresh");
                ((ni7) obj).W0();
                break;
            case 5:
                ms7 ms7Var = (ms7) obj;
                iu iuVar = ms7Var.b;
                Boolean bool = null;
                ms7Var.n = null;
                xx4 xx4Var = ms7Var.m;
                View view2 = ms7Var.a;
                if (view2.isFocused() || (viewFindFocus = view2.getRootView().findFocus()) == null || !viewFindFocus.onCheckIsTextEditor()) {
                    Object[] objArr = xx4Var.m;
                    int i2 = xx4Var.f2559o;
                    Boolean boolValueOf = null;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ls7 ls7Var = (ls7) objArr[i3];
                        int iOrdinal = ls7Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                bool = Boolean.FALSE;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                gk0.s();
                                break;
                            } else if (!im3.n(bool, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(ls7Var == ls7.f1401o);
                            }
                        } else {
                            bool = Boolean.TRUE;
                        }
                        boolValueOf = bool;
                    }
                    xx4Var.g();
                    if (im3.n(bool, Boolean.TRUE)) {
                        ((InputMethodManager) ((u14) iuVar.p).getValue()).restartInput((View) iuVar.f1103o);
                    }
                    if (boolValueOf != null) {
                        if (boolValueOf.booleanValue()) {
                            ((l07) ((l07) iuVar.n).n).H();
                        } else {
                            ((l07) ((l07) iuVar.n).n).E();
                        }
                    }
                    if (im3.n(bool, Boolean.FALSE)) {
                        ((InputMethodManager) ((u14) iuVar.p).getValue()).restartInput((View) iuVar.f1103o);
                    }
                } else {
                    xx4Var.g();
                }
                break;
            case 6:
                ve6 ve6Var = (ve6) obj;
                if (ve6Var.b && ((Network) ve6Var.f) == null) {
                    ve6Var.g();
                    break;
                }
                break;
            default:
                pn5 pn5Var2 = (pn5) obj;
                ((tg6) pn5Var2.p).F(new mm8(pn5Var2));
                break;
        }
    }
}
