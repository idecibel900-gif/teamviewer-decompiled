package o;

import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.teamviewer.commonuilib.view.OpenGLView;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks.ISelectedMarkerDataUpdateSignalCallback;
import com.teamviewer.remotecontrolviewlib.fragment.session.ExpandableTopTextBox;
import com.teamviewer.remotecontrolviewlib.fragment.session.PilotMarkerTextInputFieldView;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioPermissionClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioPermissionClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioVoipClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioVoipClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ILeaveSessionClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ILeaveSessionClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ISupportMessagesClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ISupportMessagesClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ITakePictureClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ITakePictureClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.TakePictureResponseSignalCallback;
import com.teamviewer.swigcallbacklib.IntSignalCallback;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lo/zf8;", "Lo/ut2;", "Lo/nd3;", "<init>", "()V", "o/vf8", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zf8 extends ut2 implements nd3 {
    public xk5 A0;
    public int B0;
    public boolean D0;
    public final uf8 L0;
    public final uf8 O0;
    public ILeaveSessionClientViewModel p0;
    public IVideoStreamClientViewModel q0;
    public IMarkingClientViewModel r0;
    public IAudioVoipClientViewModel s0;
    public IAudioPermissionClientViewModel t0;
    public ISupportMessagesClientViewModel u0;
    public ITakePictureClientViewModel v0;
    public ag8 w0;
    public InputMethodManager x0;
    public d11 y0;
    public AudioManager z0;
    public boolean C0 = true;
    public boolean E0 = true;
    public final l07 F0 = new l07((Object) this, (byte) 25);
    public final VoidSignalCallback G0 = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new tf8(this, 1));
    public final yf8 H0 = new yf8();
    public final xf8 I0 = new xf8(this);
    public final wf8 J0 = new wf8(this, (byte) 0);
    public final wf8 K0 = new wf8(this, (byte) 1);
    public final GestureDetector M0 = new GestureDetector(E(), new ko0(this, 6));
    public final cp0 N0 = new cp0(this, 3);

    /* JADX WARN: Type inference failed for: r0v12, types: [o.uf8] */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.uf8] */
    public zf8() {
        final byte b = 0;
        this.L0 = new hk7(this) { // from class: o.uf8
            public final /* synthetic */ zf8 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b2 = b;
                zf8 zf8Var = this.b;
                switch (b2) {
                    case 0:
                        if (zf8Var.E0) {
                            ag8 ag8Var = zf8Var.w0;
                            if (ag8Var == null) {
                                im3.e0("viewerViewModel");
                                throw null;
                            }
                            ag8Var.f321o = true;
                            nt2 nt2Var = ag8Var.p;
                            if (nt2Var != null) {
                                nt2Var.a("android.permission.RECORD_AUDIO", null);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        zf8Var.C0();
                        zf8Var.A0();
                        return;
                }
            }
        };
        final byte b2 = 1;
        this.O0 = new hk7(this) { // from class: o.uf8
            public final /* synthetic */ zf8 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b2;
                zf8 zf8Var = this.b;
                switch (b3) {
                    case 0:
                        if (zf8Var.E0) {
                            ag8 ag8Var = zf8Var.w0;
                            if (ag8Var == null) {
                                im3.e0("viewerViewModel");
                                throw null;
                            }
                            ag8Var.f321o = true;
                            nt2 nt2Var = ag8Var.p;
                            if (nt2Var != null) {
                                nt2Var.a("android.permission.RECORD_AUDIO", null);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        zf8Var.C0();
                        zf8Var.A0();
                        return;
                }
            }
        };
    }

    public static Double B0(Integer num, int i, int i2) {
        int iIntValue;
        if (num == null || (iIntValue = num.intValue() - i2) < 0 || iIntValue > i) {
            return null;
        }
        return Double.valueOf(((double) iIntValue) / ((double) i));
    }

    public final void A0() {
        View view = this.U;
        if (view == null) {
            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
        } else {
            Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        ILeaveSessionClientViewModel iLeaveSessionClientViewModel = this.p0;
        if (iLeaveSessionClientViewModel != null) {
            ILeaveSessionClientViewModelSWIGJNI.ILeaveSessionClientViewModel_leaveSession(iLeaveSessionClientViewModel.n, iLeaveSessionClientViewModel);
        } else {
            im3.e0("leaveSessionViewModel");
            throw null;
        }
    }

    public final void C0() {
        String string;
        Bundle bundle = this.r;
        if (bundle == null || (string = bundle.getString("audioPermissionSnackbarKey", null)) == null) {
            return;
        }
        SharedPreferences sharedPreferences = h57.a;
        if (sharedPreferences == null) {
            im3.e0("sharedPreferences");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(string, true);
        editorEdit.apply();
    }

    public final void D0(vf8 vf8Var) {
        sk5 sk5Var;
        sk5 sk5Var2;
        a65 a65Var;
        Editable text;
        int iOrdinal = vf8Var.ordinal();
        if (iOrdinal == 0) {
            d11 d11Var = this.y0;
            if (d11Var != null && (sk5Var = ((PilotMarkerTextInputFieldView) d11Var.q).F) != null) {
                sk5Var.n.setValue(Boolean.TRUE);
            }
            d11 d11Var2 = this.y0;
            if (d11Var2 != null) {
                PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) d11Var2.q;
                InputMethodManager inputMethodManager = this.x0;
                if (inputMethodManager == null) {
                    im3.e0("inputMethodManager");
                    throw null;
                }
                if (Build.VERSION.SDK_INT >= 36) {
                    inputMethodManager.showSoftInput(pilotMarkerTextInputFieldView, 0);
                    return;
                } else {
                    inputMethodManager.showSoftInput(pilotMarkerTextInputFieldView, 1);
                    return;
                }
            }
            return;
        }
        if (iOrdinal != 1) {
            gk0.s();
            return;
        }
        d11 d11Var3 = this.y0;
        if (d11Var3 != null && (a65Var = ((PilotMarkerTextInputFieldView) d11Var3.q).G) != null && (text = ((EditText) a65Var.n).getText()) != null) {
            text.clear();
        }
        d11 d11Var4 = this.y0;
        if (d11Var4 != null && (sk5Var2 = ((PilotMarkerTextInputFieldView) d11Var4.q).F) != null) {
            sk5Var2.n.setValue(Boolean.FALSE);
        }
        View view = this.U;
        if (view == null) {
            ye4.c("GUIHelperFuncs", "hideSoftkeyboard(): can't hide - view is null!");
            return;
        }
        Object systemService = view.getContext().getApplicationContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void E0(int i, int i2) {
        int i3 = i != 0 ? 0 : 8;
        d11 d11Var = this.y0;
        if (d11Var != null) {
            ((Group) d11Var.f578o).setVisibility(i3);
        }
        d11 d11Var2 = this.y0;
        if (d11Var2 != null) {
            ((TextView) d11Var2.m).setText(I(i2));
        }
    }

    @Override // o.ut2
    public final void X(Bundle bundle) {
        super.X(bundle);
        Bundle bundle2 = this.r;
        this.B0 = bundle2 != null ? bundle2.getInt("sessionId", 0) : 0;
        Bundle bundle3 = this.r;
        this.C0 = bundle3 != null ? bundle3.getBoolean("removeMarkersOfAllParticipants", true) : true;
        Bundle bundle4 = this.r;
        this.E0 = bundle4 != null ? bundle4.getBoolean("requestMicrophonePermission", true) : true;
    }

    @Override // o.ut2
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_viewer, viewGroup, false);
        int i = R.id.app_in_background_message;
        TextView textView = (TextView) r47.s(viewInflate, R.id.app_in_background_message);
        if (textView != null) {
            i = R.id.app_in_background_message_background;
            View viewS = r47.s(viewInflate, R.id.app_in_background_message_background);
            if (viewS != null) {
                i = R.id.app_in_background_message_group;
                Group group = (Group) r47.s(viewInflate, R.id.app_in_background_message_group);
                if (group != null) {
                    i = R.id.expandable_top_text_box;
                    ExpandableTopTextBox expandableTopTextBox = (ExpandableTopTextBox) r47.s(viewInflate, R.id.expandable_top_text_box);
                    if (expandableTopTextBox != null) {
                        i = R.id.pilot_marker_text_input_field_view;
                        PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) r47.s(viewInflate, R.id.pilot_marker_text_input_field_view);
                        if (pilotMarkerTextInputFieldView != null) {
                            i = R.id.remote_video_view;
                            OpenGLView openGLView = (OpenGLView) r47.s(viewInflate, R.id.remote_video_view);
                            if (openGLView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                d11 d11Var = new d11();
                                d11Var.m = textView;
                                d11Var.n = viewS;
                                d11Var.f578o = group;
                                d11Var.p = expandableTopTextBox;
                                d11Var.q = pilotMarkerTextInputFieldView;
                                d11Var.r = openGLView;
                                this.y0 = d11Var;
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        yq4.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // o.ut2
    public final void b0() {
        this.S = true;
        this.y0 = null;
    }

    @Override // o.ut2
    public final void i0() {
        byte b = 1;
        this.S = true;
        if (hm3.h(r0(), "android.permission.RECORD_AUDIO") == 0) {
            IAudioPermissionClientViewModel iAudioPermissionClientViewModel = this.t0;
            if (iAudioPermissionClientViewModel == null) {
                im3.e0("audioPermissionViewModel");
                throw null;
            }
            IAudioPermissionClientViewModelSWIGJNI.IAudioPermissionClientViewModel_onPermissionGranted(iAudioPermissionClientViewModel.n, iAudioPermissionClientViewModel);
        } else if (this.E0) {
            ag8 ag8Var = this.w0;
            if (ag8Var == null) {
                im3.e0("viewerViewModel");
                throw null;
            }
            if (!ag8Var.f321o) {
                ag8Var.f321o = true;
                nt2 nt2Var = ag8Var.p;
                if (nt2Var != null) {
                    nt2Var.a("android.permission.RECORD_AUDIO", null);
                }
            }
        }
        IMarkingClientViewModel iMarkingClientViewModel = this.r0;
        if (iMarkingClientViewModel == null) {
            im3.e0("markingClientViewModel");
            throw null;
        }
        long j = iMarkingClientViewModel.n;
        xf8 xf8Var = this.I0;
        IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_registerForSelectedMarkerText(j, iMarkingClientViewModel, ISelectedMarkerDataUpdateSignalCallback.getCPtr((ISelectedMarkerDataUpdateSignalCallback) xf8Var), xf8Var);
        d11 d11Var = this.y0;
        if (d11Var != null) {
            PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) d11Var.q;
            IMarkingClientViewModel iMarkingClientViewModel2 = this.r0;
            if (iMarkingClientViewModel2 == null) {
                im3.e0("markingClientViewModel");
                throw null;
            }
            pilotMarkerTextInputFieldView.setMaximumTextLength((int) IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_GetMaximumTextLength(iMarkingClientViewModel2.n, iMarkingClientViewModel2));
        }
        d11 d11Var2 = this.y0;
        if (d11Var2 != null) {
            ((PilotMarkerTextInputFieldView) d11Var2.q).setOnMarkerTextChanged(new sf8(this, b));
        }
        d11 d11Var3 = this.y0;
        if (d11Var3 != null) {
            ((PilotMarkerTextInputFieldView) d11Var3.q).setOnMarkerTextConfirmed(new sf8(this, (byte) 2));
        }
        d11 d11Var4 = this.y0;
        if (d11Var4 != null) {
            ((PilotMarkerTextInputFieldView) d11Var4.q).setOnSoftKeyboardOpened(new tf8(this, (byte) 0));
        }
        ISupportMessagesClientViewModel iSupportMessagesClientViewModel = this.u0;
        if (iSupportMessagesClientViewModel == null) {
            im3.e0("supportMessagesClientViewModel");
            throw null;
        }
        long j2 = iSupportMessagesClientViewModel.n;
        wf8 wf8Var = this.J0;
        ISupportMessagesClientViewModelSWIGJNI.ISupportMessagesClientViewModel_RegisterForAppInBackground(j2, iSupportMessagesClientViewModel, IntSignalCallback.getCPtr((IntSignalCallback) wf8Var), wf8Var);
        ISupportMessagesClientViewModel iSupportMessagesClientViewModel2 = this.u0;
        if (iSupportMessagesClientViewModel2 == null) {
            im3.e0("supportMessagesClientViewModel");
            throw null;
        }
        long j3 = iSupportMessagesClientViewModel2.n;
        wf8 wf8Var2 = this.K0;
        ISupportMessagesClientViewModelSWIGJNI.ISupportMessagesClientViewModel_RegisterForConnectionLost(j3, iSupportMessagesClientViewModel2, IntSignalCallback.getCPtr((IntSignalCallback) wf8Var2), wf8Var2);
        IVideoStreamClientViewModel iVideoStreamClientViewModel = this.q0;
        if (iVideoStreamClientViewModel == null) {
            im3.e0("videoStreamClientViewModel");
            throw null;
        }
        long j4 = iVideoStreamClientViewModel.n;
        VoidSignalCallback voidSignalCallback = this.G0;
        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_RegisterForRequestRender(j4, iVideoStreamClientViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
        d11 d11Var5 = this.y0;
        if (d11Var5 != null) {
            ((OpenGLView) d11Var5.r).onResume();
        }
    }

    @Override // o.ut2
    public final void j0() {
        this.S = true;
        d11 d11Var = this.y0;
        if (d11Var != null) {
            ((OpenGLView) d11Var.r).onPause();
        }
        this.I0.Disconnect();
        this.G0.Disconnect();
        this.J0.Disconnect();
        this.K0.Disconnect();
    }

    @Override // o.ut2
    public final void k0(View view, Bundle bundle) {
        view.getClass();
        Object systemService = r0().getSystemService("input_method");
        systemService.getClass();
        this.x0 = (InputMethodManager) systemService;
        io1.U();
        this.p0 = (ILeaveSessionClientViewModel) el5.k(this, new ra(this.B0, (byte) 3)).a(ILeaveSessionClientViewModel.class);
        io1.U();
        byte b = 2;
        this.q0 = (IVideoStreamClientViewModel) el5.k(this, new ra(this.B0, b)).a(IVideoStreamClientViewModel.class);
        io1.U();
        this.r0 = (IMarkingClientViewModel) el5.k(this, new ra(this.B0, (byte) 6)).a(IMarkingClientViewModel.class);
        io1.U();
        byte b2 = 5;
        this.s0 = (IAudioVoipClientViewModel) el5.k(this, new ra(this.B0, b2)).a(IAudioVoipClientViewModel.class);
        io1.U();
        this.t0 = (IAudioPermissionClientViewModel) el5.k(this, new x85((byte) 12)).a(IAudioPermissionClientViewModel.class);
        io1.U();
        this.u0 = (ISupportMessagesClientViewModel) el5.k(this, new ra(this.B0, (byte) 4)).a(ISupportMessagesClientViewModel.class);
        io1.U();
        this.v0 = (ITakePictureClientViewModel) el5.k(this, new ra(this.B0, (byte) 1)).a(ITakePictureClientViewModel.class);
        io1.U();
        ve8 ve8VarO = getG0();
        se8 se8VarL = h57.l(this);
        bf1 bf1VarK = h57.k(this);
        se8VarL.getClass();
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, se8VarL, bf1VarK);
        x86 x86Var = w86.a;
        wt3 wt3VarB = x86Var.b(ag8.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        ag8 ag8Var = (ag8) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        this.w0 = ag8Var;
        ag8Var.p = (nt2) o0(new io.sentry.android.core.h2(this, (byte) 8), new e8(b));
        ITakePictureClientViewModel iTakePictureClientViewModel = this.v0;
        if (iTakePictureClientViewModel == null) {
            im3.e0("takePictureClientViewModel");
            throw null;
        }
        yf8 yf8Var = this.H0;
        ITakePictureClientViewModelSWIGJNI.ITakePictureClientViewModel_RegisterOnTakePictureResponse(iTakePictureClientViewModel.n, iTakePictureClientViewModel, TakePictureResponseSignalCallback.getCPtr((TakePictureResponseSignalCallback) yf8Var), yf8Var);
        IAudioVoipClientViewModel iAudioVoipClientViewModel = this.s0;
        if (iAudioVoipClientViewModel == null) {
            im3.e0("audioVoIpViewModel");
            throw null;
        }
        NativeLiveDataBool.newInstance(IAudioVoipClientViewModelSWIGJNI.IAudioVoipClientViewModel_IsMicMuted(iAudioVoipClientViewModel.n, iAudioVoipClientViewModel), false).observe(L(), new a7(new sf8(this, (byte) 0), (byte) 17));
        d11 d11Var = this.y0;
        if (d11Var != null) {
            OpenGLView openGLView = (OpenGLView) d11Var.r;
            l07 l07Var = this.F0;
            l07Var.getClass();
            openGLView.m = l07Var;
            openGLView.setRenderMode(0);
            openGLView.setGestureDetector(this.M0);
            openGLView.setOnTouchListener(this.N0);
        }
        View viewS0 = s0();
        ar arVar = new ar(this, (byte) 28);
        WeakHashMap weakHashMap = be8.a;
        sd8.c(viewS0, arVar);
        d11 d11Var2 = this.y0;
        if (d11Var2 != null) {
            PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) d11Var2.q;
            sk5 sk5Var = pilotMarkerTextInputFieldView.F;
            if (sk5Var == null) {
                if (io1.c == null) {
                    im3.e0("factory");
                    throw null;
                }
                ve8 ve8VarO2 = getG0();
                se8 se8VarL2 = h57.l(this);
                bf1 bf1VarK2 = h57.k(this);
                se8VarL2.getClass();
                bf1VarK2.getClass();
                pn5 pn5Var2 = new pn5(ve8VarO2, se8VarL2, bf1VarK2);
                wt3 wt3VarB2 = x86Var.b(sk5.class);
                String strC2 = wt3VarB2.c();
                if (strC2 == null) {
                    hk0.g("Local and anonymous classes can not be ViewModels");
                    return;
                } else {
                    sk5Var = (sk5) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
                    pilotMarkerTextInputFieldView.F = sk5Var;
                }
            }
            nw4 nw4Var = sk5Var.n;
            if (nw4Var != null) {
                nw4Var.observe(L(), new a7(new fj3((Object) pilotMarkerTextInputFieldView, (byte) 20), b2));
            }
        }
    }
}
