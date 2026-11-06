package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ca6 extends f30 {
    public static ca6 g;
    public boolean c = true;
    public final io.sentry.android.core.d d;
    public final xt6 e;
    public String f;

    public ca6() {
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
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            this.e = au6Var;
        } else {
            im3.e0("instance");
            throw null;
        }
    }

    @Override // o.f30
    public final void a() {
        this.b = new ArrayList();
        this.c = true;
        this.f = null;
        g = null;
    }

    @Override // o.f30
    public final String g() {
        String str = this.f;
        if (str == null) {
            return "";
        }
        str.getClass();
        return str;
    }

    @Override // o.f30
    public final String h(String str) {
        String strSubstring;
        if (str != null) {
            io.sentry.android.core.d dVar = this.d;
            if (dVar.k(str)) {
                if (!str.equals((String) dVar.r)) {
                    ea6 ea6Var = (ea6) dVar.s;
                    ea6 ea6Var2 = ea6.m;
                    if (ea6Var == ea6Var2) {
                        CharSequence charSequenceSubSequence = str.subSequence(((String) dVar.r).length(), str.length());
                        charSequenceSubSequence.getClass();
                        str = (String) charSequenceSubSequence;
                    }
                    String strJ0 = ub7.j0(str, (String) dVar.m);
                    int iE0 = ub7.e0(strJ0, 0, 6, (String) dVar.m);
                    strSubstring = iE0 > -1 ? strJ0.substring(0, iE0) : "";
                    return ((ea6) dVar.s) == ea6Var2 ? ((String) dVar.r).concat(strSubstring) : strSubstring;
                }
            } else if ((!bc7.G(false, str, (String) dVar.p) || bc7.G(false, str, (String) dVar.m)) && !str.equals((String) dVar.p)) {
                int iE1 = ub7.e0(ub7.j0(str, (String) dVar.m), 0, 6, (String) dVar.m);
                strSubstring = iE1 > -1 ? str.substring(0, iE1) : "";
                if (bc7.G(false, strSubstring, (String) dVar.q)) {
                    if (ea6.n != ((ea6) dVar.s)) {
                        return strSubstring.concat((String) dVar.m);
                    }
                }
                return strSubstring;
            }
        }
        return "";
    }

    @Override // o.f30
    public final boolean i() {
        return true;
    }

    @Override // o.f30
    public final boolean j() {
        mo7 mo7Var = ((zt6) this.e).f;
        return (mo7Var instanceof et6) && ((et6) mo7Var).M;
    }

    @Override // o.f30
    public final void k(String str, xk1 xk1Var) {
        str.getClass();
        zt6 zt6Var = (zt6) this.e;
        if (zt6Var.b.get()) {
            mo7 mo7Var = zt6Var.f;
            if (!(mo7Var instanceof et6)) {
                xk1Var.U(jj2.n, new ArrayList());
                ye4.c("RemoteFileHandler", "listDirectory(): no current session");
                return;
            }
            et6 et6Var = (et6) mo7Var;
            io.sentry.i5 i5Var = new io.sentry.i5(this, str, xk1Var, (byte) 8);
            if (et6Var.D != null) {
                i5Var.b(at6.n, null);
                return;
            }
            ug2 ug2Var = ug2.GetContents;
            ug2Var.getClass();
            ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
            ak7Var.d(vg2.SessionId, 1001);
            ak7Var.z(KnownStreams.DefaultStream_File);
            ak7Var.f(vg2.Directory, str);
            et6Var.z = i5Var;
            et6Var.f(ak7Var, false);
        }
    }

    @Override // o.f30
    public final LinkedList l(String str) {
        List listK;
        int size;
        str.getClass();
        io.sentry.android.core.d dVar = this.d;
        Pattern patternCompile = Pattern.compile((String) dVar.n);
        patternCompile.getClass();
        ub7.k0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listK = arrayList;
        } else {
            listK = qf0.K(str.toString());
        }
        LinkedList linkedList = new LinkedList();
        if (!str.equals("") && (size = listK.size() - 1) >= 0) {
            while (true) {
                int i = size - 1;
                String str2 = "";
                for (int i2 = 0; i2 < size; i2++) {
                    str2 = str2 + listK.get(i2) + ((String) dVar.m);
                }
                mk7 mk7Var = mk7.n;
                if (size > 0) {
                    linkedList.addFirst(new nk7((String) listK.get(size), str2 + listK.get(size) + ((String) dVar.m), lk7.m, mk7Var, 16));
                } else {
                    linkedList.addFirst(new nk7((String) listK.get(size), str2 + listK.get(size) + ((String) dVar.m), lk7.f1374o, mk7Var, 33554432));
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return linkedList;
    }

    @Override // o.f30
    public final void m(String str, ct6 ct6Var) {
        String string;
        String str2;
        List listK;
        List listK2;
        str.getClass();
        ct6Var.getClass();
        if (str.length() == 0) {
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_filetransfer_error_drop_root);
                return;
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                return;
            }
        }
        bd4 bd4Var = bd4.k;
        if (bd4Var == null) {
            bd4Var = new bd4();
            bd4.k = bd4Var;
        }
        List list = bd4Var.b;
        if (list.isEmpty()) {
            return;
        }
        Collections.sort(list, gj2.n);
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                zt6 zt6Var = (zt6) this.e;
                et6 et6Var = (et6) zt6Var.f;
                if (!zt6Var.b.get() || et6Var == null || map.isEmpty()) {
                    ye4.c("RemoteFileHandler", "startUpload(): can't upload file - no session running");
                    return;
                }
                String strConcat = str.concat((String) this.d.m);
                if (et6Var.D != null) {
                    ye4.c("SessionFiletransfer", "startUpload: cannot start upload - other operation is running");
                    ct6Var.b(at6.n, null, null);
                    return;
                }
                et6Var.F = strConcat;
                et6Var.G = map;
                et6Var.B = ct6Var;
                et6Var.D = ah2.Upload;
                z08 z08Var = new z08();
                Iterator it2 = map.values().iterator();
                long length = 0;
                long j = 0;
                while (it2.hasNext()) {
                    for (nk7 nk7Var : (List) it2.next()) {
                        length += new File(nk7Var.f1575o).length();
                        if (nk7Var.n == lk7.n) {
                            j++;
                        }
                    }
                }
                long[] jArr = {length, j};
                z08Var.c = jArr[0];
                z08Var.b = (int) jArr[1];
                et6Var.C = z08Var;
                ug2 ug2Var = ug2.RequestIncomingTransfer;
                ug2Var.getClass();
                ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
                ak7Var.d(vg2.SessionId, 1001);
                ak7Var.z(KnownStreams.DefaultStream_File);
                ak7Var.f(vg2.ServerPath, strConcat);
                Collection collectionValues = map.values();
                if (collectionValues == null) {
                    string = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    Iterator it3 = collectionValues.iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((List) it3.next()).iterator();
                        while (it4.hasNext()) {
                            sb.append(((nk7) it4.next()).f1575o);
                            sb.append("\u0001\u0001");
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("CW\u0003\u0001\u0002\u0003");
                    }
                    string = sb.toString();
                }
                ak7Var.f(vg2.FileList, string);
                et6Var.f(ak7Var, false);
                ct6Var.b(at6.m, ug2.RequestIncomingTransfer, et6Var.C);
                return;
            }
            nk7 nk7Var2 = (nk7) it.next();
            String str3 = nk7Var2.f1575o;
            if (bc7.G(false, str3, nk7Var2.m)) {
                List listN0 = ub7.n0(nk7Var2.f1575o, new String[]{nk7Var2.m}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listN0) {
                    if (!ub7.b0((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                str2 = (String) arrayList.get(0);
                listK = arrayList;
            } else {
                ye4.a("RemoteFileHandler", "loadFile(): copying special folder");
                Pattern patternCompile = Pattern.compile("/");
                patternCompile.getClass();
                str3.getClass();
                ub7.k0(0);
                Matcher matcher = patternCompile.matcher(str3);
                if (matcher.find()) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList2.add(str3.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
                    listK2 = arrayList2;
                } else {
                    listK2 = qf0.K(str3.toString());
                }
                if (listK2.isEmpty()) {
                    ye4.c("RemoteFileHandler", "loadFile(): can't parse selected file!");
                    return;
                }
                String strQuote = Pattern.quote((String) listK2.get(listK2.size() - 1));
                strQuote.getClass();
                Pattern patternCompile2 = Pattern.compile(strQuote);
                patternCompile2.getClass();
                ub7.k0(0);
                Matcher matcher2 = patternCompile2.matcher(str3);
                if (matcher2.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iEnd2 = 0;
                    do {
                        arrayList3.add(str3.subSequence(iEnd2, matcher2.start()).toString());
                        iEnd2 = matcher2.end();
                    } while (matcher2.find());
                    arrayList3.add(str3.subSequence(iEnd2, str3.length()).toString());
                    listK = arrayList3;
                } else {
                    listK = qf0.K(str3.toString());
                }
                str2 = (String) listK.get(0);
            }
            int size = listK.size();
            for (int i = 1; i < size; i++) {
                str2 = str2 + nk7Var2.m + listK.get(i);
            }
            List list2 = (List) map.get(str2);
            ArrayList arrayList4 = list2 != null ? new ArrayList(list2) : null;
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
            }
            str3.getClass();
            File file = new File(str3);
            if (file.exists()) {
                arrayList4.add(new nk7(file));
                if (file.isDirectory()) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(file);
                    while (!arrayList5.isEmpty()) {
                        File[] fileArrListFiles = ((File) arrayList5.remove(0)).listFiles();
                        if (fileArrListFiles != null) {
                            for (File file2 : fileArrListFiles) {
                                if (!file2.isHidden()) {
                                    if (file2.isDirectory()) {
                                        arrayList5.add(file2);
                                    }
                                    arrayList4.add(new nk7(file2));
                                }
                            }
                        }
                    }
                }
            } else {
                ye4.a.g("LocalFileHandler", "Trying to list non-existent file");
            }
            map.put(str2, arrayList4);
        }
    }

    @Override // o.f30
    public final void o(String str) {
        str.getClass();
        this.f = str;
    }

    public final String p(String str) {
        List listK;
        String str2;
        Context context;
        io.sentry.android.core.d dVar = this.d;
        str.getClass();
        if (dVar.k(str)) {
            io.sentry.android.core.d dVar2 = this.d;
            if (((ea6) dVar2.s) == ea6.m) {
                CharSequence charSequenceSubSequence = str.subSequence(((String) dVar2.r).length(), str.length());
                charSequenceSubSequence.getClass();
                str2 = (String) charSequenceSubSequence;
            } else {
                str2 = str;
            }
            if (str2.equals("")) {
                synchronized (jk0.s) {
                    context = jk0.t;
                }
                context.getClass();
                String string = context.getString(R.string.tv_filetransfer_my_network);
                string.getClass();
                return string;
            }
        }
        Pattern patternCompile = Pattern.compile((String) this.d.n);
        patternCompile.getClass();
        int iEnd = 0;
        ub7.k0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listK = arrayList;
        } else {
            listK = qf0.K(str.toString());
        }
        return !listK.isEmpty() ? (String) listK.get(listK.size() - 1) : (String) this.d.m;
    }
}
