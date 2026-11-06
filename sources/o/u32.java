package o;

import android.content.SharedPreferences;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final class u32 implements ct6 {
    public String a;
    public String b;
    public nm c = new nm((byte) 3);
    public FileOutputStream d;
    public final io.sentry.android.core.d e;
    public boolean f;
    public final ReentrantLock g;
    public final Condition h;
    public boolean i;
    public boolean j;
    public final WeakReference k;

    public u32(vk2 vk2Var) {
        io.sentry.android.core.d dVar = io.sentry.android.core.d.t;
        if (dVar == null) {
            dVar = new io.sentry.android.core.d();
            dVar.m = "";
            dVar.n = "";
            dVar.f100o = "";
            dVar.p = "";
            dVar.q = "";
            dVar.r = "";
            ea6 ea6Var = ea6.m;
            dVar.i(ea6Var);
            dVar.s = ea6Var;
            io.sentry.android.core.d.t = dVar;
        }
        this.e = dVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.g = reentrantLock;
        this.h = reentrantLock.newCondition();
        this.k = new WeakReference(vk2Var);
    }

    @Override // o.ct6
    public final void a(String str) {
        this.a = str;
    }

    @Override // o.ct6
    public final synchronized bt6 b(at6 at6Var, ug2 ug2Var, z08 z08Var) {
        ik2 ik2Var;
        if (at6Var != at6.m) {
            if (at6Var != at6.f361o) {
                if (at6Var == at6.n) {
                }
            }
            return d(z08Var);
        }
        switch (ug2Var == null ? -1 : t32.a[ug2Var.ordinal()]) {
            case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                vk2 vk2Var = (vk2) this.k.get();
                if (vk2Var != null) {
                    vk2Var.a();
                }
                return j();
            case 1:
                return j();
            case 2:
                z08Var.getClass();
                vk2 vk2Var2 = (vk2) this.k.get();
                if (vk2Var2 != null && (ik2Var = (ik2) vk2Var2.a.u.get()) != null) {
                    bu7.MAIN.a(new pc0(ik2Var, z08Var));
                }
                return j();
            case 3:
                z08Var.getClass();
                return f(z08Var);
            case 4:
                z08Var.getClass();
                return h(z08Var);
            case 5:
                z08Var.getClass();
                return e(z08Var);
            case 6:
                return g();
        }
        return c();
    }

    public final bt6 c() {
        return this.f ? bt6.n : bt6.m;
    }

    public final bt6 d(z08 z08Var) {
        k();
        this.f = true;
        FileOutputStream fileOutputStream = this.d;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                ye4.c("DownloadCallbackHandler", "handleCancelOrError(): Cancel: can't close filestream");
            }
            nm nmVar = this.c;
            if (nmVar == null) {
                ye4.c("DownloadCallbackHandler", "handleCancelOrError(): invalid state for cancel or error handling.");
                return c();
            }
            if (nmVar != null) {
                String str = (String) this.e.m;
                ArrayList arrayList = nmVar.a;
                while (!arrayList.isEmpty()) {
                    String strL = nmVar.l(str);
                    if (z08Var != null) {
                        ca6 ca6Var = ca6.g;
                        if (ca6Var == null) {
                            ca6Var = new ca6();
                            ca6.g = ca6Var;
                        }
                        if (bc7.G(false, ca6Var.h(z08Var.a), strL)) {
                            break;
                        }
                    }
                }
            }
        }
        return j();
    }

    public final bt6 e(z08 z08Var) {
        if (z08Var.g == 0 && this.d != null) {
            try {
                String str = this.a + File.separatorChar + this.b;
                FileOutputStream fileOutputStream = new FileOutputStream(str, false);
                if (io.sentry.d5.c().l().isTracingEnabled()) {
                    fileOutputStream = new io.sentry.instrumentation.file.h(io.sentry.instrumentation.file.h.e(new File(str), fileOutputStream, false));
                }
                this.d = fileOutputStream;
            } catch (FileNotFoundException unused) {
                ye4.c("DownloadCallbackHandler", "Resetting file stream failed!");
            }
        }
        FileOutputStream fileOutputStream2 = this.d;
        if (fileOutputStream2 == null) {
            return c();
        }
        vk2 vk2Var = (vk2) this.k.get();
        if (vk2Var != null) {
            vk2Var.c(z08Var);
        }
        try {
            fileOutputStream2.write(z08Var.i);
            return j();
        } catch (IOException unused2) {
            if (!this.f) {
                ye4.c("DownloadCallbackHandler", "handlePublishFileChunk(): PublishFileChunk IOException");
                i(o1.n);
                k();
            }
            return c();
        }
    }

    public final bt6 f(z08 z08Var) {
        String str;
        nm nmVar = this.c;
        if (nmVar == null) {
            ye4.c("DownloadCallbackHandler", "handlePublishNewDirectory(): invalid state for new directory command.");
            return c();
        }
        if (nmVar != null) {
            String str2 = this.a;
            String str3 = (String) this.e.m;
            ArrayList arrayList = nmVar.a;
            z08Var.getClass();
            while (!arrayList.isEmpty()) {
                String strL = nmVar.l(str3);
                ca6 ca6Var = ca6.g;
                if (ca6Var == null) {
                    ca6Var = new ca6();
                    ca6.g = ca6Var;
                }
                if (bc7.G(false, ca6Var.h(z08Var.a), strL)) {
                    break;
                }
            }
            String strM = nmVar.m(str2);
            ca6 ca6Var2 = ca6.g;
            if (ca6Var2 == null) {
                ca6Var2 = new ca6();
                ca6.g = ca6Var2;
            }
            String strP = ca6Var2.p(z08Var.a);
            arrayList.add(strP);
            str = strM + strP + "/";
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        File file = new File(str);
        if (file.isDirectory() && file.canWrite()) {
            ye4.a("DownloadCallbackHandler", "handlePublishNewDirectory: Directory already existes.");
            return j();
        }
        if (file.mkdirs()) {
            ye4.a("DownloadCallbackHandler", "handlePublishNewDirectory: creating Dir: ".concat(str));
            return j();
        }
        ye4.c("DownloadCallbackHandler", "handlePublishNewDirectory: creating Dir failed");
        i(o1.m);
        return c();
    }

    public final bt6 g() {
        boolean z;
        k();
        FileOutputStream fileOutputStream = this.d;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                ye4.c("DownloadCallbackHandler", "handleReplyEndFileTransfer(): ReplyEndFileTransfer can't close FileOutputStream");
                z = false;
            }
        }
        z = true;
        this.d = null;
        this.c = null;
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        int i = sharedPreferences.getInt("FILETRANSFER_LOAD_COUNT", 0) + 1;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putInt("FILETRANSFER_LOAD_COUNT", i);
        editorEdit.commit();
        return z ? j() : c();
    }

    public final bt6 h(z08 z08Var) {
        long length;
        if (this.c == null) {
            ye4.c("DownloadCallbackHandler", "handleRequestNewFile(): invalid state for new file command.");
            return c();
        }
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        this.b = ca6Var.p(z08Var.a);
        WeakReference weakReference = this.k;
        vk2 vk2Var = (vk2) weakReference.get();
        if (vk2Var != null) {
            vk2Var.c(z08Var);
        }
        nm nmVar = this.c;
        boolean z = true;
        if (nmVar != null) {
            String str = (String) this.e.m;
            ArrayList arrayList = nmVar.a;
            while (!arrayList.isEmpty()) {
                String strL = nmVar.l(str);
                ca6 ca6Var2 = ca6.g;
                if (ca6Var2 == null) {
                    ca6Var2 = new ca6();
                    ca6.g = ca6Var2;
                }
                String strH = ca6Var2.h(z08Var.a);
                if (strH.length() > 1 && bc7.G(false, strH, str)) {
                    strH = strH.substring(0, strH.length() - 1);
                }
                if (bc7.G(false, strH, strL)) {
                    break;
                }
            }
        }
        this.j = false;
        nm nmVar2 = this.c;
        String strM = nmVar2 != null ? nmVar2.m(this.a) : null;
        File file = new File(ua5.z(strM, this.b));
        if (file.exists()) {
            ye4.c("DownloadCallbackHandler", "File already exists");
            length = file.length();
            final boolean z2 = length < z08Var.f;
            if (vk2Var != null) {
                vk2Var.b();
            }
            vk2 vk2Var2 = (vk2) weakReference.get();
            if (vk2Var2 != null) {
                wk2 wk2Var = vk2Var2.a;
                final String str2 = this.b;
                if (str2 == null) {
                    str2 = "";
                }
                final ik2 ik2Var = (ik2) wk2Var.u.get();
                if (ik2Var != null) {
                    bu7.MAIN.a(new Runnable() { // from class: o.uk2
                        @Override // java.lang.Runnable
                        public final void run() {
                            x02 x02VarA = ik7.a();
                            gk7 gk7Var = new gk7();
                            fx3.o(1, "dialogId", x02VarA, gk7Var);
                            gk7Var.Z0 = x02VarA;
                            ik2 ik2Var2 = ik2Var;
                            ik2Var2.u0 = gk7Var;
                            gk7Var.a1 = false;
                            gk7Var.M0(str2);
                            gk7Var.H0 = R.string.tv_filetransfer_dialog_file_exists_header;
                            gk7Var.K0 = R.string.tv_filetransfer_dialog_file_exists_overwrite;
                            gk7Var.O0 = R.string.tv_filetransfer_dialog_file_exists_skip;
                            xk1 xk1Var = ct1.a;
                            if (xk1Var != null) {
                                xk1.M(ik2Var2.J0, new r02(gk7Var, p02.Positive));
                            }
                            if (xk1Var != null) {
                                xk1.M(ik2Var2.H0, new r02(gk7Var, p02.Negative));
                            }
                            if (z2) {
                                gk7Var.S0 = R.string.tv_filetransfer_dialog_file_exists_resume;
                                if (xk1Var != null) {
                                    xk1.M(ik2Var2.I0, new r02(gk7Var, p02.Neutral));
                                }
                            }
                            bu7.MAIN.a(new pc0(gk7Var, (byte) 10));
                        }
                    });
                }
                ReentrantLock reentrantLock = this.g;
                reentrantLock.lock();
                try {
                    this.h.await();
                    z = false;
                } catch (InterruptedException unused) {
                    ye4.c("DownloadCallbackHandler", "showExistingFileDialogBlocking(): Interrupt Exception on waiting");
                    ik2 ik2Var2 = (ik2) wk2Var.u.get();
                    if (ik2Var2 != null) {
                        bu7.MAIN.a(new ak2(ik2Var2, (byte) 5));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (z) {
                return c();
            }
            if (vk2Var != null) {
                vk2Var.a();
            }
            if (!this.i) {
                return c();
            }
        } else {
            length = 0;
        }
        try {
            FileOutputStream fileOutputStream = this.d;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    ye4.c("DownloadCallbackHandler", "handleRequestNewFile(): RequestNewFile Closing FileOutputStream failed");
                }
            }
            boolean z3 = this.j;
            this.d = io.sentry.config.a.f(file, new FileOutputStream(file, z3), z3);
            if (this.j) {
                z08Var.g = length;
                z08Var.a = strM + this.b;
                ye4.a("DownloadCallbackHandler", "handleRequestNewFile: resuming File: " + strM + this.b);
            } else {
                ye4.a("DownloadCallbackHandler", "handleRequestNewFile: creating File: " + strM + this.b);
            }
            return j();
        } catch (FileNotFoundException unused3) {
            ye4.c("DownloadCallbackHandler", "handleRequestNewFile(): RequestNewFile FileNotFoundException " + strM);
            k();
            return c();
        }
    }

    public final void i(o1 o1Var) {
        ik2 ik2Var;
        vk2 vk2Var = (vk2) this.k.get();
        if (vk2Var == null || (ik2Var = (ik2) vk2Var.a.u.get()) == null) {
            return;
        }
        if (o1Var == o1.m) {
            bu7.MAIN.a(new ed(ik2Var, (byte) 3));
        } else if (o1Var == o1.n) {
            bu7.MAIN.a(new ed(ik2Var, (byte) 4));
        }
    }

    public final bt6 j() {
        return this.f ? bt6.n : bt6.f455o;
    }

    public final void k() {
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        ca6Var.b = new ArrayList();
        vk2 vk2Var = (vk2) this.k.get();
        if (vk2Var != null) {
            ik2 ik2Var = (ik2) vk2Var.a.u.get();
            if (ik2Var != null) {
                bu7.MAIN.a(new ak2(ik2Var, (byte) 3));
            }
            vk2Var.b();
        }
    }
}
