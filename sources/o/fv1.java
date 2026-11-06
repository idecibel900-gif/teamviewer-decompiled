package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LiveData;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.remotecontrolviewlib.view.partnerlist.DeviceOptionsActionButton;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/fv1;", "Lo/zb0;", "Lo/bi3;", "Lo/hq4;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fv1 extends zb0 implements bi3, hq4 {
    public static final /* synthetic */ int O0 = 0;
    public final b6 J0;
    public final ev1 K0;
    public va3 s0;
    public LinearLayout t0;
    public AppCompatImageView u0;
    public t33 v0;
    public long w0;
    public l07 x0;
    public ShortcutManager y0;
    public final ev1 z0 = new ev1(this, 4);
    public final av1 A0 = new av1(this, 0);
    public final av1 B0 = new av1(this, 1);
    public final av1 C0 = new av1(this, 2);
    public final av1 D0 = new av1(this, 3);
    public final av1 E0 = new av1(this, 4);
    public final av1 F0 = new av1(this, 5);
    public final av1 G0 = new av1(this, 6);
    public final ev1 H0 = new ev1(this, 1);
    public final ev1 I0 = new ev1(this, 2);
    public final ev1 L0 = new ev1(this, 0);
    public final pe0 M0 = new pe0(this, 1);
    public final ev1 N0 = new ev1(this, 3);

    public fv1() {
        byte b = 5;
        this.J0 = new b6(this, b);
        this.K0 = new ev1(this, b);
    }

    @Override // o.zb0
    public final boolean G0() {
        return true;
    }

    public final void H0() {
        LinearLayout linearLayout = this.t0;
        yk3 yk3Var = new yk3(0, linearLayout != null ? linearLayout.getChildCount() : 0, 1);
        ArrayList arrayList = new ArrayList(mv0.Z(yk3Var, 10));
        Iterator it = yk3Var.iterator();
        while (true) {
            View childAt = null;
            if (!it.hasNext()) {
                break;
            }
            int iNextInt = ((xk3) it).nextInt();
            LinearLayout linearLayout2 = this.t0;
            if (linearLayout2 != null) {
                childAt = linearLayout2.getChildAt(iNextInt);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof DeviceOptionsActionButton) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((DeviceOptionsActionButton) obj2).getVisibility() == 0) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
        int i = 0;
        for (Object obj3 : arrayList3) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            ((DeviceOptionsActionButton) obj3).setPrimary(i == 0);
            arrayList4.add(f88.a);
            i = i2;
        }
    }

    public final void I0(String str) {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.L0(str);
        gk7Var.O0 = R.string.tv_ok;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            xk1Var.L(gk7Var);
        }
        this.z0.g(gk7Var);
    }

    public final void J0(int i) {
        va3 va3Var = this.s0;
        String strJ = J(i, va3Var != null ? ((iv1) va3Var).G : null);
        strJ.getClass();
        I0(strJ);
    }

    public final void K0() {
        if (this.x0 != null) {
            new ed((byte) 5).run();
        } else {
            im3.e0("startConnectionFeedbackUiFactory");
            throw null;
        }
    }

    @Override // o.fv2, o.ut2
    public final void X(Bundle bundle) {
        t33 t33Var;
        long jLongValue;
        super.X(bundle);
        if (bundle == null || (t33Var = (t33) pm8.w(bundle, "memberType", t33.class)) == null) {
            Bundle bundle2 = this.r;
            t33Var = bundle2 != null ? (t33) pm8.w(bundle2, "memberType", t33.class) : null;
            if (t33Var == null) {
                t33Var = t33.n;
            }
        }
        this.v0 = t33Var;
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("memberId")) : null;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        } else {
            Bundle bundle3 = this.r;
            Long lValueOf2 = bundle3 != null ? Long.valueOf(bundle3.getLong("memberId")) : null;
            jLongValue = lValueOf2 != null ? lValueOf2.longValue() : 0L;
        }
        this.w0 = jLongValue;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String strI;
        nw4 nw4Var;
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        LiveData liveData4;
        LiveData liveData5;
        LiveData liveData6;
        LiveData liveData7;
        LiveData liveData8;
        LiveData liveData9;
        LiveData liveData10;
        LiveData liveData11;
        LiveData liveData12;
        layoutInflater.getClass();
        du2 du2VarA = du2.a(layoutInflater, viewGroup);
        DeviceOptionsActionButton deviceOptionsActionButton = du2VarA.r;
        this.t0 = du2VarA.b;
        this.u0 = du2VarA.e;
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return null;
        }
        t33 t33Var = this.v0;
        if (t33Var == null) {
            im3.e0("type");
            throw null;
        }
        this.s0 = c36Var.g(this, t33Var, this.w0);
        ep3 ep3Var = it1.c;
        if (ep3Var == null) {
            im3.e0("viewFactory");
            throw null;
        }
        this.x0 = ep3Var.p();
        p0().v(this, L());
        Context contextE = E();
        if (contextE != null) {
            this.y0 = (ShortcutManager) contextE.getSystemService(ShortcutManager.class);
        }
        t33 t33Var2 = this.v0;
        if (t33Var2 == null) {
            im3.e0("type");
            throw null;
        }
        if (t33Var2 != t33.n) {
            deviceOptionsActionButton.setVisibility(8);
        }
        du2VarA.f.setOnClickListener(this.A0);
        du2VarA.h.setOnClickListener(this.B0);
        du2VarA.j.setOnClickListener(this.C0);
        du2VarA.f655o.setOnClickListener(this.E0);
        du2VarA.d.setOnClickListener(this.D0);
        byte b = 7;
        du2VarA.k.setOnClickListener(new av1(this, b));
        du2VarA.s.setOnClickListener(this.F0);
        deviceOptionsActionButton.setOnClickListener(this.G0);
        va3 va3Var = this.s0;
        byte b2 = 0;
        byte b3 = 12;
        if (va3Var != null && (liveData12 = ((iv1) va3Var).t) != null) {
            liveData12.observe(L(), new b7(new cv1(du2VarA, b2), b3));
        }
        va3 va3Var2 = this.s0;
        byte b4 = 1;
        if (va3Var2 != null && (liveData11 = ((iv1) va3Var2).u) != null) {
            liveData11.observe(L(), new b7(new cv1(du2VarA, b4), b3));
        }
        va3 va3Var3 = this.s0;
        if (va3Var3 != null && (liveData10 = ((iv1) va3Var3).v) != null) {
            liveData10.observe(L(), new b7(new cv1(du2VarA, (byte) 2), b3));
        }
        va3 va3Var4 = this.s0;
        byte b5 = 3;
        if (va3Var4 != null && (liveData9 = ((iv1) va3Var4).w) != null) {
            liveData9.observe(L(), new b7(new cv1(du2VarA, b5), b3));
        }
        va3 va3Var5 = this.s0;
        if (va3Var5 != null && (liveData8 = ((iv1) va3Var5).x) != null) {
            liveData8.observe(L(), new b7(new bv1(this, du2VarA), b3));
        }
        va3 va3Var6 = this.s0;
        if (va3Var6 != null && (liveData7 = ((iv1) va3Var6).y) != null) {
            liveData7.observe(L(), new b7(new bv1(du2VarA, this, b5), b3));
        }
        va3 va3Var7 = this.s0;
        if (va3Var7 != null && (liveData6 = ((iv1) va3Var7).z) != null) {
            liveData6.observe(L(), new b7(new bv1(du2VarA, this, (byte) 4), b3));
        }
        va3 va3Var8 = this.s0;
        if (va3Var8 != null && (liveData5 = ((iv1) va3Var8).A) != null) {
            liveData5.observe(L(), new b7(new bv1(du2VarA, this, (byte) 5), b3));
        }
        va3 va3Var9 = this.s0;
        if (va3Var9 != null && (liveData4 = ((iv1) va3Var9).B) != null) {
            liveData4.observe(L(), new b7(new bv1(du2VarA, this, (byte) 6), b3));
        }
        va3 va3Var10 = this.s0;
        if (va3Var10 != null && (liveData3 = ((iv1) va3Var10).C) != null) {
            liveData3.observe(L(), new b7(new bv1(du2VarA, this, b), b3));
        }
        va3 va3Var11 = this.s0;
        if (va3Var11 != null && (liveData2 = ((iv1) va3Var11).E) != null) {
            liveData2.observe(L(), new b7(new bv1(du2VarA, this, b2), b3));
        }
        va3 va3Var12 = this.s0;
        if (va3Var12 != null && (liveData = ((iv1) va3Var12).D) != null) {
            liveData.observe(L(), new b7(new bv1(du2VarA, this, b4), b3));
        }
        va3 va3Var13 = this.s0;
        if (va3Var13 != null && (nw4Var = ((iv1) va3Var13).F) != null) {
            nw4Var.observe(L(), new b7(new a81(this, (byte) 9), b3));
        }
        va3 va3Var14 = this.s0;
        if (va3Var14 != null) {
            ((iv1) va3Var14).J.a(new zz0(this, b3));
        }
        xt2 xt2VarC = C();
        if (xt2VarC != null) {
            t33 t33Var3 = this.v0;
            if (t33Var3 == null) {
                im3.e0("type");
                throw null;
            }
            int iOrdinal = t33Var3.ordinal();
            if (iOrdinal == 0) {
                strI = I(R.string.tv_contact_options_title);
            } else if (iOrdinal == 1) {
                strI = I(R.string.tv_device_options_title);
            }
            xt2VarC.setTitle(strI);
        }
        NestedScrollView nestedScrollView = du2VarA.a;
        nestedScrollView.getClass();
        return nestedScrollView;
    }

    @Override // o.fv2, o.ut2
    public final void h0(Bundle bundle) {
        E0(bundle);
        bundle.putLong("memberId", this.w0);
        t33 t33Var = this.v0;
        if (t33Var != null) {
            bundle.putSerializable("memberType", t33Var);
        } else {
            im3.e0("type");
            throw null;
        }
    }

    @Override // o.ut2
    public final void i0() {
        s33 s33Var;
        v93 v93Var;
        v93 v93Var2;
        this.S = true;
        au2 au2Var = vt1.c;
        if (au2Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        t33 t33Var = this.v0;
        if (t33Var == null) {
            im3.e0("type");
            throw null;
        }
        int iOrdinal = t33Var.ordinal();
        if (iOrdinal == 0) {
            s33Var = s33.Contact;
        } else if (iOrdinal == 1) {
            s33Var = s33.Computer;
        } else {
            if (iOrdinal != 2) {
                gk0.s();
                return;
            }
            s33Var = s33.ServiceCase;
        }
        if (au2Var.h(this, new GroupMemberId(s33Var, this.w0)) == null) {
            bb5 bb5Var = this.r0;
            if (bb5Var != null) {
                bb5Var.G0();
                return;
            }
            return;
        }
        va3 va3Var = this.s0;
        if (va3Var != null && (v93Var2 = ((iv1) va3Var).p) != null) {
            v93Var2.c();
        }
        va3 va3Var2 = this.s0;
        if (va3Var2 == null || (v93Var = ((iv1) va3Var2).p) == null) {
            return;
        }
        v93Var.m();
    }

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
    @Override // o.hq4
    public final boolean j(MenuItem menuItem) {
        bb5 bb5Var;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        zb0 yb0Var = null;
        if (itemId == R.id.device_options_settings_button) {
            if (it1.c != null) {
                y0(new Intent(E(), (Class<?>) SettingsActivity.class));
                return true;
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (itemId != R.id.device_options_edit_button) {
            return false;
        }
        t33 t33Var = this.v0;
        if (t33Var == null) {
            im3.e0("type");
            throw null;
        }
        int iOrdinal = t33Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (it1.c == null) {
                    im3.e0("viewFactory");
                    throw null;
                }
                long j = this.w0;
                t33 t33Var2 = this.v0;
                if (t33Var2 == null) {
                    im3.e0("type");
                    throw null;
                }
                yb0Var = new wb0();
                Bundle bundle = new Bundle();
                bundle.putLong("buddy_id", j);
                bundle.putSerializable("memberType", t33Var2);
                yb0Var.u0(bundle);
            }
        } else {
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            long j2 = this.w0;
            t33 t33Var3 = this.v0;
            if (t33Var3 == null) {
                im3.e0("type");
                throw null;
            }
            yb0Var = new yb0();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("buddy_id", j2);
            bundle2.putSerializable("memberType", t33Var3);
            yb0Var.u0(bundle2);
        }
        if (yb0Var != null && (bb5Var = this.r0) != null) {
            bb5Var.I0(yb0Var, true);
        }
        return true;
    }

    @Override // o.hq4
    public final void u(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(R.menu.device_options_menu, menu);
        va3 va3Var = this.s0;
        if (va3Var != null) {
            GroupMemberListElementViewModel groupMemberListElementViewModel = ((iv1) va3Var).f1105o.n;
            menu.findItem(R.id.device_options_edit_button).setVisible(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsEditableByMe(groupMemberListElementViewModel.a, groupMemberListElementViewModel));
        }
    }
}
