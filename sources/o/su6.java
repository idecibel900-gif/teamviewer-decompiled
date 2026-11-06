package o;

import com.teamviewer.apidefinitions.account.models.Account;
import com.teamviewer.apidefinitions.legacydevices.models.GroupShareContactRight;
import com.teamviewer.apidefinitions.legacydevices.models.GroupShareModel;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.time.Clock;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class su6 extends oe8 {
    public final r36 A;
    public n87 B;
    public Integer C;
    public String D;
    public final jk0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l07 f2056o;
    public final nx3 p;
    public final fe1 q;
    public final cj3 r;
    public final Clock s;
    public final l97 t;
    public final t36 u;
    public final yx6 v;
    public final r36 w;
    public final yx6 x;
    public final r36 y;
    public final yx6 z;

    public su6(int i) {
        jk0 jk0Var = new jk0((byte) 27);
        q85 q85Var = q85.a;
        l07 l07Var = new l07((byte) 9);
        nx3 nx3Var = new nx3((byte) 9);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        cj3 cj3Var = new cj3((Object) jk0Var, (Object) l07Var, (byte) 4);
        Clock clockSystemUTC = Clock.systemUTC();
        clockSystemUTC.getClass();
        gk1Var.getClass();
        this.n = jk0Var;
        this.f2056o = l07Var;
        this.p = nx3Var;
        this.q = gk1Var;
        this.r = cj3Var;
        this.s = clockSystemUTC;
        l97 l97VarK = im3.k(new it6(null, false, null, "", "", "", null, true, true, true, false, false, false, false, false));
        this.t = l97VarK;
        this.u = yo1.u(l97VarK);
        yx6 yx6VarL = au8.l(0, 7, null);
        this.v = yx6VarL;
        this.w = new r36(yx6VarL);
        yx6 yx6VarL2 = au8.l(0, 7, null);
        this.x = yx6VarL2;
        this.y = new r36(yx6VarL2);
        yx6 yx6VarL3 = au8.l(0, 7, null);
        this.z = yx6VarL3;
        this.A = new r36(yx6VarL3);
    }

    public static boolean Y0(it6 it6Var) {
        SupportSession supportSession = it6Var.a;
        if (supportSession == null) {
            return false;
        }
        String name = supportSession.getName();
        if (name == null) {
            name = "";
        }
        if (!name.equals(it6Var.d)) {
            return true;
        }
        String email = supportSession.getEmail();
        if (email == null) {
            email = "";
        }
        if (!email.equals(it6Var.e)) {
            return true;
        }
        String description = supportSession.getDescription();
        if (!(description != null ? description : "").equals(it6Var.f)) {
            return true;
        }
        int groupId = supportSession.getGroupId();
        Integer num = it6Var.g;
        return num == null || groupId != num.intValue();
    }

    public static boolean a1(SupportSession supportSession, SupportSession supportSession2) {
        return supportSession2 != null && supportSession.getSessioncode() == supportSession2.getSessioncode() && supportSession.getGroupId() == supportSession2.getGroupId() && supportSession.getAssignedAccountId() == supportSession2.getAssignedAccountId();
    }

    public final SupportSession V0() {
        SupportSession supportSession = ((it6) this.t.getValue()).a;
        if (supportSession == null) {
            ye4.a("SessionScreenViewModel", "No current support session");
        }
        return supportSession;
    }

    public final Object W0(d37 d37Var, og7 og7Var) throws Throwable {
        Object objC = this.v.c(d37Var, og7Var);
        return objC == ne1.m ? objC : f88.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X0(jc1 jc1Var) {
        pu6 pu6Var;
        Object objH;
        if (jc1Var instanceof pu6) {
            pu6Var = (pu6) jc1Var;
            int i = pu6Var.f1778o;
            if ((i & Integer.MIN_VALUE) != 0) {
                pu6Var.f1778o = i - Integer.MIN_VALUE;
            } else {
                pu6Var = new pu6(this, jc1Var);
            }
        } else {
            pu6Var = new pu6(this, jc1Var);
        }
        Object obj = pu6Var.m;
        int i2 = pu6Var.f1778o;
        if (i2 == 0) {
            ct1.a0(obj);
            pu6Var.f1778o = 1;
            objH = this.n.h(pu6Var);
            ne1 ne1Var = ne1.m;
            if (objH == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objH = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objH);
        if (thA != null) {
            ua5.v("Failed to resolve current account display name: ", thA.getMessage(), "SessionScreenViewModel");
            return null;
        }
        String string = ub7.x0(((Account) objH).getProfile().getDisplayName().getValue()).toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(SupportSession supportSession, jc1 jc1Var) {
        qu6 qu6Var;
        Object objB;
        Object next;
        String name;
        String string;
        if (jc1Var instanceof qu6) {
            qu6Var = (qu6) jc1Var;
            int i = qu6Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                qu6Var.p = i - Integer.MIN_VALUE;
            } else {
                qu6Var = new qu6(this, jc1Var);
            }
        } else {
            qu6Var = new qu6(this, jc1Var);
        }
        Object obj = qu6Var.n;
        int i2 = qu6Var.p;
        String str = null;
        if (i2 == 0) {
            ct1.a0(obj);
            int groupId = supportSession.getGroupId();
            qu6Var.m = supportSession;
            qu6Var.p = 1;
            objB = this.p.B(groupId, qu6Var);
            ne1 ne1Var = ne1.m;
            if (objB == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            supportSession = qu6Var.m;
            ct1.a0(obj);
            objB = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objB);
        if (thA != null) {
            ye4.a("SessionScreenViewModel", "Failed to resolve assigned contact name for group " + supportSession.getGroupId() + ": " + thA.getMessage());
            return null;
        }
        Iterator<T> it = ((GroupShareModel) objB).getItems().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((GroupShareContactRight) next).getContactId() != supportSession.getAssignedAccountId());
        GroupShareContactRight groupShareContactRight = (GroupShareContactRight) next;
        if (groupShareContactRight != null && (name = groupShareContactRight.getName()) != null && (string = ub7.x0(name).toString()) != null && string.length() > 0) {
            str = string;
        }
        if (str == null) {
            ye4.a("SessionScreenViewModel", "Assigned account " + supportSession.getAssignedAccountId() + " was not found in shared rights for group " + supportSession.getGroupId());
        }
        return str;
    }

    public final boolean b1() {
        it6 it6Var = (it6) this.u.m.getValue();
        return !it6Var.b && it6Var.h && it6Var.i && it6Var.j && Y0(it6Var);
    }

    public final void c1() {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.t;
            value = l97Var.getValue();
        } while (!l97Var.j(value, it6.a((it6) value, null, false, null, null, null, null, null, false, false, false, false, false, false, true, false, 24575)));
    }

    public final void d1(int i) {
        l97 l97Var;
        Object value;
        it6 it6VarA;
        do {
            l97Var = this.t;
            value = l97Var.getValue();
            it6VarA = (it6) value;
            SupportSession supportSession = it6VarA.a;
            if (supportSession != null && supportSession.getSessioncode() == i) {
                it6VarA = it6.a(it6VarA, null, false, null, null, null, null, null, false, false, false, false, false, false, false, true, 1023);
            }
        } while (!l97Var.j(value, it6VarA));
    }

    public final void e1() {
        l97 l97Var;
        Object value;
        this.C = null;
        do {
            l97Var = this.t;
            value = l97Var.getValue();
        } while (!l97Var.j(value, it6.a((it6) value, null, false, null, "", "", "", null, true, true, true, false, false, false, false, false, 31751)));
    }

    public final void f1(SupportSession supportSession, String str) {
        l97 l97Var;
        Object value;
        it6 it6VarA;
        do {
            l97Var = this.t;
            value = l97Var.getValue();
            it6VarA = (it6) value;
            SupportSession supportSession2 = it6VarA.a;
            if (supportSession2 != null && a1(supportSession2, supportSession)) {
                it6VarA = it6.a(it6VarA, null, false, str, null, null, null, null, false, false, false, false, false, false, false, false, 32763);
            }
        } while (!l97Var.j(value, it6VarA));
    }

    public final void g1(SupportSession supportSession, boolean z, hw2 hw2Var) {
        l97 l97Var;
        Object value;
        it6 it6VarA;
        String name;
        SupportSession supportSessionE = h57.E(supportSession);
        String str = this.D;
        if (str != null && ((name = supportSessionE.getName()) == null || ub7.b0(name))) {
            supportSessionE = SupportSession.copy$default(supportSessionE, 0, null, null, null, null, 0, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, 1048319, null);
        }
        do {
            l97Var = this.t;
            value = l97Var.getValue();
            it6VarA = (it6) hw2Var.invoke((it6) value, supportSessionE);
            if (h57.o(supportSessionE, this.s)) {
                it6VarA = it6.a(it6VarA, null, false, null, null, null, null, null, false, false, false, false, false, false, false, true, 1023);
            }
        } while (!l97Var.j(value, it6VarA));
        if (z) {
            n87 n87Var = this.B;
            hc1 hc1Var = null;
            if (n87Var != null) {
                n87Var.j(null);
            }
            if (supportSessionE.getAssignedAccountId() == 0) {
                f1(supportSessionE, null);
            } else {
                this.B = im3.R(e8.n(this), this.q, null, new ff(supportSessionE, this, hc1Var, (byte) 9), 2);
            }
        }
    }

    public su6() {
        this(0);
    }
}
