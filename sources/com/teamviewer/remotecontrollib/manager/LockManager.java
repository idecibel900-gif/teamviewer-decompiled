package com.teamviewer.remotecontrollib.manager;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import o.ae;
import o.de4;
import o.fx3;
import o.iu;
import o.k41;
import o.t60;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/teamviewer/remotecontrollib/manager/LockManager;", "", "o/de4", "appInBackgroundCallback", "Lo/de4;", "RemoteControlLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LockManager {
    public final RemoteControlApplication a;
    private final de4 appInBackgroundCallback;
    public final SharedPreferences b;
    public long c;
    public final int d;
    public boolean e;
    public boolean f;

    public LockManager(ae aeVar, RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences) {
        aeVar.getClass();
        sharedPreferences.getClass();
        this.a = remoteControlApplication;
        this.b = sharedPreferences;
        this.d = 33023;
        this.f = a();
        de4 de4Var = new de4(this);
        this.appInBackgroundCallback = de4Var;
        k41 k41Var = new k41(this, (byte) 1);
        ((LinkedHashSet) aeVar.c).add(new WeakReference(de4Var));
        sharedPreferences.registerOnSharedPreferenceChangeListener(k41Var);
        if ((!a()) && sharedPreferences.getBoolean("lock_enabled", false)) {
            fx3.q(sharedPreferences, "lock_enabled", false);
        }
    }

    public final boolean a() {
        return new iu(new t60(this.a)).g() == 0;
    }

    public final boolean b() {
        boolean zA = a();
        SharedPreferences sharedPreferences = this.b;
        boolean z = zA & sharedPreferences.getBoolean("lock_enabled", false);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        String string = sharedPreferences.getString("lock_timeout_value", "0");
        return (!(jElapsedRealtime < (string != null ? Long.parseLong(string) : 0L))) & z;
    }
}
