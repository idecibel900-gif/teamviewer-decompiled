package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.Observer;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioVoipClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IAudioVoipClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IToolbarClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IToolbarClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ToolbarClientButtonStateSignalCallback;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class cl5 extends uz7 {
    public final Resources s;
    public final IToolbarClientViewModel t;
    public final bl5 u;
    public final zk5 v;
    public final zk5 w;
    public xk5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.lifecycle.Observer, o.zk5] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.lifecycle.Observer, o.zk5] */
    public cl5(IToolbarClientViewModel iToolbarClientViewModel, Resources resources) {
        super(false);
        final byte b = 0;
        this.s = resources;
        this.t = iToolbarClientViewModel;
        bl5 bl5Var = new bl5(this);
        this.u = bl5Var;
        ?? r7 = new Observer(this) { // from class: o.zk5
            public final /* synthetic */ cl5 n;

            {
                this.n = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                Drawable drawable;
                oz7 oz7Var;
                Drawable drawable2;
                byte b2 = b;
                cl5 cl5Var = this.n;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (b2) {
                    case 0:
                        Resources resources2 = cl5Var.s;
                        if (zBooleanValue) {
                            ThreadLocal threadLocal = ic6.a;
                            drawable = resources2.getDrawable(R.drawable.ic_play, null);
                        } else {
                            ThreadLocal threadLocal2 = ic6.a;
                            drawable = resources2.getDrawable(R.drawable.ic_pause, null);
                        }
                        if (drawable != null && (oz7Var = (oz7) cl5Var.W0(2)) != null) {
                            oz7Var.c.setValue(drawable);
                            break;
                        }
                        break;
                    default:
                        oz7 oz7Var2 = (oz7) cl5Var.W0(1);
                        if (oz7Var2 != null) {
                            if (!oz7Var2.a()) {
                                oz7Var2.d.setValue(Boolean.TRUE);
                            }
                            Resources resources3 = cl5Var.s;
                            if (zBooleanValue) {
                                ThreadLocal threadLocal3 = ic6.a;
                                drawable2 = resources3.getDrawable(R.drawable.ic_mic_muted, null);
                            } else {
                                ThreadLocal threadLocal4 = ic6.a;
                                drawable2 = resources3.getDrawable(R.drawable.ic_mic_unmuted, null);
                            }
                            if (drawable2 != null) {
                                oz7Var2.c.setValue(drawable2);
                            }
                        }
                        break;
                }
            }
        };
        this.v = r7;
        final byte b2 = 1;
        ?? r8 = new Observer(this) { // from class: o.zk5
            public final /* synthetic */ cl5 n;

            {
                this.n = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void a(Object obj) {
                Drawable drawable;
                oz7 oz7Var;
                Drawable drawable2;
                byte b3 = b2;
                cl5 cl5Var = this.n;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (b3) {
                    case 0:
                        Resources resources2 = cl5Var.s;
                        if (zBooleanValue) {
                            ThreadLocal threadLocal = ic6.a;
                            drawable = resources2.getDrawable(R.drawable.ic_play, null);
                        } else {
                            ThreadLocal threadLocal2 = ic6.a;
                            drawable = resources2.getDrawable(R.drawable.ic_pause, null);
                        }
                        if (drawable != null && (oz7Var = (oz7) cl5Var.W0(2)) != null) {
                            oz7Var.c.setValue(drawable);
                            break;
                        }
                        break;
                    default:
                        oz7 oz7Var2 = (oz7) cl5Var.W0(1);
                        if (oz7Var2 != null) {
                            if (!oz7Var2.a()) {
                                oz7Var2.d.setValue(Boolean.TRUE);
                            }
                            Resources resources3 = cl5Var.s;
                            if (zBooleanValue) {
                                ThreadLocal threadLocal3 = ic6.a;
                                drawable2 = resources3.getDrawable(R.drawable.ic_mic_muted, null);
                            } else {
                                ThreadLocal threadLocal4 = ic6.a;
                                drawable2 = resources3.getDrawable(R.drawable.ic_mic_unmuted, null);
                            }
                            if (drawable2 != null) {
                                oz7Var2.c.setValue(drawable2);
                            }
                        }
                        break;
                }
            }
        };
        this.w = r8;
        ThreadLocal threadLocal = ic6.a;
        Drawable drawable = resources.getDrawable(R.drawable.ic_call_end, null);
        if (drawable != null) {
            V0(new oz7(0, drawable, true, new Function0(this) { // from class: o.al5
                public final /* synthetic */ cl5 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    nd3 nd3Var;
                    yk5 yk5Var;
                    Context contextE;
                    nd3 nd3Var2;
                    nd3 nd3Var3;
                    byte b3 = b;
                    f88 f88Var = f88.a;
                    cl5 cl5Var = this.n;
                    switch (b3) {
                        case 0:
                            xk5 xk5Var = cl5Var.x;
                            if (xk5Var != null && (nd3Var = xk5Var.a.s0) != null) {
                                ((zf8) nd3Var).A0();
                            }
                            return f88Var;
                        case 1:
                            xk5 xk5Var2 = cl5Var.x;
                            if (xk5Var2 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel2 = cl5Var.t;
                                boolean zN = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_MicMuted(iToolbarClientViewModel2.a, iToolbarClientViewModel2), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var4 = xk5Var2.a.s0;
                                if (nd3Var4 != null) {
                                    IAudioVoipClientViewModel iAudioVoipClientViewModel = ((zf8) nd3Var4).s0;
                                    if (iAudioVoipClientViewModel == null) {
                                        im3.e0("audioVoIpViewModel");
                                        throw null;
                                    }
                                    IAudioVoipClientViewModelSWIGJNI.IAudioVoipClientViewModel_SetMicMuted(iAudioVoipClientViewModel.n, iAudioVoipClientViewModel, zN);
                                }
                            }
                            return f88Var;
                        case 2:
                            xk5 xk5Var3 = cl5Var.x;
                            if (xk5Var3 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel3 = cl5Var.t;
                                boolean zN2 = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_VideoStreamPaused(iToolbarClientViewModel3.a, iToolbarClientViewModel3), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var5 = xk5Var3.a.s0;
                                if (nd3Var5 != null) {
                                    IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) nd3Var5).q0;
                                    if (zN2) {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendPauseVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    } else {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendResumeVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    }
                                }
                            }
                            return f88Var;
                        case 3:
                            xk5 xk5Var4 = cl5Var.x;
                            if (xk5Var4 != null && (contextE = (yk5Var = xk5Var4.a).E()) != null) {
                                nd ndVar = new nd(contextE);
                                jd jdVar = (jd) ndVar.f1562o;
                                jdVar.d = jdVar.a.getText(R.string.clear_all_markers_dialog_title);
                                jdVar.f = jdVar.a.getText(R.string.clear_all_markers_dialog_message);
                                z zVar = new z(yk5Var, (byte) 5);
                                jdVar.g = jdVar.a.getText(R.string.clear_all_markers_dialog_confirm);
                                jdVar.h = zVar;
                                jdVar.i = jdVar.a.getText(R.string.tv_cancel);
                                jdVar.j = null;
                                ndVar.e().show();
                            }
                            return f88Var;
                        case 4:
                            xk5 xk5Var5 = cl5Var.x;
                            if (xk5Var5 != null && (nd3Var2 = xk5Var5.a.s0) != null) {
                                IMarkingClientViewModel iMarkingClientViewModel = ((zf8) nd3Var2).r0;
                                if (iMarkingClientViewModel == null) {
                                    im3.e0("markingClientViewModel");
                                    throw null;
                                }
                                IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_RemoveLastMarker(iMarkingClientViewModel.n, iMarkingClientViewModel);
                            }
                            return f88Var;
                        default:
                            xk5 xk5Var6 = cl5Var.x;
                            if (xk5Var6 != null && (nd3Var3 = xk5Var6.a.s0) != null) {
                                zf8 zf8Var = (zf8) nd3Var3;
                                if (zf8Var.D0) {
                                    zf8Var.D0(vf8.m);
                                }
                            }
                            return f88Var;
                    }
                }
            }));
        }
        Drawable drawable2 = resources.getDrawable(R.drawable.ic_mic_unmuted, null);
        if (drawable2 != null) {
            V0(new oz7(1, drawable2, false, new Function0(this) { // from class: o.al5
                public final /* synthetic */ cl5 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    nd3 nd3Var;
                    yk5 yk5Var;
                    Context contextE;
                    nd3 nd3Var2;
                    nd3 nd3Var3;
                    byte b3 = b2;
                    f88 f88Var = f88.a;
                    cl5 cl5Var = this.n;
                    switch (b3) {
                        case 0:
                            xk5 xk5Var = cl5Var.x;
                            if (xk5Var != null && (nd3Var = xk5Var.a.s0) != null) {
                                ((zf8) nd3Var).A0();
                            }
                            return f88Var;
                        case 1:
                            xk5 xk5Var2 = cl5Var.x;
                            if (xk5Var2 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel2 = cl5Var.t;
                                boolean zN = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_MicMuted(iToolbarClientViewModel2.a, iToolbarClientViewModel2), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var4 = xk5Var2.a.s0;
                                if (nd3Var4 != null) {
                                    IAudioVoipClientViewModel iAudioVoipClientViewModel = ((zf8) nd3Var4).s0;
                                    if (iAudioVoipClientViewModel == null) {
                                        im3.e0("audioVoIpViewModel");
                                        throw null;
                                    }
                                    IAudioVoipClientViewModelSWIGJNI.IAudioVoipClientViewModel_SetMicMuted(iAudioVoipClientViewModel.n, iAudioVoipClientViewModel, zN);
                                }
                            }
                            return f88Var;
                        case 2:
                            xk5 xk5Var3 = cl5Var.x;
                            if (xk5Var3 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel3 = cl5Var.t;
                                boolean zN2 = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_VideoStreamPaused(iToolbarClientViewModel3.a, iToolbarClientViewModel3), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var5 = xk5Var3.a.s0;
                                if (nd3Var5 != null) {
                                    IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) nd3Var5).q0;
                                    if (zN2) {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendPauseVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    } else {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendResumeVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    }
                                }
                            }
                            return f88Var;
                        case 3:
                            xk5 xk5Var4 = cl5Var.x;
                            if (xk5Var4 != null && (contextE = (yk5Var = xk5Var4.a).E()) != null) {
                                nd ndVar = new nd(contextE);
                                jd jdVar = (jd) ndVar.f1562o;
                                jdVar.d = jdVar.a.getText(R.string.clear_all_markers_dialog_title);
                                jdVar.f = jdVar.a.getText(R.string.clear_all_markers_dialog_message);
                                z zVar = new z(yk5Var, (byte) 5);
                                jdVar.g = jdVar.a.getText(R.string.clear_all_markers_dialog_confirm);
                                jdVar.h = zVar;
                                jdVar.i = jdVar.a.getText(R.string.tv_cancel);
                                jdVar.j = null;
                                ndVar.e().show();
                            }
                            return f88Var;
                        case 4:
                            xk5 xk5Var5 = cl5Var.x;
                            if (xk5Var5 != null && (nd3Var2 = xk5Var5.a.s0) != null) {
                                IMarkingClientViewModel iMarkingClientViewModel = ((zf8) nd3Var2).r0;
                                if (iMarkingClientViewModel == null) {
                                    im3.e0("markingClientViewModel");
                                    throw null;
                                }
                                IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_RemoveLastMarker(iMarkingClientViewModel.n, iMarkingClientViewModel);
                            }
                            return f88Var;
                        default:
                            xk5 xk5Var6 = cl5Var.x;
                            if (xk5Var6 != null && (nd3Var3 = xk5Var6.a.s0) != null) {
                                zf8 zf8Var = (zf8) nd3Var3;
                                if (zf8Var.D0) {
                                    zf8Var.D0(vf8.m);
                                }
                            }
                            return f88Var;
                    }
                }
            }));
        }
        Drawable drawable3 = resources.getDrawable(R.drawable.ic_pause, null);
        if (drawable3 != null) {
            final byte b3 = 2;
            V0(new oz7(2, drawable3, false, new Function0(this) { // from class: o.al5
                public final /* synthetic */ cl5 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    nd3 nd3Var;
                    yk5 yk5Var;
                    Context contextE;
                    nd3 nd3Var2;
                    nd3 nd3Var3;
                    byte b4 = b3;
                    f88 f88Var = f88.a;
                    cl5 cl5Var = this.n;
                    switch (b4) {
                        case 0:
                            xk5 xk5Var = cl5Var.x;
                            if (xk5Var != null && (nd3Var = xk5Var.a.s0) != null) {
                                ((zf8) nd3Var).A0();
                            }
                            return f88Var;
                        case 1:
                            xk5 xk5Var2 = cl5Var.x;
                            if (xk5Var2 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel2 = cl5Var.t;
                                boolean zN = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_MicMuted(iToolbarClientViewModel2.a, iToolbarClientViewModel2), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var4 = xk5Var2.a.s0;
                                if (nd3Var4 != null) {
                                    IAudioVoipClientViewModel iAudioVoipClientViewModel = ((zf8) nd3Var4).s0;
                                    if (iAudioVoipClientViewModel == null) {
                                        im3.e0("audioVoIpViewModel");
                                        throw null;
                                    }
                                    IAudioVoipClientViewModelSWIGJNI.IAudioVoipClientViewModel_SetMicMuted(iAudioVoipClientViewModel.n, iAudioVoipClientViewModel, zN);
                                }
                            }
                            return f88Var;
                        case 2:
                            xk5 xk5Var3 = cl5Var.x;
                            if (xk5Var3 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel3 = cl5Var.t;
                                boolean zN2 = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_VideoStreamPaused(iToolbarClientViewModel3.a, iToolbarClientViewModel3), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var5 = xk5Var3.a.s0;
                                if (nd3Var5 != null) {
                                    IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) nd3Var5).q0;
                                    if (zN2) {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendPauseVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    } else {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendResumeVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    }
                                }
                            }
                            return f88Var;
                        case 3:
                            xk5 xk5Var4 = cl5Var.x;
                            if (xk5Var4 != null && (contextE = (yk5Var = xk5Var4.a).E()) != null) {
                                nd ndVar = new nd(contextE);
                                jd jdVar = (jd) ndVar.f1562o;
                                jdVar.d = jdVar.a.getText(R.string.clear_all_markers_dialog_title);
                                jdVar.f = jdVar.a.getText(R.string.clear_all_markers_dialog_message);
                                z zVar = new z(yk5Var, (byte) 5);
                                jdVar.g = jdVar.a.getText(R.string.clear_all_markers_dialog_confirm);
                                jdVar.h = zVar;
                                jdVar.i = jdVar.a.getText(R.string.tv_cancel);
                                jdVar.j = null;
                                ndVar.e().show();
                            }
                            return f88Var;
                        case 4:
                            xk5 xk5Var5 = cl5Var.x;
                            if (xk5Var5 != null && (nd3Var2 = xk5Var5.a.s0) != null) {
                                IMarkingClientViewModel iMarkingClientViewModel = ((zf8) nd3Var2).r0;
                                if (iMarkingClientViewModel == null) {
                                    im3.e0("markingClientViewModel");
                                    throw null;
                                }
                                IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_RemoveLastMarker(iMarkingClientViewModel.n, iMarkingClientViewModel);
                            }
                            return f88Var;
                        default:
                            xk5 xk5Var6 = cl5Var.x;
                            if (xk5Var6 != null && (nd3Var3 = xk5Var6.a.s0) != null) {
                                zf8 zf8Var = (zf8) nd3Var3;
                                if (zf8Var.D0) {
                                    zf8Var.D0(vf8.m);
                                }
                            }
                            return f88Var;
                    }
                }
            }));
        }
        Drawable drawable4 = resources.getDrawable(R.drawable.ic_delete, null);
        if (drawable4 != null) {
            final byte b4 = 3;
            V0(new oz7(3, drawable4, true, new Function0(this) { // from class: o.al5
                public final /* synthetic */ cl5 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    nd3 nd3Var;
                    yk5 yk5Var;
                    Context contextE;
                    nd3 nd3Var2;
                    nd3 nd3Var3;
                    byte b5 = b4;
                    f88 f88Var = f88.a;
                    cl5 cl5Var = this.n;
                    switch (b5) {
                        case 0:
                            xk5 xk5Var = cl5Var.x;
                            if (xk5Var != null && (nd3Var = xk5Var.a.s0) != null) {
                                ((zf8) nd3Var).A0();
                            }
                            return f88Var;
                        case 1:
                            xk5 xk5Var2 = cl5Var.x;
                            if (xk5Var2 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel2 = cl5Var.t;
                                boolean zN = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_MicMuted(iToolbarClientViewModel2.a, iToolbarClientViewModel2), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var4 = xk5Var2.a.s0;
                                if (nd3Var4 != null) {
                                    IAudioVoipClientViewModel iAudioVoipClientViewModel = ((zf8) nd3Var4).s0;
                                    if (iAudioVoipClientViewModel == null) {
                                        im3.e0("audioVoIpViewModel");
                                        throw null;
                                    }
                                    IAudioVoipClientViewModelSWIGJNI.IAudioVoipClientViewModel_SetMicMuted(iAudioVoipClientViewModel.n, iAudioVoipClientViewModel, zN);
                                }
                            }
                            return f88Var;
                        case 2:
                            xk5 xk5Var3 = cl5Var.x;
                            if (xk5Var3 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel3 = cl5Var.t;
                                boolean zN2 = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_VideoStreamPaused(iToolbarClientViewModel3.a, iToolbarClientViewModel3), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var5 = xk5Var3.a.s0;
                                if (nd3Var5 != null) {
                                    IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) nd3Var5).q0;
                                    if (zN2) {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendPauseVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    } else {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendResumeVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    }
                                }
                            }
                            return f88Var;
                        case 3:
                            xk5 xk5Var4 = cl5Var.x;
                            if (xk5Var4 != null && (contextE = (yk5Var = xk5Var4.a).E()) != null) {
                                nd ndVar = new nd(contextE);
                                jd jdVar = (jd) ndVar.f1562o;
                                jdVar.d = jdVar.a.getText(R.string.clear_all_markers_dialog_title);
                                jdVar.f = jdVar.a.getText(R.string.clear_all_markers_dialog_message);
                                z zVar = new z(yk5Var, (byte) 5);
                                jdVar.g = jdVar.a.getText(R.string.clear_all_markers_dialog_confirm);
                                jdVar.h = zVar;
                                jdVar.i = jdVar.a.getText(R.string.tv_cancel);
                                jdVar.j = null;
                                ndVar.e().show();
                            }
                            return f88Var;
                        case 4:
                            xk5 xk5Var5 = cl5Var.x;
                            if (xk5Var5 != null && (nd3Var2 = xk5Var5.a.s0) != null) {
                                IMarkingClientViewModel iMarkingClientViewModel = ((zf8) nd3Var2).r0;
                                if (iMarkingClientViewModel == null) {
                                    im3.e0("markingClientViewModel");
                                    throw null;
                                }
                                IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_RemoveLastMarker(iMarkingClientViewModel.n, iMarkingClientViewModel);
                            }
                            return f88Var;
                        default:
                            xk5 xk5Var6 = cl5Var.x;
                            if (xk5Var6 != null && (nd3Var3 = xk5Var6.a.s0) != null) {
                                zf8 zf8Var = (zf8) nd3Var3;
                                if (zf8Var.D0) {
                                    zf8Var.D0(vf8.m);
                                }
                            }
                            return f88Var;
                    }
                }
            }));
        }
        Drawable drawable5 = resources.getDrawable(R.drawable.ic_undo, null);
        if (drawable5 != null) {
            final byte b5 = 4;
            V0(new oz7(4, drawable5, true, new Function0(this) { // from class: o.al5
                public final /* synthetic */ cl5 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    nd3 nd3Var;
                    yk5 yk5Var;
                    Context contextE;
                    nd3 nd3Var2;
                    nd3 nd3Var3;
                    byte b6 = b5;
                    f88 f88Var = f88.a;
                    cl5 cl5Var = this.n;
                    switch (b6) {
                        case 0:
                            xk5 xk5Var = cl5Var.x;
                            if (xk5Var != null && (nd3Var = xk5Var.a.s0) != null) {
                                ((zf8) nd3Var).A0();
                            }
                            return f88Var;
                        case 1:
                            xk5 xk5Var2 = cl5Var.x;
                            if (xk5Var2 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel2 = cl5Var.t;
                                boolean zN = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_MicMuted(iToolbarClientViewModel2.a, iToolbarClientViewModel2), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var4 = xk5Var2.a.s0;
                                if (nd3Var4 != null) {
                                    IAudioVoipClientViewModel iAudioVoipClientViewModel = ((zf8) nd3Var4).s0;
                                    if (iAudioVoipClientViewModel == null) {
                                        im3.e0("audioVoIpViewModel");
                                        throw null;
                                    }
                                    IAudioVoipClientViewModelSWIGJNI.IAudioVoipClientViewModel_SetMicMuted(iAudioVoipClientViewModel.n, iAudioVoipClientViewModel, zN);
                                }
                            }
                            return f88Var;
                        case 2:
                            xk5 xk5Var3 = cl5Var.x;
                            if (xk5Var3 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel3 = cl5Var.t;
                                boolean zN2 = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_VideoStreamPaused(iToolbarClientViewModel3.a, iToolbarClientViewModel3), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var5 = xk5Var3.a.s0;
                                if (nd3Var5 != null) {
                                    IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) nd3Var5).q0;
                                    if (zN2) {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendPauseVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    } else {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendResumeVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    }
                                }
                            }
                            return f88Var;
                        case 3:
                            xk5 xk5Var4 = cl5Var.x;
                            if (xk5Var4 != null && (contextE = (yk5Var = xk5Var4.a).E()) != null) {
                                nd ndVar = new nd(contextE);
                                jd jdVar = (jd) ndVar.f1562o;
                                jdVar.d = jdVar.a.getText(R.string.clear_all_markers_dialog_title);
                                jdVar.f = jdVar.a.getText(R.string.clear_all_markers_dialog_message);
                                z zVar = new z(yk5Var, (byte) 5);
                                jdVar.g = jdVar.a.getText(R.string.clear_all_markers_dialog_confirm);
                                jdVar.h = zVar;
                                jdVar.i = jdVar.a.getText(R.string.tv_cancel);
                                jdVar.j = null;
                                ndVar.e().show();
                            }
                            return f88Var;
                        case 4:
                            xk5 xk5Var5 = cl5Var.x;
                            if (xk5Var5 != null && (nd3Var2 = xk5Var5.a.s0) != null) {
                                IMarkingClientViewModel iMarkingClientViewModel = ((zf8) nd3Var2).r0;
                                if (iMarkingClientViewModel == null) {
                                    im3.e0("markingClientViewModel");
                                    throw null;
                                }
                                IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_RemoveLastMarker(iMarkingClientViewModel.n, iMarkingClientViewModel);
                            }
                            return f88Var;
                        default:
                            xk5 xk5Var6 = cl5Var.x;
                            if (xk5Var6 != null && (nd3Var3 = xk5Var6.a.s0) != null) {
                                zf8 zf8Var = (zf8) nd3Var3;
                                if (zf8Var.D0) {
                                    zf8Var.D0(vf8.m);
                                }
                            }
                            return f88Var;
                    }
                }
            }));
        }
        Drawable drawable6 = resources.getDrawable(R.drawable.ic_add_text, null);
        if (drawable6 != null) {
            final byte b6 = 5;
            V0(new oz7(5, drawable6, false, new Function0(this) { // from class: o.al5
                public final /* synthetic */ cl5 n;

                {
                    this.n = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    nd3 nd3Var;
                    yk5 yk5Var;
                    Context contextE;
                    nd3 nd3Var2;
                    nd3 nd3Var3;
                    byte b7 = b6;
                    f88 f88Var = f88.a;
                    cl5 cl5Var = this.n;
                    switch (b7) {
                        case 0:
                            xk5 xk5Var = cl5Var.x;
                            if (xk5Var != null && (nd3Var = xk5Var.a.s0) != null) {
                                ((zf8) nd3Var).A0();
                            }
                            return f88Var;
                        case 1:
                            xk5 xk5Var2 = cl5Var.x;
                            if (xk5Var2 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel2 = cl5Var.t;
                                boolean zN = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_MicMuted(iToolbarClientViewModel2.a, iToolbarClientViewModel2), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var4 = xk5Var2.a.s0;
                                if (nd3Var4 != null) {
                                    IAudioVoipClientViewModel iAudioVoipClientViewModel = ((zf8) nd3Var4).s0;
                                    if (iAudioVoipClientViewModel == null) {
                                        im3.e0("audioVoIpViewModel");
                                        throw null;
                                    }
                                    IAudioVoipClientViewModelSWIGJNI.IAudioVoipClientViewModel_SetMicMuted(iAudioVoipClientViewModel.n, iAudioVoipClientViewModel, zN);
                                }
                            }
                            return f88Var;
                        case 2:
                            xk5 xk5Var3 = cl5Var.x;
                            if (xk5Var3 != null) {
                                IToolbarClientViewModel iToolbarClientViewModel3 = cl5Var.t;
                                boolean zN2 = im3.n(NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_VideoStreamPaused(iToolbarClientViewModel3.a, iToolbarClientViewModel3), false).getValue(), Boolean.FALSE);
                                nd3 nd3Var5 = xk5Var3.a.s0;
                                if (nd3Var5 != null) {
                                    IVideoStreamClientViewModel iVideoStreamClientViewModel = ((zf8) nd3Var5).q0;
                                    if (zN2) {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendPauseVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    } else {
                                        if (iVideoStreamClientViewModel == null) {
                                            im3.e0("videoStreamClientViewModel");
                                            throw null;
                                        }
                                        IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_SendResumeVideoStream(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                                    }
                                }
                            }
                            return f88Var;
                        case 3:
                            xk5 xk5Var4 = cl5Var.x;
                            if (xk5Var4 != null && (contextE = (yk5Var = xk5Var4.a).E()) != null) {
                                nd ndVar = new nd(contextE);
                                jd jdVar = (jd) ndVar.f1562o;
                                jdVar.d = jdVar.a.getText(R.string.clear_all_markers_dialog_title);
                                jdVar.f = jdVar.a.getText(R.string.clear_all_markers_dialog_message);
                                z zVar = new z(yk5Var, (byte) 5);
                                jdVar.g = jdVar.a.getText(R.string.clear_all_markers_dialog_confirm);
                                jdVar.h = zVar;
                                jdVar.i = jdVar.a.getText(R.string.tv_cancel);
                                jdVar.j = null;
                                ndVar.e().show();
                            }
                            return f88Var;
                        case 4:
                            xk5 xk5Var5 = cl5Var.x;
                            if (xk5Var5 != null && (nd3Var2 = xk5Var5.a.s0) != null) {
                                IMarkingClientViewModel iMarkingClientViewModel = ((zf8) nd3Var2).r0;
                                if (iMarkingClientViewModel == null) {
                                    im3.e0("markingClientViewModel");
                                    throw null;
                                }
                                IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_RemoveLastMarker(iMarkingClientViewModel.n, iMarkingClientViewModel);
                            }
                            return f88Var;
                        default:
                            xk5 xk5Var6 = cl5Var.x;
                            if (xk5Var6 != null && (nd3Var3 = xk5Var6.a.s0) != null) {
                                zf8 zf8Var = (zf8) nd3Var3;
                                if (zf8Var.D0) {
                                    zf8Var.D0(vf8.m);
                                }
                            }
                            return f88Var;
                    }
                }
            }));
        }
        IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_RegisterForButtonStateChanged(iToolbarClientViewModel.a, iToolbarClientViewModel, ToolbarClientButtonStateSignalCallback.getCPtr((ToolbarClientButtonStateSignalCallback) bl5Var), bl5Var);
        NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_MicMuted(iToolbarClientViewModel.a, iToolbarClientViewModel), false).observeForever(r8);
        NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_VideoStreamPaused(iToolbarClientViewModel.a, iToolbarClientViewModel), false).observeForever(r7);
    }

    @Override // o.oe8
    public final void U0() {
        IToolbarClientViewModel iToolbarClientViewModel = this.t;
        NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_MicMuted(iToolbarClientViewModel.a, iToolbarClientViewModel), false).removeObserver(this.w);
        NativeLiveDataBool.newInstance(IToolbarClientViewModelSWIGJNI.IToolbarClientViewModel_VideoStreamPaused(iToolbarClientViewModel.a, iToolbarClientViewModel), false).removeObserver(this.v);
        iToolbarClientViewModel.a();
    }
}
