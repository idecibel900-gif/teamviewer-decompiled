package o;

import android.R;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.net.nsd.NsdManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo/ia;", "Lo/gk7;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ia extends gk7 {
    public ProgressBar e1;
    public ImageView f1;
    public TextView g1;
    public dc3 h1;
    public wk0 i1;
    public ExpandableListView j1;
    public ea k1;
    public boolean l1;
    public final b9 m1;
    public final t0 n1 = new t0(this, 3);
    public final nt2 o1;

    public ia() {
        byte b = 1;
        this.m1 = new b9(this, b);
        this.o1 = (nt2) o0(new io.sentry.android.core.h2(this, (byte) 2), new e8(b));
    }

    public final void P0() {
        boolean z;
        ea eaVar = this.k1;
        Integer numValueOf = eaVar != null ? Integer.valueOf(eaVar.e.size()) : null;
        boolean z2 = true;
        boolean z3 = numValueOf != null && numValueOf.intValue() > 0;
        if (z3) {
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                z = true;
                for (int i = 0; i < iIntValue; i++) {
                    ea eaVar2 = this.k1;
                    o15 o15Var = eaVar2 != null ? (o15) ((vd5) eaVar2.b.get(i)).m : null;
                    if (o15Var != null && !o15Var.a()) {
                        z = false;
                    }
                    if (o15Var == null || !o15Var.i || o15Var.a()) {
                        ExpandableListView expandableListView = this.j1;
                        if (expandableListView != null) {
                            expandableListView.collapseGroup(i);
                        }
                    } else {
                        ExpandableListView expandableListView2 = this.j1;
                        if (expandableListView2 != null) {
                            expandableListView2.expandGroup(i);
                        }
                    }
                }
            } else {
                z = true;
            }
            ExpandableListView expandableListView3 = this.j1;
            if (expandableListView3 != null) {
                expandableListView3.setVisibility(!z ? 0 : 4);
            }
        } else {
            z = true;
        }
        if (z3 && !z) {
            z2 = false;
        }
        ImageView imageView = this.f1;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 4);
        }
        TextView textView = this.g1;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
        }
    }

    public final void Q0() {
        nw4 nw4Var;
        List list;
        ExpandableListView expandableListView = this.j1;
        if (expandableListView != null) {
            dc3 dc3Var = this.h1;
            this.k1 = (dc3Var == null || (nw4Var = ((q15) dc3Var).t) == null || (list = (List) nw4Var.getValue()) == null) ? null : new ea(expandableListView, list, this.m1, this.n1);
        }
        ExpandableListView expandableListView2 = this.j1;
        if (expandableListView2 != null) {
            expandableListView2.setSelector(R.color.transparent);
        }
        ExpandableListView expandableListView3 = this.j1;
        if (expandableListView3 != null) {
            expandableListView3.setAdapter(this.k1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    @Override // o.gk7, o.v02, o.ut2
    public final void X(Bundle bundle) {
        dc3 dc3Var;
        String[] strArrV0;
        ProgressBar progressBar;
        nw4 nw4Var;
        nw4 nw4Var2;
        nw4 nw4Var3;
        super.X(bundle);
        final byte b = 0;
        View viewInflate = LayoutInflater.from(E()).inflate(com.teamviewer.teamviewer.market.mobile.R.layout.dialog_nearby_devices, (ViewGroup) null, false);
        int i = com.teamviewer.teamviewer.market.mobile.R.id.device_discovery_progressBar;
        ProgressBar progressBar2 = (ProgressBar) r47.s(viewInflate, com.teamviewer.teamviewer.market.mobile.R.id.device_discovery_progressBar);
        if (progressBar2 != null) {
            i = com.teamviewer.teamviewer.market.mobile.R.id.divider;
            View viewS = r47.s(viewInflate, com.teamviewer.teamviewer.market.mobile.R.id.divider);
            if (viewS != null) {
                i = com.teamviewer.teamviewer.market.mobile.R.id.nearby_devices_dropdown_list;
                ExpandableListView expandableListView = (ExpandableListView) r47.s(viewInflate, com.teamviewer.teamviewer.market.mobile.R.id.nearby_devices_dropdown_list);
                if (expandableListView != null) {
                    i = com.teamviewer.teamviewer.market.mobile.R.id.nearby_devices_text;
                    if (((TextView) r47.s(viewInflate, com.teamviewer.teamviewer.market.mobile.R.id.nearby_devices_text)) != null) {
                        i = com.teamviewer.teamviewer.market.mobile.R.id.no_devices_found_image;
                        ImageView imageView = (ImageView) r47.s(viewInflate, com.teamviewer.teamviewer.market.mobile.R.id.no_devices_found_image);
                        if (imageView != null) {
                            i = com.teamviewer.teamviewer.market.mobile.R.id.no_devices_found_layout;
                            if (((ConstraintLayout) r47.s(viewInflate, com.teamviewer.teamviewer.market.mobile.R.id.no_devices_found_layout)) != null) {
                                i = com.teamviewer.teamviewer.market.mobile.R.id.no_devices_found_text;
                                TextView textView = (TextView) r47.s(viewInflate, com.teamviewer.teamviewer.market.mobile.R.id.no_devices_found_text);
                                if (textView != null) {
                                    this.i1 = new wk0((ConstraintLayout) viewInflate, progressBar2, viewS, expandableListView, imageView, textView);
                                    this.e1 = progressBar2;
                                    this.f1 = imageView;
                                    this.g1 = textView;
                                    this.j1 = expandableListView;
                                    c36 c36Var = zu1.c;
                                    if (c36Var == null) {
                                        hk0.g("Required value was null.");
                                        return;
                                    }
                                    dl5 dl5Var = new dl5(new q26(c36Var, (byte) 14), (byte) 2);
                                    ve8 ve8VarO = getG0();
                                    bf1 bf1VarK = h57.k(this);
                                    pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
                                    wt3 wt3VarB = w86.a.b(q15.class);
                                    String strC = wt3VarB.c();
                                    if (strC == null) {
                                        hk0.g("Local and anonymous classes can not be ViewModels");
                                        return;
                                    }
                                    this.h1 = (dc3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                                    ExpandableListView expandableListView2 = this.j1;
                                    if (expandableListView2 != null) {
                                        expandableListView2.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() { // from class: o.fa
                                            @Override // android.widget.ExpandableListView.OnGroupExpandListener
                                            public final void onGroupExpand(int i2) {
                                                nw4 nw4Var4;
                                                List list;
                                                vd5 vd5Var;
                                                o15 o15Var;
                                                dc3 dc3Var2 = this.a.h1;
                                                if (dc3Var2 == null || (nw4Var4 = ((q15) dc3Var2).t) == null || (list = (List) nw4Var4.getValue()) == null || (vd5Var = (vd5) list.get(i2)) == null || (o15Var = (o15) vd5Var.m) == null) {
                                                    return;
                                                }
                                                o15Var.i = true;
                                            }
                                        });
                                    }
                                    ExpandableListView expandableListView3 = this.j1;
                                    if (expandableListView3 != null) {
                                        expandableListView3.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() { // from class: o.ga
                                            @Override // android.widget.ExpandableListView.OnGroupCollapseListener
                                            public final void onGroupCollapse(int i2) {
                                                nw4 nw4Var4;
                                                List list;
                                                vd5 vd5Var;
                                                o15 o15Var;
                                                dc3 dc3Var2 = this.a.h1;
                                                if (dc3Var2 == null || (nw4Var4 = ((q15) dc3Var2).t) == null || (list = (List) nw4Var4.getValue()) == null || (vd5Var = (vd5) list.get(i2)) == null || (o15Var = (o15) vd5Var.m) == null) {
                                                    return;
                                                }
                                                o15Var.i = false;
                                            }
                                        });
                                    }
                                    Q0();
                                    final byte b2 = 1;
                                    this.l1 = bundle != null && bundle.getBoolean("OrientationChangeKey");
                                    dc3 dc3Var2 = this.h1;
                                    if (dc3Var2 != null && (nw4Var3 = ((q15) dc3Var2).u) != null) {
                                        nw4Var3.observe(this, new b7(new Function1(this) { // from class: o.ha
                                            public final /* synthetic */ ia n;

                                            {
                                                this.n = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                byte b3 = b;
                                                f88 f88Var = f88.a;
                                                ia iaVar = this.n;
                                                switch (b3) {
                                                    case 0:
                                                        if (!((Boolean) obj).booleanValue() || iaVar.l1) {
                                                            ProgressBar progressBar3 = iaVar.e1;
                                                            if (progressBar3 != null) {
                                                                progressBar3.setVisibility(4);
                                                            }
                                                            iaVar.P0();
                                                        }
                                                        break;
                                                    default:
                                                        iaVar.Q0();
                                                        iaVar.P0();
                                                        break;
                                                }
                                                return f88Var;
                                            }
                                        }, b2));
                                    }
                                    dc3 dc3Var3 = this.h1;
                                    if (dc3Var3 != null && (nw4Var2 = ((q15) dc3Var3).t) != null) {
                                        nw4Var2.observe(this, new b7(new Function1(this) { // from class: o.ha
                                            public final /* synthetic */ ia n;

                                            {
                                                this.n = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                byte b3 = b2;
                                                f88 f88Var = f88.a;
                                                ia iaVar = this.n;
                                                switch (b3) {
                                                    case 0:
                                                        if (!((Boolean) obj).booleanValue() || iaVar.l1) {
                                                            ProgressBar progressBar3 = iaVar.e1;
                                                            if (progressBar3 != null) {
                                                                progressBar3.setVisibility(4);
                                                            }
                                                            iaVar.P0();
                                                        }
                                                        break;
                                                    default:
                                                        iaVar.Q0();
                                                        iaVar.P0();
                                                        break;
                                                }
                                                return f88Var;
                                            }
                                        }, b2));
                                    }
                                    if (bundle != null) {
                                        dc3 dc3Var4 = this.h1;
                                        if (((dc3Var4 == null || (nw4Var = ((q15) dc3Var4).u) == null) ? false : im3.n(nw4Var.getValue(), Boolean.TRUE)) && !this.l1 && (progressBar = this.e1) != null) {
                                            progressBar.setVisibility(0);
                                        }
                                    }
                                    if (l25.b()) {
                                        ProgressBar progressBar3 = this.e1;
                                        if (progressBar3 != null) {
                                            progressBar3.setVisibility(0);
                                        }
                                        ImageView imageView2 = this.f1;
                                        if (imageView2 != null) {
                                            imageView2.setVisibility(4);
                                        }
                                        TextView textView2 = this.g1;
                                        if (textView2 != null) {
                                            textView2.setVisibility(4);
                                        }
                                        ExpandableListView expandableListView4 = this.j1;
                                        if (expandableListView4 != null) {
                                            expandableListView4.setVisibility(4);
                                        }
                                        dc3 dc3Var5 = this.h1;
                                        if (dc3Var5 != null) {
                                            q15 q15Var = (q15) dc3Var5;
                                            nf nfVar = q15Var.q;
                                            Object systemService = ((RemoteControlApplication) nfVar.c).getSystemService("servicediscovery");
                                            systemService.getClass();
                                            NsdManager nsdManager = (NsdManager) systemService;
                                            nfVar.j = nsdManager;
                                            if (((py4) nfVar.k) == py4.m) {
                                                nsdManager.discoverServices("_teamviewer._tcp.", 1, (oy4) ((kh7) nfVar.d).getValue());
                                            }
                                            long j = l25.b() ? 30000L : 1000L;
                                            CountDownTimer countDownTimer = q15Var.s;
                                            if (countDownTimer != null) {
                                                countDownTimer.cancel();
                                            }
                                            q15Var.s = new p15(j, q15Var).start();
                                            q15Var.u.setValue(Boolean.TRUE);
                                        }
                                        xt2 xt2VarC = C();
                                        if (xt2VarC != null) {
                                            dc3 dc3Var6 = this.h1;
                                            String[] strArrV1 = dc3Var6 != null ? ((q15) dc3Var6).V0() : null;
                                            if (strArrV1 != null) {
                                                int length = strArrV1.length;
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 >= length) {
                                                        dc3 dc3Var7 = this.h1;
                                                        if (dc3Var7 != null) {
                                                            ((q15) dc3Var7).W0();
                                                        }
                                                    } else if (hm3.h(xt2VarC, strArrV1[i2]) == 0) {
                                                        i2++;
                                                    } else {
                                                        dc3Var = this.h1;
                                                        if (dc3Var != null) {
                                                            strArrV0 = ((q15) dc3Var).V0();
                                                        } else {
                                                            strArrV0 = null;
                                                        }
                                                        this.o1.a(strArrV0, null);
                                                    }
                                                }
                                            } else {
                                                dc3Var = this.h1;
                                                if (dc3Var != null) {
                                                    strArrV0 = ((q15) dc3Var).V0();
                                                } else {
                                                    strArrV0 = null;
                                                }
                                                this.o1.a(strArrV0, null);
                                            }
                                        }
                                    } else {
                                        P0();
                                    }
                                    this.Y0 = false;
                                    wk0 wk0Var = this.i1;
                                    K0(wk0Var != null ? (ConstraintLayout) wk0Var.n : null);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // o.gk7, o.v02, o.ut2
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putBoolean("OrientationChangeKey", true);
    }

    @Override // o.v02, o.ut2
    public final void j0() {
        NsdManager nsdManager;
        BluetoothAdapter bluetoothAdapter;
        super.j0();
        dc3 dc3Var = this.h1;
        if (dc3Var != null) {
            o10 o10Var = ((q15) dc3Var).f1795o;
            LinkedHashMap linkedHashMap = (LinkedHashMap) o10Var.c;
            BluetoothLeScanner bluetoothLeScanner = (BluetoothLeScanner) o10Var.h;
            if (o10Var.a && (bluetoothAdapter = (BluetoothAdapter) o10Var.g) != null && bluetoothAdapter.isEnabled()) {
                o10Var.a = false;
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    String str = (String) ((Map.Entry) it.next()).getKey();
                    ar arVar = (ar) o10Var.b;
                    if (arVar == null) {
                        im3.e0("registeredCallback");
                        throw null;
                    }
                    arVar.p(str, true);
                }
                linkedHashMap.clear();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan((n10) o10Var.i);
                }
                ((Handler) ((kh7) o10Var.d).getValue()).removeCallbacks((mt8) o10Var.j);
            }
        }
        dc3 dc3Var2 = this.h1;
        if (dc3Var2 != null) {
            nf nfVar = ((q15) dc3Var2).q;
            ArrayList<ry4> arrayList = (ArrayList) nfVar.f;
            if (((py4) nfVar.k) == py4.n && (nsdManager = (NsdManager) nfVar.j) != null) {
                nsdManager.stopServiceDiscovery((oy4) ((kh7) nfVar.d).getValue());
            }
            if (Build.VERSION.SDK_INT >= 34) {
                for (ry4 ry4Var : arrayList) {
                    NsdManager nsdManager2 = (NsdManager) nfVar.j;
                    if (nsdManager2 != null) {
                        nsdManager2.unregisterServiceInfoCallback(ry4Var);
                    }
                }
            }
            arrayList.clear();
        }
    }
}
