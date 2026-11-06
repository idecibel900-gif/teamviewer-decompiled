package o;

import android.content.SharedPreferences;
import android.os.Handler;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj4 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ MainActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f2614o;

    public /* synthetic */ yj4(MainActivity mainActivity, String str, byte b) {
        this.m = b;
        this.n = mainActivity;
        this.f2614o = str;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    @Override // java.lang.Runnable
    public final void run() {
        Object yn4Var;
        od odVar;
        byte b = this.m;
        String str = this.f2614o;
        MainActivity mainActivity = this.n;
        switch (b) {
            case 0:
                int i = MainActivity.w0;
                mainActivity.b0(w05.Chat, new hr2(str, (byte) 7));
                return;
            default:
                pb3 pb3Var = mainActivity.Y;
                boolean zH = bc7.H(false, pb3Var != null ? ((nk4) pb3Var).L : null, str);
                pb3 pb3Var2 = mainActivity.Y;
                if (!zH) {
                    if (pb3Var2 != null) {
                        ((nk4) pb3Var2).I = false;
                    }
                    if (pb3Var2 != null) {
                        ((nk4) pb3Var2).Y0(mainActivity);
                        return;
                    }
                    return;
                }
                byte b2 = 1;
                if (pb3Var2 != null) {
                    nk4 nk4Var = (nk4) pb3Var2;
                    if (nk4Var.P) {
                        String str2 = nk4Var.M;
                        if (str2 != null) {
                            Long l = nk4Var.N;
                            if (l == null || l.longValue() == 0) {
                                l = null;
                            }
                            yn4Var = new yn4(str2, l);
                        } else {
                            yn4Var = null;
                        }
                    } else if (pb3Var2 != null) {
                        yn4Var = ((nk4) pb3Var2).H;
                    } else {
                        yn4Var = null;
                    }
                } else if (pb3Var2 != null) {
                    yn4Var = ((nk4) pb3Var2).H;
                } else {
                    yn4Var = null;
                }
                if (mainActivity.Z) {
                    return;
                }
                od odVarE = new nd(mainActivity).e();
                mainActivity.a0 = odVarE;
                odVarE.create();
                od odVar2 = mainActivity.a0;
                if (odVar2 != null) {
                    odVar2.setContentView(R.layout.layout_shortcut_session_wait);
                }
                od odVar3 = mainActivity.a0;
                if (odVar3 != null) {
                    odVar3.setCancelable(true);
                }
                od odVar4 = mainActivity.a0;
                if (odVar4 != null) {
                    odVar4.setOnCancelListener(new rl0(mainActivity, (byte) 2));
                }
                pb3 pb3Var3 = mainActivity.Y;
                if (pb3Var3 != null && ((nk4) pb3Var3).I && (odVar = mainActivity.a0) != null && !odVar.isShowing()) {
                    od odVar5 = mainActivity.a0;
                    if (odVar5 != null) {
                        odVar5.show();
                    }
                    mainActivity.Z = true;
                }
                pb3 pb3Var4 = mainActivity.Y;
                if (pb3Var4 == null || ((nk4) pb3Var4).K) {
                    return;
                }
                SharedPreferences sharedPreferences = h57.a;
                if (sharedPreferences == null) {
                    im3.e0("sharedPreferences");
                    throw null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt("CURRENT_TAB", 0);
                editorEdit.apply();
                new Handler(mainActivity.getMainLooper()).postDelayed(new ak4(mainActivity, yn4Var, b2), 5000L);
                return;
        }
    }
}
