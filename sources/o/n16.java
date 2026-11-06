package o;

import com.teamviewer.remotecontrollib.swig.IPredefinedShortcutsViewModel;
import com.teamviewer.remotecontrollib.swig.IPredefinedShortcutsViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class n16 extends oe8 {
    public final dd3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IPredefinedShortcutsViewModel f1532o;
    public RCClientActivity p;
    public final ArrayList q;

    public n16(final vc3 vc3Var, oh3 oh3Var, IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel) {
        vc3Var.getClass();
        this.n = oh3Var;
        this.f1532o = iPredefinedShortcutsViewModel;
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        Integer numValueOf = Integer.valueOf(R.string.tv_session_toolbar_info_button_save);
        Integer numValueOf2 = Integer.valueOf(R.string.tv_session_toolbar_info_button_paste);
        Integer numValueOf3 = Integer.valueOf(R.string.tv_session_toolbar_info_button_copy);
        int iOrdinal = vc3Var.ordinal();
        final byte b = 4;
        final byte b2 = 2;
        nw4 nw4Var = iOrdinal != 2 ? iOrdinal != 4 ? new nw4(numValueOf3) : new nw4(numValueOf3) : new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_copy_osx));
        nw4 nw4Var2 = new nw4(Integer.valueOf(R.drawable.predefined_shortcuts_copy));
        Boolean bool = Boolean.TRUE;
        final byte b3 = 0;
        arrayList.add(new e26(0, nw4Var, nw4Var2, new nw4(bool), new Function0() { // from class: o.k16
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b4 = b3;
                f88 f88Var = f88.a;
                n16 n16Var = this;
                vc3 vc3Var2 = vc3Var;
                switch (b4) {
                    case 0:
                        int i = m16.a[vc3Var2.ordinal()];
                        dd3 dd3Var = n16Var.n;
                        if (i == 1) {
                            if (dd3Var != null) {
                                oh3 oh3Var2 = (oh3) dd3Var;
                                oh3Var2.h(true, false);
                                oh3Var2.f(99, false);
                                oh3Var2.h(false, false);
                            }
                        } else if (dd3Var != null) {
                            oh3 oh3Var3 = (oh3) dd3Var;
                            oh3Var3.d(true, null);
                            oh3Var3.f(99, false);
                            oh3Var3.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel2 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel2.a, iPredefinedShortcutsViewModel2, 0);
                        break;
                    case 1:
                        int i2 = m16.a[vc3Var2.ordinal()];
                        dd3 dd3Var2 = n16Var.n;
                        if (i2 == 1) {
                            if (dd3Var2 != null) {
                                oh3 oh3Var4 = (oh3) dd3Var2;
                                oh3Var4.h(true, false);
                                oh3Var4.f(118, false);
                                oh3Var4.h(false, false);
                            }
                        } else if (dd3Var2 != null) {
                            oh3 oh3Var5 = (oh3) dd3Var2;
                            oh3Var5.d(true, null);
                            oh3Var5.f(118, false);
                            oh3Var5.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel3 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel3.a, iPredefinedShortcutsViewModel3, 1);
                        break;
                    case 2:
                        dd3 dd3Var3 = n16Var.n;
                        int iOrdinal2 = vc3Var2.ordinal();
                        if (iOrdinal2 != 2) {
                            dg8 dg8Var = dg8.VK_SNAPSHOT;
                            if (iOrdinal2 != 4) {
                                if (dd3Var3 != null) {
                                    oh3 oh3Var6 = (oh3) dd3Var3;
                                    oh3Var6.h(true, false);
                                    oh3Var6.a |= 32;
                                    oh3Var6.g(dg8Var, false, 0);
                                    oh3Var6.h(false, false);
                                    oh3Var6.a &= -33;
                                    oh3Var6.g(dg8Var, true, 0);
                                }
                            } else if (dd3Var3 != null) {
                                oh3 oh3Var7 = (oh3) dd3Var3;
                                oh3Var7.h(true, false);
                                oh3Var7.a |= 32;
                                oh3Var7.g(dg8Var, false, 0);
                                oh3Var7.h(false, false);
                                oh3Var7.a &= -33;
                                oh3Var7.g(dg8Var, true, 0);
                            }
                        } else if (dd3Var3 != null) {
                            oh3 oh3Var8 = (oh3) dd3Var3;
                            oh3Var8.e(true, null);
                            oh3Var8.h(true, false);
                            oh3Var8.f(51, false);
                            oh3Var8.e(false, null);
                            oh3Var8.h(false, false);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel4 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel4.a, iPredefinedShortcutsViewModel4, 4);
                        break;
                    case 3:
                        int i3 = m16.a[vc3Var2.ordinal()];
                        dd3 dd3Var4 = n16Var.n;
                        if (i3 == 1) {
                            if (dd3Var4 != null) {
                                oh3 oh3Var9 = (oh3) dd3Var4;
                                oh3Var9.d(true, null);
                                oh3Var9.a |= 64;
                                dg8 dg8Var2 = dg8.VK_UP;
                                oh3Var9.g(dg8Var2, false, 0);
                                oh3Var9.a &= -65;
                                oh3Var9.g(dg8Var2, true, 0);
                                oh3Var9.d(false, null);
                            }
                        } else if (dd3Var4 != null) {
                            oh3 oh3Var10 = (oh3) dd3Var4;
                            oh3Var10.h(true, false);
                            oh3Var10.a |= 16;
                            dg8 dg8Var3 = dg8.VK_TAB;
                            oh3Var10.g(dg8Var3, false, 0);
                            oh3Var10.h(false, false);
                            oh3Var10.a &= -17;
                            oh3Var10.g(dg8Var3, true, 0);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel5 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel5.a, iPredefinedShortcutsViewModel5, 3);
                        break;
                    default:
                        int i4 = m16.a[vc3Var2.ordinal()];
                        dd3 dd3Var5 = n16Var.n;
                        if (i4 == 1) {
                            if (dd3Var5 != null) {
                                oh3 oh3Var11 = (oh3) dd3Var5;
                                oh3Var11.h(true, false);
                                oh3Var11.f(115, false);
                                oh3Var11.h(false, false);
                            }
                        } else if (dd3Var5 != null) {
                            oh3 oh3Var12 = (oh3) dd3Var5;
                            oh3Var12.d(true, null);
                            oh3Var12.f(115, false);
                            oh3Var12.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel6 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel6.a, iPredefinedShortcutsViewModel6, 2);
                        break;
                }
                return f88Var;
            }
        }));
        int iOrdinal2 = vc3Var.ordinal();
        nw4 nw4Var3 = iOrdinal2 != 2 ? iOrdinal2 != 4 ? new nw4(numValueOf2) : new nw4(numValueOf2) : new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_paste_osx));
        final byte b4 = 1;
        arrayList.add(new e26(1, nw4Var3, new nw4(Integer.valueOf(R.drawable.predefined_shortcuts_paste)), new nw4(bool), new Function0() { // from class: o.k16
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b4;
                f88 f88Var = f88.a;
                n16 n16Var = this;
                vc3 vc3Var2 = vc3Var;
                switch (b5) {
                    case 0:
                        int i = m16.a[vc3Var2.ordinal()];
                        dd3 dd3Var = n16Var.n;
                        if (i == 1) {
                            if (dd3Var != null) {
                                oh3 oh3Var2 = (oh3) dd3Var;
                                oh3Var2.h(true, false);
                                oh3Var2.f(99, false);
                                oh3Var2.h(false, false);
                            }
                        } else if (dd3Var != null) {
                            oh3 oh3Var3 = (oh3) dd3Var;
                            oh3Var3.d(true, null);
                            oh3Var3.f(99, false);
                            oh3Var3.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel2 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel2.a, iPredefinedShortcutsViewModel2, 0);
                        break;
                    case 1:
                        int i2 = m16.a[vc3Var2.ordinal()];
                        dd3 dd3Var2 = n16Var.n;
                        if (i2 == 1) {
                            if (dd3Var2 != null) {
                                oh3 oh3Var4 = (oh3) dd3Var2;
                                oh3Var4.h(true, false);
                                oh3Var4.f(118, false);
                                oh3Var4.h(false, false);
                            }
                        } else if (dd3Var2 != null) {
                            oh3 oh3Var5 = (oh3) dd3Var2;
                            oh3Var5.d(true, null);
                            oh3Var5.f(118, false);
                            oh3Var5.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel3 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel3.a, iPredefinedShortcutsViewModel3, 1);
                        break;
                    case 2:
                        dd3 dd3Var3 = n16Var.n;
                        int iOrdinal3 = vc3Var2.ordinal();
                        if (iOrdinal3 != 2) {
                            dg8 dg8Var = dg8.VK_SNAPSHOT;
                            if (iOrdinal3 != 4) {
                                if (dd3Var3 != null) {
                                    oh3 oh3Var6 = (oh3) dd3Var3;
                                    oh3Var6.h(true, false);
                                    oh3Var6.a |= 32;
                                    oh3Var6.g(dg8Var, false, 0);
                                    oh3Var6.h(false, false);
                                    oh3Var6.a &= -33;
                                    oh3Var6.g(dg8Var, true, 0);
                                }
                            } else if (dd3Var3 != null) {
                                oh3 oh3Var7 = (oh3) dd3Var3;
                                oh3Var7.h(true, false);
                                oh3Var7.a |= 32;
                                oh3Var7.g(dg8Var, false, 0);
                                oh3Var7.h(false, false);
                                oh3Var7.a &= -33;
                                oh3Var7.g(dg8Var, true, 0);
                            }
                        } else if (dd3Var3 != null) {
                            oh3 oh3Var8 = (oh3) dd3Var3;
                            oh3Var8.e(true, null);
                            oh3Var8.h(true, false);
                            oh3Var8.f(51, false);
                            oh3Var8.e(false, null);
                            oh3Var8.h(false, false);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel4 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel4.a, iPredefinedShortcutsViewModel4, 4);
                        break;
                    case 3:
                        int i3 = m16.a[vc3Var2.ordinal()];
                        dd3 dd3Var4 = n16Var.n;
                        if (i3 == 1) {
                            if (dd3Var4 != null) {
                                oh3 oh3Var9 = (oh3) dd3Var4;
                                oh3Var9.d(true, null);
                                oh3Var9.a |= 64;
                                dg8 dg8Var2 = dg8.VK_UP;
                                oh3Var9.g(dg8Var2, false, 0);
                                oh3Var9.a &= -65;
                                oh3Var9.g(dg8Var2, true, 0);
                                oh3Var9.d(false, null);
                            }
                        } else if (dd3Var4 != null) {
                            oh3 oh3Var10 = (oh3) dd3Var4;
                            oh3Var10.h(true, false);
                            oh3Var10.a |= 16;
                            dg8 dg8Var3 = dg8.VK_TAB;
                            oh3Var10.g(dg8Var3, false, 0);
                            oh3Var10.h(false, false);
                            oh3Var10.a &= -17;
                            oh3Var10.g(dg8Var3, true, 0);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel5 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel5.a, iPredefinedShortcutsViewModel5, 3);
                        break;
                    default:
                        int i4 = m16.a[vc3Var2.ordinal()];
                        dd3 dd3Var5 = n16Var.n;
                        if (i4 == 1) {
                            if (dd3Var5 != null) {
                                oh3 oh3Var11 = (oh3) dd3Var5;
                                oh3Var11.h(true, false);
                                oh3Var11.f(115, false);
                                oh3Var11.h(false, false);
                            }
                        } else if (dd3Var5 != null) {
                            oh3 oh3Var12 = (oh3) dd3Var5;
                            oh3Var12.d(true, null);
                            oh3Var12.f(115, false);
                            oh3Var12.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel6 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel6.a, iPredefinedShortcutsViewModel6, 2);
                        break;
                }
                return f88Var;
            }
        }));
        nw4 nw4Var4 = new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_start_terminal));
        nw4 nw4Var5 = new nw4(Integer.valueOf(R.drawable.predefined_shortcuts_start_terminal));
        vc3 vc3Var2 = vc3.OSVersion_Linux;
        arrayList.add(new e26(2, nw4Var4, nw4Var5, vc3Var == vc3Var2 ? new nw4(bool) : new nw4(Boolean.FALSE), new Function0(this) { // from class: o.l16
            public final /* synthetic */ n16 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b3;
                f88 f88Var = f88.a;
                n16 n16Var = this.n;
                switch (b5) {
                    case 0:
                        dd3 dd3Var = n16Var.n;
                        if (dd3Var != null) {
                            oh3 oh3Var2 = (oh3) dd3Var;
                            oh3Var2.d(true, null);
                            oh3Var2.c(true, null);
                            oh3Var2.f(116, false);
                            oh3Var2.c(false, null);
                            oh3Var2.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel2 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel2.a, iPredefinedShortcutsViewModel2, 7);
                        break;
                    case 1:
                        dd3 dd3Var2 = n16Var.n;
                        if (dd3Var2 != null) {
                            oh3 oh3Var3 = (oh3) dd3Var2;
                            oh3Var3.d(true, null);
                            oh3Var3.e(true, null);
                            oh3Var3.f(113, false);
                            oh3Var3.e(false, null);
                            oh3Var3.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel3 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel3.a, iPredefinedShortcutsViewModel3, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity = n16Var.p;
                        if (rCClientActivity != null) {
                            rCClientActivity.R();
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel4 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel4.a, iPredefinedShortcutsViewModel4, 5);
                        break;
                }
                return f88Var;
            }
        }));
        arrayList.add(new e26(3, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_end_terminal)), new nw4(Integer.valueOf(R.drawable.predefined_shortcuts_end_terminal)), vc3Var == vc3Var2 ? new nw4(bool) : new nw4(Boolean.FALSE), new Function0(this) { // from class: o.l16
            public final /* synthetic */ n16 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b4;
                f88 f88Var = f88.a;
                n16 n16Var = this.n;
                switch (b5) {
                    case 0:
                        dd3 dd3Var = n16Var.n;
                        if (dd3Var != null) {
                            oh3 oh3Var2 = (oh3) dd3Var;
                            oh3Var2.d(true, null);
                            oh3Var2.c(true, null);
                            oh3Var2.f(116, false);
                            oh3Var2.c(false, null);
                            oh3Var2.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel2 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel2.a, iPredefinedShortcutsViewModel2, 7);
                        break;
                    case 1:
                        dd3 dd3Var2 = n16Var.n;
                        if (dd3Var2 != null) {
                            oh3 oh3Var3 = (oh3) dd3Var2;
                            oh3Var3.d(true, null);
                            oh3Var3.e(true, null);
                            oh3Var3.f(113, false);
                            oh3Var3.e(false, null);
                            oh3Var3.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel3 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel3.a, iPredefinedShortcutsViewModel3, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity = n16Var.p;
                        if (rCClientActivity != null) {
                            rCClientActivity.R();
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel4 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel4.a, iPredefinedShortcutsViewModel4, 5);
                        break;
                }
                return f88Var;
            }
        }));
        int iOrdinal3 = vc3Var.ordinal();
        arrayList.add(new e26(4, iOrdinal3 != 2 ? iOrdinal3 != 4 ? new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_print_screen)) : new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_print_screen_linux)) : new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_print_screen_osx)), new nw4(Integer.valueOf(R.drawable.predefined_shortcuts_print_screen)), vc3Var == vc3Var2 ? new nw4(Boolean.FALSE) : new nw4(bool), new Function0() { // from class: o.k16
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b5 = b2;
                f88 f88Var = f88.a;
                n16 n16Var = this;
                vc3 vc3Var3 = vc3Var;
                switch (b5) {
                    case 0:
                        int i = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var = n16Var.n;
                        if (i == 1) {
                            if (dd3Var != null) {
                                oh3 oh3Var2 = (oh3) dd3Var;
                                oh3Var2.h(true, false);
                                oh3Var2.f(99, false);
                                oh3Var2.h(false, false);
                            }
                        } else if (dd3Var != null) {
                            oh3 oh3Var3 = (oh3) dd3Var;
                            oh3Var3.d(true, null);
                            oh3Var3.f(99, false);
                            oh3Var3.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel2 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel2.a, iPredefinedShortcutsViewModel2, 0);
                        break;
                    case 1:
                        int i2 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var2 = n16Var.n;
                        if (i2 == 1) {
                            if (dd3Var2 != null) {
                                oh3 oh3Var4 = (oh3) dd3Var2;
                                oh3Var4.h(true, false);
                                oh3Var4.f(118, false);
                                oh3Var4.h(false, false);
                            }
                        } else if (dd3Var2 != null) {
                            oh3 oh3Var5 = (oh3) dd3Var2;
                            oh3Var5.d(true, null);
                            oh3Var5.f(118, false);
                            oh3Var5.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel3 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel3.a, iPredefinedShortcutsViewModel3, 1);
                        break;
                    case 2:
                        dd3 dd3Var3 = n16Var.n;
                        int iOrdinal4 = vc3Var3.ordinal();
                        if (iOrdinal4 != 2) {
                            dg8 dg8Var = dg8.VK_SNAPSHOT;
                            if (iOrdinal4 != 4) {
                                if (dd3Var3 != null) {
                                    oh3 oh3Var6 = (oh3) dd3Var3;
                                    oh3Var6.h(true, false);
                                    oh3Var6.a |= 32;
                                    oh3Var6.g(dg8Var, false, 0);
                                    oh3Var6.h(false, false);
                                    oh3Var6.a &= -33;
                                    oh3Var6.g(dg8Var, true, 0);
                                }
                            } else if (dd3Var3 != null) {
                                oh3 oh3Var7 = (oh3) dd3Var3;
                                oh3Var7.h(true, false);
                                oh3Var7.a |= 32;
                                oh3Var7.g(dg8Var, false, 0);
                                oh3Var7.h(false, false);
                                oh3Var7.a &= -33;
                                oh3Var7.g(dg8Var, true, 0);
                            }
                        } else if (dd3Var3 != null) {
                            oh3 oh3Var8 = (oh3) dd3Var3;
                            oh3Var8.e(true, null);
                            oh3Var8.h(true, false);
                            oh3Var8.f(51, false);
                            oh3Var8.e(false, null);
                            oh3Var8.h(false, false);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel4 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel4.a, iPredefinedShortcutsViewModel4, 4);
                        break;
                    case 3:
                        int i3 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var4 = n16Var.n;
                        if (i3 == 1) {
                            if (dd3Var4 != null) {
                                oh3 oh3Var9 = (oh3) dd3Var4;
                                oh3Var9.d(true, null);
                                oh3Var9.a |= 64;
                                dg8 dg8Var2 = dg8.VK_UP;
                                oh3Var9.g(dg8Var2, false, 0);
                                oh3Var9.a &= -65;
                                oh3Var9.g(dg8Var2, true, 0);
                                oh3Var9.d(false, null);
                            }
                        } else if (dd3Var4 != null) {
                            oh3 oh3Var10 = (oh3) dd3Var4;
                            oh3Var10.h(true, false);
                            oh3Var10.a |= 16;
                            dg8 dg8Var3 = dg8.VK_TAB;
                            oh3Var10.g(dg8Var3, false, 0);
                            oh3Var10.h(false, false);
                            oh3Var10.a &= -17;
                            oh3Var10.g(dg8Var3, true, 0);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel5 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel5.a, iPredefinedShortcutsViewModel5, 3);
                        break;
                    default:
                        int i4 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var5 = n16Var.n;
                        if (i4 == 1) {
                            if (dd3Var5 != null) {
                                oh3 oh3Var11 = (oh3) dd3Var5;
                                oh3Var11.h(true, false);
                                oh3Var11.f(115, false);
                                oh3Var11.h(false, false);
                            }
                        } else if (dd3Var5 != null) {
                            oh3 oh3Var12 = (oh3) dd3Var5;
                            oh3Var12.d(true, null);
                            oh3Var12.f(115, false);
                            oh3Var12.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel6 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel6.a, iPredefinedShortcutsViewModel6, 2);
                        break;
                }
                return f88Var;
            }
        }));
        int iOrdinal4 = vc3Var.ordinal();
        nw4 nw4Var6 = iOrdinal4 != 2 ? iOrdinal4 != 4 ? new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_switch_tabs)) : new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_switch_tabs_linux)) : new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_switch_tabs_osx));
        final byte b5 = 3;
        arrayList.add(new e26(5, nw4Var6, new nw4(Integer.valueOf(R.drawable.predefined_shortcuts_switch_window)), vc3Var == vc3Var2 ? new nw4(Boolean.FALSE) : new nw4(bool), new Function0() { // from class: o.k16
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b6 = b5;
                f88 f88Var = f88.a;
                n16 n16Var = this;
                vc3 vc3Var3 = vc3Var;
                switch (b6) {
                    case 0:
                        int i = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var = n16Var.n;
                        if (i == 1) {
                            if (dd3Var != null) {
                                oh3 oh3Var2 = (oh3) dd3Var;
                                oh3Var2.h(true, false);
                                oh3Var2.f(99, false);
                                oh3Var2.h(false, false);
                            }
                        } else if (dd3Var != null) {
                            oh3 oh3Var3 = (oh3) dd3Var;
                            oh3Var3.d(true, null);
                            oh3Var3.f(99, false);
                            oh3Var3.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel2 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel2.a, iPredefinedShortcutsViewModel2, 0);
                        break;
                    case 1:
                        int i2 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var2 = n16Var.n;
                        if (i2 == 1) {
                            if (dd3Var2 != null) {
                                oh3 oh3Var4 = (oh3) dd3Var2;
                                oh3Var4.h(true, false);
                                oh3Var4.f(118, false);
                                oh3Var4.h(false, false);
                            }
                        } else if (dd3Var2 != null) {
                            oh3 oh3Var5 = (oh3) dd3Var2;
                            oh3Var5.d(true, null);
                            oh3Var5.f(118, false);
                            oh3Var5.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel3 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel3.a, iPredefinedShortcutsViewModel3, 1);
                        break;
                    case 2:
                        dd3 dd3Var3 = n16Var.n;
                        int iOrdinal5 = vc3Var3.ordinal();
                        if (iOrdinal5 != 2) {
                            dg8 dg8Var = dg8.VK_SNAPSHOT;
                            if (iOrdinal5 != 4) {
                                if (dd3Var3 != null) {
                                    oh3 oh3Var6 = (oh3) dd3Var3;
                                    oh3Var6.h(true, false);
                                    oh3Var6.a |= 32;
                                    oh3Var6.g(dg8Var, false, 0);
                                    oh3Var6.h(false, false);
                                    oh3Var6.a &= -33;
                                    oh3Var6.g(dg8Var, true, 0);
                                }
                            } else if (dd3Var3 != null) {
                                oh3 oh3Var7 = (oh3) dd3Var3;
                                oh3Var7.h(true, false);
                                oh3Var7.a |= 32;
                                oh3Var7.g(dg8Var, false, 0);
                                oh3Var7.h(false, false);
                                oh3Var7.a &= -33;
                                oh3Var7.g(dg8Var, true, 0);
                            }
                        } else if (dd3Var3 != null) {
                            oh3 oh3Var8 = (oh3) dd3Var3;
                            oh3Var8.e(true, null);
                            oh3Var8.h(true, false);
                            oh3Var8.f(51, false);
                            oh3Var8.e(false, null);
                            oh3Var8.h(false, false);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel4 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel4.a, iPredefinedShortcutsViewModel4, 4);
                        break;
                    case 3:
                        int i3 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var4 = n16Var.n;
                        if (i3 == 1) {
                            if (dd3Var4 != null) {
                                oh3 oh3Var9 = (oh3) dd3Var4;
                                oh3Var9.d(true, null);
                                oh3Var9.a |= 64;
                                dg8 dg8Var2 = dg8.VK_UP;
                                oh3Var9.g(dg8Var2, false, 0);
                                oh3Var9.a &= -65;
                                oh3Var9.g(dg8Var2, true, 0);
                                oh3Var9.d(false, null);
                            }
                        } else if (dd3Var4 != null) {
                            oh3 oh3Var10 = (oh3) dd3Var4;
                            oh3Var10.h(true, false);
                            oh3Var10.a |= 16;
                            dg8 dg8Var3 = dg8.VK_TAB;
                            oh3Var10.g(dg8Var3, false, 0);
                            oh3Var10.h(false, false);
                            oh3Var10.a &= -17;
                            oh3Var10.g(dg8Var3, true, 0);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel5 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel5.a, iPredefinedShortcutsViewModel5, 3);
                        break;
                    default:
                        int i4 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var5 = n16Var.n;
                        if (i4 == 1) {
                            if (dd3Var5 != null) {
                                oh3 oh3Var11 = (oh3) dd3Var5;
                                oh3Var11.h(true, false);
                                oh3Var11.f(115, false);
                                oh3Var11.h(false, false);
                            }
                        } else if (dd3Var5 != null) {
                            oh3 oh3Var12 = (oh3) dd3Var5;
                            oh3Var12.d(true, null);
                            oh3Var12.f(115, false);
                            oh3Var12.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel6 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel6.a, iPredefinedShortcutsViewModel6, 2);
                        break;
                }
                return f88Var;
            }
        }));
        int iOrdinal5 = vc3Var.ordinal();
        arrayList.add(new e26(6, iOrdinal5 != 2 ? iOrdinal5 != 4 ? new nw4(numValueOf) : new nw4(numValueOf) : new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_save_osx)), new nw4(Integer.valueOf(R.drawable.predefined_shortcuts_save)), new nw4(bool), new Function0() { // from class: o.k16
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b6 = b;
                f88 f88Var = f88.a;
                n16 n16Var = this;
                vc3 vc3Var3 = vc3Var;
                switch (b6) {
                    case 0:
                        int i = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var = n16Var.n;
                        if (i == 1) {
                            if (dd3Var != null) {
                                oh3 oh3Var2 = (oh3) dd3Var;
                                oh3Var2.h(true, false);
                                oh3Var2.f(99, false);
                                oh3Var2.h(false, false);
                            }
                        } else if (dd3Var != null) {
                            oh3 oh3Var3 = (oh3) dd3Var;
                            oh3Var3.d(true, null);
                            oh3Var3.f(99, false);
                            oh3Var3.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel2 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel2.a, iPredefinedShortcutsViewModel2, 0);
                        break;
                    case 1:
                        int i2 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var2 = n16Var.n;
                        if (i2 == 1) {
                            if (dd3Var2 != null) {
                                oh3 oh3Var4 = (oh3) dd3Var2;
                                oh3Var4.h(true, false);
                                oh3Var4.f(118, false);
                                oh3Var4.h(false, false);
                            }
                        } else if (dd3Var2 != null) {
                            oh3 oh3Var5 = (oh3) dd3Var2;
                            oh3Var5.d(true, null);
                            oh3Var5.f(118, false);
                            oh3Var5.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel3 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel3.a, iPredefinedShortcutsViewModel3, 1);
                        break;
                    case 2:
                        dd3 dd3Var3 = n16Var.n;
                        int iOrdinal6 = vc3Var3.ordinal();
                        if (iOrdinal6 != 2) {
                            dg8 dg8Var = dg8.VK_SNAPSHOT;
                            if (iOrdinal6 != 4) {
                                if (dd3Var3 != null) {
                                    oh3 oh3Var6 = (oh3) dd3Var3;
                                    oh3Var6.h(true, false);
                                    oh3Var6.a |= 32;
                                    oh3Var6.g(dg8Var, false, 0);
                                    oh3Var6.h(false, false);
                                    oh3Var6.a &= -33;
                                    oh3Var6.g(dg8Var, true, 0);
                                }
                            } else if (dd3Var3 != null) {
                                oh3 oh3Var7 = (oh3) dd3Var3;
                                oh3Var7.h(true, false);
                                oh3Var7.a |= 32;
                                oh3Var7.g(dg8Var, false, 0);
                                oh3Var7.h(false, false);
                                oh3Var7.a &= -33;
                                oh3Var7.g(dg8Var, true, 0);
                            }
                        } else if (dd3Var3 != null) {
                            oh3 oh3Var8 = (oh3) dd3Var3;
                            oh3Var8.e(true, null);
                            oh3Var8.h(true, false);
                            oh3Var8.f(51, false);
                            oh3Var8.e(false, null);
                            oh3Var8.h(false, false);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel4 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel4.a, iPredefinedShortcutsViewModel4, 4);
                        break;
                    case 3:
                        int i3 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var4 = n16Var.n;
                        if (i3 == 1) {
                            if (dd3Var4 != null) {
                                oh3 oh3Var9 = (oh3) dd3Var4;
                                oh3Var9.d(true, null);
                                oh3Var9.a |= 64;
                                dg8 dg8Var2 = dg8.VK_UP;
                                oh3Var9.g(dg8Var2, false, 0);
                                oh3Var9.a &= -65;
                                oh3Var9.g(dg8Var2, true, 0);
                                oh3Var9.d(false, null);
                            }
                        } else if (dd3Var4 != null) {
                            oh3 oh3Var10 = (oh3) dd3Var4;
                            oh3Var10.h(true, false);
                            oh3Var10.a |= 16;
                            dg8 dg8Var3 = dg8.VK_TAB;
                            oh3Var10.g(dg8Var3, false, 0);
                            oh3Var10.h(false, false);
                            oh3Var10.a &= -17;
                            oh3Var10.g(dg8Var3, true, 0);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel5 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel5.a, iPredefinedShortcutsViewModel5, 3);
                        break;
                    default:
                        int i4 = m16.a[vc3Var3.ordinal()];
                        dd3 dd3Var5 = n16Var.n;
                        if (i4 == 1) {
                            if (dd3Var5 != null) {
                                oh3 oh3Var11 = (oh3) dd3Var5;
                                oh3Var11.h(true, false);
                                oh3Var11.f(115, false);
                                oh3Var11.h(false, false);
                            }
                        } else if (dd3Var5 != null) {
                            oh3 oh3Var12 = (oh3) dd3Var5;
                            oh3Var12.d(true, null);
                            oh3Var12.f(115, false);
                            oh3Var12.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel6 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel6.a, iPredefinedShortcutsViewModel6, 2);
                        break;
                }
                return f88Var;
            }
        }));
        arrayList.add(new e26(7, new nw4(Integer.valueOf(R.string.tv_session_toolbar_info_button_more)), new nw4(Integer.valueOf(R.drawable.predefined_shortcuts_more)), new nw4(bool), new Function0(this) { // from class: o.l16
            public final /* synthetic */ n16 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                byte b6 = b2;
                f88 f88Var = f88.a;
                n16 n16Var = this.n;
                switch (b6) {
                    case 0:
                        dd3 dd3Var = n16Var.n;
                        if (dd3Var != null) {
                            oh3 oh3Var2 = (oh3) dd3Var;
                            oh3Var2.d(true, null);
                            oh3Var2.c(true, null);
                            oh3Var2.f(116, false);
                            oh3Var2.c(false, null);
                            oh3Var2.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel2 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel2.a, iPredefinedShortcutsViewModel2, 7);
                        break;
                    case 1:
                        dd3 dd3Var2 = n16Var.n;
                        if (dd3Var2 != null) {
                            oh3 oh3Var3 = (oh3) dd3Var2;
                            oh3Var3.d(true, null);
                            oh3Var3.e(true, null);
                            oh3Var3.f(113, false);
                            oh3Var3.e(false, null);
                            oh3Var3.d(false, null);
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel3 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel3.a, iPredefinedShortcutsViewModel3, 8);
                        break;
                    default:
                        RCClientActivity rCClientActivity = n16Var.p;
                        if (rCClientActivity != null) {
                            rCClientActivity.R();
                        }
                        IPredefinedShortcutsViewModel iPredefinedShortcutsViewModel4 = n16Var.f1532o;
                        IPredefinedShortcutsViewModelSWIGJNI.IPredefinedShortcutsViewModel_ReportEvent(iPredefinedShortcutsViewModel4.a, iPredefinedShortcutsViewModel4, 5);
                        break;
                }
                return f88Var;
            }
        }));
    }

    @Override // o.oe8
    public final void U0() {
        this.f1532o.a();
    }
}
