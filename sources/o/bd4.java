package o;

import android.content.Context;
import android.os.Environment;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class bd4 extends f30 {
    public static bd4 k;
    public String c;
    public final io.sentry.android.core.d d;
    public final LinkedList e;
    public ct6 f;
    public boolean g;
    public final xt6 h;
    public String i;
    public final mu j;

    public bd4() {
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
        this.d = dVar;
        this.e = new LinkedList();
        this.g = true;
        au6 au6Var = bt1.b;
        if (au6Var == null) {
            im3.e0("instance");
            throw null;
        }
        this.h = au6Var;
        mu muVar = new mu(this, (byte) 7);
        this.j = muVar;
        if (EventHub.e.f().c(EventType.EVENT_FILETRANSFER_DOWNLOAD_COMPLETED, muVar)) {
            return;
        }
        ye4.c("LocalFileHandler", "LocalFileHandler: registering DownloadComplete failed");
    }

    @Override // o.f30
    public final void a() {
        this.b = new ArrayList();
        this.g = true;
        k = null;
        this.i = null;
        if (EventHub.e.f().f(this.j)) {
            return;
        }
        ye4.c("LocalFileHandler", "LocalFileHandler: unregistering DownloadComplete failed");
    }

    @Override // o.f30
    public final boolean b(String str, String str2) {
        try {
            Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9|\\-_\\s]{1,255}+$");
            patternCompile.getClass();
            if (patternCompile.matcher(str2).matches()) {
                String str3 = str + "/" + str2;
                if (i()) {
                    File file = new File(str3);
                    if (!file.exists() && file.mkdirs()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (SecurityException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            ye4.c("LocalFileHandler", message);
            return false;
        }
    }

    @Override // o.f30
    public final boolean c(String str) {
        str.getClass();
        if (!i()) {
            ye4.c("LocalFileHandler", "DeleteFile: External storage is not writable");
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            if (file.exists()) {
                return file.delete();
            }
            return false;
        }
        Stack stack = new Stack();
        stack.push(str);
        while (true) {
            if (stack.isEmpty()) {
                return true;
            }
            File file2 = new File((String) stack.peek());
            String[] list = file2.list();
            if (list != null) {
                if (!(list.length == 0)) {
                    for (String str2 : list) {
                        File file3 = new File(file2.getAbsolutePath() + "/" + str2);
                        if (file3.exists()) {
                            if (file3.isDirectory()) {
                                stack.push(file3.getAbsolutePath());
                            } else {
                                file3.delete();
                            }
                        }
                    }
                }
            }
            file2.delete();
            stack.pop();
        }
    }

    @Override // o.f30
    public final String g() {
        String str = this.i;
        return str == null ? "" : str;
    }

    @Override // o.f30
    public final void k(String str, xk1 xk1Var) {
        Context context;
        Context context2;
        Context context3;
        str.getClass();
        if (!str.equals("")) {
            bu7.CACHEDTHREADPOOL.a(new io.sentry.android.core.internal.util.j((Object) this, (Object) str, (Object) xk1Var, (byte) 12));
            return;
        }
        ArrayList arrayList = new ArrayList();
        jk0 jk0Var = jk0.s;
        synchronized (jk0Var) {
            context = jk0.t;
        }
        context.getClass();
        String string = context.getString(R.string.tv_filetransfer_external_storage);
        string.getClass();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        absolutePath.getClass();
        arrayList.add(new nk7(24, string, absolutePath));
        String str2 = Environment.DIRECTORY_MUSIC;
        str2.getClass();
        lv1.C(arrayList, str2, R.string.tv_filetransfer_my_music);
        String str3 = Environment.DIRECTORY_MOVIES;
        str3.getClass();
        lv1.C(arrayList, str3, R.string.tv_filetransfer_my_movies);
        String str4 = Environment.DIRECTORY_PICTURES;
        str4.getClass();
        lv1.C(arrayList, str4, R.string.tv_filetransfer_my_pictures);
        String str5 = Environment.DIRECTORY_DCIM;
        str5.getClass();
        lv1.C(arrayList, str5, R.string.tv_filetransfer_my_photos);
        String str6 = Environment.DIRECTORY_DOWNLOADS;
        str6.getClass();
        lv1.C(arrayList, str6, R.string.tv_filetransfer_my_downloads);
        String absolutePath2 = Environment.getExternalStorageDirectory().getAbsolutePath();
        synchronized (jk0Var) {
            context2 = jk0.t;
        }
        nk7 nk7Var = null;
        File[] externalFilesDirs = context2 != null ? context2.getExternalFilesDirs(null) : null;
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && file.exists()) {
                    String absolutePath3 = file.getAbsolutePath();
                    absolutePath3.getClass();
                    LinkedList linkedListL = l(absolutePath3);
                    if (!linkedListL.isEmpty()) {
                        nk7 nk7Var2 = (nk7) linkedListL.get(0);
                        if (!im3.n(nk7Var2.f1575o, absolutePath2)) {
                            nk7Var = nk7Var2;
                            break;
                        }
                    } else {
                        ye4.c("LocalFileHandler", "getSdFile: no sd paths obtained");
                    }
                }
            }
        }
        if (nk7Var != null) {
            synchronized (jk0.s) {
                context3 = jk0.t;
            }
            context3.getClass();
            String string2 = context3.getString(R.string.tv_filetransfer_sd_card);
            string2.getClass();
            nk7Var.m = string2;
            nk7Var.n = lk7.m;
            arrayList.add(nk7Var);
        }
        xk1Var.U(jj2.m, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    @Override // o.f30
    public final LinkedList l(String str) {
        String externalStorageState;
        File file;
        File parentFile;
        String name;
        str.getClass();
        LinkedList linkedList = new LinkedList();
        String str2 = "unknown";
        try {
            externalStorageState = Environment.getExternalStorageState();
            externalStorageState.getClass();
        } catch (NullPointerException unused) {
            ye4.c("StorageHelper", "external storage check failed");
            externalStorageState = "unknown";
        }
        if (!"mounted".equals(externalStorageState)) {
            try {
                String externalStorageState2 = Environment.getExternalStorageState();
                externalStorageState2.getClass();
                str2 = externalStorageState2;
            } catch (NullPointerException unused2) {
                ye4.c("StorageHelper", "external storage check failed");
            }
            if ("mounted_ro".equals(str2)) {
                if (!str.equals("")) {
                    file = new File(str);
                    linkedList.add(new nk7(file));
                    while (true) {
                        parentFile = file.getParentFile();
                        if (parentFile != null) {
                            name = parentFile.getName();
                        } else {
                            name = null;
                        }
                        if (!im3.n(name, "mnt") && !im3.n(file.getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath())) {
                            File parentFile2 = file.getParentFile();
                            if (!im3.n(parentFile2 != null ? parentFile2.getName() : null, "")) {
                                File parentFile3 = file.getParentFile();
                                if (im3.n(parentFile3 != null ? parentFile3.getName() : null, "storage")) {
                                    break;
                                }
                                File parentFile4 = file.getParentFile();
                                if (parentFile4 != null) {
                                    linkedList.addFirst(new nk7(parentFile4));
                                    file = parentFile4;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        } else if (!str.equals("")) {
            file = new File(str);
            linkedList.add(new nk7(file));
            while (true) {
                parentFile = file.getParentFile();
                if (parentFile != null) {
                    name = parentFile.getName();
                } else {
                    name = null;
                }
                if (!im3.n(name, "mnt")) {
                    break;
                }
                break;
                break;
            }
        }
        return linkedList;
    }

    @Override // o.f30
    public final void m(String str, ct6 ct6Var) {
        List listK;
        String[] strArr;
        str.getClass();
        ct6Var.getClass();
        if (!i() || !((zt6) this.h).b.get()) {
            ye4.c("LocalFileHandler", "downloadFile(): external storage not writable/session not running");
            return;
        }
        ca6 ca6Var = ca6.g;
        if (ca6Var == null) {
            ca6Var = new ca6();
            ca6.g = ca6Var;
        }
        List list = ca6Var.b;
        if (list.isEmpty()) {
            ye4.c("LocalFileHandler", "loadFile():dropped on wrong side");
            return;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = ((nk7) it.next()).f1575o;
            io.sentry.android.core.d dVar = this.d;
            dVar.getClass();
            str2.getClass();
            int iOrdinal = ((ea6) dVar.s).ordinal();
            if (iOrdinal == 0) {
                Pattern patternCompile = Pattern.compile((String) dVar.f100o);
                patternCompile.getClass();
                ub7.k0(0);
                Matcher matcher = patternCompile.matcher(str2);
                if (matcher.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList.add(str2.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList.add(str2.subSequence(iEnd, str2.length()).toString());
                    listK = arrayList;
                } else {
                    listK = qf0.K(str2.toString());
                }
                String[] strArr2 = (String[]) listK.toArray(new String[0]);
                strArr2[0] = ua5.z(strArr2[0], (String) dVar.p);
                strArr = strArr2;
            } else {
                if (iOrdinal != 1) {
                    gk0.s();
                    return;
                }
                strArr = new String[]{"/", str2.substring(1, str2.length())};
            }
            if (strArr.length != 2) {
                ye4.c("LocalFileHandler", "loadFile: could not split drive and path");
            } else {
                String str3 = strArr[0];
                if (map.get(str3) == null) {
                    map.put(str3, new ArrayList());
                }
                Object obj = map.get(str3);
                obj.getClass();
                ((List) obj).add(strArr[1]);
            }
        }
        for (String str4 : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            Object obj2 = map.get(str4);
            obj2.getClass();
            Iterator it2 = ((List) obj2).iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
                sb.append("\u0001\u0001");
            }
            sb.append("CW\u0003\u0001\u0002\u0003");
            this.e.offer(new ad4(str, str4, sb.toString()));
        }
        p(str, ct6Var);
    }

    @Override // o.f30
    public final boolean n(String str, String str2) {
        str.getClass();
        if (!i()) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^(?=.{1,255}$)[a-zA-Z0-9|\\-_\\s]+\\.?([a-zA-Z0-9]+)?$");
        patternCompile.getClass();
        if (!patternCompile.matcher(str2).matches()) {
            return false;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        return file.renameTo(new File((parentFile != null ? parentFile.getAbsolutePath() : null) + "/" + str2));
    }

    @Override // o.f30
    public final void o(String str) {
        str.getClass();
        this.i = str;
    }

    public final void p(String str, ct6 ct6Var) {
        if (str == null || str.length() == 0) {
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_filetransfer_error_drop_root);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
            ye4.a("LocalFileHandler", "startDownload: tried to download to landing page");
            return;
        }
        zt6 zt6Var = (zt6) this.h;
        if (!zt6Var.b.get()) {
            ye4.c("LocalFileHandler", "startDownload(): no session running");
            return;
        }
        et6 et6Var = (et6) zt6Var.f;
        this.c = str;
        this.f = ct6Var;
        if (et6Var == null) {
            ye4.c("LocalFileHandler", "startDownload: session is NULL");
            return;
        }
        ad4 ad4Var = (ad4) this.e.poll();
        if (ad4Var != null) {
            ct6Var.b(at6.m, null, null);
            ct6Var.a(ad4Var.a + "/");
            String str2 = ad4Var.b;
            String str3 = ad4Var.c;
            if (et6Var.D != null) {
                ye4.c("SessionFiletransfer", "startDownload: cannot start download - other operation is running");
                ct6Var.b(at6.n, null, null);
                return;
            }
            if (str2 != null) {
                et6Var.A = ct6Var;
                et6Var.D = ah2.Download;
                ug2 ug2Var = ug2.RequestOutgoingTransfer;
                ug2Var.getClass();
                ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
                ak7Var.d(vg2.SessionId, 1001);
                ak7Var.z(KnownStreams.DefaultStream_File);
                ak7Var.f(vg2.Directory, str2);
                ak7Var.f(vg2.FileList, str3);
                et6Var.f(ak7Var, false);
            }
        }
    }
}
