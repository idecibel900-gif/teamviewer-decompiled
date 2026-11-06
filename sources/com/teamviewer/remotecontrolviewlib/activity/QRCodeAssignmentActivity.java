package com.teamviewer.remotecontrolviewlib.activity;

import android.content.Intent;
import android.os.Bundle;
import java.util.List;
import o.ei7;
import o.ny0;
import o.ox5;
import o.qf0;
import o.x72;
import o.yy0;

/* JADX INFO: loaded from: classes.dex */
public final class QRCodeAssignmentActivity extends ei7 {
    public static final /* synthetic */ int N = 0;

    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List listM;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (listM = intent.getStringArrayListExtra("groupIds")) == null) {
            Intent intent2 = getIntent();
            listM = qf0.M(intent2 != null ? intent2.getStringExtra("groupId") : null);
        }
        x72.a(this);
        ny0.a(this, new yy0(1800461120, true, new ox5(this, listM, (byte) 0)));
    }
}
