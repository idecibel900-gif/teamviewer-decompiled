package com.teamviewer.remotecontrolviewlib.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import o.au6;
import o.bt1;
import o.im3;
import o.s7;
import o.u7;
import o.vn4;
import o.xt2;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    public final String m = "NotificationHandlerActivity";

    public final boolean a() {
        s7 s7Var = u7.g;
        xt2 xt2Var = vn4.g0().d;
        String str = this.m;
        ye4 ye4Var = ye4.a;
        if (xt2Var != null) {
            ye4Var.g(str, "A session is already running!");
            return false;
        }
        au6 au6Var = bt1.b;
        if (au6Var == null) {
            im3.e0("instance");
            throw null;
        }
        if (!au6Var.b.get() && !au6Var.a.get()) {
            return true;
        }
        ye4Var.g(str, "A session is already running!");
        return false;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        super.onCreate(bundle);
        String str = this.m;
        ye4.a(str, "onCreate");
        Intent intent = getIntent();
        if (intent == null || (extras2 = intent.getExtras()) == null || !extras2.getBoolean("SHOW_CHAT", false)) {
            Intent intent2 = getIntent();
            if (intent2 != null && (extras = intent2.getExtras()) != null && extras.getBoolean("SHOW_MONITORINGOVERVIEW", false) && a()) {
                Intent intent3 = new Intent(this, (Class<?>) MainActivity.class);
                intent3.setAction("android.intent.action.MAIN");
                intent3.addCategory("android.intent.category.LAUNCHER");
                intent3.addFlags(268435456);
                intent3.addFlags(67108864);
                intent3.putExtra("SHOW_MONITORINGOVERVIEW", true);
                startActivity(intent3);
            }
        } else if (a()) {
            Intent intent4 = new Intent(this, (Class<?>) MainActivity.class);
            intent4.setAction("android.intent.action.MAIN");
            intent4.addCategory("android.intent.category.LAUNCHER");
            intent4.addFlags(268435456);
            intent4.addFlags(67108864);
            if ((intent4.getFlags() & 1048576) != 1048576) {
                intent4.putExtra("SHOW_CHAT", true);
                Intent intent5 = getIntent();
                intent4.putExtra("CHATROOMID", (intent5 == null || (extras3 = intent5.getExtras()) == null) ? null : extras3.getString("CHATROOMID"));
            }
            startActivity(intent4);
        }
        ye4.a(str, "ending chat notification handler activity");
        finish();
    }
}
