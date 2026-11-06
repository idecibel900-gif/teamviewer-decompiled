package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jp6 implements hw2 {
    public final /* synthetic */ byte m;

    public /* synthetic */ jp6(byte b) {
        this.m = b;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 1:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 2:
                return (pe6) obj;
            case 3:
                return (String) obj;
            case 4:
                return (f88) obj;
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 6:
                return (pw6) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 8:
                return (vb1) obj;
            case ep1.b /* 9 */:
                return (qh) obj;
            case ep1.c /* 10 */:
                return (pi) obj;
            case 11:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case ep1.d /* 12 */:
                if (obj != null || obj2 != null) {
                    io.sentry.h2.f();
                }
                return null;
            case 13:
                return obj == null ? obj2 : obj;
            case 14:
                fp6 fp6Var = (fp6) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                ap6 ap6Var = ((fp6) obj).d;
                np6 np6Var = kp6.u;
                Object objG = ap6Var.m.g(np6Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = fp6Var.d.m.g(np6Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 15:
                ((Integer) obj).intValue();
                SupportSession supportSession = (SupportSession) obj2;
                supportSession.getClass();
                return Integer.valueOf(supportSession.getSessioncode());
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return f88Var;
            case 17:
                it6 it6Var = (it6) obj;
                SupportSession supportSession2 = (SupportSession) obj2;
                it6Var.getClass();
                supportSession2.getClass();
                return it6.a(it6Var, supportSession2, false, su6.a1(supportSession2, it6Var.a) ? it6Var.c : null, null, null, null, null, false, false, false, false, false, false, false, false, 16378);
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                it6 it6Var2 = (it6) obj;
                SupportSession supportSession3 = (SupportSession) obj2;
                it6Var2.getClass();
                supportSession3.getClass();
                String name = supportSession3.getName();
                String str = name == null ? "" : name;
                String email = supportSession3.getEmail();
                String str2 = email == null ? "" : email;
                String description = supportSession3.getDescription();
                return it6.a(it6Var2, supportSession3, false, null, str, str2, description == null ? "" : description, Integer.valueOf(supportSession3.getGroupId()), true, true, true, false, false, false, false, false, 31750);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                it6 it6Var3 = (it6) obj;
                SupportSession supportSession4 = (SupportSession) obj2;
                it6Var3.getClass();
                supportSession4.getClass();
                return it6.a(it6Var3, supportSession4, false, su6.a1(supportSession4, it6Var3.a) ? it6Var3.c : null, null, null, null, null, false, false, false, false, false, false, false, false, 16378);
            case 20:
                return ((xy6) obj2).c();
            case 21:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.W(-2130319705);
                    ux2Var.p(false);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 22:
                return Integer.valueOf(((zn4) obj).a(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((zn4) obj).V(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((zn4) obj).k(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((zn4) obj).o(((Integer) obj2).intValue()));
            case 26:
                hr7 hr7Var = (hr7) obj2;
                return qf0.L(Float.valueOf(hr7Var.a.z()), Boolean.valueOf(((gb5) hr7Var.f.getValue()) == gb5.m));
            case 27:
                jh6 jh6Var = (jh6) obj;
                zr7 zr7Var = (zr7) obj2;
                return qf0.p(hi6.a(zr7Var.a, hi6.a, jh6Var), hi6.a(new gt7(zr7Var.b), hi6.p, jh6Var));
            case 28:
                be1 be1Var = (be1) obj2;
                if (!(be1Var instanceof cu7)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue2 = num != null ? num.intValue() : 1;
                return iIntValue2 == 0 ? be1Var : Integer.valueOf(iIntValue2 + 1);
            default:
                cu7 cu7Var = (cu7) obj;
                be1 be1Var2 = (be1) obj2;
                if (cu7Var != null) {
                    return cu7Var;
                }
                if (be1Var2 instanceof cu7) {
                    return (cu7) be1Var2;
                }
                return null;
        }
    }

    public /* synthetic */ jp6(su6 su6Var, byte b) {
        this.m = b;
    }
}
