package com.teamviewer.remotecontrolviewlib.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.teamviewer.remotecontrolviewlib.service.ConditionalAccessAuthenticationService;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.Serializable;
import o.a21;
import o.c4;
import o.hm3;
import o.im3;
import o.j56;
import o.my0;
import o.ny0;
import o.s7;
import o.u7;
import o.us1;
import o.ux2;
import o.vn4;
import o.w11;
import o.x11;
import o.y0;
import o.y11;
import o.ye4;
import o.yy0;

/* JADX INFO: loaded from: classes.dex */
public final class ConditionalAccessAuthenticationResponseFeedbackActivity extends my0 {
    public static final /* synthetic */ int H = 0;

    public final void D(int i, ux2 ux2Var) {
        ux2 ux2Var2;
        ux2Var.Y(-12245519);
        int i2 = i & 1;
        if (ux2Var.N(i2, i2 != 0)) {
            ux2Var2 = ux2Var;
            hm3.a(R.color.conditional_access_authentication_feedback_approved, R.drawable.ic_round_check_circle_outline, R.string.conditional_access_authentication_feedback_approved, null, ux2Var2, 0);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new w11(this, i, (byte) 2);
        }
    }

    public final void E(int i, ux2 ux2Var) {
        ux2 ux2Var2;
        ux2Var.Y(1841345165);
        int i2 = i & 1;
        if (ux2Var.N(i2, i2 != 0)) {
            ux2Var2 = ux2Var;
            hm3.a(R.color.conditional_access_authentication_feedback_denied, R.drawable.ic_round_close_circle_outline, R.string.conditional_access_authentication_feedback_denied, null, ux2Var2, 0);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new w11(this, i, (byte) 3);
        }
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Serializable serializableExtra;
        getWindow().addFlags(768);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("SESSION_ID", 0L);
        if (longExtra == 0) {
            ye4.c("ConditionalAccessAuthenticationResponseFeedbackActivity", "Invalid session Id");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (i >= 34) {
            serializableExtra = c4.g(intent, x11.class);
        } else {
            serializableExtra = intent.getSerializableExtra("RESPONSE");
            if (!x11.class.isInstance(serializableExtra)) {
                serializableExtra = null;
            }
        }
        x11 x11Var = (x11) serializableExtra;
        int i2 = x11Var == null ? -1 : y11.a[x11Var.ordinal()];
        if (i2 == 1) {
            int i3 = ConditionalAccessAuthenticationService.q;
            Intent intent2 = new Intent(this, (Class<?>) ConditionalAccessAuthenticationService.class);
            intent2.putExtra("SESSION_ID", longExtra);
            intent2.putExtra("RESPONSE", a21.m);
            startService(intent2);
            ny0.a(this, new yy0(-1116912398, true, new w11(this, (byte) 0)));
            return;
        }
        if (i2 != 2) {
            ye4.c("ConditionalAccessAuthenticationResponseFeedbackActivity", "Invalid response");
            finish();
            return;
        }
        int i4 = ConditionalAccessAuthenticationService.q;
        Intent intent3 = new Intent(this, (Class<?>) ConditionalAccessAuthenticationService.class);
        intent3.putExtra("SESSION_ID", longExtra);
        intent3.putExtra("RESPONSE", a21.n);
        startService(intent3);
        ny0.a(this, new yy0(42488411, true, new w11(this, (byte) 1)));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        s7 s7Var = u7.g;
        vn4.g0().a(this);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        s7 s7Var = u7.g;
        vn4.g0().b(this);
        im3.R(us1.B(this), null, null, new y0(this, null, (byte) 8), 3);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        s7 s7Var = u7.g;
        vn4.g0().c(this);
    }
}
