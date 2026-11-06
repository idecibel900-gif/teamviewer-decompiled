package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ir implements dw, uh0, ce1, v46, jb2, cf7, jf8, i20, jk4 {
    public final /* synthetic */ byte m;

    public /* synthetic */ ir(byte b) {
        this.m = b;
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static gk7 f() {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        return gk7Var;
    }

    public static q1 g(ViewGroup viewGroup, ge0 ge0Var, ze0 ze0Var, fl4 fl4Var) {
        ge0Var.getClass();
        ze0Var.getClass();
        if (fl4Var == fl4.ONLINE_HEADER) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistpartner_online_header, viewGroup, false);
            viewInflate.getClass();
            return new sk4(viewInflate);
        }
        if (fl4Var == fl4.OFFLINE_HEADER) {
            View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistpartner_offline_header, viewGroup, false);
            viewInflate2.getClass();
            return new sk4(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_buddylistpartner, viewGroup, false);
        viewInflate3.getClass();
        return new xk4(viewInflate3, ge0Var, ze0Var);
    }

    public static w05 i(int i) {
        Object next;
        jc2 jc2Var = w05.u;
        jc2Var.getClass();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        do {
            if (!j1Var.hasNext()) {
                next = null;
                break;
            }
            next = j1Var.next();
        } while (((w05) next).m != i);
        w05 w05Var = (w05) next;
        return w05Var == null ? w05.Connect : w05Var;
    }

    public static cj3 k(Context context, String[] strArr, String str, a65 a65Var) {
        String[] strArrS = s(context);
        int length = strArrS.length;
        boolean z = false;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = strArrS[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str3);
                            sb.append(c);
                            sb.append(str);
                            String string = sb.toString();
                            a65Var.I0("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                cj3 cj3Var = new cj3((byte) 17, z);
                                cj3Var.n = zipFile;
                                cj3Var.f531o = entry;
                                return cj3Var;
                            }
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    public static sc0 m(int i) {
        Object next;
        jc2 jc2Var = sc0.q;
        jc2Var.getClass();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        do {
            if (!j1Var.hasNext()) {
                next = null;
                break;
            }
            next = j1Var.next();
        } while (((sc0) next).m != i);
        sc0 sc0Var = (sc0) next;
        return sc0Var == null ? sc0.f2005o : sc0Var;
    }

    public static String[] o(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : s(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static mr0 q(String str) {
        mr0 mr0Var = new mr0(str);
        mr0.d.put(str, mr0Var);
        return mr0Var;
    }

    public static String[] s(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // o.jb2
    public Object b(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // o.uh0
    public byte[] c(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // o.cf7
    public df7 d(zz6 zz6Var) {
        return io.sentry.android.sqlite.g.e(new ov2((Context) zz6Var.c, (String) zz6Var.d, (nd) zz6Var.e, zz6Var.a, zz6Var.b));
    }

    @Override // o.v46
    public oz3 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // o.dw
    public void h(in1 in1Var, int i, int[] iArr, j04 j04Var, int[] iArr2) {
        int i2 = 0;
        if (j04Var == j04.m) {
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int length = iArr.length;
            int i5 = i - i3;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.i20
    public void j(Enum r1, bb5 bb5Var) {
        if (w05.Partnerlist == ((w05) r1) && (bb5Var instanceof kd0)) {
            ((kd0) bb5Var).f();
        }
    }

    public synchronized mr0 l(String str) {
        mr0 mr0Var;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = mr0.d;
            mr0Var = (mr0) linkedHashMap.get(str);
            if (mr0Var == null) {
                if (bc7.N(false, str, "TLS_")) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = bc7.N(false, str, "SSL_") ? "TLS_".concat(str.substring(4)) : str;
                }
                mr0Var = (mr0) linkedHashMap.get(strConcat);
                if (mr0Var == null) {
                    mr0Var = new mr0(str);
                }
                linkedHashMap.put(str, mr0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mr0Var;
    }

    @Override // o.jf8
    public int n() {
        return R.id.view_tree_navigation_event_dispatcher_owner;
    }

    @Override // o.jk4
    public void p(ob3 ob3Var) {
        if (ob3Var != null) {
            x02 x02VarA = ik7.a();
            gk7 gk7Var = new gk7();
            fx3.o(1, "dialogId", x02VarA, gk7Var);
            gk7Var.Z0 = x02VarA;
            gk7Var.F0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_LicenseBlockedPassiveMarketingTrialBlocked_title;
            gk7Var.H0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_LicenseBlockedPassiveMarketingTrialBlocked;
            gk7Var.K0 = R.string.tv_ok;
            gk7.O0(gk7Var, (MainActivity) ob3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public Object r(List list, dh1 dh1Var, jc1 jc1Var) throws Throwable {
        ug1 ug1Var;
        List list2;
        Iterator it;
        k76 k76Var;
        Throwable th;
        Function1 function1;
        if (jc1Var instanceof ug1) {
            ug1Var = (ug1) jc1Var;
            int i = ug1Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ug1Var.q = i - Integer.MIN_VALUE;
            } else {
                ug1Var = new ug1(this, jc1Var);
            }
        } else {
            ug1Var = new ug1(this, jc1Var);
        }
        Object obj = ug1Var.f2211o;
        int i2 = ug1Var.q;
        hc1 hc1Var = null;
        Object obj2 = ne1.m;
        if (i2 == 0) {
            ct1.a0(obj);
            ArrayList arrayList = new ArrayList();
            wg1 wg1Var = new wg1(list, arrayList, hc1Var, (byte) 0);
            ug1Var.m = arrayList;
            ug1Var.q = 1;
            if (dh1Var.a(wg1Var, ug1Var) != obj2) {
                list2 = arrayList;
            }
            return obj2;
        }
        if (i2 == 1) {
            list2 = (List) ug1Var.m;
            ct1.a0(obj);
        } else {
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = ug1Var.n;
            k76Var = (k76) ug1Var.m;
            try {
                ct1.a0(obj);
            } catch (Throwable th2) {
                Object obj3 = k76Var.m;
                if (obj3 == null) {
                    k76Var.m = th2;
                } else {
                    ct1.q((Throwable) obj3, th2);
                }
            }
        }
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            ug1Var.m = k76Var;
            ug1Var.n = it;
            ug1Var.q = 2;
            if (function1.invoke(ug1Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) k76Var.m;
        if (th == null) {
            return f88.a;
        }
        throw th;
        k76 k76Var2 = new k76();
        it = list2.iterator();
        k76Var = k76Var2;
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            ug1Var.m = k76Var;
            ug1Var.n = it;
            ug1Var.q = 2;
            if (function1.invoke(ug1Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) k76Var.m;
        if (th == null) {
            return f88.a;
        }
        throw th;
    }

    public String toString() {
        switch (this.m) {
            case 1:
                return "Arrangement#End";
            case 7:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
