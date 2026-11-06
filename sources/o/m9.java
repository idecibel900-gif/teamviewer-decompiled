package o;

import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m9 extends cx2 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ContentCaptureSession contentCaptureSessionE;
        Object value;
        p31 p31Var;
        Object value2;
        p31 p31Var2;
        Object value3;
        p31 p31Var3;
        Object value4;
        p31 p31Var4;
        Object value5;
        Object value6;
        Object value7;
        byte b = this.n;
        byte b2 = 9;
        byte b3 = 2;
        byte b4 = 3;
        byte b5 = 1;
        hc1 hc1Var = null;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((p9) this.receiver).V0();
                return f88Var;
            case 1:
                p9 p9Var = (p9) this.receiver;
                p9Var.X0(true);
                im3.R(e8.n(p9Var), p9Var.f1715o, null, new y0(p9Var, hc1Var, b3), 2);
                return f88Var;
            case 2:
                vb vbVar = (vb) this.receiver;
                vbVar.e1(true);
                im3.R(e8.n(vbVar), vbVar.r, null, new y0(vbVar, hc1Var, b4), 2);
                return f88Var;
            case 3:
                vb vbVar2 = (vb) this.receiver;
                n87 n87Var = vbVar2.y;
                if (n87Var != null) {
                    n87Var.j(null);
                }
                vbVar2.d1(true);
                vbVar2.y = im3.R(e8.n(vbVar2), vbVar2.r, null, new tb(vbVar2, null), 2);
                return f88Var;
            case 4:
                ((vb) this.receiver).X0(c27.a);
                return f88Var;
            case 5:
                View view = (View) this.receiver;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    b4.k(view);
                }
                if (i < 29 || (contentCaptureSessionE = eq.e(view)) == null) {
                    return null;
                }
                return new wk0(contentCaptureSessionE, view, b2);
            case 6:
                ((Runnable) this.receiver).run();
                return f88Var;
            case 7:
                ((g80) this.receiver).f870o.setValue(null);
                return f88Var;
            case 8:
                g80 g80Var = (g80) this.receiver;
                g80Var.f870o.setValue(null);
                if (g80Var.n) {
                    g80Var.p.setValue(Boolean.TRUE);
                } else {
                    g80Var.V0();
                }
                return f88Var;
            case ep1.b /* 9 */:
                ((g80) this.receiver).q.setValue(Boolean.FALSE);
                return f88Var;
            case ep1.c /* 10 */:
                ((g80) this.receiver).V0();
                return f88Var;
            case 11:
                g80 g80Var2 = (g80) this.receiver;
                g80Var2.p.setValue(Boolean.FALSE);
                g80Var2.q.setValue(Boolean.TRUE);
                return f88Var;
            case ep1.d /* 12 */:
                y31 y31Var = (y31) this.receiver;
                fx3.q(y31Var.s, "KEY_SHOW_QS_APP_CARD", false);
                l97 l97Var = y31Var.P;
                do {
                    value = l97Var.getValue();
                    p31Var = (p31) value;
                    p31Var.getClass();
                } while (!l97Var.j(value, p31.a(p31Var, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8386559)));
                return f88Var;
            case 13:
                y31 y31Var2 = (y31) this.receiver;
                SharedPreferences.Editor editorEdit = y31Var2.s.edit();
                editorEdit.getClass();
                editorEdit.putBoolean("KEY_SESSIONS_LIST_EXPANDED", !y31Var2.s.getBoolean("KEY_SESSIONS_LIST_EXPANDED", true));
                editorEdit.apply();
                l97 l97Var2 = y31Var2.P;
                do {
                    value2 = l97Var2.getValue();
                    p31Var2 = (p31) value2;
                    p31Var2.getClass();
                } while (!l97Var2.j(value2, p31.a(p31Var2, false, false, false, false, false, false, false, false, !((p31) y31Var2.Q.m.getValue()).i, false, false, false, null, null, null, false, false, 8388095)));
                return f88Var;
            case 14:
                y31 y31Var3 = (y31) this.receiver;
                SharedPreferences.Editor editorEdit2 = y31Var3.s.edit();
                editorEdit2.getClass();
                editorEdit2.putBoolean("KEY_RECENT_CONNECTIONS_LIST_EXPANDED", !y31Var3.s.getBoolean("KEY_RECENT_CONNECTIONS_LIST_EXPANDED", true));
                editorEdit2.apply();
                l97 l97Var3 = y31Var3.P;
                do {
                    value3 = l97Var3.getValue();
                    p31Var3 = (p31) value3;
                    p31Var3.getClass();
                } while (!l97Var3.j(value3, p31.a(p31Var3, false, false, false, false, false, false, false, false, false, !((p31) y31Var3.Q.m.getValue()).j, false, false, null, null, null, false, false, 8387583)));
                return f88Var;
            case 15:
                y31 y31Var4 = (y31) this.receiver;
                y31Var4.getClass();
                im3.R(e8.n(y31Var4), null, null, new v31(y31Var4, hc1Var, (byte) 7), 3);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((y31) this.receiver).o1();
                return f88Var;
            case 17:
                l97 l97Var4 = ((y31) this.receiver).P;
                do {
                    value4 = l97Var4.getValue();
                    p31Var4 = (p31) value4;
                    p31Var4.getClass();
                } while (!l97Var4.j(value4, p31.a(p31Var4, true, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, 8388606)));
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((y31) this.receiver).Z0();
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                y31 y31Var5 = (y31) this.receiver;
                y31Var5.getClass();
                im3.R(e8.n(y31Var5), null, null, new v31(y31Var5, hc1Var, b2), 3);
                return f88Var;
            case 20:
                y31 y31Var6 = (y31) this.receiver;
                y31Var6.getClass();
                im3.R(e8.n(y31Var6), null, null, new v31(y31Var6, hc1Var, (byte) 8), 3);
                return f88Var;
            case 21:
                return ((fp7) this.receiver).P();
            case 22:
                l97 l97Var5 = ((ru1) this.receiver).z;
                do {
                    value5 = l97Var5.getValue();
                } while (!l97Var5.j(value5, wt1.a((wt1) value5, false, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776959)));
                return f88Var;
            case 23:
                ((ru1) this.receiver).X0();
                return f88Var;
            case 24:
                ru1 ru1Var = (ru1) this.receiver;
                l97 l97Var6 = ru1Var.z;
                do {
                    value6 = l97Var6.getValue();
                } while (!l97Var6.j(value6, wt1.a((wt1) value6, false, null, null, false, false, false, false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776191)));
                im3.R(e8.n(ru1Var), null, null, new pt1(ru1Var, hc1Var, b5), 3);
                return f88Var;
            case 25:
                l97 l97Var7 = ((hz1) this.receiver).z;
                Boolean bool = Boolean.TRUE;
                l97Var7.getClass();
                l97Var7.l(null, bool);
                return f88Var;
            case 26:
                l97 l97Var8 = ((hz1) this.receiver).z;
                Boolean bool2 = Boolean.FALSE;
                l97Var8.getClass();
                l97Var8.l(null, bool2);
                return f88Var;
            case 27:
                l97 l97Var9 = ((hz1) this.receiver).r;
                ((j35) l97Var9.getValue()).getClass();
                l97Var9.l(null, new j35("", false, true, false, true));
                return f88Var;
            case 28:
                ((fx1) this.receiver).b1();
                return f88Var;
            default:
                l97 l97Var10 = ((fx1) this.receiver).n;
                do {
                    value7 = l97Var10.getValue();
                } while (!l97Var10.j(value7, gw1.a((gw1) value7, null, null, null, null, 14)));
                return f88Var;
        }
    }
}
