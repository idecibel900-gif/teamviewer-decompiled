package o;

import android.content.res.Resources;
import android.util.Pair;
import com.teamviewer.chatviewlib.helper.DownloadFileService;
import com.teamviewer.chatviewlib.helper.UploadFileService;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vs6 implements Function1 {
    public final /* synthetic */ byte m;

    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int iOffsetByCodePoints;
        switch (this.m) {
            case 0:
                ((Long) obj).getClass();
                return f88.a;
            case 1:
                ((Long) obj).getClass();
                return f88.a;
            case 2:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                mp6.a(op6Var);
                return f88.a;
            case 3:
                op6 op6Var2 = (op6) obj;
                op6Var2.getClass();
                mp6.a(op6Var2);
                return f88.a;
            case 4:
                op6 op6Var3 = (op6) obj;
                op6Var3.getClass();
                mp6.a(op6Var3);
                return f88.a;
            case 5:
                return f88.a;
            case 6:
                return f88.a;
            case 7:
                String str = (String) obj;
                str.getClass();
                ye4.a.b("StorageManagerConnector", "cancel(" + str + ")");
                Pair pair = (Pair) UploadFileService.r.get(str);
                if (pair != null) {
                    try {
                        Object obj2 = pair.first;
                        obj2.getClass();
                        ((UploadFileService) obj2).q = true;
                        ((Thread) pair.second).interrupt();
                        break;
                    } catch (Exception unused) {
                    }
                }
                Pair pair2 = (Pair) DownloadFileService.q.get(str);
                if (pair2 != null) {
                    try {
                        ((Thread) pair2.second).interrupt();
                        break;
                    } catch (Exception unused2) {
                    }
                }
                return f88.a;
            case 8:
                fn4 fn4Var = (fn4) obj;
                fn4Var.getClass();
                return (String) ((dn4) fn4Var.a()).get(1);
            case ep1.b /* 9 */:
                fn4 fn4Var2 = (fn4) obj;
                fn4Var2.getClass();
                return ub7.x0((String) ((dn4) fn4Var2.a()).get(1)).toString();
            case ep1.c /* 10 */:
                fn4 fn4Var3 = (fn4) obj;
                fn4Var3.getClass();
                return ub7.x0((String) ((dn4) fn4Var3.a()).get(1)).toString();
            case 11:
                fn4 fn4Var4 = (fn4) obj;
                fn4Var4.getClass();
                return ub7.x0((String) ((dn4) fn4Var4.a()).get(1)).toString();
            case ep1.d /* 12 */:
                fn4 fn4Var5 = (fn4) obj;
                fn4Var5.getClass();
                return (String) ((dn4) fn4Var5.a()).get(1);
            case 13:
                fn4 fn4Var6 = (fn4) obj;
                fn4Var6.getClass();
                return (String) ((dn4) fn4Var6.a()).get(1);
            case 14:
                fw3[] fw3VarArr = lp6.a;
                np6 np6Var = kp6.m;
                fw3 fw3Var = lp6.a[5];
                Boolean bool = Boolean.TRUE;
                np6Var.getClass();
                ((op6) obj).d(np6Var, bool);
                return f88.a;
            case 15:
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 17:
                pg6 pg6Var = (pg6) obj;
                pg6Var.getClass();
                ug6 ug6VarJ0 = pg6Var.J0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (ug6VarJ0.F0()) {
                        arrayList.add(ug6VarJ0.h0(0));
                    }
                    ug6VarJ0.close();
                    return arrayList;
                } catch (Throwable th) {
                    ug6VarJ0.close();
                    throw th;
                }
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return f88.a;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((Float) obj).getClass();
                return f88.a;
            case 20:
                ((Integer) obj).intValue();
                return fq7.a;
            case 21:
                return f88.a;
            case 22:
                br7 br7Var = (br7) obj;
                String str2 = br7Var.g.n;
                long j = br7Var.f;
                int i = gt7.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > 0) {
                    a92 a92VarN = x67.n();
                    if (a92VarN != null) {
                        int iB = a92VarN.b(i2 - 1, str2);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i2 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str2, i2, -1);
                        }
                    } else if (i2 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str2, i2, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new dn1(((int) (4294967295L & br7Var.f)) - iOffsetByCodePoints, 0);
            case 23:
                br7 br7Var2 = (br7) obj;
                String str3 = br7Var2.g.n;
                long j2 = br7Var2.f;
                int i3 = gt7.c;
                int iL = x67.l((int) (j2 & 4294967295L), str3);
                if (iL != -1) {
                    return new dn1(0, iL - ((int) (4294967295L & br7Var2.f)));
                }
                return null;
            case 24:
                br7 br7Var3 = (br7) obj;
                Integer numE = br7Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = br7Var3.f;
                int i4 = gt7.c;
                return new dn1(((int) (4294967295L & j3)) - iIntValue, 0);
            case 25:
                br7 br7Var4 = (br7) obj;
                Integer numD = br7Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = br7Var4.f;
                int i5 = gt7.c;
                return new dn1(0, iIntValue2 - ((int) (4294967295L & j4)));
            case 26:
                br7 br7Var5 = (br7) obj;
                Integer numC = br7Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = br7Var5.f;
                int i6 = gt7.c;
                return new dn1(((int) (4294967295L & j5)) - iIntValue3, 0);
            case 27:
                br7 br7Var6 = (br7) obj;
                Integer numB = br7Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = br7Var6.f;
                int i7 = gt7.c;
                return new dn1(0, iIntValue4 - ((int) (4294967295L & j6)));
            case 28:
                List list = (List) obj;
                Object obj3 = list.get(1);
                obj3.getClass();
                gb5 gb5Var = ((Boolean) obj3).booleanValue() ? gb5.m : gb5.n;
                Object obj4 = list.get(0);
                obj4.getClass();
                return new hr7(gb5Var, ((Float) obj4).floatValue());
            default:
                return f88.a;
        }
    }

    public /* synthetic */ vs6(byte b) {
        this.m = b;
    }
}
