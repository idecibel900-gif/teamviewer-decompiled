package com.teamviewer.remotecontrolviewlib.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.au2;
import o.aw;
import o.be8;
import o.bf1;
import o.ca6;
import o.ck3;
import o.cr;
import o.ct1;
import o.f75;
import o.fx3;
import o.gk7;
import o.h57;
import o.hk0;
import o.hk7;
import o.hm3;
import o.ik2;
import o.ik7;
import o.im3;
import o.j93;
import o.m26;
import o.m6;
import o.nk2;
import o.ok2;
import o.p02;
import o.pn5;
import o.r02;
import o.r10;
import o.s7;
import o.sd8;
import o.tk2;
import o.u7;
import o.uj2;
import o.ut2;
import o.ve8;
import o.vj2;
import o.vn4;
import o.vt1;
import o.w10;
import o.w86;
import o.wt3;
import o.x02;
import o.xa3;
import o.xj2;
import o.xk1;
import o.ya3;
import o.ye4;
import o.zg2;

/* JADX INFO: loaded from: classes.dex */
public final class FileTransferActivity extends m6 {
    public static final /* synthetic */ int T = 0;
    public ya3 N = ya3.Unknown;
    public xj2 O;
    public final uj2 P;
    public final uj2 Q;
    public final vj2 R;
    public final vj2 S;

    /* JADX WARN: Type inference failed for: r0v1, types: [o.uj2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.uj2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.vj2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.vj2] */
    public FileTransferActivity() {
        final byte b = 0;
        this.P = new DialogInterface.OnClickListener(this) { // from class: o.uj2
            public final /* synthetic */ FileTransferActivity n;

            {
                this.n = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                byte b2 = b;
                FileTransferActivity fileTransferActivity = this.n;
                switch (b2) {
                    case 0:
                        int i2 = FileTransferActivity.T;
                        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + fileTransferActivity.getApplicationContext().getPackageName()));
                        if (intent.resolveActivity(fileTransferActivity.getPackageManager()) != null) {
                            fileTransferActivity.startActivity(intent);
                            return;
                        } else {
                            ye4.c("FileTransferActivity", "Failed to grant storage permission");
                            return;
                        }
                    default:
                        int i3 = FileTransferActivity.T;
                        dialogInterface.dismiss();
                        fileTransferActivity.N = ya3.Deny;
                        xj2 xj2Var = fileTransferActivity.O;
                        if (xj2Var != null) {
                            xj2Var.V0();
                            return;
                        } else {
                            im3.e0("fileTransferActivityViewModel");
                            throw null;
                        }
                }
            }
        };
        final byte b2 = 1;
        this.Q = new DialogInterface.OnClickListener(this) { // from class: o.uj2
            public final /* synthetic */ FileTransferActivity n;

            {
                this.n = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                byte b3 = b2;
                FileTransferActivity fileTransferActivity = this.n;
                switch (b3) {
                    case 0:
                        int i2 = FileTransferActivity.T;
                        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + fileTransferActivity.getApplicationContext().getPackageName()));
                        if (intent.resolveActivity(fileTransferActivity.getPackageManager()) != null) {
                            fileTransferActivity.startActivity(intent);
                            return;
                        } else {
                            ye4.c("FileTransferActivity", "Failed to grant storage permission");
                            return;
                        }
                    default:
                        int i3 = FileTransferActivity.T;
                        dialogInterface.dismiss();
                        fileTransferActivity.N = ya3.Deny;
                        xj2 xj2Var = fileTransferActivity.O;
                        if (xj2Var != null) {
                            xj2Var.V0();
                            return;
                        } else {
                            im3.e0("fileTransferActivityViewModel");
                            throw null;
                        }
                }
            }
        };
        this.R = new hk7(this) { // from class: o.vj2
            public final /* synthetic */ FileTransferActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b;
                FileTransferActivity fileTransferActivity = this.b;
                switch (b3) {
                    case 0:
                        int i = FileTransferActivity.T;
                        fileTransferActivity.N = ya3.SecondRequest;
                        hm3.A(fileTransferActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                        gk7Var.A0();
                        return;
                    default:
                        int i2 = FileTransferActivity.T;
                        gk7Var.A0();
                        fileTransferActivity.N = ya3.Deny;
                        xj2 xj2Var = fileTransferActivity.O;
                        if (xj2Var != null) {
                            xj2Var.V0();
                            return;
                        } else {
                            im3.e0("fileTransferActivityViewModel");
                            throw null;
                        }
                }
            }
        };
        this.S = new hk7(this) { // from class: o.vj2
            public final /* synthetic */ FileTransferActivity b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b2;
                FileTransferActivity fileTransferActivity = this.b;
                switch (b3) {
                    case 0:
                        int i = FileTransferActivity.T;
                        fileTransferActivity.N = ya3.SecondRequest;
                        hm3.A(fileTransferActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                        gk7Var.A0();
                        return;
                    default:
                        int i2 = FileTransferActivity.T;
                        gk7Var.A0();
                        fileTransferActivity.N = ya3.Deny;
                        xj2 xj2Var = fileTransferActivity.O;
                        if (xj2Var != null) {
                            xj2Var.V0();
                            return;
                        } else {
                            im3.e0("fileTransferActivityViewModel");
                            throw null;
                        }
                }
            }
        };
    }

    public final void L(boolean z) {
        ut2 ut2VarF = D().F("file_transfer_fragment_tag");
        ut2VarF.getClass();
        if (!(((ik2) ut2VarF) instanceof ok2)) {
            int i = ok2.X0;
            ok2 ok2VarM = cr.m(z);
            w10 w10Var = new w10(D());
            w10Var.k(R.id.filetransfer_main, ok2VarM, "file_transfer_fragment_tag");
            w10Var.f();
            return;
        }
        int i2 = nk2.b1;
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("checkable", z);
        bundle.putString("directory", null);
        nk2 nk2Var = new nk2();
        nk2Var.u0(bundle);
        w10 w10Var2 = new w10(D());
        w10Var2.k(R.id.filetransfer_main, nk2Var, "file_transfer_fragment_tag");
        w10Var2.f();
    }

    @Override // android.app.Activity
    public final void finish() {
        zg2 zg2Var = zg2.H0;
        if (zg2Var == null) {
            zg2Var = new zg2();
            zg2.H0 = zg2Var;
        }
        zg2Var.A0();
        super.finish();
    }

    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        final View viewFindViewById;
        final View viewFindViewById2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_file_transfer);
        au2 au2Var = vt1.c;
        if (au2Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        byte b = 3;
        m26 m26Var = new m26(au2Var, b);
        ve8 ve8VarO = o();
        bf1 bf1VarK = h57.k(this);
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, m26Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(xj2.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        xj2 xj2Var = (xj2) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.O = xj2Var;
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        boolean zJ = ca6Var.j();
        if (!zJ) {
            tk2 tk2Var = xj2Var.p;
            xa3 xa3Var = xa3.p;
            if (((xa3) tk2Var.c) == null) {
                tk2Var.c = xa3Var;
            }
        }
        if (!zJ) {
            finish();
            return;
        }
        xj2 xj2Var2 = this.O;
        Object obj = null;
        if (xj2Var2 == null) {
            im3.e0("fileTransferActivityViewModel");
            throw null;
        }
        xj2Var2.q = new WeakReference(this);
        I((Toolbar) findViewById(R.id.toolbar));
        ck3 ck3VarH = H();
        if (ck3VarH == null && !new j93(this).W()) {
            ye4.c("ToolbarActivityDelegate", "Could not find action bar!");
            ck3VarH = null;
        }
        boolean z = false;
        if (ck3VarH != null) {
            ck3VarH.n0(false);
        }
        View viewFindViewById3 = findViewById(R.id.filetransfer_coordinator);
        if (viewFindViewById3 != null && (viewFindViewById = findViewById(R.id.app_bar_layout)) != null && (viewFindViewById2 = findViewById(R.id.filetransfer_main)) != null) {
            final int paddingLeft = viewFindViewById.getPaddingLeft();
            final int paddingTop = viewFindViewById.getPaddingTop();
            final int paddingRight = viewFindViewById.getPaddingRight();
            final int paddingBottom = viewFindViewById.getPaddingBottom();
            final int paddingLeft2 = viewFindViewById2.getPaddingLeft();
            final int paddingTop2 = viewFindViewById2.getPaddingTop();
            final int paddingRight2 = viewFindViewById2.getPaddingRight();
            final int paddingBottom2 = viewFindViewById2.getPaddingBottom();
            f75 f75Var = new f75() { // from class: o.wj2
                @Override // o.f75
                public final sk8 t(View view, sk8 sk8Var) {
                    int i = FileTransferActivity.T;
                    view.getClass();
                    nj3 nj3VarI = sk8Var.a.i(519);
                    nj3VarI.getClass();
                    viewFindViewById.setPadding(paddingLeft, paddingTop + nj3VarI.b, paddingRight, paddingBottom);
                    viewFindViewById2.setPadding(paddingLeft2 + nj3VarI.a, paddingTop2, paddingRight2 + nj3VarI.c, paddingBottom2 + nj3VarI.d);
                    return sk8Var;
                }
            };
            WeakHashMap weakHashMap = be8.a;
            sd8.c(viewFindViewById3, f75Var);
            viewFindViewById3.requestApplyInsets();
        }
        if (bundle == null) {
            boolean z2 = true;
            if (getIntent() != null && getIntent().getBundleExtra("activity_navigation_bundle") != null && ((bundleExtra = getIntent().getBundleExtra("activity_navigation_bundle")) == null || !bundleExtra.getBoolean("checkable"))) {
                z2 = false;
            }
            w10 w10Var = new w10(D());
            int i = ok2.X0;
            w10Var.k(R.id.filetransfer_main, cr.m(z2), "file_transfer_fragment_tag");
            w10Var.f();
        } else {
            aw awVar = ya3.n;
            int i2 = bundle.getInt("permission_request_state");
            awVar.getClass();
            for (Object obj2 : ya3.v) {
                if (((ya3) obj2).m == i2) {
                    obj = obj2;
                    break;
                }
            }
            ya3 ya3Var = (ya3) obj;
            if (ya3Var == null) {
                ya3Var = ya3.Unknown;
            }
            this.N = ya3Var;
        }
        if (c().b) {
            return;
        }
        c().b(new r10(b, this, z));
    }

    @Override // o.xt2, o.my0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (1 != i) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        if (this.O == null) {
            im3.e0("fileTransferActivityViewModel");
            throw null;
        }
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(strArr[i2]) && iArr[i2] == 0) {
                this.N = ya3.Allow;
                return;
            }
        }
        if (this.N != ya3.FirstRequest || !hm3.C(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            this.N = ya3.Deny;
            xj2 xj2Var = this.O;
            if (xj2Var != null) {
                xj2Var.V0();
                return;
            } else {
                im3.e0("fileTransferActivityViewModel");
                throw null;
            }
        }
        this.N = ya3.Rationale;
        String str = getResources().getString(R.string.tv_no_storage_permission_grant_text) + "\n\n" + getResources().getString(R.string.tv_no_storage_permission_grant_additional_text);
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.a1 = false;
        gk7Var.L0(str);
        gk7Var.K0 = R.string.tv_no_storage_permission_grant_action;
        gk7Var.O0 = R.string.tv_no_storage_permission_deny_rationale;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            xk1.M(this.R, new r02(gk7Var, p02.Positive));
        }
        if (xk1Var != null) {
            xk1.M(this.S, new r02(gk7Var, p02.Negative));
        }
        gk7.O0(gk7Var, this);
    }

    @Override // o.ei7, o.xt2, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT > 29) {
            if (Environment.isExternalStorageManager()) {
                return;
            }
            final byte b = 0;
            new Handler(getMainLooper()).postDelayed(new Runnable(this) { // from class: o.tj2
                public final /* synthetic */ FileTransferActivity n;

                {
                    this.n = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b2 = b;
                    ya3 ya3Var = ya3.FirstRequest;
                    FileTransferActivity fileTransferActivity = this.n;
                    switch (b2) {
                        case 0:
                            int i = FileTransferActivity.T;
                            fileTransferActivity.N = ya3Var;
                            nd ndVar = new nd(fileTransferActivity);
                            jd jdVar = (jd) ndVar.f1562o;
                            jdVar.d = jdVar.a.getText(R.string.tv_storage_permission_grant_title);
                            jdVar.f = jdVar.a.getText(R.string.tv_storage_permission_grant_text);
                            uj2 uj2Var = fileTransferActivity.P;
                            jdVar.g = jdVar.a.getText(R.string.tv_no_storage_permission_grant_action);
                            jdVar.h = uj2Var;
                            uj2 uj2Var2 = fileTransferActivity.Q;
                            jdVar.i = jdVar.a.getText(R.string.tv_cancel);
                            jdVar.j = uj2Var2;
                            ndVar.e().show();
                            break;
                        default:
                            int i2 = FileTransferActivity.T;
                            fileTransferActivity.N = ya3Var;
                            hm3.A(fileTransferActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                            break;
                    }
                }
            }, 100L);
            return;
        }
        xj2 xj2Var = this.O;
        if (xj2Var == null) {
            im3.e0("fileTransferActivityViewModel");
            throw null;
        }
        ya3 ya3Var = this.N;
        ya3Var.getClass();
        RemoteControlApplication remoteControlApplication = xj2Var.n;
        remoteControlApplication.getClass();
        if (hm3.h(remoteControlApplication, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 && ya3Var == ya3.Unknown) {
            final byte b2 = 1;
            new Handler(getMainLooper()).postDelayed(new Runnable(this) { // from class: o.tj2
                public final /* synthetic */ FileTransferActivity n;

                {
                    this.n = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    ya3 ya3Var2 = ya3.FirstRequest;
                    FileTransferActivity fileTransferActivity = this.n;
                    switch (b3) {
                        case 0:
                            int i = FileTransferActivity.T;
                            fileTransferActivity.N = ya3Var2;
                            nd ndVar = new nd(fileTransferActivity);
                            jd jdVar = (jd) ndVar.f1562o;
                            jdVar.d = jdVar.a.getText(R.string.tv_storage_permission_grant_title);
                            jdVar.f = jdVar.a.getText(R.string.tv_storage_permission_grant_text);
                            uj2 uj2Var = fileTransferActivity.P;
                            jdVar.g = jdVar.a.getText(R.string.tv_no_storage_permission_grant_action);
                            jdVar.h = uj2Var;
                            uj2 uj2Var2 = fileTransferActivity.Q;
                            jdVar.i = jdVar.a.getText(R.string.tv_cancel);
                            jdVar.j = uj2Var2;
                            ndVar.e().show();
                            break;
                        default:
                            int i2 = FileTransferActivity.T;
                            fileTransferActivity.N = ya3Var2;
                            hm3.A(fileTransferActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
                            break;
                    }
                }
            }, 100L);
        }
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putInt("permission_request_state", this.N.ordinal());
        super.onSaveInstanceState(bundle);
    }

    @Override // o.ei7, o.xr, o.xt2, android.app.Activity
    public final void onStart() {
        super.onStart();
        s7 s7Var = u7.g;
        vn4.g0().b(this);
    }

    @Override // o.ei7, o.xr, o.xt2, android.app.Activity
    public final void onStop() {
        super.onStop();
        s7 s7Var = u7.g;
        vn4.g0().c(this);
    }
}
