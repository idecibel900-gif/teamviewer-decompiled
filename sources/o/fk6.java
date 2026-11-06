package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk6 implements Function1 {
    public final /* synthetic */ byte m;

    public /* synthetic */ fk6(byte b) {
        this.m = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return new hk6(((Integer) obj).intValue());
            case 1:
                op6 op6Var = (op6) obj;
                op6Var.getClass();
                mp6.a(op6Var);
                return f88Var;
            case 2:
                ((String) obj).getClass();
                return f88Var;
            case 3:
                yl6 yl6Var = (yl6) obj;
                yl6Var.getClass();
                List list = yl6Var.e;
                ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(db8.G0((x46) it.next()));
                }
                ea2 ea2Var = ea2.m;
                return yl6.a(yl6Var, null, null, null, false, null, null, arrayList, ea2Var, ea2Var, ea2Var, al6.q, false, null, false, false, false, null, null, false, 1964087);
            case 4:
                x46 x46Var = (x46) obj;
                x46Var.getClass();
                return db8.G0(x46Var);
            case 5:
                op6 op6Var2 = (op6) obj;
                op6Var2.getClass();
                mp6.a(op6Var2);
                return f88Var;
            case 6:
                fw3[] fw3VarArr = lp6.a;
                ((op6) obj).d(kp6.e, f88Var);
                return f88Var;
            case 7:
                t65 t65Var = (t65) obj;
                long j = t65Var.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new no(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (t65Var.a & 4294967295L))) : vo6.a;
            case 8:
                no noVar = (no) obj;
                float f = noVar.a;
                return new t65((((long) Float.floatToRawIntBits(noVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            case ep1.b /* 9 */:
                ((String) obj).getClass();
                return f88Var;
            case ep1.c /* 10 */:
                zp6 zp6Var = (zp6) obj;
                zp6Var.getClass();
                return zp6Var.iterator();
            case 11:
                return obj;
            case ep1.d /* 12 */:
                return Boolean.valueOf(obj == null);
            case 13:
                op6 op6Var3 = (op6) obj;
                op6Var3.getClass();
                mp6.a(op6Var3);
                return f88Var;
            case 14:
                ((SupportSession) obj).getClass();
                return f88Var;
            case 15:
                ((SupportSession) obj).getClass();
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((SupportSession) obj).getClass();
                return f88Var;
            case 17:
                ((SupportSession) obj).getClass();
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((SupportSession) obj).getClass();
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((SupportSession) obj).getClass();
                return f88Var;
            case 20:
                ((rr6) obj).getClass();
                return f88Var;
            case 21:
                ((SupportSession) obj).getClass();
                return f88Var;
            case 22:
                ((SupportSession) obj).getClass();
                return f88Var;
            case 23:
                ((SupportSession) obj).getClass();
                return f88Var;
            case 24:
                ((SupportSession) obj).getClass();
                return f88Var;
            case 25:
                ((SupportSession) obj).getClass();
                return f88Var;
            case 26:
                op6 op6Var4 = (op6) obj;
                op6Var4.getClass();
                mp6.a(op6Var4);
                return f88Var;
            case 27:
                op6 op6Var5 = (op6) obj;
                op6Var5.getClass();
                mp6.a(op6Var5);
                return f88Var;
            case 28:
                Throwable th = (Throwable) obj;
                th.getClass();
                ua5.v("Failed to fetch support sessions: ", th.getMessage(), "ServiceQueueViewModel");
                return f88Var;
            default:
                SupportSession supportSession = (SupportSession) obj;
                supportSession.getClass();
                String name = supportSession.getName();
                return name == null ? "" : name;
        }
    }
}
