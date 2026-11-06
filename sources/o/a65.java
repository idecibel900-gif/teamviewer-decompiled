package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceFilteringModel;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntry;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntryType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.manageddevices.models.DevicePoolType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceType;
import com.teamviewer.apidefinitions.recentconnections.models.RecentConnectionsItem;
import com.teamviewer.apidefinitions.recentconnections.models.RecentConnectionsItemType;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class a65 implements z55, dj0, hl0, sa5, xs0, ex5, di6 {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f302o;

    public a65(byte b) {
        this.m = b;
        switch (b) {
            case 13:
                this.n = new HashSet();
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                this.n = new LinkedHashMap();
                this.f302o = new LinkedHashMap();
                break;
            case 28:
                this.n = new ArrayList();
                this.f302o = new n97();
                break;
            case 29:
                this.n = new Object();
                kw4 kw4Var = uk3.a;
                this.f302o = new kw4();
                break;
            default:
                this.n = new xx4(new LayoutNode[16]);
                break;
        }
    }

    public static void z0(LayoutNode layoutNode) {
        if (layoutNode.b0 > 0) {
            layoutNode.j();
            layoutNode.a0 = false;
            xx4 xx4VarL = layoutNode.L();
            Object[] objArr = xx4VarL.m;
            int i = xx4VarL.f2559o;
            for (int i2 = 0; i2 < i; i2++) {
                z0((LayoutNode) objArr[i2]);
            }
        }
    }

    @Override // o.xs0
    public boolean A(i07 i07Var) {
        i07Var.getClass();
        g07 g07VarM = db8.m(i07Var);
        return (g07VarM != null ? db8.j(this, g07VarM) : null) != null;
    }

    public void A0(int i) {
        int[] iArr = (int[]) this.n;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.n = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.n = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.n;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // o.xs0
    public boolean B(l48 l48Var) {
        return db8.K(l48Var);
    }

    public void B0(String str, String str2, Function1 function1) {
        LinkedHashMap linkedHashMap = ((og1) this.f302o).a;
        yz6 yz6Var = new yz6(this, str, str2);
        function1.invoke(yz6Var);
        String str3 = (String) this.n;
        ArrayList arrayList = yz6Var.b;
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((vd5) it.next()).m);
        }
        String strI = (String) yz6Var.c.m;
        strI.getClass();
        StringBuilder sb = new StringBuilder(str);
        sb.append('(');
        sb.append(lv0.t0(arrayList2, "", null, null, e24.J, 30));
        sb.append(')');
        if (strI.length() > 1) {
            strI = to7.i(';', "L", strI);
        }
        sb.append(strI);
        String str4 = str3 + '.' + sb.toString();
        s48 s48Var = (s48) yz6Var.c.n;
        ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((s48) ((vd5) it2.next()).n);
        }
        linkedHashMap.put(str4, new zp5(s48Var, arrayList3, yz6Var.a));
    }

    @Override // o.xs0
    public am0 C(i07 i07Var) {
        return db8.j(this, i07Var);
    }

    public AutofillManager C0() {
        AutofillManager autofillManager = (AutofillManager) this.f302o;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.n).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.f302o = autofillManager2;
            return autofillManager2;
        }
        hk0.l("Could not locate AutofillManager from context");
        return null;
    }

    @Override // o.xs0
    public int D(f48 f48Var) {
        f48Var.getClass();
        if (f48Var instanceof i07) {
            return db8.h((sz3) f48Var);
        }
        if (f48Var instanceof zv) {
            return ((zv) f48Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(f48Var);
        gk0.q(sb, ", ", w86.a.b(f48Var.getClass()));
        return 0;
    }

    public xh6 D0(String str) {
        xh6 xh6Var;
        zh6 zh6Var = (zh6) this.n;
        synchronized (zh6Var.c) {
            xh6Var = (xh6) zh6Var.d.g(str);
        }
        return xh6Var;
    }

    @Override // o.xs0
    public w87 E(sz3 sz3Var) {
        return db8.n(sz3Var);
    }

    public File E0(Context context, String str) {
        return new File(context.getDir("lib", 0), wj5.i(str));
    }

    @Override // o.xs0
    public void F(i07 i07Var) {
        db8.c0(i07Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[DONT_INVERT, PHI: r5
      0x0072: PHI (r5v3 long) = (r5v2 long), (r5v4 long) binds: [B:8:0x0025, B:24:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[LOOP:0: B:7:0x0017->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[EDGE_INSN: B:34:0x0077->B:27:0x0077 BREAK  A[LOOP:0: B:7:0x0017->B:26:0x0074], SYNTHETIC] */
    public long F0() {
        long j;
        int i;
        synchronized (this.n) {
            kw4 kw4Var = (kw4) this.f302o;
            int[] iArr = kw4Var.b;
            Object[] objArr = kw4Var.c;
            long[] jArr = kw4Var.a;
            int length = jArr.length - 2;
            j = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                oc7 oc7Var = (oc7) objArr[i6];
                                i = i3;
                                if (oc7Var.c == pc7.q || ((Boolean) oc7Var.b.d.getValue()).booleanValue()) {
                                    j |= 1 << i7;
                                }
                            } else {
                                i = i3;
                            }
                            j2 >>= i;
                            i5++;
                            i3 = i;
                        }
                        if (i4 != i3) {
                            break;
                        }
                        if (i2 != length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return j;
    }

    @Override // o.di6
    public Object G(jh6 jh6Var, Object obj) {
        return ((hw2) this.n).invoke(jh6Var, obj);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005c -> B:20:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public java.lang.Object G0(o.jc1 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof o.sd5
            if (r0 == 0) goto L13
            r0 = r9
            o.sd5 r0 = (o.sd5) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            o.sd5 r0 = new o.sd5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f2011o
            int r1 = r0.q
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r1 = r0.n
            java.util.List r3 = r0.m
            o.ct1.a0(r9)
            goto L5f
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r8)
            r8 = 0
            return r8
        L30:
            o.ct1.a0(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r1 = 0
            r3 = r9
            r9 = r1
        L3b:
            if (r1 != 0) goto L84
            java.lang.Object r1 = r8.n
            o.wr6 r1 = (o.wr6) r1
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r9)
            java.lang.Integer r5 = new java.lang.Integer
            r6 = 100
            r5.<init>(r6)
            r0.m = r3
            r0.n = r9
            r0.q = r2
            java.lang.Object r1 = r1.d(r4, r5, r0)
            o.ne1 r4 = o.ne1.m
            if (r1 != r4) goto L5c
            return r4
        L5c:
            r7 = r1
            r1 = r9
            r9 = r7
        L5f:
            o.tc6 r9 = (o.tc6) r9
            java.lang.Object r9 = r9.m
            java.lang.Throwable r4 = o.tc6.a(r9)
            if (r4 != 0) goto L77
            o.rd5 r9 = (o.rd5) r9
            java.util.ArrayList r4 = r9.a
            o.qv0.c0(r3, r4)
            boolean r9 = r9.b
            int r1 = r1 + r2
            r7 = r1
            r1 = r9
            r9 = r7
            goto L3b
        L77:
            java.lang.Object r8 = r8.f302o
            o.fk6 r8 = (o.fk6) r8
            r8.invoke(r4)
            o.sc6 r8 = new o.sc6
            r8.<init>(r4)
            return r8
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a65.G0(o.jc1):java.lang.Object");
    }

    @Override // o.xs0
    public boolean H(i07 i07Var) {
        return db8.P(i07Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public void H0(Context context, String str) {
        String[] strArrO;
        InputStream inputStream;
        InputStream inputStream2;
        ?? r16;
        ?? r11;
        if (context == null) {
            hk0.g("Given context is null");
            return;
        }
        if (str.length() == 0) {
            hk0.g("Given library is either null or empty");
            return;
        }
        I0("Beginning load of %s...", str);
        HashSet hashSet = (HashSet) this.n;
        if (hashSet.contains(str)) {
            I0("%s already loaded previously!", str);
            return;
        }
        cj3 cj3Var = null;
        try {
            System.loadLibrary(str);
            hashSet.add(str);
            I0("%s (%s) was loaded normally!", str, null);
        } catch (UnsatisfiedLinkError e) {
            I0("Loading the library normally failed: %s", Log.getStackTraceString(e));
            I0("%s (%s) was not loaded normally, re-linking...", str, null);
            ?? E0 = E0(context, str);
            if (!E0.exists()) {
                boolean z = false;
                File dir = context.getDir("lib", 0);
                File fileE0 = E0(context, str);
                File[] fileArrListFiles = dir.listFiles(new g36(wj5.i(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileE0.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str2 = Build.CPU_ABI2;
                    strArr = (str2 == null || str2.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str2};
                }
                String strI = wj5.i(str);
                try {
                    cj3 cj3VarK = ir.k(context, strArr, strI, this);
                    try {
                        if (cj3VarK == null) {
                            try {
                                strArrO = ir.o(context, strI);
                            } catch (Exception e2) {
                                strArrO = new String[]{e2.toString()};
                            }
                            StringBuilder sbP = ua5.p("Could not find '", strI, "'. Looked for: ");
                            sbP.append(Arrays.toString(strArr));
                            sbP.append(", but only found: ");
                            throw new nr4(e41.l(sbP, Arrays.toString(strArrO), "."));
                        }
                        ZipFile zipFile = (ZipFile) cj3VarK.n;
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            if (i >= 5) {
                                f36 f36Var = (f36) this.f302o;
                                if (f36Var == null) {
                                    break;
                                }
                                f36Var.a("FATAL! Couldn't extract the library from the APK!");
                                break;
                            }
                            I0("Found %s! Extracting...", strI);
                            try {
                                if (E0.exists() || E0.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream((ZipEntry) cj3VarK.f531o);
                                        try {
                                            ?? G = io.sentry.config.a.g(new FileOutputStream((File) E0), E0);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j = 0;
                                                ?? r7 = z;
                                                while (true) {
                                                    int i3 = inputStream2.read(bArr);
                                                    if (i3 == -1) {
                                                        break;
                                                    }
                                                    G.write(bArr, r7, i3);
                                                    j += (long) i3;
                                                    strI = strI;
                                                    r7 = 0;
                                                }
                                                G.flush();
                                                G.getFD().sync();
                                                if (j == E0.length()) {
                                                    ir.e(inputStream2);
                                                    ir.e(G);
                                                    E0.setReadable(true, r7);
                                                    E0.setExecutable(true, r7);
                                                    E0.setWritable(true);
                                                    break;
                                                }
                                                ir.e(inputStream2);
                                                ir.e(G);
                                            } catch (FileNotFoundException unused) {
                                                strI = strI;
                                                r11 = G;
                                                ir.e(inputStream2);
                                                ir.e(r11);
                                                strI = strI;
                                                i = i2;
                                                z = false;
                                            } catch (IOException unused2) {
                                                strI = strI;
                                                r11 = G;
                                                ir.e(inputStream2);
                                                ir.e(r11);
                                                strI = strI;
                                                i = i2;
                                                z = false;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = inputStream2;
                                                r16 = G;
                                                ir.e(inputStream);
                                                ir.e(r16);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused3) {
                                            r11 = 0;
                                            ir.e(inputStream2);
                                            ir.e(r11);
                                            strI = strI;
                                            i = i2;
                                            z = false;
                                        } catch (IOException unused4) {
                                            r11 = 0;
                                            ir.e(inputStream2);
                                            ir.e(r11);
                                            strI = strI;
                                            i = i2;
                                            z = false;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = inputStream2;
                                            r16 = 0;
                                            ir.e(inputStream);
                                            ir.e(r16);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused5) {
                                        inputStream2 = null;
                                    } catch (IOException unused6) {
                                        inputStream2 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = null;
                                    }
                                }
                            } catch (IOException unused7) {
                            }
                            strI = strI;
                            strI = strI;
                            i = i2;
                            z = false;
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused8) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cj3Var = cj3VarK;
                        if (cj3Var != null) {
                            try {
                                ((ZipFile) cj3Var.n).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            System.load(E0.getAbsolutePath());
            hashSet.add(str);
            I0("%s (%s) was re-linked!", str, null);
        }
    }

    @Override // o.sa5
    public boolean I() {
        return ((sa5) this.n).I();
    }

    public void I0(String str, Object... objArr) {
        String str2 = String.format(Locale.US, str, objArr);
        f36 f36Var = (f36) this.f302o;
        if (f36Var != null) {
            f36Var.a(str2);
        }
    }

    @Override // o.xs0
    public m98 J(i07 i07Var, i07 i07Var2) {
        return db8.s(this, i07Var, i07Var2);
    }

    public void J0(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            C0().notifyViewVisibilityChanged(view, i, z);
        }
    }

    @Override // o.xs0
    public Collection K(i07 i07Var) {
        return db8.u0(this, i07Var);
    }

    public void K0(int i, int i2) {
        int[] iArr = (int[]) this.n;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        A0(i3);
        int[] iArr2 = (int[]) this.n;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.n, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f302o;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j87 j87Var = (j87) ((ArrayList) this.f302o).get(size);
            int i4 = j87Var.m;
            if (i4 >= i) {
                j87Var.m = i4 + i2;
            }
        }
    }

    @Override // o.xs0
    public boolean L(am0 am0Var) {
        return db8.Z(am0Var);
    }

    public void L0(int i, int i2) {
        int[] iArr = (int[]) this.n;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        A0(i3);
        int[] iArr2 = (int[]) this.n;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.n;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f302o;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j87 j87Var = (j87) ((ArrayList) this.f302o).get(size);
            int i4 = j87Var.m;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f302o).remove(size);
                } else {
                    j87Var.m = i4 - i2;
                }
            }
        }
    }

    @Override // o.xs0
    public q58 M(d58 d58Var) {
        d58Var.getClass();
        ub8 ub8VarB = d58Var.B();
        ub8VarB.getClass();
        return o77.f(ub8VarB);
    }

    public void M0() {
        ((zh6) this.n).a();
    }

    @Override // o.xs0
    public int N(l48 l48Var) {
        return db8.s0(l48Var);
    }

    public void N0(Bundle bundle) {
        zh6 zh6Var = (zh6) this.n;
        ai6 ai6Var = zh6Var.a;
        if (!zh6Var.e) {
            zh6Var.a();
        }
        if (ai6Var.getR().i.compareTo(m84.p) >= 0) {
            yq4.k(ai6Var.getR().i, "performRestore cannot be called when owner is ");
            return;
        }
        if (zh6Var.g) {
            hk0.l("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleN = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleN = lv1.N("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        zh6Var.f = bundleN;
        zh6Var.g = true;
    }

    @Override // o.xs0
    public boolean O(i07 i07Var, i07 i07Var2) {
        return db8.I(i07Var, i07Var2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[LOOP:0: B:10:0x002b->B:23:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[EDGE_INSN: B:34:0x0073->B:24:0x0073 BREAK  A[LOOP:0: B:10:0x002b->B:23:0x0070], SYNTHETIC] */
    public void O0(Bundle bundle) {
        zh6 zh6Var = (zh6) this.n;
        Bundle bundleG = mo8.g((vd5[]) Arrays.copyOf(new vd5[0], 0));
        Bundle bundle2 = zh6Var.f;
        if (bundle2 != null) {
            bundleG.putAll(bundle2);
        }
        synchronized (zh6Var.c) {
            jx4 jx4Var = zh6Var.d;
            Object[] objArr = jx4Var.b;
            Object[] objArr2 = jx4Var.c;
            long[] jArr = jx4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                String str = (String) objArr[i4];
                                Bundle bundleA = ((xh6) objArr2[i4]).a();
                                str.getClass();
                                bundleG.putBundle(str, bundleA);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        if (bundleG.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleG);
    }

    public void P(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + strValueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        ((ArrayList) this.n).add(sb.toString());
    }

    public void P0(wc7 wc7Var) {
        int i;
        kw4 kw4Var = (kw4) this.f302o;
        int[] iArr = kw4Var.b;
        Object[] objArr = kw4Var.c;
        long[] jArr = kw4Var.a;
        int i2 = 2;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j) < 128) {
                        int i7 = (i3 << 3) + i6;
                        int i8 = iArr[i7];
                        oc7 oc7Var = (oc7) objArr[i7];
                        pc7 pc7Var = oc7Var.c;
                        a65 a65Var = oc7Var.e;
                        int iOrdinal = pc7Var.ordinal();
                        if (iOrdinal != 0) {
                            byte b = 24;
                            hc1 hc1Var = null;
                            i = i4;
                            if (iOrdinal == i2) {
                                oc7Var.c = pc7.q;
                                me1 me1VarI0 = wc7Var.I0();
                                n87 n87Var = oc7Var.d;
                                if (n87Var != null) {
                                    n87Var.j(null);
                                }
                                oc7Var.d = im3.R(me1VarI0, null, null, new vt4(a65Var, oc7Var, hc1Var, b), 3);
                            } else if (iOrdinal == 3) {
                                me1 me1VarI1 = wc7Var.I0();
                                n87 n87Var2 = oc7Var.d;
                                if (n87Var2 != null) {
                                    n87Var2.j(null);
                                }
                                oc7Var.d = im3.R(me1VarI1, null, null, new vt4(a65Var, oc7Var, hc1Var, b), 3);
                            }
                        } else {
                            i = i4;
                            oc7Var.c = pc7.r;
                        }
                    } else {
                        i = i4;
                    }
                    j >>= i;
                    i6++;
                    i4 = i;
                    i2 = 2;
                }
                if (i5 != i4) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            }
            i3++;
            i2 = 2;
        }
    }

    public void Q(ValueAnimator valueAnimator) {
        ol5 ol5Var = new ol5((byte) 10);
        valueAnimator.addListener((n97) this.f302o);
        ((ArrayList) this.n).add(ol5Var);
    }

    public void Q0(String str, xh6 xh6Var) {
        zh6 zh6Var = (zh6) this.n;
        synchronized (zh6Var.c) {
            if (zh6Var.d.b(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            zh6Var.d.m(str, xh6Var);
        }
    }

    @Override // o.xs0
    public boolean R(i07 i07Var) {
        i07Var.getClass();
        return db8.M(db8.K0(i07Var));
    }

    public void R0(Object obj) {
        ThreadLocal threadLocal = (ThreadLocal) this.n;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) threadLocal.get()).get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            threadLocal.set(new SoftReference(arrayDeque));
        }
        if (arrayDeque.size() < 12) {
            arrayDeque.push(obj);
        }
    }

    @Override // o.xs0
    public boolean S(sz3 sz3Var) {
        sz3Var.getClass();
        return !im3.n(db8.K0(d(sz3Var)), db8.K0(z(sz3Var)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable S0(List list, jc1 jc1Var) {
        g56 g56Var;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f302o;
        if (jc1Var instanceof g56) {
            g56Var = (g56) jc1Var;
            int i = g56Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                g56Var.q = i - Integer.MIN_VALUE;
            } else {
                g56Var = new g56(this, jc1Var);
            }
        } else {
            g56Var = new g56(this, jc1Var);
        }
        Object objT0 = g56Var.f863o;
        int i2 = g56Var.q;
        if (i2 == 0) {
            ct1.a0(objT0);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                RecentConnectionsItem recentConnectionsItem = (RecentConnectionsItem) obj;
                if (recentConnectionsItem.getItemType() == RecentConnectionsItemType.Device && recentConnectionsItem.getBuddyId() == null) {
                    arrayList.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(new Long(((RecentConnectionsItem) obj2).getConnectId()))) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(String.valueOf(((RecentConnectionsItem) it.next()).getConnectId()));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (!concurrentHashMap2.containsKey((String) obj3)) {
                    arrayList4.add(obj3);
                }
            }
            g56Var.m = list;
            g56Var.n = concurrentHashMap2;
            g56Var.q = 1;
            objT0 = T0(arrayList4, g56Var);
            ne1 ne1Var = ne1.m;
            if (objT0 == ne1Var) {
                return ne1Var;
            }
            concurrentHashMap = concurrentHashMap2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            concurrentHashMap = g56Var.n;
            list = g56Var.m;
            ct1.a0(objT0);
        }
        concurrentHashMap.putAll((Map) objT0);
        ArrayList arrayList5 = new ArrayList(mv0.Z(list, 10));
        for (RecentConnectionsItem recentConnectionsItem2 : list) {
            x46 x46VarH0 = db8.H0(recentConnectionsItem2);
            jz1 jz1Var = recentConnectionsItem2.getItemType() != RecentConnectionsItemType.Device ? null : recentConnectionsItem2.getBuddyId() == null ? (jz1) concurrentHashMap2.get(String.valueOf(recentConnectionsItem2.getConnectId())) : jz1.m;
            String str = x46VarH0.a;
            String str2 = x46VarH0.b;
            f95 f95Var = x46VarH0.c;
            hs1 hs1Var = x46VarH0.e;
            str.getClass();
            str2.getClass();
            f95Var.getClass();
            hs1Var.getClass();
            arrayList5.add(new x46(str, str2, f95Var, jz1Var, hs1Var));
        }
        return arrayList5;
    }

    @Override // o.xs0
    public m98 T(ArrayList arrayList) {
        g07 g07Var;
        int size = arrayList.size();
        if (size == 0) {
            hk0.l("Expected some types");
            return null;
        }
        if (size == 1) {
            return (m98) lv0.E0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            m98 m98Var = (m98) it.next();
            z = z || ct1.K(m98Var);
            if (m98Var instanceof g07) {
                g07Var = (g07) m98Var;
            } else {
                if (!(m98Var instanceof um2)) {
                    gk0.s();
                    return null;
                }
                g07Var = ((um2) m98Var).n;
                z2 = true;
            }
            arrayList2.add(g07Var);
        }
        if (z) {
            return hd2.c(gd2.J, arrayList.toString());
        }
        b58 b58Var = b58.a;
        if (!z2) {
            return b58Var.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(bt1.V((m98) it2.next()));
        }
        return bt1.v(b58Var.b(arrayList2), b58Var.b(arrayList3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object T0(ArrayList arrayList, jc1 jc1Var) {
        h56 h56Var;
        Object objD;
        if (jc1Var instanceof h56) {
            h56Var = (h56) jc1Var;
            int i = h56Var.f951o;
            if ((i & Integer.MIN_VALUE) != 0) {
                h56Var.f951o = i - Integer.MIN_VALUE;
            } else {
                h56Var = new h56(this, jc1Var);
            }
        } else {
            h56Var = new h56(this, jc1Var);
        }
        Object obj = h56Var.m;
        int i2 = h56Var.f951o;
        fa2 fa2Var = fa2.m;
        if (i2 == 0) {
            ct1.a0(obj);
            if (arrayList.isEmpty()) {
                return fa2Var;
            }
            hl4 hl4Var = (hl4) this.n;
            DeviceFilteringModel deviceFilteringModel = new DeviceFilteringModel(DevicePoolType.Combined, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Integer(arrayList.size()), null, null, null, null, null, qf0.K(DeviceListEntryType.Managed), null, 25034746, null);
            h56Var.f951o = 1;
            objD = ((xl4) hl4Var).d(deviceFilteringModel, h56Var);
            ne1 ne1Var = ne1.m;
            if (objD == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objD = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objD);
        if (thA != null) {
            ua5.v("Failed to resolve managed recent devices: ", thA.getMessage(), "RecentDeviceTypeResolver");
            return fa2Var;
        }
        List<DeviceListEntry> items = ((DeviceListResponse) objD).getItems();
        ArrayList arrayList2 = new ArrayList();
        for (DeviceListEntry deviceListEntry : items) {
            DeviceType deviceType = deviceListEntry.getDeviceType();
            vd5 vd5Var = deviceType != null ? new vd5(String.valueOf(deviceListEntry.getTeamViewerId()), db8.D0(deviceType)) : null;
            if (vd5Var != null) {
                arrayList2.add(vd5Var);
            }
        }
        return xm4.U(arrayList2);
    }

    @Override // o.xs0
    public boolean U(i07 i07Var) {
        i07Var.getClass();
        return db8.T(db8.K0(i07Var));
    }

    public void U0() {
        if (!((zh6) this.n).h) {
            hk0.l("Can not perform this action after onSaveInstanceState");
            return;
        }
        vr vrVar = (vr) this.f302o;
        if (vrVar == null) {
            vrVar = new vr(this);
        }
        this.f302o = vrVar;
        try {
            i64.class.getDeclaredConstructor(null);
            vr vrVar2 = (vr) this.f302o;
            if (vrVar2 != null) {
                ((LinkedHashSet) vrVar2.b).add(i64.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + i64.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    @Override // o.xs0
    public boolean V(i07 i07Var) {
        i07Var.getClass();
        return db8.W(c(i07Var)) && !db8.X(i07Var);
    }

    public float V0(int i) {
        synchronized (this.n) {
            oc7 oc7Var = (oc7) ((kw4) this.f302o).b(i);
            float fFloatValue = 0.0f;
            if (oc7Var == null) {
                return 0.0f;
            }
            if (oc7Var.c != pc7.q) {
                fFloatValue = ((Number) oc7Var.b.d()).floatValue();
            }
            return fFloatValue;
        }
    }

    public Object W() {
        ThreadLocal threadLocal = (ThreadLocal) this.n;
        ArrayDeque arrayDeque = (ArrayDeque) ((SoftReference) threadLocal.get()).get();
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            threadLocal.set(new SoftReference(arrayDeque));
        }
        return !arrayDeque.isEmpty() ? arrayDeque.pop() : ((Supplier) this.f302o).get();
    }

    @Override // o.xs0
    public boolean X(l48 l48Var, l48 l48Var2) {
        l48Var.getClass();
        l48Var2.getClass();
        if (!(l48Var instanceof k48)) {
            hk0.g("Failed requirement.");
            return false;
        }
        if (!(l48Var2 instanceof k48)) {
            hk0.g("Failed requirement.");
            return false;
        }
        if (db8.g(l48Var, l48Var2)) {
            return true;
        }
        k48 k48Var = (k48) l48Var;
        k48 k48Var2 = (k48) l48Var2;
        Map map = (Map) this.n;
        if (((pz3) this.f302o).j(k48Var, k48Var2)) {
            return true;
        }
        if (map != null) {
            k48 k48Var3 = (k48) map.get(k48Var);
            k48 k48Var4 = (k48) map.get(k48Var2);
            if (k48Var3 != null && k48Var3.equals(k48Var2)) {
                return true;
            }
            if (k48Var4 != null && k48Var4.equals(k48Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.xs0
    public h58 Y(xl0 xl0Var) {
        return db8.v0(xl0Var);
    }

    @Override // o.xs0
    public boolean Z(sz3 sz3Var) {
        sz3Var.getClass();
        g07 g07VarM = db8.m(sz3Var);
        return (g07VarM != null ? db8.k(g07VarM) : null) != null;
    }

    @Override // o.dj0
    public void a(lc6 lc6Var) {
        cj0 cj0Var = (cj0) this.n;
        a75 a75Var = (a75) this.f302o;
        try {
            try {
                cj0Var.e(a75Var, a75Var.c(lc6Var));
            } catch (Throwable th) {
                im3.c0(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            im3.c0(th2);
            try {
                cj0Var.d(a75Var, th2);
            } catch (Throwable th3) {
                im3.c0(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // o.xs0
    public boolean a0(am0 am0Var) {
        return am0Var instanceof vl0;
    }

    @Override // o.di6
    public Object b(Object obj) {
        return ((Function1) this.f302o).invoke(obj);
    }

    @Override // o.xs0
    public k48 b0(i07 i07Var) {
        return db8.K0(i07Var);
    }

    @Override // o.xs0
    public k48 c(sz3 sz3Var) {
        sz3Var.getClass();
        g07 g07VarM = db8.m(sz3Var);
        if (g07VarM == null) {
            g07VarM = d(sz3Var);
        }
        return db8.K0(g07VarM);
    }

    @Override // o.xs0
    public q58 c0(h58 h58Var) {
        return db8.E(h58Var);
    }

    @Override // o.hl0
    public void cancel() {
        if (((yx) this.f302o).compareAndSet(1, 1)) {
            return;
        }
        ((n5) this.n).a();
    }

    @Override // o.xs0
    public g07 d(sz3 sz3Var) {
        g07 g07VarH0;
        sz3Var.getClass();
        um2 um2VarL = db8.l(sz3Var);
        if (um2VarL != null && (g07VarH0 = db8.h0(um2VarL)) != null) {
            return g07VarH0;
        }
        g07 g07VarM = db8.m(sz3Var);
        g07VarM.getClass();
        return g07VarM;
    }

    @Override // o.xs0
    public i35 d0(am0 am0Var) {
        return db8.J0(am0Var);
    }

    @Override // o.xs0
    public boolean e(m98 m98Var) {
        m98Var.getClass();
        return db8.V(d(m98Var)) != db8.V(z(m98Var));
    }

    @Override // o.xs0
    public m98 e0(sz3 sz3Var) {
        return db8.j0(sz3Var);
    }

    @Override // o.xs0
    public boolean f(sz3 sz3Var) {
        sz3Var.getClass();
        return sz3Var instanceof h55;
    }

    @Override // o.xs0
    public g07 f0(um2 um2Var) {
        return db8.h0(um2Var);
    }

    @Override // o.xs0
    public boolean g(l48 l48Var) {
        return db8.M(l48Var);
    }

    @Override // o.xs0
    public g07 g0(i07 i07Var) {
        return db8.o(i07Var);
    }

    @Override // o.ex5
    public Object get() {
        rk5 rk5Var = new rk5((byte) 17);
        wj5 wj5Var = new wj5((byte) 16);
        Object obj = ((ex5) this.n).get();
        ex5 ex5Var = (ex5) this.f302o;
        return new tg6(rk5Var, wj5Var, l00.f, (fj6) obj, ex5Var);
    }

    @Override // o.xs0
    public lm1 h(i07 i07Var) {
        return db8.k(i07Var);
    }

    @Override // o.xs0
    public h58 h0(i07 i07Var, int i) {
        i07Var.getClass();
        if (i < 0 || i >= db8.h(i07Var)) {
            return null;
        }
        return db8.y(i07Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.xs0
    public h58 i(f48 f48Var, int i) {
        f48Var.getClass();
        if (f48Var instanceof i07) {
            return db8.y((sz3) f48Var, i);
        }
        if (f48Var instanceof zv) {
            E e = ((zv) f48Var).get(i);
            e.getClass();
            return (h58) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(f48Var);
        gk0.q(sb, ", ", w86.a.b(f48Var.getClass()));
        return null;
    }

    @Override // o.xs0
    public g07 i0(lm1 lm1Var) {
        return lm1Var.n;
    }

    @Override // o.xs0
    public ws0 j(i07 i07Var) {
        return db8.B0(this, i07Var);
    }

    @Override // o.xs0
    public boolean j0(l48 l48Var) {
        return db8.W(l48Var);
    }

    @Override // o.xs0
    public m98 k(am0 am0Var) {
        return db8.i0(am0Var);
    }

    @Override // o.xs0
    public f48 k0(i07 i07Var) {
        return db8.i(i07Var);
    }

    @Override // o.xs0
    public void l(i07 i07Var) {
        db8.d0(i07Var);
    }

    @Override // o.xs0
    public g07 l0(sz3 sz3Var) {
        return db8.m(sz3Var);
    }

    @Override // o.xs0
    public h58 m(sz3 sz3Var, int i) {
        return db8.y(sz3Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[LOOP:0: B:7:0x0010->B:24:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0069 A[EDGE_INSN: B:32:0x0069->B:25:0x0069 BREAK  A[LOOP:0: B:7:0x0010->B:24:0x0066], SYNTHETIC] */
    public void m0() {
        synchronized (this.n) {
            kw4 kw4Var = (kw4) this.f302o;
            long[] jArr = kw4Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                int i5 = kw4Var.b[i4];
                                oc7 oc7Var = (oc7) kw4Var.c[i4];
                                if (oc7Var.c != pc7.q && !((Boolean) oc7Var.b.d.getValue()).booleanValue()) {
                                    kw4Var.h(i4);
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // o.xs0
    public sz3 n(sz3 sz3Var) {
        return db8.N0(this, sz3Var);
    }

    @Override // o.xs0
    public boolean n0(l48 l48Var) {
        return db8.O(l48Var);
    }

    @Override // o.xs0
    public boolean o(h58 h58Var) {
        return db8.b0(h58Var);
    }

    @Override // o.xs0
    public int o0(sz3 sz3Var) {
        return db8.h(sz3Var);
    }

    @Override // o.xs0
    public boolean p(l48 l48Var) {
        return db8.U(l48Var);
    }

    @Override // o.xs0
    public m98 p0(h58 h58Var) {
        return db8.C(h58Var);
    }

    @Override // o.dj0
    public void q(IOException iOException) {
        try {
            ((cj0) this.n).d((a75) this.f302o, iOException);
        } catch (Throwable th) {
            im3.c0(th);
            th.printStackTrace();
        }
    }

    @Override // o.xs0
    public i07 q0(i07 i07Var) {
        g07 g07Var;
        i07Var.getClass();
        lm1 lm1VarK = db8.k(i07Var);
        return (lm1VarK == null || (g07Var = lm1VarK.n) == null) ? i07Var : g07Var;
    }

    @Override // o.xs0
    public boolean r(l48 l48Var) {
        return db8.N(l48Var);
    }

    @Override // o.xs0
    public boolean r0(i07 i07Var) {
        return db8.V(i07Var);
    }

    @Override // o.xs0
    public g07 s(i07 i07Var, boolean z) {
        return db8.O0(i07Var, z);
    }

    @Override // o.xs0
    public um2 s0(sz3 sz3Var) {
        return db8.l(sz3Var);
    }

    @Override // o.xs0
    public void t(i07 i07Var, l48 l48Var) {
    }

    public void t0() {
        int[] iArr = (int[]) this.n;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f302o = null;
    }

    public String toString() {
        int i = 0;
        switch (this.m) {
            case 1:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f302o.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.n;
                int size = arrayList.size();
                while (i < size) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                sb.append('}');
                return sb.toString();
            case ep1.d /* 12 */:
                String str = "[ ";
                if (((k67) this.n) != null) {
                    while (i < 9) {
                        str = str + ((k67) this.n).t[i] + " ";
                        i++;
                    }
                }
                return str + "] " + ((k67) this.n);
            default:
                return super.toString();
        }
    }

    @Override // o.xs0
    public boolean u(l48 l48Var) {
        return db8.T(l48Var);
    }

    @Override // o.xs0
    public boolean u0(d58 d58Var, l48 l48Var) {
        return db8.H(d58Var, l48Var);
    }

    @Override // o.xs0
    public d58 v(l48 l48Var, int i) {
        return db8.B(l48Var, i);
    }

    @Override // o.xs0
    public Collection v0(l48 l48Var) {
        return db8.C0(l48Var);
    }

    @Override // o.sa5
    public List w(Integer num) {
        List listW = ((sa5) this.n).w(null);
        k17 k17Var = (k17) this.f302o;
        int i = k17Var.v;
        return i < 0 ? listW : lv0.A0(ga0.h(k17Var, num, i, Integer.valueOf(k17Var.D(k17Var.b, i))), listW);
    }

    @Override // o.xs0
    public ul0 w0(am0 am0Var) {
        return db8.p(am0Var);
    }

    @Override // o.xs0
    public g07 x(um2 um2Var) {
        return db8.L0(um2Var);
    }

    public Bundle x0(String str) {
        zh6 zh6Var = (zh6) this.n;
        if (!zh6Var.g) {
            hk0.l("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = zh6Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleN = bundle.containsKey(str) ? lv1.N(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            zh6Var.f = null;
        }
        return bundleN;
    }

    @Override // o.xs0
    public void y(sz3 sz3Var) {
        sz3Var.getClass();
        db8.l(sz3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y0() {
        Object[] objArr;
        xx4 xx4Var = (xx4) this.n;
        Arrays.sort(xx4Var.m, 0, xx4Var.f2559o, gj2.r);
        int i = xx4Var.f2559o;
        LayoutNode[] layoutNodeArr = (LayoutNode[]) this.f302o;
        if (layoutNodeArr == null || layoutNodeArr.length < i) {
            objArr = layoutNodeArr;
            objArr = new LayoutNode[Math.max(16, i)];
        }
        objArr = layoutNodeArr;
        this.f302o = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = xx4Var.m[i2];
        }
        xx4Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.f302o = objArr;
                return;
            }
            LayoutNode layoutNode = objArr[i];
            layoutNode.getClass();
            if (layoutNode.a0) {
                z0(layoutNode);
            }
            objArr[i] = 0;
        }
    }

    @Override // o.xs0
    public g07 z(sz3 sz3Var) {
        g07 g07VarL0;
        sz3Var.getClass();
        um2 um2VarL = db8.l(sz3Var);
        if (um2VarL != null && (g07VarL0 = db8.L0(um2VarL)) != null) {
            return g07VarL0;
        }
        g07 g07VarM = db8.m(sz3Var);
        g07VarM.getClass();
        return g07VarM;
    }

    public /* synthetic */ a65(byte b, Object obj, boolean z) {
        this.m = b;
        this.n = obj;
    }

    public /* synthetic */ a65(byte b, boolean z) {
        this.m = b;
    }

    public /* synthetic */ a65(Object obj, Object obj2, byte b) {
        this.m = b;
        this.f302o = obj;
        this.n = obj2;
    }

    public a65(Object obj, byte b) {
        this.m = b;
        switch (b) {
            case 25:
                this.n = obj;
                this.f302o = Thread.currentThread();
                break;
            default:
                this.f302o = obj;
                this.n = new ArrayList();
                break;
        }
    }

    public a65(HashMap map, pz3 pz3Var) {
        this.m = (byte) 6;
        pz3Var.getClass();
        this.n = map;
        this.f302o = pz3Var;
    }

    public a65(hl4 hl4Var) {
        this.m = (byte) 14;
        this.n = hl4Var;
        this.f302o = new ConcurrentHashMap();
    }

    public a65(RemoteControlApplication remoteControlApplication, xt6 xt6Var, EventHub eventHub, SharedPreferences sharedPreferences) {
        this.m = (byte) 15;
        sharedPreferences.getClass();
        this.n = remoteControlApplication;
        this.f302o = xt6Var;
        eventHub.c(EventType.EVENT_SESSION_CONNECTION_STATE_UPDATE, new mu(this, (byte) 10));
    }

    public a65(zh6 zh6Var) {
        this.m = (byte) 19;
        this.n = zh6Var;
        this.f302o = new a65((byte) 18, (Object) zh6Var, false);
    }

    public /* synthetic */ a65(byte b, Object obj, Object obj2, boolean z) {
        this.m = b;
        this.n = obj;
        this.f302o = obj2;
    }

    public a65(Supplier supplier) {
        this.m = (byte) 26;
        this.f302o = supplier;
        this.n = ThreadLocal.withInitial(new sn0((byte) 5));
    }

    public a65(EditText editText, ImageView imageView, View view) {
        this.m = (byte) 8;
        this.n = editText;
        this.f302o = view;
    }

    public a65(n5 n5Var) {
        this.m = (byte) 4;
        this.n = n5Var;
        this.f302o = new yx(0);
    }

    public a65(ts5 ts5Var) {
        this.m = (byte) 12;
        this.f302o = ts5Var;
    }

    public a65(Map map) {
        this.m = (byte) 0;
        this.n = map;
        this.f302o = new xd4("Java nullability annotation states").c(new t(this, (byte) 24));
    }

    public a65(kf0 kf0Var, ef0 ef0Var) {
        this.m = (byte) 21;
        gf0 gf0Var = gf0.n;
        hf0 hf0Var = hf0.n;
        this.n = kf0Var;
        this.f302o = ef0Var;
    }
}
