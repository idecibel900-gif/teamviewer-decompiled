package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.content.FileProvider;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class cd4 extends wk2 {
    public boolean v;
    public boolean w;
    public WeakReference x;

    @Override // o.wk2
    public final ct6 V0() {
        u32 u32Var = new u32(new vk2(this));
        this.x = new WeakReference(u32Var);
        return u32Var;
    }

    @Override // o.wk2
    public final String W0() {
        String strSubstring;
        String str = this.t;
        String string = Environment.getExternalStorageDirectory().toString();
        string.getClass();
        boolean zN = bc7.N(false, str, string);
        RemoteControlApplication remoteControlApplication = this.n;
        if (zN) {
            String string2 = remoteControlApplication.getString(R.string.tv_filetransfer_external_storage);
            string2.getClass();
            return bc7.L(str, string, string2);
        }
        File[] externalFilesDirs = remoteControlApplication.getExternalFilesDirs(null);
        externalFilesDirs.getClass();
        for (File file : externalFilesDirs) {
            if (file == null) {
                ye4.a.g("LocalFileTransferVM", "no external storage found");
                strSubstring = null;
            } else {
                String string3 = file.toString();
                string3.getClass();
                strSubstring = string3.substring(0, ub7.Z(string3, "/Android/", 0, false, 6));
            }
            if (strSubstring != null && bc7.N(false, str, strSubstring)) {
                String name = new File(strSubstring).getName();
                name.getClass();
                return bc7.L(str, strSubstring, name);
            }
        }
        return str;
    }

    @Override // o.wk2
    public final ArrayList X0() {
        bd4 bd4Var = bd4.k;
        if (bd4Var == null) {
            bd4Var = new bd4();
            bd4.k = bd4Var;
        }
        Collection arrayList = bd4Var.b;
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList();
        }
        return new ArrayList(arrayList);
    }

    @Override // o.wk2
    public final boolean a1() {
        return this.w;
    }

    @Override // o.wk2
    public final boolean b1() {
        return this.v;
    }

    @Override // o.wk2
    public final boolean c1() {
        if (im3.n(this.t, "")) {
            ik2 ik2Var = (ik2) this.u.get();
            if (ik2Var == null) {
                return false;
            }
            ik2Var.P0();
            return true;
        }
        String str = this.t;
        f30 f30Var = this.f2421o;
        if (f30Var.l(str).size() == 1) {
            this.t = "";
            o1("", new xk1(this, (byte) 18));
            return true;
        }
        String strH = f30Var.h(this.t);
        strH.getClass();
        this.t = strH;
        o1(strH, new xk1(this, (byte) 18));
        return true;
    }

    @Override // o.wk2
    public final void d1() {
        n1(true, false);
    }

    @Override // o.wk2
    public final void e1() {
        n1(true, true);
    }

    @Override // o.wk2
    public final void f1() {
        n1(false, false);
    }

    @Override // o.wk2
    public final void g1(String str, xk1 xk1Var) {
        str.getClass();
        o1(str, xk1Var);
    }

    @Override // o.wk2
    public final void h1(nk7 nk7Var) {
        Uri uriC;
        List<ResolveInfo> listQueryIntentActivities;
        RemoteControlApplication remoteControlApplication = this.n;
        Uri uriFromFile = Uri.fromFile(new File(nk7Var.f1575o));
        uriFromFile.getClass();
        String path = uriFromFile.getPath();
        Intent intent = null;
        if (path != null) {
            File file = new File(path);
            if (file.exists()) {
                try {
                    uriC = FileProvider.c(remoteControlApplication, remoteControlApplication.getPackageName() + ".filetransfer", file);
                } catch (IllegalArgumentException e) {
                    ua5.v("Error message ", e.getMessage(), "FileTransferIntentHelper");
                    uriC = null;
                }
                if (uriC != null) {
                    intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(uriC);
                    intent.setFlags(3);
                    try {
                        if (Build.VERSION.SDK_INT >= 33) {
                            listQueryIntentActivities = remoteControlApplication.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
                            listQueryIntentActivities.getClass();
                        } else {
                            listQueryIntentActivities = remoteControlApplication.getPackageManager().queryIntentActivities(intent, 65536);
                            listQueryIntentActivities.getClass();
                        }
                        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                        while (it.hasNext()) {
                            remoteControlApplication.grantUriPermission(it.next().activityInfo.packageName, uriC, 3);
                        }
                    } catch (ActivityNotFoundException unused) {
                        ye4.a("FileManager", "Could not query activity for this intent");
                    }
                }
            }
        }
        if (intent == null) {
            return;
        }
        try {
            ik2 ik2Var = (ik2) this.u.get();
            if (ik2Var != null) {
                ik2Var.y0(Intent.createChooser(intent, ik2Var.I(R.string.tv_filetransfer_filechooser_title)));
            }
        } catch (ActivityNotFoundException unused2) {
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_filetransfer_noactfound);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
        }
    }

    @Override // o.wk2
    public final void i1(boolean z) {
        this.w = z;
    }

    @Override // o.wk2
    public final void j1(boolean z) {
        this.v = z;
    }

    @Override // o.wk2
    public final void k1(ArrayList arrayList) {
        bd4 bd4Var = bd4.k;
        if (bd4Var == null) {
            bd4Var = new bd4();
            bd4.k = bd4Var;
        }
        bd4Var.b = arrayList;
    }

    @Override // o.wk2
    public final boolean l1() {
        bd4 bd4Var = bd4.k;
        if (bd4Var == null) {
            bd4Var = new bd4();
            bd4.k = bd4Var;
        }
        return bd4Var.b.isEmpty();
    }

    @Override // o.wk2
    public final void m1() {
        o1(this.t, new xk1(this, (byte) 18));
    }

    public final void n1(boolean z, boolean z2) {
        WeakReference weakReference = this.x;
        u32 u32Var = weakReference != null ? (u32) weakReference.get() : null;
        if (u32Var != null) {
            u32Var.i = z;
            u32Var.j = z2;
            ReentrantLock reentrantLock = u32Var.g;
            reentrantLock.lock();
            try {
                u32Var.h.signal();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void o1(String str, xk1 xk1Var) {
        if (this.v || im3.n(str, "")) {
            ik2 ik2Var = (ik2) this.u.get();
            if (im3.n(str, this.t) && ik2Var != null && ik2Var.E0 == null) {
                this.r = true;
            }
            str.getClass();
            this.t = str;
            if (ik2Var == null) {
                return;
            }
            ik2Var.O0();
            ik2Var.Q0();
            f30 f30Var = this.f2421o;
            if (f30Var.j()) {
                ListView listView = ik2Var.v0;
                if (listView != null) {
                    listView.startAnimation(AnimationUtils.loadAnimation(ik2Var.C(), R.anim.fade_out));
                    ListView listView2 = ik2Var.v0;
                    if (listView2 != null) {
                        listView2.setVisibility(4);
                    }
                }
                String str2 = this.t;
                str2.getClass();
                this.s = true;
                f30Var.k(str2, xk1Var);
            }
        }
    }
}
