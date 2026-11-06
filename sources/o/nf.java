package o;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapper;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nf {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public nf(yy6 yy6Var, Function1 function1) {
        this.a = (byte) 0;
        this.b = new t2((byte) 11);
        this.c = new iy4();
        this.d = h57.p(yy6Var);
        this.e = h57.p(yy6Var);
        this.h = d57.b(new hf(this, (byte) 0));
        this.i = new wf5(Float.NaN);
        new yx(0);
        v47.h().g();
        h65.a.getClass();
        this.j = new wf5(0.0f);
        this.f = h57.p(null);
        this.g = h57.p(new uj1(ea2.m, new float[0]));
        this.k = new mf(this);
        this.b = function1;
    }

    public static Object b(nf nfVar, iw2 iw2Var, jc1 jc1Var) {
        iy4 iy4Var = (iy4) nfVar.c;
        jf jfVar = new jf(nfVar, iw2Var, null, (byte) 0);
        iy4Var.getClass();
        Object objJ = hm3.j(new gy4(ay4.m, iy4Var, jfVar, null), jc1Var);
        return objJ == ne1.m ? objJ : f88.a;
    }

    public static es4 c(ds4 ds4Var, es4 es4Var) {
        es4 es4VarCreate;
        if (ds4Var instanceof ls4) {
            es4VarCreate = ((ls4) ds4Var).create();
            es4VarCreate.f737o = k45.f(es4VarCreate);
        } else {
            m20 m20Var = new m20();
            m20Var.f737o = k45.d(ds4Var);
            m20Var.A = ds4Var;
            m20Var.C = new HashSet();
            es4VarCreate = m20Var;
        }
        if (es4VarCreate.z) {
            ki3.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        es4VarCreate.u = true;
        es4 es4Var2 = es4Var.r;
        if (es4Var2 != null) {
            es4Var2.q = es4VarCreate;
            es4VarCreate.r = es4Var2;
        }
        es4Var.r = es4VarCreate;
        es4VarCreate.q = es4Var;
        return es4VarCreate;
    }

    public static es4 d(es4 es4Var) {
        boolean z = es4Var.z;
        if (z) {
            vw4 vw4Var = k45.a;
            if (!z) {
                ki3.c("autoInvalidateRemovedNode called on unattached node");
            }
            k45.a(es4Var, -1, 2);
            es4Var.R0();
            es4Var.L0();
        }
        es4 es4Var2 = es4Var.r;
        es4 es4Var3 = es4Var.q;
        if (es4Var2 != null) {
            es4Var2.q = es4Var3;
            es4Var.r = null;
        }
        if (es4Var3 != null) {
            es4Var3.r = es4Var2;
            es4Var.q = null;
        }
        es4Var3.getClass();
        return es4Var3;
    }

    public static nf g(LayoutInflater layoutInflater, CoordinatorLayout coordinatorLayout) {
        View viewInflate = layoutInflater.inflate(R.layout.partnerlist_fab_add_partner, (ViewGroup) coordinatorLayout, false);
        int i = R.id.pl_group_add;
        FloatingActionButton floatingActionButton = (FloatingActionButton) r47.s(viewInflate, R.id.pl_group_add);
        if (floatingActionButton != null) {
            i = R.id.pl_group_add_computer;
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) r47.s(viewInflate, R.id.pl_group_add_computer);
            if (floatingActionButton2 != null) {
                i = R.id.pl_group_add_computer_label;
                TextView textView = (TextView) r47.s(viewInflate, R.id.pl_group_add_computer_label);
                if (textView != null) {
                    i = R.id.pl_group_add_contact;
                    FloatingActionButton floatingActionButton3 = (FloatingActionButton) r47.s(viewInflate, R.id.pl_group_add_contact);
                    if (floatingActionButton3 != null) {
                        i = R.id.pl_group_add_contact_label;
                        TextView textView2 = (TextView) r47.s(viewInflate, R.id.pl_group_add_contact_label);
                        if (textView2 != null) {
                            i = R.id.pl_group_add_group;
                            FloatingActionButton floatingActionButton4 = (FloatingActionButton) r47.s(viewInflate, R.id.pl_group_add_group);
                            if (floatingActionButton4 != null) {
                                i = R.id.pl_group_add_group_label;
                                TextView textView3 = (TextView) r47.s(viewInflate, R.id.pl_group_add_group_label);
                                if (textView3 != null) {
                                    i = R.id.pl_nearby_search;
                                    FloatingActionButton floatingActionButton5 = (FloatingActionButton) r47.s(viewInflate, R.id.pl_nearby_search);
                                    if (floatingActionButton5 != null) {
                                        i = R.id.pl_nearby_search_label;
                                        TextView textView4 = (TextView) r47.s(viewInflate, R.id.pl_nearby_search_label);
                                        if (textView4 != null) {
                                            return new nf((GridLayout) viewInflate, floatingActionButton, floatingActionButton2, textView, floatingActionButton3, textView2, floatingActionButton4, textView3, floatingActionButton5, textView4, (byte) 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static void n(ds4 ds4Var, ds4 ds4Var2, es4 es4Var) {
        if ((ds4Var instanceof ls4) && (ds4Var2 instanceof ls4)) {
            es4Var.getClass();
            ((ls4) ds4Var2).update(es4Var);
            if (es4Var.z) {
                k45.c(es4Var);
                return;
            } else {
                es4Var.v = true;
                return;
            }
        }
        if (!(es4Var instanceof m20)) {
            ki3.c("Unknown Modifier.Node type");
            return;
        }
        m20 m20Var = (m20) es4Var;
        if (m20Var.z) {
            m20Var.V0();
        }
        m20Var.A = ds4Var2;
        m20Var.f737o = k45.d(ds4Var2);
        if (m20Var.z) {
            m20Var.U0(false);
        }
        if (es4Var.z) {
            k45.c(es4Var);
        } else {
            es4Var.v = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public Object a(Object obj, ay4 ay4Var, jw2 jw2Var, hc1 hc1Var) {
        kf kfVar;
        bg5 bg5Var = (bg5) this.f;
        if (hc1Var instanceof kf) {
            kfVar = (kf) hc1Var;
            int i = kfVar.f1257o;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfVar.f1257o = i - Integer.MIN_VALUE;
            } else {
                kfVar = new kf(this, hc1Var);
            }
        } else {
            kfVar = new kf(this, hc1Var);
        }
        Object obj2 = kfVar.m;
        int i2 = kfVar.f1257o;
        hc1 hc1Var2 = null;
        try {
            if (i2 == 0) {
                ct1.a0(obj2);
                if (e().c(obj)) {
                    iy4 iy4Var = (iy4) this.c;
                    lf lfVar = new lf(this, obj, jw2Var, hc1Var2, (byte) 0);
                    kfVar.f1257o = 1;
                    iy4Var.getClass();
                    Object objJ = hm3.j(new gy4(ay4Var, iy4Var, lfVar, null), kfVar);
                    ne1 ne1Var = ne1.m;
                    if (objJ == ne1Var) {
                        return ne1Var;
                    }
                } else if (((Boolean) ((Function1) this.b).invoke(obj)).booleanValue()) {
                    ((bg5) this.e).setValue(obj);
                    ((bg5) this.d).setValue(obj);
                }
                return f88.a;
            }
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj2);
            bg5Var.setValue(null);
            return f88.a;
        } catch (Throwable th) {
            bg5Var.setValue(null);
            throw th;
        }
    }

    public uj1 e() {
        return (uj1) ((bg5) this.g).getValue();
    }

    public boolean f(int i) {
        return (((es4) this.g).p & i) != 0;
    }

    public float h(float f) {
        wf5 wf5Var = (wf5) this.i;
        return ct1.u((Float.isNaN(wf5Var.z()) ? 0.0f : wf5Var.z()) + f, e().e(), e().d());
    }

    public void i(es4 es4Var, e45 e45Var) {
        for (es4 es4Var2 = es4Var.q; es4Var2 != null; es4Var2 = es4Var2.q) {
            if (es4Var2 == ((a45) this.c)) {
                LayoutNode layoutNodeF = ((LayoutNode) this.b).F();
                e45Var.K = layoutNodeF != null ? (ti3) layoutNodeF.S.d : null;
                this.e = e45Var;
                return;
            } else {
                if ((es4Var2.f737o & 2) != 0) {
                    return;
                }
                es4Var2.T0(e45Var);
            }
        }
    }

    public float j() {
        wf5 wf5Var = (wf5) this.i;
        if (Float.isNaN(wf5Var.z())) {
            ni3.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return wf5Var.z();
    }

    public void k() {
        for (es4 es4Var = (es4) this.g; es4Var != null; es4Var = es4Var.r) {
            es4Var.Q0();
            if (es4Var.u) {
                vw4 vw4Var = k45.a;
                if (!es4Var.z) {
                    ki3.c("autoInvalidateInsertedNode called on unattached node");
                }
                k45.a(es4Var, -1, 1);
            }
            if (es4Var.v) {
                k45.c(es4Var);
            }
            es4Var.u = false;
            es4Var.v = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0145 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void l(int r32, o.zw4 r33, o.zw4 r34, o.es4 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.nf.l(int, o.zw4, o.zw4, o.es4, boolean):void");
    }

    public void m() {
        u04 u04Var;
        nc5 nc5Var;
        LayoutNode layoutNode = (LayoutNode) this.b;
        e45 e45Var = (ti3) this.d;
        for (es4 es4Var = ((kn7) this.f).q; es4Var != null; es4Var = es4Var.q) {
            r04 r04VarX = vn4.X(es4Var);
            if (r04VarX != null) {
                e45 e45Var2 = es4Var.t;
                if (e45Var2 != null) {
                    u04Var = (u04) e45Var2;
                    r04 r04Var = u04Var.q0;
                    u04Var.E1(r04VarX);
                    if (r04Var != es4Var && (nc5Var = u04Var.h0) != null) {
                        ((o03) nc5Var).c();
                    }
                } else {
                    u04Var = new u04(layoutNode, r04VarX);
                    es4Var.T0(u04Var);
                }
                e45Var.K = u04Var;
                u04Var.J = e45Var;
                e45Var = u04Var;
            } else {
                es4Var.T0(e45Var);
            }
        }
        LayoutNode layoutNodeF = layoutNode.F();
        e45Var.K = layoutNodeF != null ? (ti3) layoutNodeF.S.d : null;
        this.e = e45Var;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("[");
                es4 es4Var = (es4) this.g;
                kn7 kn7Var = (kn7) this.f;
                if (es4Var == kn7Var) {
                    sb.append("]");
                } else {
                    while (es4Var != null && es4Var != kn7Var) {
                        sb.append(String.valueOf(es4Var));
                        if (es4Var.r == kn7Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            es4Var = es4Var.r;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public nf(NSDDiscoveryWrapper nSDDiscoveryWrapper, RemoteControlApplication remoteControlApplication) {
        final byte b = 1;
        this.a = (byte) 1;
        this.b = nSDDiscoveryWrapper;
        this.c = remoteControlApplication;
        final byte b2 = 0;
        this.d = new kh7(new Function0(this) { // from class: o.ny4
            public final /* synthetic */ nf n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b2;
                nf nfVar = this.n;
                switch (b3) {
                    case 0:
                        return new oy4(nfVar);
                    default:
                        return new qy4(nfVar);
                }
            }
        });
        this.e = new kh7(new Function0(this) { // from class: o.ny4
            public final /* synthetic */ nf n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b3 = b;
                nf nfVar = this.n;
                switch (b3) {
                    case 0:
                        return new oy4(nfVar);
                    default:
                        return new qy4(nfVar);
                }
            }
        });
        this.f = new ArrayList();
        this.g = new kh7(new ti4((byte) 10));
        this.h = new kh7(new ti4((byte) 11));
        this.k = py4.m;
    }

    public nf(LayoutNode layoutNode) {
        this.a = (byte) 2;
        this.b = layoutNode;
        a45 a45Var = new a45();
        a45Var.p = -1;
        this.c = a45Var;
        ti3 ti3Var = new ti3(layoutNode);
        this.d = ti3Var;
        this.e = ti3Var;
        kn7 kn7Var = ti3Var.q0;
        this.f = kn7Var;
        this.g = kn7Var;
        this.h = new zw4();
    }

    public nf(fz4 fz4Var, xt6 xt6Var, qi7 qi7Var, EventHub eventHub, Settings settings, RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences, io.sentry.android.core.n1 n1Var, j93 j93Var, d31 d31Var) {
        this.a = (byte) 3;
        qi7Var.getClass();
        eventHub.getClass();
        settings.getClass();
        sharedPreferences.getClass();
        n1Var.getClass();
        this.b = fz4Var;
        this.c = xt6Var;
        this.d = qi7Var;
        this.e = eventHub;
        this.f = settings;
        this.g = remoteControlApplication;
        this.h = sharedPreferences;
        this.i = n1Var;
        this.j = j93Var;
        this.k = d31Var;
    }

    public /* synthetic */ nf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.j = obj9;
        this.k = obj10;
    }
}
