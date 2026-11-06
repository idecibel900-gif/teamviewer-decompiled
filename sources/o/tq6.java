package o;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ServiceCaseListElementViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class tq6 extends c76 implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final g95 G;
    public final TextView H;
    public final ImageView I;
    public final View J;
    public final View K;
    public ServiceCaseListElementViewModel L;
    public int M;
    public final VoidSignalCallback N;

    public tq6(View view, g95 g95Var) {
        super(view);
        this.G = g95Var;
        View viewFindViewById = view.findViewById(R.id.service_case_name);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.H = textView;
        this.N = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new y26(this, (byte) 13));
        textView.setTextColor(view.getContext().getColor(R.color.colorServiceCaseName));
        View viewFindViewById2 = view.findViewById(R.id.service_case_icon);
        viewFindViewById2.getClass();
        ImageView imageView = (ImageView) viewFindViewById2;
        this.I = imageView;
        final byte b = 0;
        imageView.setVisibility(0);
        View viewFindViewById3 = view.findViewById(R.id.service_case_takeover_button);
        viewFindViewById3.getClass();
        this.J = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: o.rq6
            public final /* synthetic */ tq6 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                tq6 tq6Var = this.n;
                switch (b2) {
                    case 0:
                        ServiceCaseListElementViewModel serviceCaseListElementViewModel = tq6Var.L;
                        if (serviceCaseListElementViewModel != null) {
                            ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_TakeOver(serviceCaseListElementViewModel.c, serviceCaseListElementViewModel);
                        }
                        break;
                    default:
                        ServiceCaseListElementViewModel serviceCaseListElementViewModel2 = tq6Var.L;
                        if (serviceCaseListElementViewModel2 != null) {
                            StringBuilder sb = new StringBuilder(String.format(Locale.US, "%08d", Arrays.copyOf(new Object[]{Integer.valueOf(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetID(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2))}, 1)));
                            int length = sb.length();
                            sb.insert(length - 3, '-').insert(length - 6, '-').insert(0, 's');
                            String string = sb.toString();
                            DyngateID dyngateID = new DyngateID(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetCustomerDyngateID(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2), true);
                            String strServiceCaseListElementViewModel_GetPassword = ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetPassword(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2);
                            String strServiceCaseListElementViewModel_GetName = ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetName(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2);
                            strServiceCaseListElementViewModel_GetPassword.getClass();
                            zu1.Q(string, strServiceCaseListElementViewModel_GetPassword, strServiceCaseListElementViewModel_GetName, dyngateID);
                        }
                        break;
                }
            }
        });
        View viewFindViewById4 = view.findViewById(R.id.service_case_connect_button_container);
        viewFindViewById4.getClass();
        this.K = viewFindViewById4;
        final byte b2 = 1;
        viewFindViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: o.rq6
            public final /* synthetic */ tq6 n;

            {
                this.n = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                tq6 tq6Var = this.n;
                switch (b3) {
                    case 0:
                        ServiceCaseListElementViewModel serviceCaseListElementViewModel = tq6Var.L;
                        if (serviceCaseListElementViewModel != null) {
                            ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_TakeOver(serviceCaseListElementViewModel.c, serviceCaseListElementViewModel);
                        }
                        break;
                    default:
                        ServiceCaseListElementViewModel serviceCaseListElementViewModel2 = tq6Var.L;
                        if (serviceCaseListElementViewModel2 != null) {
                            StringBuilder sb = new StringBuilder(String.format(Locale.US, "%08d", Arrays.copyOf(new Object[]{Integer.valueOf(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetID(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2))}, 1)));
                            int length = sb.length();
                            sb.insert(length - 3, '-').insert(length - 6, '-').insert(0, 's');
                            String string = sb.toString();
                            DyngateID dyngateID = new DyngateID(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetCustomerDyngateID(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2), true);
                            String strServiceCaseListElementViewModel_GetPassword = ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetPassword(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2);
                            String strServiceCaseListElementViewModel_GetName = ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetName(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2);
                            strServiceCaseListElementViewModel_GetPassword.getClass();
                            zu1.Q(string, strServiceCaseListElementViewModel_GetPassword, strServiceCaseListElementViewModel_GetName, dyngateID);
                        }
                        break;
                }
            }
        });
        view.setOnClickListener(this);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ServiceCaseListElementViewModel serviceCaseListElementViewModel;
        view.getClass();
        int i = this.M;
        g95 g95Var = this.G;
        g95Var.getClass();
        long jPartnerlistViewModelLocator_GetServiceCaseListElementViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetServiceCaseListElementViewModel(i);
        if (jPartnerlistViewModelLocator_GetServiceCaseListElementViewModel == 0) {
            serviceCaseListElementViewModel = null;
        } else {
            serviceCaseListElementViewModel = new ServiceCaseListElementViewModel(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_SWIGSmartPtrUpcast(jPartnerlistViewModelLocator_GetServiceCaseListElementViewModel));
            serviceCaseListElementViewModel.d = true;
            serviceCaseListElementViewModel.c = jPartnerlistViewModelLocator_GetServiceCaseListElementViewModel;
        }
        bb5 bb5Var = ((br6) g95Var.m).r0;
        if (bb5Var != null) {
            int i2 = dd0.J0;
            long jServiceCaseListElementViewModel_GetID = ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetID(serviceCaseListElementViewModel.c, serviceCaseListElementViewModel);
            dd0 dd0Var = new dd0();
            Bundle bundle = new Bundle();
            bundle.putLong("BuddyId", jServiceCaseListElementViewModel_GetID);
            bundle.putBoolean("ExpandToolbar", true);
            dd0Var.u0(bundle);
            bb5Var.I0(dd0Var, true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        if (this.L == null || this.N.IsConnected()) {
            return;
        }
        ServiceCaseListElementViewModel serviceCaseListElementViewModel = this.L;
        serviceCaseListElementViewModel.getClass();
        long j = serviceCaseListElementViewModel.c;
        VoidSignalCallback voidSignalCallback = this.N;
        ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_RegisterForChanges(j, serviceCaseListElementViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        this.N.Disconnect();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[LOOP:0: B:9:0x0023->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x002b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public final void r() {
        int length;
        int i;
        qq6 qq6Var;
        qq6 qq6Var2;
        ServiceCaseListElementViewModel serviceCaseListElementViewModel = this.L;
        serviceCaseListElementViewModel.getClass();
        int iServiceCaseListElementViewModel_GetIcon = ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_GetIcon(serviceCaseListElementViewModel.c, serviceCaseListElementViewModel);
        qq6 qq6Var3 = qq6.Online;
        qq6[] qq6VarArr = (qq6[]) qq6.class.getEnumConstants();
        if (iServiceCaseListElementViewModel_GetIcon >= qq6VarArr.length || iServiceCaseListElementViewModel_GetIcon < 0) {
            length = qq6VarArr.length;
            i = 0;
            while (true) {
                if (i < length) {
                    hk0.g(ua5.k(iServiceCaseListElementViewModel_GetIcon, qq6.class, "No enum ", " with value "));
                    return;
                }
                qq6Var = qq6VarArr[i];
                if (qq6Var.m == iServiceCaseListElementViewModel_GetIcon) {
                    qq6Var2 = qq6Var;
                    break;
                }
                i++;
            }
        } else {
            qq6Var2 = qq6VarArr[iServiceCaseListElementViewModel_GetIcon];
            if (qq6Var2.m != iServiceCaseListElementViewModel_GetIcon) {
                length = qq6VarArr.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        hk0.g(ua5.k(iServiceCaseListElementViewModel_GetIcon, qq6.class, "No enum ", " with value "));
                        return;
                    }
                    qq6Var = qq6VarArr[i];
                    if (qq6Var.m == iServiceCaseListElementViewModel_GetIcon) {
                        qq6Var2 = qq6Var;
                        break;
                    }
                    i++;
                }
            }
        }
        int i2 = sq6.a[qq6Var2.ordinal()];
        ImageView imageView = this.I;
        if (i2 == 1) {
            imageView.setImageResource(2131231258);
        } else if (i2 != 2) {
            imageView.setImageResource(2131231256);
        } else {
            imageView.setImageResource(2131231257);
        }
    }

    public final void s() {
        ServiceCaseListElementViewModel serviceCaseListElementViewModel = this.L;
        serviceCaseListElementViewModel.getClass();
        this.J.setVisibility(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_IsTakeOverPossible(serviceCaseListElementViewModel.c, serviceCaseListElementViewModel) ? 0 : 8);
        ServiceCaseListElementViewModel serviceCaseListElementViewModel2 = this.L;
        serviceCaseListElementViewModel2.getClass();
        this.K.setVisibility(ServiceCaseListElementViewModelSWIGJNI.ServiceCaseListElementViewModel_IsConnectPossible(serviceCaseListElementViewModel2.c, serviceCaseListElementViewModel2) ? 0 : 8);
    }
}
