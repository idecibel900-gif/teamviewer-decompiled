package com.teamviewer.teamviewerlib.gui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import kotlin.Metadata;
import o.bt1;
import o.c6;
import o.ct1;
import o.d82;
import o.fx3;
import o.gk7;
import o.ik7;
import o.im3;
import o.jk0;
import o.p02;
import o.r02;
import o.x02;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/teamviewer/teamviewerlib/gui/UIConnector;", "", "", "text", "Lo/f88;", "showToast", "(Ljava/lang/String;)V", "url", "openUrl", "openUpgradePlan", "()V", "", "id", "idType", "header", "content", "defaultButton", "alternateButton", "otherButton", "showDialog", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "button", "jniOnClickCallback", "(III)V", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UIConnector {
    public static final UIConnector a = new UIConnector();
    public static final c6 b = new c6((byte) 15);
    public static final c6 c = new c6((byte) 16);
    public static final c6 d = new c6((byte) 17);
    public static final c6 e = new c6((byte) 18);

    private final native void jniOnClickCallback(int id, int idType, int button);

    public static final void openUpgradePlan() {
        EventHub.e(EventHub.e.f(), EventType.EVENT_IN_APP_PURCHASE_UPGRADE_PLAN_REQUEST);
    }

    public static final void openUrl(String url) {
        Context context;
        url.getClass();
        synchronized (jk0.s) {
            context = jk0.t;
        }
        if (context != null) {
            Uri uri = Uri.parse(url);
            uri.getClass();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public static final void showDialog(int id, int idType, String header, String content, String defaultButton, String alternateButton, String otherButton) {
        x02 x02Var = new x02(id, idType);
        if (bt1.a == null) {
            im3.e0("dialogFactory");
            throw null;
        }
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02Var, gk7Var);
        gk7Var.Z0 = x02Var;
        gk7Var.M0(header);
        gk7Var.L0(content);
        if (ct1.a != null) {
            if (defaultButton != null && defaultButton.length() != 0) {
                gk7Var.K0 = 0;
                gk7Var.L0 = defaultButton;
                ik7.b(b, new r02(x02Var, p02.Positive));
            }
            if (alternateButton != null && alternateButton.length() != 0) {
                gk7Var.O0 = 0;
                gk7Var.P0 = alternateButton;
                ik7.b(c, new r02(x02Var, p02.Negative));
            }
            if (otherButton != null && otherButton.length() != 0) {
                gk7Var.S0 = 0;
                gk7Var.T0 = otherButton;
                ik7.b(d, new r02(x02Var, p02.Neutral));
            }
            ik7.b(e, new r02(x02Var, p02.Cancelled));
        }
        gk7Var.N0();
    }

    public static final void showToast(String text) {
        text.getClass();
        Context context = d82.M;
        if (context != null) {
            d82.u(context, text);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
    }

    public final void a(gk7 gk7Var, p02 p02Var) {
        x02 x02VarH0 = gk7Var.H0();
        jniOnClickCallback(x02VarH0.m, x02VarH0.n, p02Var.m);
        gk7Var.A0();
    }
}
