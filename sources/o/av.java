package o;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class av {
    public final SharedPreferences a;
    public final me1 b;
    public final ou c;
    public final wk0 d;
    public hv e;

    public av(SharedPreferences sharedPreferences, me1 me1Var) {
        ou ouVar;
        ou ouVar2 = jk0.f1175o;
        if (ouVar2 == null) {
            synchronized (ou.class) {
                if (jk0.f1175o == null) {
                    jk0.f1175o = (ou) ((kh7) new d11(ou.class, "https://download.teamviewer.com/api/Version/mobile/", new zq((byte) 5)).r).getValue();
                }
                ouVar = jk0.f1175o;
                ouVar.getClass();
            }
            ouVar2 = ouVar;
        }
        wk0 wk0Var = new wk0((byte) 21);
        me1Var.getClass();
        this.a = sharedPreferences;
        this.b = me1Var;
        this.c = ouVar2;
        this.d = wk0Var;
    }

    public final void a(hv hvVar, String str, xa xaVar, l8 l8Var, Function0 function0) {
        String str2 = hvVar != null ? hvVar.m : null;
        ye4 ye4Var = ye4.a;
        if (str2 == null || ub7.b0(str2)) {
            ye4Var.g("AppUpdateDelegate", "Latest app version is empty");
            function0.a();
            return;
        }
        String str3 = hvVar.n;
        if (str3 == null || ub7.b0(str3)) {
            ye4Var.g("AppUpdateDelegate", "Download url not available");
            function0.a();
            return;
        }
        String str4 = hvVar.p;
        if (str4 == null) {
            str4 = "";
        }
        boolean z = str.compareTo(str4) < 0;
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("LAST_CHECKED_VERSION_NAME", "");
        boolean z2 = sharedPreferences.getBoolean("UPDATE_CANCELLED_BY_USER", false);
        if (str.compareTo(str2) >= 0) {
            l8Var.invoke(Boolean.valueOf(str2.equals(string)));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove("LAST_CHECKED_VERSION_NAME");
            editorEdit.apply();
            return;
        }
        if (im3.n(string, str2) && z2 && !z) {
            return;
        }
        xaVar.invoke(Boolean.valueOf(z), hvVar);
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString("LAST_CHECKED_VERSION_NAME", str2);
        editorEdit2.remove("UPDATE_CANCELLED_BY_USER");
        editorEdit2.apply();
    }
}
