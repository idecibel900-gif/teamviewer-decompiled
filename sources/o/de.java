package o;

import android.view.View;
import android.widget.TextView;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseListViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final class de extends d66 {
    public final /* synthetic */ byte c = 2;
    public final Object d;
    public final Object e;

    public de(w93 w93Var, rd0 rd0Var) {
        w93Var.getClass();
        this.d = w93Var;
        this.e = rd0Var;
    }

    @Override // o.d66
    public final int a() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                zd zdVar = (zd) obj;
                if (zdVar != null) {
                    return zdVar.o();
                }
                return 0;
            case 1:
                GroupListViewModel groupListViewModel = ((ud0) ((w93) obj)).f2200o;
                if (groupListViewModel != null) {
                    return GroupListViewModelSWIGJNI.GroupListViewModel_GetSize(groupListViewModel.a, groupListViewModel);
                }
                return 0;
            default:
                ServiceCaseListViewModel serviceCaseListViewModel = (ServiceCaseListViewModel) obj;
                if (serviceCaseListViewModel != null) {
                    return ServiceCaseListViewModelSWIGJNI.ServiceCaseListViewModel_GetSize(serviceCaseListViewModel.a, serviceCaseListViewModel);
                }
                return 0;
        }
    }

    @Override // o.d66
    public int c(int i) {
        switch (this.c) {
            case 0:
                return !(((zd) this.d) instanceof br1) ? 1 : 0;
            default:
                return super.c(i);
        }
    }

    @Override // o.d66
    public final void e(c76 c76Var, int i) {
        zd zdVar;
        eh7 item;
        byte b = this.c;
        ServiceCaseListElementViewModel serviceCaseListElementViewModel = null;
        byte b2 = 1;
        Object obj = this.d;
        switch (b) {
            case 0:
                s sVar = (s) c76Var;
                if (i >= 0 && (zdVar = (zd) obj) != null && (item = zdVar.getItem(i)) != null) {
                    sVar.x(item);
                    sVar.m.setOnClickListener(new da(b2, i, this));
                    break;
                }
                break;
            case 1:
                if (c76Var instanceof zc0) {
                    GroupListViewModel groupListViewModel = ((ud0) ((w93) obj)).f2200o;
                    GroupListElementViewModel groupListElementViewModelK = ds1.k(groupListViewModel != null ? groupListViewModel.a(i) : null);
                    zc0 zc0Var = (zc0) c76Var;
                    zc0Var.K = groupListElementViewModelK;
                    zc0Var.I.setText(groupListElementViewModelK != null ? GroupListElementViewModelSWIGJNI.GroupListElementViewModel_GetName(groupListElementViewModelK.c, groupListElementViewModelK) : null);
                    zc0Var.r();
                    View view = zc0Var.G;
                    view.setOnClickListener(zc0Var);
                    view.addOnAttachStateChangeListener(zc0Var);
                }
                break;
            default:
                tq6 tq6Var = (tq6) c76Var;
                ServiceCaseListViewModel serviceCaseListViewModel = (ServiceCaseListViewModel) obj;
                serviceCaseListViewModel.getClass();
                long jPartnerlistViewModelLocator_GetServiceCaseListElementViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetServiceCaseListElementViewModel(ServiceCaseListViewModelSWIGJNI.ServiceCaseListViewModel_GetElement(serviceCaseListViewModel.a, serviceCaseListViewModel, i));
                if (jPartnerlistViewModelLocator_GetServiceCaseListElementViewModel != 0) {
                    serviceCaseListElementViewModel = new ServiceCaseListElementViewModel(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_SWIGSmartPtrUpcast(jPartnerlistViewModelLocator_GetServiceCaseListElementViewModel));
                    serviceCaseListElementViewModel.d = true;
                    serviceCaseListElementViewModel.c = jPartnerlistViewModelLocator_GetServiceCaseListElementViewModel;
                }
                if (serviceCaseListElementViewModel == null) {
                    ye4.c("ServiceCaseViewHolder", "incorrect type of input viewmodel");
                } else {
                    tq6Var.L = serviceCaseListElementViewModel;
                    int iServiceCaseListElementViewModel_GetID = ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetID(serviceCaseListElementViewModel.c, serviceCaseListElementViewModel);
                    if (iServiceCaseListElementViewModel_GetID != tq6Var.M) {
                        TextView textView = tq6Var.H;
                        ServiceCaseListElementViewModel serviceCaseListElementViewModel2 = tq6Var.L;
                        serviceCaseListElementViewModel2.getClass();
                        textView.setText(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetName(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2));
                        tq6Var.r();
                        tq6Var.s();
                    }
                    tq6Var.M = iServiceCaseListElementViewModel_GetID;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
          (r0v7 java.lang.Object) from 0x005b: PHI (r0 I:??) = (r0v2 java.lang.Object), (r0v7 java.lang.Object) binds: [B:14:0x005a, B:28:0x005b] A[DONT_GENERATE, DONT_INLINE]
          (r0v7 java.lang.Object) from 0x0053: CHECK_CAST (o.ce) (r0v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // o.d66
    public final o.c76 f(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            byte r0 = r4.c
            java.lang.Object r4 = r4.e
            r1 = 0
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L22;
                default: goto L8;
            }
        L8:
            android.content.Context r6 = r5.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131558545(0x7f0d0091, float:1.8742409E38)
            android.view.View r5 = r6.inflate(r0, r5, r1)
            o.tq6 r6 = new o.tq6
            r5.getClass()
            o.g95 r4 = (o.g95) r4
            r6.<init>(r5, r4)
            return r6
        L22:
            android.content.Context r6 = r5.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131558541(0x7f0d008d, float:1.87424E38)
            android.view.View r5 = r6.inflate(r0, r5, r1)
            o.zc0 r6 = new o.zc0
            r5.getClass()
            o.rd0 r4 = (o.rd0) r4
            r6.<init>(r5, r4)
            return r6
        L3c:
            o.jk0 r4 = o.ce.n
            r4.getClass()
            o.jc2 r4 = o.ce.q
            java.util.Iterator r4 = r4.iterator()
        L47:
            boolean r0 = r4.hasNext()
            r2 = 0
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r4.next()
            r3 = r0
            o.ce r3 = (o.ce) r3
            byte r3 = r3.m
            if (r3 != r6) goto L47
            goto L5b
        L5a:
            r0 = r2
        L5b:
            o.ce r0 = (o.ce) r0
            if (r0 != 0) goto L61
            o.ce r0 = o.ce.UNKNOWN
        L61:
            int r4 = r0.ordinal()
            if (r4 == 0) goto L8a
            r6 = 1
            if (r4 == r6) goto L72
            java.lang.String r4 = "MonitoringAlertsLayoutFactory"
            java.lang.String r5 = "Unrecognized viewType"
            o.ye4.c(r4, r5)
            goto La1
        L72:
            android.content.Context r4 = r5.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r6 = 2131558548(0x7f0d0094, float:1.8742415E38)
            android.view.View r4 = r4.inflate(r6, r5, r1)
            r4.getClass()
            o.xs4 r2 = new o.xs4
            r2.<init>(r4)
            goto La1
        L8a:
            android.content.Context r4 = r5.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r6 = 2131558549(0x7f0d0095, float:1.8742417E38)
            android.view.View r4 = r4.inflate(r6, r5, r1)
            r4.getClass()
            o.ft4 r2 = new o.ft4
            r2.<init>(r4)
        La1:
            r2.getClass()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.de.f(android.view.ViewGroup, int):o.c76");
    }

    public de(ServiceCaseListViewModel serviceCaseListViewModel, g95 g95Var) {
        this.d = serviceCaseListViewModel;
        this.e = g95Var;
    }

    public de(zd zdVar, d82 d82Var, be beVar) {
        this.d = zdVar;
        this.e = beVar;
    }
}
