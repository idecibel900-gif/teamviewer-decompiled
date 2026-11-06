package o;

import com.teamviewer.teamviewerlib.settings.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class sv {
    public static final kh7 b = new kh7(new zq(10));
    public final tv a;

    public sv() {
        Settings.i.n();
        this.a = (tv) ((kh7) new d11(tv.class, fx3.g("https://", Settings.a(gv6.MACHINE, ov6.P_USE_TESTMASTER_KEYS) ? "uat" : "www", ".teamviewer.com/api/v1/"), new zq((byte) 11)).r).getValue();
    }
}
