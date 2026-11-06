package o;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import com.teamviewer.teamviewerlib.swig.tvnetwork.NetworkLogFilePathProvider;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class yl7 implements k10, vc1, cu0, lg1, bd6, rb8, ce1, c57, ja0 {
    public final /* synthetic */ byte m;
    public static final yl7 n = new yl7(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final yl7 f2619o = new yl7(1);
    public static final tp p = new tp();
    public static final yl7 q = new yl7(3);
    public static final yl7 r = new yl7(4);
    public static final hk0 s = new hk0(5);
    public static final qh t = new qh(0);
    public static final qh u = new qh(1);
    public static final qh v = new qh(2);
    public static final yl7 w = new yl7(7);
    public static final yl7 x = new yl7(8);
    public static final yl7 y = new yl7(9);
    public static final yl7 z = new yl7(10);
    public static final yl7 A = new yl7(11);
    public static final yl7 B = new yl7(12);
    public static final yl7 C = new yl7(13);
    public static final yl7 D = new yl7(14);
    public static final /* synthetic */ yl7 E = new yl7(15);
    public static final yl7 F = new yl7(16);
    public static final qe5 G = new qe5("NoMotion", 0);
    public static final qe5 H = new qe5("AnimateBounds", 3);
    public static final qe5 I = new qe5("EnterFromLeft", 2);
    public static final qe5 J = new qe5("EnterFromRight", 2);
    public static final qe5 K = new qe5("EnterFromLeftDelayed", 2);
    public static final qe5 L = new qe5("EnterFromRightDelayed", 2);
    public static final qe5 M = new qe5("ExitToLeft", 1);
    public static final qe5 N = new qe5("ExitToRight", 1);
    public static final qe5 O = new qe5("EnterWithExpand", 2);
    public static final qe5 P = new qe5("ExitWithShrink", 1);
    public static final qe5 Q = new qe5("EnterAsModal", 6);
    public static final qe5 R = new qe5("ExitAsModal", 5);
    public static final yl7 S = new yl7(18);
    public static final yl7 T = new yl7(19);
    public static final yl7 U = new yl7(20);
    public static final yl7 V = new yl7(21);
    public static final yl7 W = new yl7(22);
    public static final yl7 X = new yl7(23);
    public static final yl7 Y = new yl7(24);
    public static final yl7 Z = new yl7(25);
    public static final hl8 a0 = new hl8();

    public /* synthetic */ yl7(byte b) {
        this.m = b;
    }

    public static final boolean e(xs0 xs0Var, i07 i07Var) {
        if (xs0Var.U(i07Var)) {
            return true;
        }
        if (!(i07Var instanceof am0)) {
            return false;
        }
        h58 h58VarY = xs0Var.Y(xs0Var.d0((am0) i07Var));
        return !xs0Var.o(h58VarY) && xs0Var.U(xs0Var.z(xs0Var.p0(h58VarY)));
    }

    public static final boolean f(xs0 xs0Var, i48 i48Var, i07 i07Var, i07 i07Var2, boolean z2) {
        Collection<sz3> collectionK = xs0Var.K(i07Var);
        if ((collectionK instanceof Collection) && collectionK.isEmpty()) {
            return false;
        }
        for (sz3 sz3Var : collectionK) {
            if (im3.n(xs0Var.c(sz3Var), xs0Var.b0(i07Var2))) {
                return true;
            }
            if (z2 && s(f2619o, i48Var, i07Var2, sz3Var)) {
                return true;
            }
        }
        return false;
    }

    public static List h(i48 i48Var, i07 i07Var, l48 l48Var) {
        o67 o67VarJ;
        h48 h48Var = h48.c;
        xs0 xs0Var = i48Var.c;
        xs0Var.t(i07Var, l48Var);
        if (xs0Var.g(l48Var) || !xs0Var.R(i07Var)) {
            if (!xs0Var.r(l48Var)) {
                u17 u17Var = new u17();
                i48Var.c();
                ArrayDeque arrayDeque = i48Var.f;
                arrayDeque.getClass();
                v17 v17Var = i48Var.g;
                v17Var.getClass();
                arrayDeque.push(i07Var);
                while (!arrayDeque.isEmpty()) {
                    if (v17Var.a() > 1000) {
                        StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                        sb.append(i07Var);
                        gk0.q(sb, ". Supertypes = ", lv0.t0(v17Var, null, null, null, null, 63));
                        return null;
                    }
                    i07 i07Var2 = (i07) arrayDeque.pop();
                    i07Var2.getClass();
                    if (v17Var.add(i07Var2)) {
                        i07 i07VarG0 = xs0Var.g0(i07Var2);
                        if (i07VarG0 == null) {
                            i07VarG0 = i07Var2;
                        }
                        if (xs0Var.X(xs0Var.b0(i07VarG0), l48Var)) {
                            u17Var.add(i07VarG0);
                            o67VarJ = h48Var;
                        } else {
                            o67VarJ = xs0Var.o0(i07VarG0) == 0 ? h48.b : xs0Var.j(i07VarG0);
                        }
                        o67 o67Var = o67VarJ.equals(h48Var) ? null : o67VarJ;
                        if (o67Var != null) {
                            Iterator it = xs0Var.v0(xs0Var.b0(i07Var2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(o67Var.o(i48Var, (sz3) it.next()));
                            }
                        }
                    }
                }
                i48Var.a();
                return u17Var;
            }
            if (xs0Var.X(xs0Var.b0(i07Var), l48Var)) {
                g07 g07VarG0 = xs0Var.g0(i07Var);
                if (g07VarG0 != null) {
                    i07Var = g07VarG0;
                }
                return qf0.K(i07Var);
            }
        }
        return ea2.m;
    }

    public static List i(i48 i48Var, i07 i07Var, l48 l48Var) {
        List listH = h(i48Var, i07Var, l48Var);
        xs0 xs0Var = i48Var.c;
        if (listH.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                f48 f48VarK0 = xs0Var.k0((i07) obj);
                int iD = xs0Var.D(f48VarK0);
                int i = 0;
                while (true) {
                    if (i >= iD) {
                        arrayList.add(obj);
                        break;
                    }
                    if (xs0Var.s0(xs0Var.p0(xs0Var.i(f48VarK0, i))) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listH;
    }

    public static cq7 k(int i, ux2 ux2Var) {
        return o(((rn4) ux2Var.j(un4.a)).a, ux2Var);
    }

    public static cq7 l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, ux2 ux2Var, int i, int i2) {
        long j10 = rv0.h;
        return o(((rn4) ux2Var.j(un4.a)).a, ux2Var).b(j10, j10, (i & 4) != 0 ? j10 : j, j10, (i & 16) != 0 ? j10 : j2, (i & 32) != 0 ? j10 : j3, j10, j10, j10, j10, null, (i & 2048) != 0 ? j10 : j4, (i & 4096) != 0 ? j10 : j5, (i & 8192) != 0 ? j10 : j6, j10, j10, j10, j10, j10, j10, j10, (2097152 & i) != 0 ? j10 : j7, j10, j10, j10, (i & 33554432) != 0 ? j10 : j8, j10, j10, j10, j10, j10, j10, j10, (i2 & 4) != 0 ? j10 : j9, j10, j10, j10, j10, j10, j10, j10, j10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.ea2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public static Uri m(Context context, String str) {
        ?? arrayList;
        File file;
        String message;
        String str2;
        context.getClass();
        Pattern pattern = qe4.a;
        ArrayList<File> arrayList2 = new ArrayList();
        File filesDir = context.getFilesDir();
        filesDir.getClass();
        File[] fileArrListFiles = filesDir.listFiles(new pe4());
        if (fileArrListFiles != null) {
            arrayList2.addAll(qf0.L(Arrays.copyOf(fileArrListFiles, fileArrListFiles.length)));
        }
        try {
            List<File> listL = qf0.L(new File(NetworkLogFilePathProvider.GetLogFilePath()), new File(NetworkLogFilePathProvider.GetLogFilePath2()), new File(NetworkLogFilePathProvider.GetLogFilePathOld()));
            arrayList = new ArrayList();
            for (File file2 : listL) {
                if (!file2.exists()) {
                    file2 = null;
                }
                if (file2 != null) {
                    arrayList.add(file2);
                }
            }
        } catch (UnsatisfiedLinkError unused) {
            arrayList = ea2.m;
        }
        List list = lu.b;
        File filesDir2 = context.getFilesDir();
        filesDir2.getClass();
        ArrayList<String> arrayList3 = new ArrayList();
        Iterator it = lu.b.iterator();
        while (it.hasNext()) {
            File file3 = new File(filesDir2, (String) it.next());
            if (file3.exists()) {
                String absolutePath = file3.getAbsolutePath();
                absolutePath.getClass();
                arrayList3.add(absolutePath);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (String str3 : arrayList3) {
            File file4 = new File(str3);
            if (file4.exists()) {
                arrayList4.add(file4);
            } else {
                e41.s("could not find ", str3, "FileHelper");
            }
        }
        arrayList2.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = qe4.b.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            io.sentry.h2.f();
            return null;
        }
        arrayList2.addAll(arrayList5);
        arrayList2.addAll(arrayList);
        ye4.a("FileManager", "createAndPublishLogFilesZip: create");
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        externalFilesDirs.getClass();
        if (externalFilesDirs.length == 0) {
            ye4.c("FileManager", "Could not determine external storage path. Maybe it's not mounted");
            file = null;
        } else {
            file = externalFilesDirs[0];
        }
        File file5 = file != null ? new File(file, "export") : new File(context.getFilesDir(), "export");
        file5.mkdirs();
        File file6 = new File(file5, str);
        if (file6.exists()) {
            file6.delete();
        } else {
            File parentFile = file6.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(io.sentry.config.a.g(new FileOutputStream(file6), file6)));
            byte[] bArr = new byte[1024];
            for (File file7 : arrayList2) {
                if (file7 == null) {
                    ye4.c("FileHelper", "zip: input file is null");
                } else {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(io.sentry.config.a.c(file7, new FileInputStream(file7)), 1024);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(file7.getName()));
                        while (true) {
                            int i = bufferedInputStream.read(bArr, 0, 1024);
                            if (i == -1) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, i);
                            message = e.getMessage();
                            str2 = "zip: FileNotFoundException: ";
                            e41.s(str2, message, "FileHelper");
                            ye4.c("FileManager", "could not package log files");
                            return null;
                        }
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            kh.n(bufferedInputStream, th);
                            throw th2;
                        }
                    }
                }
            }
            zipOutputStream.close();
            Uri uriC = FileProvider.c(context, context.getPackageName() + ".export", file6);
            uriC.getClass();
            return uriC;
        } catch (FileNotFoundException e) {
            message = e.getMessage();
            str2 = "zip: FileNotFoundException: ";
        } catch (IOException e2) {
            message = e2.getMessage();
            str2 = "zip: IOException: ";
        }
    }

    public static boolean n(i48 i48Var, sz3 sz3Var, sz3 sz3Var2) {
        tz3 tz3Var = i48Var.d;
        sz3Var.getClass();
        sz3Var2.getClass();
        xs0 xs0Var = i48Var.c;
        if (sz3Var == sz3Var2) {
            return true;
        }
        if (q(xs0Var, sz3Var) && q(xs0Var, sz3Var2)) {
            m98 m98VarA = tz3Var.a((oz3) sz3Var);
            m98 m98VarA2 = tz3Var.a((oz3) sz3Var2);
            g07 g07VarD = xs0Var.d(m98VarA);
            if (!xs0Var.X(xs0Var.c(m98VarA), xs0Var.c(m98VarA2))) {
                return false;
            }
            if (xs0Var.o0(g07VarD) == 0) {
                return xs0Var.e(m98VarA) || xs0Var.e(m98VarA2) || xs0Var.r0(g07VarD) == xs0Var.r0(xs0Var.d(m98VarA2));
            }
        }
        yl7 yl7Var = f2619o;
        return s(yl7Var, i48Var, sz3Var, sz3Var2) && s(yl7Var, i48Var, sz3Var2, sz3Var);
    }

    public static cq7 o(zv0 zv0Var, ux2 ux2Var) {
        cq7 cq7VarB = zv0Var.h0;
        if (cq7VarB == null) {
            ux2Var.W(390452338);
            ux2Var.p(false);
            cq7VarB = null;
        } else {
            ux2Var.W(390452339);
            jt7 jt7Var = (jt7) ux2Var.j(kt7.a);
            if (!im3.n(cq7VarB.k, jt7Var)) {
                cq7VarB = cq7VarB.b(cq7VarB.a, cq7VarB.b, cq7VarB.c, cq7VarB.d, cq7VarB.e, cq7VarB.f, cq7VarB.g, cq7VarB.h, cq7VarB.i, cq7VarB.j, jt7Var, cq7VarB.l, cq7VarB.m, cq7VarB.n, cq7VarB.f550o, cq7VarB.p, cq7VarB.q, cq7VarB.r, cq7VarB.s, cq7VarB.t, cq7VarB.u, cq7VarB.v, cq7VarB.w, cq7VarB.x, cq7VarB.y, cq7VarB.z, cq7VarB.A, cq7VarB.B, cq7VarB.C, cq7VarB.D, cq7VarB.E, cq7VarB.F, cq7VarB.G, cq7VarB.H, cq7VarB.I, cq7VarB.J, cq7VarB.K, cq7VarB.L, cq7VarB.M, cq7VarB.N, cq7VarB.O, cq7VarB.P, cq7VarB.Q);
                zv0Var.h0 = cq7VarB;
            }
            ux2Var.p(false);
        }
        if (cq7VarB != null) {
            ux2Var.W(-1788515437);
            ux2Var.p(false);
            return cq7VarB;
        }
        ux2Var.W(-1788321191);
        long jB = bw0.b(zv0Var, au8.x0);
        long jB2 = bw0.b(zv0Var, au8.D0);
        aw0 aw0Var = au8.k0;
        long jB3 = rv0.b(0.38f, bw0.b(zv0Var, aw0Var));
        long jB4 = bw0.b(zv0Var, au8.r0);
        long j = rv0.g;
        long jB5 = bw0.b(zv0Var, au8.i0);
        long jB6 = bw0.b(zv0Var, au8.q0);
        jt7 jt7Var2 = (jt7) ux2Var.j(kt7.a);
        long jB7 = bw0.b(zv0Var, au8.A0);
        long jB8 = bw0.b(zv0Var, au8.J0);
        long jB9 = rv0.b(0.12f, bw0.b(zv0Var, au8.n0));
        long jB10 = bw0.b(zv0Var, au8.u0);
        long jB11 = bw0.b(zv0Var, au8.z0);
        long jB12 = bw0.b(zv0Var, au8.I0);
        long jB13 = rv0.b(0.38f, bw0.b(zv0Var, au8.m0));
        long jB14 = bw0.b(zv0Var, au8.t0);
        long jB15 = bw0.b(zv0Var, au8.C0);
        long jB16 = bw0.b(zv0Var, au8.L0);
        long jB17 = rv0.b(0.38f, bw0.b(zv0Var, au8.p0));
        long jB18 = bw0.b(zv0Var, au8.w0);
        long jB19 = bw0.b(zv0Var, au8.y0);
        long jB20 = bw0.b(zv0Var, au8.H0);
        long jB21 = rv0.b(0.38f, bw0.b(zv0Var, au8.l0));
        long jB22 = bw0.b(zv0Var, au8.s0);
        aw0 aw0Var2 = au8.E0;
        long jB23 = bw0.b(zv0Var, aw0Var2);
        long jB24 = bw0.b(zv0Var, aw0Var2);
        long jB25 = rv0.b(0.38f, bw0.b(zv0Var, aw0Var));
        long jB26 = bw0.b(zv0Var, aw0Var2);
        long jB27 = bw0.b(zv0Var, au8.B0);
        long jB28 = bw0.b(zv0Var, au8.K0);
        long jB29 = rv0.b(0.38f, bw0.b(zv0Var, au8.o0));
        long jB30 = bw0.b(zv0Var, au8.v0);
        aw0 aw0Var3 = au8.F0;
        long jB31 = bw0.b(zv0Var, aw0Var3);
        long jB32 = bw0.b(zv0Var, aw0Var3);
        long jB33 = rv0.b(0.38f, bw0.b(zv0Var, aw0Var3));
        long jB34 = bw0.b(zv0Var, aw0Var3);
        aw0 aw0Var4 = au8.G0;
        cq7 cq7Var = new cq7(jB, jB2, jB3, jB4, j, j, j, j, jB5, jB6, jt7Var2, jB7, jB8, jB9, jB10, jB11, jB12, jB13, jB14, jB15, jB16, jB17, jB18, jB19, jB20, jB21, jB22, jB23, jB24, jB25, jB26, jB27, jB28, jB29, jB30, jB31, jB32, jB33, jB34, bw0.b(zv0Var, aw0Var4), bw0.b(zv0Var, aw0Var4), rv0.b(0.38f, bw0.b(zv0Var, aw0Var4)), bw0.b(zv0Var, aw0Var4));
        zv0Var.h0 = cq7Var;
        ux2Var.p(false);
        return cq7Var;
    }

    public static d58 p(xs0 xs0Var, sz3 sz3Var, sz3 sz3Var2) {
        m98 m98VarP0;
        int iO0 = xs0Var.o0(sz3Var);
        int i = 0;
        while (true) {
            if (i >= iO0) {
                return null;
            }
            h58 h58VarM = xs0Var.m(sz3Var, i);
            h58 h58Var = xs0Var.o(h58VarM) ? null : h58VarM;
            if (h58Var != null && (m98VarP0 = xs0Var.p0(h58Var)) != null) {
                boolean z2 = xs0Var.A(xs0Var.q0(xs0Var.d(m98VarP0))) && xs0Var.A(xs0Var.q0(xs0Var.d(sz3Var2)));
                if (m98VarP0.equals(sz3Var2) || (z2 && im3.n(xs0Var.c(m98VarP0), xs0Var.c(sz3Var2)))) {
                    return xs0Var.v(xs0Var.c(sz3Var), i);
                }
                d58 d58VarP = p(xs0Var, m98VarP0, sz3Var2);
                if (d58VarP != null) {
                    return d58VarP;
                }
            }
            i++;
        }
    }

    public static boolean q(xs0 xs0Var, sz3 sz3Var) {
        if (!xs0Var.n0(xs0Var.c(sz3Var))) {
            return false;
        }
        xs0Var.y(sz3Var);
        return (xs0Var.Z(sz3Var) || xs0Var.f(sz3Var) || xs0Var.S(sz3Var)) ? false : true;
    }

    public static boolean r(i48 i48Var, f48 f48Var, i07 i07Var) {
        boolean zS;
        f48Var.getClass();
        xs0 xs0Var = i48Var.c;
        k48 k48VarB0 = xs0Var.b0(i07Var);
        int iD = xs0Var.D(f48Var);
        int iN = xs0Var.N(k48VarB0);
        if (iD == iN && iD == xs0Var.o0(i07Var)) {
            for (int i = 0; i < iN; i++) {
                h58 h58VarM = xs0Var.m(i07Var, i);
                if (!xs0Var.o(h58VarM)) {
                    m98 m98VarP0 = xs0Var.p0(h58VarM);
                    h58 h58VarI = xs0Var.i(f48Var, i);
                    xs0Var.c0(h58VarI);
                    m98 m98VarP1 = xs0Var.p0(h58VarI);
                    q58 q58VarM = xs0Var.M(xs0Var.v(k48VarB0, i));
                    q58 q58VarC0 = xs0Var.c0(h58VarM);
                    q58 q58Var = q58.INV;
                    if (q58VarM == q58Var) {
                        q58VarM = q58VarC0;
                    } else if (q58VarC0 != q58Var && q58VarM != q58VarC0) {
                        q58VarM = null;
                    }
                    if (q58VarM == null) {
                        return i48Var.a;
                    }
                    if (q58VarM == q58Var) {
                        t(xs0Var, m98VarP1, m98VarP0);
                        t(xs0Var, m98VarP0, m98VarP1);
                    }
                    int i2 = i48Var.e;
                    if (i2 > 100) {
                        hk0.f(m98VarP1, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    i48Var.e = i2 + 1;
                    int iOrdinal = q58VarM.ordinal();
                    yl7 yl7Var = f2619o;
                    if (iOrdinal == 0) {
                        zS = s(yl7Var, i48Var, m98VarP0, m98VarP1);
                    } else if (iOrdinal == 1) {
                        zS = s(yl7Var, i48Var, m98VarP1, m98VarP0);
                    } else {
                        if (iOrdinal != 2) {
                            gk0.s();
                            return false;
                        }
                        zS = n(i48Var, m98VarP1, m98VarP0);
                    }
                    i48Var.e--;
                    if (!zS) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0242  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:220:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:223:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:227:0x03dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x03de  */
    /* JADX WARN: Code duplicated, block: B:230:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:235:0x0402  */
    /* JADX WARN: Code duplicated, block: B:237:0x0405  */
    /* JADX WARN: Code duplicated, block: B:240:0x0418  */
    /* JADX WARN: Code duplicated, block: B:242:0x0424  */
    /* JADX WARN: Code duplicated, block: B:245:0x042f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0476  */
    /* JADX WARN: Code duplicated, block: B:263:0x0497  */
    /* JADX WARN: Code duplicated, block: B:268:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:270:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:272:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:274:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:277:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:280:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:282:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:286:0x0509  */
    /* JADX WARN: Code duplicated, block: B:287:0x050b  */
    /* JADX WARN: Code duplicated, block: B:291:0x0513  */
    /* JADX WARN: Code duplicated, block: B:297:0x0529  */
    /* JADX WARN: Code duplicated, block: B:301:0x0541 A[LOOP:7: B:295:0x0523->B:301:0x0541, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:317:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:326:0x04a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0545 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0503 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0517 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x053d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:354:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:? A[LOOP:12: B:39:0x00a7->B:356:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:? A[LOOP:13: B:55:0x00e6->B:359:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [o.xs0] */
    /* JADX WARN: Type inference failed for: r9v21, types: [int] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean s(yl7 yl7Var, i48 i48Var, sz3 sz3Var, sz3 sz3Var2) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z2;
        List<i07> listH;
        h48 h48Var;
        ArrayList<i07> arrayList;
        int i;
        int size;
        k48 k48VarB0;
        ArrayDeque arrayDeque;
        v17 v17Var;
        i07 i07Var;
        h48 h48Var2;
        Iterator it;
        i07 i07VarO;
        zv zvVar;
        int iN;
        boolean z3;
        boolean z4;
        ?? r9;
        boolean zR;
        boolean z5;
        boolean z6;
        h58 h58VarH0;
        m98 m98VarP0;
        g07 g07VarL0;
        g07 g07VarI0;
        k48 k48VarB1;
        k48 k48VarB2;
        d58 d58VarP;
        Collection collectionV0;
        Iterator it2;
        Collection collectionV1;
        Iterator it3;
        boolean z7;
        tz3 tz3Var = i48Var.d;
        ?? r4 = i48Var.c;
        sz3Var.getClass();
        sz3Var2.getClass();
        boolean z8 = true;
        if (sz3Var != sz3Var2) {
            m98 m98VarA = tz3Var.a((oz3) sz3Var);
            m98 m98VarA2 = tz3Var.a((oz3) sz3Var2);
            g07 g07VarD = r4.d(m98VarA);
            g07 g07VarZ = r4.z(m98VarA2);
            boolean z9 = false;
            if (!r4.H(g07VarD) && !r4.H(g07VarZ)) {
                r4.l(g07VarD);
                r4.F(g07VarD);
                r4.F(g07VarZ);
                lm1 lm1VarH = r4.h(g07VarZ);
                if (lm1VarH == null || (g07VarI0 = r4.i0(lm1VarH)) == null) {
                    g07VarI0 = g07VarZ;
                }
                am0 am0VarC = r4.C(g07VarI0);
                sz3 sz3VarK = am0VarC != null ? r4.k(am0VarC) : null;
                yl7 yl7Var2 = f2619o;
                if (am0VarC == null || sz3VarK == null) {
                    k48VarB1 = r4.b0(g07VarZ);
                    if (r4.p(k48VarB1)) {
                        r4.r0(g07VarZ);
                        collectionV1 = r4.v0(k48VarB1);
                        if (!(collectionV1 instanceof Collection) && collectionV1.isEmpty()) {
                            z7 = true;
                            break;
                        }
                        it3 = collectionV1.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z7 = true;
                                break;
                            }
                            if (!s(yl7Var2, i48Var, g07VarD, (sz3) it3.next())) {
                                z7 = false;
                                break;
                            }
                        }
                        boolValueOf = Boolean.valueOf(z7);
                    } else {
                        k48VarB2 = r4.b0(g07VarD);
                        if (g07VarD instanceof am0) {
                            d58VarP = p(r4, g07VarZ, g07VarD);
                            if (d58VarP == null && r4.u0(d58VarP, r4.b0(g07VarZ))) {
                                boolValueOf = Boolean.TRUE;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (r4.p(k48VarB2)) {
                                collectionV0 = r4.v0(k48VarB2);
                                if ((collectionV0 instanceof Collection) || !collectionV0.isEmpty()) {
                                    it2 = collectionV0.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            d58VarP = p(r4, g07VarZ, g07VarD);
                                            if (d58VarP == null) {
                                            }
                                        } else if (!(((sz3) it2.next()) instanceof am0)) {
                                        }
                                    }
                                } else {
                                    d58VarP = p(r4, g07VarZ, g07VarD);
                                    if (d58VarP == null) {
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                } else {
                    if (r4.r0(g07VarZ)) {
                        sz3VarK = r4.n(sz3VarK);
                    } else if (r4.Z(g07VarZ)) {
                        sz3VarK = r4.e0(sz3VarK);
                    }
                    if (s(yl7Var2, i48Var, g07VarD, sz3VarK)) {
                        boolValueOf = Boolean.TRUE;
                    } else {
                        k48VarB1 = r4.b0(g07VarZ);
                        if (r4.p(k48VarB1)) {
                            r4.r0(g07VarZ);
                            collectionV1 = r4.v0(k48VarB1);
                            if (!(collectionV1 instanceof Collection)) {
                                it3 = collectionV1.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z7 = true;
                                        break;
                                    }
                                    if (!s(yl7Var2, i48Var, g07VarD, (sz3) it3.next())) {
                                        z7 = false;
                                        break;
                                    }
                                }
                            } else {
                                it3 = collectionV1.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z7 = true;
                                        break;
                                    }
                                    if (!s(yl7Var2, i48Var, g07VarD, (sz3) it3.next())) {
                                        z7 = false;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z7);
                        } else {
                            k48VarB2 = r4.b0(g07VarD);
                            if (g07VarD instanceof am0) {
                                d58VarP = p(r4, g07VarZ, g07VarD);
                                if (d58VarP == null) {
                                    boolValueOf = null;
                                } else {
                                    boolValueOf = null;
                                }
                            } else {
                                if (r4.p(k48VarB2)) {
                                    collectionV0 = r4.v0(k48VarB2);
                                    if (collectionV0 instanceof Collection) {
                                        it2 = collectionV0.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                d58VarP = p(r4, g07VarZ, g07VarD);
                                                if (d58VarP == null) {
                                                }
                                            } else if (!(((sz3) it2.next()) instanceof am0)) {
                                            }
                                        }
                                    } else {
                                        it2 = collectionV0.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                d58VarP = p(r4, g07VarZ, g07VarD);
                                                if (d58VarP == null) {
                                                }
                                            } else if (!(((sz3) it2.next()) instanceof am0)) {
                                            }
                                        }
                                    }
                                }
                                boolValueOf = null;
                            }
                        }
                    }
                }
            } else if (i48Var.a) {
                boolValueOf = Boolean.TRUE;
            } else if (!r4.r0(g07VarD) || r4.r0(g07VarZ)) {
                g07 g07VarS = r4.s(g07VarD, false);
                g07 g07VarS2 = r4.s(g07VarZ, false);
                g07VarS.getClass();
                g07VarS2.getClass();
                boolValueOf = Boolean.valueOf(mo8.v(r4, g07VarS, g07VarS2));
            } else {
                boolValueOf = Boolean.FALSE;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            i07 i07VarD = r4.d(m98VarA);
            g07 g07VarZ2 = r4.z(m98VarA2);
            h48 h48Var3 = h48.c;
            h48 h48Var4 = h48.b;
            int i2 = 1000;
            if (!r4.r0(g07VarZ2) && !r4.Z(i07VarD) && !r4.f(i07VarD) && ((!(i07VarD instanceof am0) || !r4.L((am0) i07VarD)) && !db8.G(i48Var, i07VarD, h48Var4))) {
                if (r4.Z(g07VarZ2) || db8.G(i48Var, g07VarZ2, h48.d) || r4.R(i07VarD)) {
                    return false;
                }
                k48 k48VarB3 = r4.b0(g07VarZ2);
                k48VarB3.getClass();
                if (!db8.L(i48Var, i07VarD, k48VarB3)) {
                    i48Var.c();
                    ArrayDeque arrayDeque2 = i48Var.f;
                    arrayDeque2.getClass();
                    v17 v17Var2 = i48Var.g;
                    v17Var2.getClass();
                    arrayDeque2.push(i07VarD);
                    loop0: while (true) {
                        if (arrayDeque2.isEmpty()) {
                            i48Var.a();
                            return false;
                        }
                        if (v17Var2.a() > i2) {
                            StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                            sb.append(i07VarD);
                            gk0.q(sb, ". Supertypes = ", lv0.t0(v17Var2, null, null, null, null, 63));
                            return false;
                        }
                        i07 i07Var2 = (i07) arrayDeque2.pop();
                        i07Var2.getClass();
                        if (v17Var2.add(i07Var2)) {
                            h48 h48Var5 = r4.r0(i07Var2) ? h48Var3 : h48Var4;
                            if (h48Var5.equals(h48Var3)) {
                                h48Var5 = null;
                            }
                            if (h48Var5 == null) {
                                continue;
                            } else {
                                Iterator it4 = r4.v0(r4.b0(i07Var2)).iterator();
                                while (it4.hasNext()) {
                                    i07 i07VarO2 = h48Var5.o(i48Var, (sz3) it4.next());
                                    if (db8.L(i48Var, i07VarO2, k48VarB3)) {
                                        i48Var.a();
                                        break loop0;
                                    }
                                    arrayDeque2.add(i07VarO2);
                                    i2 = 1000;
                                }
                            }
                        }
                    }
                }
            }
            g07 g07VarD2 = r4.d(i07VarD);
            g07 g07VarZ3 = r4.z(g07VarZ2);
            if (!r4.U(g07VarD2) && !r4.U(g07VarZ3)) {
                bool = null;
            } else if (e(r4, g07VarD2) && e(r4, g07VarZ3)) {
                bool = Boolean.TRUE;
            } else if (r4.U(g07VarD2)) {
                if (f(r4, i48Var, g07VarD2, g07VarZ3, false)) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
            } else if (r4.U(g07VarZ3)) {
                k48 k48VarB4 = r4.b0(g07VarD2);
                if (k48VarB4 instanceof zl3) {
                    Collection collectionV2 = r4.v0(k48VarB4);
                    if (!(collectionV2 instanceof Collection) || !collectionV2.isEmpty()) {
                        Iterator it5 = collectionV2.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                g07 g07VarL1 = r4.l0((sz3) it5.next());
                                if (g07VarL1 == null || !r4.U(g07VarL1)) {
                                }
                            } else if (!f(r4, i48Var, g07VarZ3, g07VarD2, true)) {
                                bool = null;
                            }
                        }
                    } else if (!f(r4, i48Var, g07VarZ3, g07VarD2, true)) {
                        bool = null;
                    }
                } else if (!f(r4, i48Var, g07VarZ3, g07VarD2, true)) {
                    bool = null;
                }
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            k48 k48VarB5 = r4.b0(g07VarZ2);
            if ((!r4.X(r4.b0(i07VarD), k48VarB5) || r4.N(k48VarB5) != 0) && !r4.B(r4.b0(g07VarZ2))) {
                k48VarB5.getClass();
                if (!r4.R(i07VarD)) {
                    if (r4.g(k48VarB5) || r4.u(k48VarB5)) {
                        u17<i07> u17Var = new u17();
                        i48Var.c();
                        ArrayDeque arrayDeque3 = i48Var.f;
                        arrayDeque3.getClass();
                        v17 v17Var3 = i48Var.g;
                        v17Var3.getClass();
                        arrayDeque3.push(i07VarD);
                        while (!arrayDeque3.isEmpty()) {
                            if (v17Var3.a() > 1000) {
                                boolean z10 = z9;
                                StringBuilder sb2 = new StringBuilder("Too many supertypes for type: ");
                                sb2.append(i07VarD);
                                gk0.q(sb2, ". Supertypes = ", lv0.t0(v17Var3, null, null, null, null, 63));
                                return z10;
                            }
                            i07 i07Var3 = (i07) arrayDeque3.pop();
                            i07Var3.getClass();
                            if (v17Var3.add(i07Var3)) {
                                if (r4.R(i07Var3)) {
                                    u17Var.add(i07Var3);
                                    h48Var = h48Var3;
                                } else {
                                    h48Var = h48Var4;
                                }
                                if (h48Var.equals(h48Var3)) {
                                    h48Var = null;
                                }
                                if (h48Var != null) {
                                    Iterator it6 = r4.v0(r4.b0(i07Var3)).iterator();
                                    while (it6.hasNext()) {
                                        arrayDeque3.add(h48Var.o(i48Var, (sz3) it6.next()));
                                        z9 = z9;
                                    }
                                }
                            }
                        }
                        z2 = z9;
                        i48Var.a();
                        ArrayList arrayList2 = new ArrayList();
                        for (i07 i07Var4 : u17Var) {
                            i07Var4.getClass();
                            qv0.c0(arrayList2, i(i48Var, i07Var4, k48VarB5));
                        }
                        listH = arrayList2;
                    } else {
                        listH = h(i48Var, i07VarD, k48VarB5);
                    }
                    listH.size();
                    i = 10;
                    arrayList = new ArrayList(mv0.Z(listH, 10));
                    for (i07 i07Var5 : listH) {
                        i07Var5.getClass();
                        g07VarL0 = r4.l0(i48Var.d.a(i07Var5));
                        if (g07VarL0 == null) {
                            i07Var5 = g07VarL0;
                        }
                        arrayList.add(i07Var5);
                    }
                    size = arrayList.size();
                    if (size != 0) {
                        k48VarB0 = r4.b0(i07VarD);
                        if (r4.g(k48VarB0)) {
                            return r4.j0(k48VarB0);
                        }
                        if (r4.j0(r4.b0(i07VarD))) {
                            return true;
                        }
                        i48Var.c();
                        arrayDeque = i48Var.f;
                        arrayDeque.getClass();
                        v17Var = i48Var.g;
                        v17Var.getClass();
                        arrayDeque.push(i07VarD);
                        while (!arrayDeque.isEmpty()) {
                            if (v17Var.a() <= 1000) {
                                StringBuilder sb3 = new StringBuilder("Too many supertypes for type: ");
                                sb3.append(i07VarD);
                                gk0.q(sb3, ". Supertypes = ", lv0.t0(v17Var, null, null, null, null, 63));
                                return z2;
                            }
                            i07Var = (i07) arrayDeque.pop();
                            i07Var.getClass();
                            if (!v17Var.add(i07Var)) {
                                if (r4.R(i07Var)) {
                                    h48Var2 = h48Var3;
                                } else {
                                    h48Var2 = h48Var4;
                                }
                                if (h48Var2.equals(h48Var3)) {
                                    h48Var2 = null;
                                }
                                if (h48Var2 == null) {
                                    continue;
                                } else {
                                    it = r4.v0(r4.b0(i07Var)).iterator();
                                    while (it.hasNext()) {
                                        i07VarO = h48Var2.o(i48Var, (sz3) it.next());
                                        if (r4.j0(r4.b0(i07VarO))) {
                                            i48Var.a();
                                            return true;
                                        }
                                        arrayDeque.add(i07VarO);
                                    }
                                }
                            }
                        }
                        i48Var.a();
                        return z2;
                    }
                    if (size != 1) {
                        return r(i48Var, r4.k0((i07) lv0.l0(arrayList)), g07VarZ2);
                    }
                    zvVar = new zv(r4.N(k48VarB5));
                    iN = r4.N(k48VarB5);
                    z3 = z2;
                    z4 = z3;
                    while (r9 < iN) {
                        if (z4 && r4.M(r4.v(k48VarB5, r9)) == q58.OUT) {
                            z5 = z2;
                        } else {
                            z5 = z8;
                        }
                        if (z5) {
                            z6 = z8;
                        } else {
                            ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList, i));
                            for (i07 i07Var6 : arrayList) {
                                h58VarH0 = r4.h0(i07Var6, r9);
                                if (h58VarH0 != null) {
                                    boolean z11 = z8;
                                    if (r4.c0(h58VarH0) != q58.INV) {
                                        h58VarH0 = null;
                                    }
                                    if (h58VarH0 == null && (m98VarP0 = r4.p0(h58VarH0)) != null) {
                                        arrayList3.add(m98VarP0);
                                        z8 = z11;
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + i07Var6 + ", subType: " + i07VarD + ", superType: " + g07VarZ2).toString());
                            }
                            z6 = z8;
                            zvVar.add(r4.E(r4.T(arrayList3)));
                        }
                        z8 = z6;
                        i = 10;
                        r9++;
                        z4 = z5;
                    }
                    r9 = z3;
                    boolean z12 = z8;
                    if (z4 && r(i48Var, zvVar, g07VarZ2)) {
                        return z12;
                    }
                    zR = z2;
                    for (i07 i07Var7 : arrayList) {
                        if (zR) {
                            zR = r(i48Var, r4.k0(i07Var7), g07VarZ2);
                        }
                    }
                    return zR;
                }
                listH = i(i48Var, i07VarD, k48VarB5);
                z2 = false;
                listH.size();
                i = 10;
                arrayList = new ArrayList(mv0.Z(listH, 10));
                while (r9.hasNext()) {
                    i07Var5.getClass();
                    g07VarL0 = r4.l0(i48Var.d.a(i07Var5));
                    if (g07VarL0 == null) {
                        i07Var5 = g07VarL0;
                    }
                    arrayList.add(i07Var5);
                }
                size = arrayList.size();
                if (size != 0) {
                    k48VarB0 = r4.b0(i07VarD);
                    if (r4.g(k48VarB0)) {
                        return r4.j0(k48VarB0);
                    }
                    if (r4.j0(r4.b0(i07VarD))) {
                        return true;
                    }
                    i48Var.c();
                    arrayDeque = i48Var.f;
                    arrayDeque.getClass();
                    v17Var = i48Var.g;
                    v17Var.getClass();
                    arrayDeque.push(i07VarD);
                    while (!arrayDeque.isEmpty()) {
                        if (v17Var.a() <= 1000) {
                            StringBuilder sb4 = new StringBuilder("Too many supertypes for type: ");
                            sb4.append(i07VarD);
                            gk0.q(sb4, ". Supertypes = ", lv0.t0(v17Var, null, null, null, null, 63));
                            return z2;
                        }
                        i07Var = (i07) arrayDeque.pop();
                        i07Var.getClass();
                        if (!v17Var.add(i07Var)) {
                            if (r4.R(i07Var)) {
                                h48Var2 = h48Var3;
                            } else {
                                h48Var2 = h48Var4;
                            }
                            if (h48Var2.equals(h48Var3)) {
                                h48Var2 = null;
                            }
                            if (h48Var2 == null) {
                                continue;
                            } else {
                                it = r4.v0(r4.b0(i07Var)).iterator();
                                while (it.hasNext()) {
                                    i07VarO = h48Var2.o(i48Var, (sz3) it.next());
                                    if (r4.j0(r4.b0(i07VarO))) {
                                        i48Var.a();
                                        return true;
                                    }
                                    arrayDeque.add(i07VarO);
                                }
                            }
                        }
                    }
                    i48Var.a();
                    return z2;
                }
                if (size != 1) {
                    return r(i48Var, r4.k0((i07) lv0.l0(arrayList)), g07VarZ2);
                }
                zvVar = new zv(r4.N(k48VarB5));
                iN = r4.N(k48VarB5);
                z3 = z2;
                z4 = z3;
                while (r9 < iN) {
                    if (z4) {
                        z5 = z8;
                    } else {
                        z5 = z8;
                    }
                    if (z5) {
                        ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList, i));
                        while (r13.hasNext()) {
                            h58VarH0 = r4.h0(i07Var6, r9);
                            if (h58VarH0 != null) {
                                boolean z13 = z8;
                                if (r4.c0(h58VarH0) != q58.INV) {
                                    h58VarH0 = null;
                                }
                                if (h58VarH0 == null) {
                                }
                            }
                            throw new IllegalStateException(("Incorrect type: " + i07Var6 + ", subType: " + i07VarD + ", superType: " + g07VarZ2).toString());
                        }
                        z6 = z8;
                        zvVar.add(r4.E(r4.T(arrayList4)));
                    } else {
                        z6 = z8;
                    }
                    z8 = z6;
                    i = 10;
                    r9++;
                    z4 = z5;
                }
                r9 = z3;
                boolean z14 = z8;
                if (z4) {
                }
                zR = z2;
                while (r1.hasNext()) {
                    if (zR) {
                        zR = r(i48Var, r4.k0(i07Var7), g07VarZ2);
                    }
                }
                return zR;
            }
        }
        return true;
    }

    public static void t(xs0 xs0Var, sz3 sz3Var, sz3 sz3Var2) {
        i07 i07VarL0 = xs0Var.l0(sz3Var);
        if (i07VarL0 instanceof am0) {
            am0 am0Var = (am0) i07VarL0;
            if (!xs0Var.a0(am0Var) && xs0Var.o(xs0Var.Y(xs0Var.d0(am0Var))) && xs0Var.w0(am0Var) == ul0.m) {
                xs0Var.c(sz3Var2);
            }
        }
    }

    @Override // o.c57
    public boolean G(Object obj, Object obj2) {
        switch (this.m) {
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return obj == obj2;
            default:
                return im3.n(obj, obj2);
        }
    }

    @Override // o.k10
    public byte[] a(Object obj) {
        BCommandNativeImpl bCommandNativeImpl = (BCommandNativeImpl) obj;
        bCommandNativeImpl.getClass();
        return (byte[]) bCommandNativeImpl.y().n;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0165  */
    /* JADX WARN: Code duplicated, block: B:110:0x0168  */
    /* JADX WARN: Code duplicated, block: B:113:0x0173  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:136:0x01be  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118  */
    public void b(final boolean z2, final boolean z3, final mw4 mw4Var, fs4 fs4Var, final cq7 cq7Var, final pw6 pw6Var, float f, float f2, ux2 ux2Var, final int i, final int i2) {
        fs4 fs4Var2;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        boolean z4;
        boolean z5;
        final float f5;
        final float f6;
        final fs4 fs4Var3;
        j56 j56VarR;
        fs4 fs4Var4;
        float f7;
        final float f8;
        final float f9;
        boolean z6;
        Object objK;
        ux4 ux4Var;
        final e87 e87VarC0;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objK2;
        int i6;
        nc7 nc7Var;
        fs4 fs4VarF;
        int i7;
        ux2Var.Y(1035477640);
        int i8 = (ux2Var.g(z2) ? 4 : 2) | i | (ux2Var.g(z3) ? 32 : 16) | (ux2Var.f(mw4Var) ? 256 : 128);
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                fs4Var2 = fs4Var;
                i8 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
            }
            if (ux2Var.f(cq7Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            int i10 = i8 | i3;
            if (ux2Var.f(pw6Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i5 = i10 | i4;
            if ((i & 1572864) == 0) {
                f3 = f;
                if ((i2 & 64) == 0 || !ux2Var.c(f3)) {
                    i7 = 524288;
                } else {
                    i7 = 1048576;
                }
                i5 |= i7;
            } else {
                f3 = f;
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    int i11 = ux2Var.c(f4) ? 8388608 : 4194304;
                    i5 |= i11;
                } else {
                    f4 = f2;
                }
                i5 |= i11;
            } else {
                f4 = f2;
            }
            z4 = true;
            if ((i5 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ux2Var.N(i5 & 1, z5)) {
                ux2Var.S();
                if ((i & 1) != 0 || ux2Var.x()) {
                    if (i9 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                        f7 = 2.0f;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                        f4 = 1.0f;
                    }
                    fs4Var2 = fs4Var4;
                    f8 = f4;
                    f9 = f7;
                } else {
                    ux2Var.Q();
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i5 &= -29360129;
                    }
                    f8 = f4;
                    f9 = f3;
                }
                ux2Var.q();
                if ((i5 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objK = ux2Var.K();
                Object obj = e01.a;
                if (z6 || objK == obj) {
                    objK = new ux4(mw4Var);
                    ux2Var.g0(objK);
                }
                ux4Var = (ux4) objK;
                e87VarC0 = xs1.c0(du4.p, ux2Var);
                boolean z10 = ((((i5 & 458752) ^ 196608) <= 131072 && ux2Var.f(pw6Var)) || (i5 & 196608) == 131072) | ((((57344 & i5) ^ 24576) <= 16384 && ux2Var.f(cq7Var)) || (i5 & 24576) == 16384);
                if ((i5 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z11 = z10 | z7;
                if ((i5 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean zH = z11 | z8 | ((((29360128 & i5) ^ 12582912) <= 8388608 && ux2Var.c(f8)) || (i5 & 12582912) == 8388608) | ux2Var.h(e87VarC0);
                if ((((3670016 & i5) ^ 1572864) > 1048576 || !ux2Var.c(f9)) && (i5 & 1572864) != 1048576) {
                }
                z9 = zH | z4;
                objK2 = ux2Var.K();
                if (!z9 || objK2 == obj) {
                    i6 = 0;
                    Object obj2 = new nc7() { // from class: o.qb5
                        @Override // o.nc7
                        public final void a(pb6 pb6Var) {
                            e87 e87Var = e87VarC0;
                            float f10 = f9;
                            pb6Var.h(pw6Var);
                            cq7 cq7Var2 = cq7Var;
                            boolean z12 = z2;
                            boolean z13 = z3;
                            pb6Var.a(cq7Var2.a(z12, z13, false));
                            x37.h(pb6Var, f8, cq7Var2.d(z12, z13, false));
                            wc7 wc7Var = pb6Var.n;
                            wc7Var.getClass();
                            rx4 rx4Var = wc7Var.K.c;
                            if ((((qx4) v47.s(rx4Var.m, rx4Var)).c & 4) != 0) {
                                jo joVar = pb6Var.x;
                                jo joVar2 = pb6Var.y;
                                try {
                                    pb6Var.x = e87Var;
                                    pb6Var.y = e87Var;
                                    pb6Var.a(cq7Var2.a(z12, z13, true));
                                    x37.h(pb6Var, f10, cq7Var2.d(z12, z13, true));
                                } finally {
                                    pb6Var.x = joVar;
                                    pb6Var.y = joVar2;
                                }
                            }
                        }
                    };
                    ux2Var.g0(obj2);
                    objK2 = obj2;
                } else {
                    i6 = 0;
                }
                nc7Var = (nc7) objK2;
                if (nc7Var == mc7.a) {
                    fs4VarF = fs4Var2;
                } else {
                    fs4VarF = fs4Var2.f(new qc7(ux4Var, nc7Var)).f(rc7.b);
                }
                ua0.a(fs4VarF, ux2Var, i6);
                f5 = f8;
                f6 = f9;
            } else {
                ux2Var.Q();
                f5 = f4;
                f6 = f3;
            }
            fs4Var3 = fs4Var2;
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.rb5
                    @Override // o.hw2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        this.m.b(z2, z3, mw4Var, fs4Var3, cq7Var, pw6Var, f6, f5, (ux2) obj3, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i8 |= 3072;
        fs4Var2 = fs4Var;
        if (ux2Var.f(cq7Var)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i12 = i8 | i3;
        if (ux2Var.f(pw6Var)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        i5 = i12 | i4;
        if ((i & 1572864) == 0) {
            f3 = f;
            if ((i2 & 64) == 0) {
                i7 = 524288;
            } else {
                i7 = 524288;
            }
            i5 |= i7;
        } else {
            f3 = f;
        }
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                f4 = f2;
                if (ux2Var.c(f4)) {
                }
                i5 |= i11;
            } else {
                f4 = f2;
            }
            i5 |= i11;
        } else {
            f4 = f2;
        }
        z4 = true;
        if ((i5 & 38347923) != 38347922) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (ux2Var.N(i5 & 1, z5)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    i5 &= -29360129;
                    f4 = 1.0f;
                }
                fs4Var2 = fs4Var4;
                f8 = f4;
                f9 = f7;
            } else {
                if (i9 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if ((i2 & 64) != 0) {
                    i5 &= -3670017;
                    f7 = 2.0f;
                } else {
                    f7 = f3;
                }
                if ((i2 & 128) != 0) {
                    i5 &= -29360129;
                    f4 = 1.0f;
                }
                fs4Var2 = fs4Var4;
                f8 = f4;
                f9 = f7;
            }
            ux2Var.q();
            if ((i5 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            objK = ux2Var.K();
            Object obj3 = e01.a;
            if (z6) {
                objK = new ux4(mw4Var);
                ux2Var.g0(objK);
            } else {
                objK = new ux4(mw4Var);
                ux2Var.g0(objK);
            }
            ux4Var = (ux4) objK;
            e87VarC0 = xs1.c0(du4.p, ux2Var);
            boolean z12 = ((((i5 & 458752) ^ 196608) <= 131072 && ux2Var.f(pw6Var)) || (i5 & 196608) == 131072) | ((((57344 & i5) ^ 24576) <= 16384 && ux2Var.f(cq7Var)) || (i5 & 24576) == 16384);
            if ((i5 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i5 & 112) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean zH2 = z13 | z8 | ((((29360128 & i5) ^ 12582912) <= 8388608 && ux2Var.c(f8)) || (i5 & 12582912) == 8388608) | ux2Var.h(e87VarC0);
            z4 = ((3670016 & i5) ^ 1572864) > 1048576 ? false : false;
            z9 = zH2 | z4;
            objK2 = ux2Var.K();
            if (z9) {
                i6 = 0;
                Object obj4 = new nc7() { // from class: o.qb5
                    @Override // o.nc7
                    public final void a(pb6 pb6Var) {
                        e87 e87Var = e87VarC0;
                        float f10 = f9;
                        pb6Var.h(pw6Var);
                        cq7 cq7Var2 = cq7Var;
                        boolean z14 = z2;
                        boolean z15 = z3;
                        pb6Var.a(cq7Var2.a(z14, z15, false));
                        x37.h(pb6Var, f8, cq7Var2.d(z14, z15, false));
                        wc7 wc7Var = pb6Var.n;
                        wc7Var.getClass();
                        rx4 rx4Var = wc7Var.K.c;
                        if ((((qx4) v47.s(rx4Var.m, rx4Var)).c & 4) != 0) {
                            jo joVar = pb6Var.x;
                            jo joVar2 = pb6Var.y;
                            try {
                                pb6Var.x = e87Var;
                                pb6Var.y = e87Var;
                                pb6Var.a(cq7Var2.a(z14, z15, true));
                                x37.h(pb6Var, f10, cq7Var2.d(z14, z15, true));
                            } finally {
                                pb6Var.x = joVar;
                                pb6Var.y = joVar2;
                            }
                        }
                    }
                };
                ux2Var.g0(obj4);
                objK2 = obj4;
            } else {
                i6 = 0;
                Object obj5 = new nc7() { // from class: o.qb5
                    @Override // o.nc7
                    public final void a(pb6 pb6Var) {
                        e87 e87Var = e87VarC0;
                        float f10 = f9;
                        pb6Var.h(pw6Var);
                        cq7 cq7Var2 = cq7Var;
                        boolean z14 = z2;
                        boolean z15 = z3;
                        pb6Var.a(cq7Var2.a(z14, z15, false));
                        x37.h(pb6Var, f8, cq7Var2.d(z14, z15, false));
                        wc7 wc7Var = pb6Var.n;
                        wc7Var.getClass();
                        rx4 rx4Var = wc7Var.K.c;
                        if ((((qx4) v47.s(rx4Var.m, rx4Var)).c & 4) != 0) {
                            jo joVar = pb6Var.x;
                            jo joVar2 = pb6Var.y;
                            try {
                                pb6Var.x = e87Var;
                                pb6Var.y = e87Var;
                                pb6Var.a(cq7Var2.a(z14, z15, true));
                                x37.h(pb6Var, f10, cq7Var2.d(z14, z15, true));
                            } finally {
                                pb6Var.x = joVar;
                                pb6Var.y = joVar2;
                            }
                        }
                    }
                };
                ux2Var.g0(obj5);
                objK2 = obj5;
            }
            nc7Var = (nc7) objK2;
            if (nc7Var == mc7.a) {
                fs4VarF = fs4Var2;
            } else {
                fs4VarF = fs4Var2.f(new qc7(ux4Var, nc7Var)).f(rc7.b);
            }
            ua0.a(fs4VarF, ux2Var, i6);
            f5 = f8;
            f6 = f9;
        } else {
            ux2Var.Q();
            f5 = f4;
            f6 = f3;
        }
        fs4Var3 = fs4Var2;
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.rb5
                @Override // o.hw2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    this.m.b(z2, z3, mw4Var, fs4Var3, cq7Var, pw6Var, f6, f5, (ux2) obj6, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public void c(final String str, final hw2 hw2Var, final boolean z2, final boolean z3, final tg8 tg8Var, final mw4 mw4Var, final boolean z4, final hw2 hw2Var2, final hw2 hw2Var3, final hw2 hw2Var4, final hw2 hw2Var5, final hw2 hw2Var6, final cq7 cq7Var, nd5 nd5Var, final yy0 yy0Var, ux2 ux2Var, final int i) {
        int i2;
        boolean z5;
        boolean z6;
        final nd5 nd5Var2;
        nd5 pd5Var;
        int i3;
        yy0 yy0Var2;
        ux2Var.Y(-1732281618);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(hw2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i2 |= ux2Var.g(z5) ? 256 : 128;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            z6 = z3;
            i2 |= ux2Var.g(z6) ? 2048 : 1024;
        } else {
            z6 = z3;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.f(tg8Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.f(mw4Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= ux2Var.g(z4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= ux2Var.h(hw2Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= ux2Var.h(hw2Var3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= ux2Var.h(hw2Var4) ? 536870912 : 268435456;
        }
        int i4 = 14155776 | (ux2Var.h(hw2Var5) ? 4 : 2) | (ux2Var.h(null) ? 32 : 16) | (ux2Var.h(null) ? 256 : 128) | (ux2Var.h(hw2Var6) ? 2048 : 1024) | (ux2Var.f(cq7Var) ? 16384 : 8192) | 65536;
        int i5 = i2;
        if (ux2Var.N(i5 & 1, ((i2 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                pd5Var = new pd5(16.0f, 16.0f, 16.0f, 16.0f);
                i3 = i4 & (-458753);
            } else {
                ux2Var.Q();
                i3 = i4 & (-458753);
                pd5Var = nd5Var;
            }
            ux2Var.q();
            int i6 = i3;
            boolean z7 = ((i5 & 57344) == 16384) | ((i5 & 14) == 4);
            Object objK = ux2Var.K();
            if (z7 || objK == e01.a) {
                objK = tg8Var.c(new xo(str));
                ux2Var.g0(objK);
            }
            String str2 = ((e18) objK).a.n;
            wq7 wq7Var = new wq7();
            if (hw2Var2 == null) {
                ux2Var.W(1927010204);
                ux2Var.p(false);
                yy0Var2 = null;
            } else {
                ux2Var.W(1927010205);
                yy0 yy0VarO = au8.O(-1819131923, new lj1(hw2Var2, (byte) 1), ux2Var);
                ux2Var.p(false);
                yy0Var2 = yy0VarO;
            }
            int i7 = i5 >> 12;
            int i8 = i6 << 18;
            m77.a(str2, hw2Var, wq7Var, yy0Var2, hw2Var3, hw2Var4, hw2Var5, hw2Var6, z6, z5, z4, mw4Var, pd5Var, cq7Var, yy0Var, ux2Var, (i5 & 112) | (i7 & 57344) | (i7 & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192), ((i5 >> 9) & 14) | ((i5 >> 3) & 112) | (i7 & 896) | ((i5 >> 6) & 7168) | ((i6 << 3) & 458752) | 1572864);
            nd5Var2 = pd5Var;
        } else {
            ux2Var.Q();
            nd5Var2 = nd5Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.sb5
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    this.m.c(str, hw2Var, z2, z3, tg8Var, mw4Var, z4, hw2Var2, hw2Var3, hw2Var4, hw2Var5, hw2Var6, cq7Var, nd5Var2, yy0Var, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    @Override // o.lg1
    public Iterable d(Object obj) {
        switch (this.m) {
            case 8:
                int i = bp1.a;
                Collection collectionJ = ((qb8) obj).j();
                ArrayList arrayList = new ArrayList(mv0.Z(collectionJ, 10));
                Iterator it = ((ArrayList) collectionJ).iterator();
                while (it.hasNext()) {
                    arrayList.add(((qb8) it.next()).a());
                }
                return arrayList;
            default:
                int i2 = u24.p;
                Collection collectionB = ((ns4) obj).q().b();
                collectionB.getClass();
                return new ex(bq6.k0(new fx(collectionB, (byte) 1), e24.r), (byte) 2);
        }
    }

    @Override // o.rb8
    public Object g(kr3 kr3Var, float f) {
        switch (this.m) {
            case ep1.d /* 12 */:
                return Integer.valueOf(Math.round(qr3.d(kr3Var) * f));
            default:
                int iQ = kr3Var.q();
                if (iQ != 1 && iQ != 3) {
                    if (iQ != 7) {
                        hk0.g("Cannot convert json to point. Next token is ".concat(e41.w(iQ)));
                        return null;
                    }
                    PointF pointF = new PointF(((float) kr3Var.nextDouble()) * f, ((float) kr3Var.nextDouble()) * f);
                    while (kr3Var.hasNext()) {
                        kr3Var.v();
                    }
                    return pointF;
                }
                return qr3.b(kr3Var, f);
        }
    }

    @Override // o.ja0
    public long j(int i, rr0 rr0Var) {
        return ((vs7) rr0Var.e).j(i);
    }

    public String toString() {
        switch (this.m) {
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return "ReferentialEqualityPolicy";
            case 23:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // o.vc1
    public Object w(Object obj) throws IOException {
        switch (this.m) {
            case 4:
                nc6 nc6Var = (nc6) obj;
                try {
                    bf0 bf0Var = new bf0();
                    nc6Var.E0().r0(bf0Var);
                    return new mc6(nc6Var.q(), nc6Var.j(), bf0Var);
                } finally {
                    nc6Var.close();
                }
            case 20:
                String strU = ((nc6) obj).u();
                if (strU.length() == 1) {
                    return Character.valueOf(strU.charAt(0));
                }
                throw new IOException("Expected body of length 1 for Character conversion but was " + strU.length());
            default:
                return Short.valueOf(((nc6) obj).u());
        }
    }
}
