package com.teamviewer.remotecontrolviewlib.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.teamviewer.remotecontrolviewlib.activity.LockScreenActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import o.a7;
import o.ei7;
import o.ge4;
import o.he4;
import o.kh7;
import o.m5;
import o.r10;

/* JADX INFO: loaded from: classes.dex */
public final class LockScreenActivity extends ei7 {
    public static final /* synthetic */ int O = 0;
    public final kh7 N = new kh7(new ge4(this, (byte) 1));

    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lockscreen);
        Button button = (Button) findViewById(R.id.reset_lock);
        final byte b = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: o.fe4
            public final /* synthetic */ LockScreenActivity n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                LockScreenActivity lockScreenActivity = this.n;
                switch (b2) {
                    case 0:
                        int i = LockScreenActivity.O;
                        new AlertDialog.Builder(lockScreenActivity).setTitle(R.string.tv_lockscreen_reset_dialog).setMessage(R.string.tv_lockscreen_reset_description).setCancelable(false).setPositiveButton(R.string.tv_options_never, new z(lockScreenActivity, (byte) 4)).setNegativeButton(R.string.tv_cancel, (DialogInterface.OnClickListener) null).show();
                        break;
                    default:
                        int i2 = LockScreenActivity.O;
                        ((he4) lockScreenActivity.N.getValue()).V0(lockScreenActivity, new ge4(lockScreenActivity, (byte) 2));
                        break;
                }
            }
        });
        TextView textView = (TextView) findViewById(R.id.reset_description);
        Button button2 = (Button) findViewById(R.id.retry_auth);
        final byte b2 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: o.fe4
            public final /* synthetic */ LockScreenActivity n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                LockScreenActivity lockScreenActivity = this.n;
                switch (b3) {
                    case 0:
                        int i = LockScreenActivity.O;
                        new AlertDialog.Builder(lockScreenActivity).setTitle(R.string.tv_lockscreen_reset_dialog).setMessage(R.string.tv_lockscreen_reset_description).setCancelable(false).setPositiveButton(R.string.tv_options_never, new z(lockScreenActivity, (byte) 4)).setNegativeButton(R.string.tv_cancel, (DialogInterface.OnClickListener) null).show();
                        break;
                    default:
                        int i2 = LockScreenActivity.O;
                        ((he4) lockScreenActivity.N.getValue()).V0(lockScreenActivity, new ge4(lockScreenActivity, (byte) 2));
                        break;
                }
            }
        });
        kh7 kh7Var = this.N;
        ((he4) kh7Var.getValue()).r.observe(this, new a7(new m5((Object) button2, (Object) button, (Object) textView, (byte) 27), (byte) 4));
        ((he4) kh7Var.getValue()).V0(this, new ge4(this, (byte) 0));
        if (c().b) {
            return;
        }
        c().a(this, new r10((byte) 6, this, false));
    }
}
