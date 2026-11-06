package o;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Scroller;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationListUIModel;
import com.teamviewer.remotecontrollib.gui.KeyboardInputView;
import com.teamviewer.remotecontrollib.gui.view.M2MControlView;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.SessionSettingsActivity;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IVideoStreamClientViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class ko0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ko0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                motionEvent.getClass();
                return false;
            case 5:
                motionEvent.getClass();
                ((kv4) this.b).m.forceFinished(true);
                return false;
            case 6:
                motionEvent.getClass();
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IConversationHistoryListUIModel iConversationHistoryListUIModel;
        IConversationHistoryListUIModel iConversationHistoryListUIModel2;
        RecyclerView recyclerView;
        IConversationListUIModel iConversationListUIModel;
        IConversationListUIModel iConversationListUIModel2;
        RecyclerView recyclerView2;
        boolean z;
        l97 l97Var;
        v97 v97Var;
        aj4 aj4Var;
        aj4 aj4Var2;
        byte b = this.a;
        Object obj = this.b;
        int i = 0;
        switch (b) {
            case 0:
                po0 po0Var = (po0) obj;
                motionEvent2.getClass();
                if (Math.abs(f) < Math.abs(f2) && (iConversationHistoryListUIModel = po0Var.n) != null && iConversationHistoryListUIModel.GetHasMoreMessages() && (iConversationHistoryListUIModel2 = po0Var.n) != null && !iConversationHistoryListUIModel2.IsLoading() && (recyclerView = po0Var.t) != null && !recyclerView.canScrollVertically(-1)) {
                    ye4.a("ChatConversationDefaultLogic", "GestureDetector: load more messages");
                    IConversationHistoryListUIModel iConversationHistoryListUIModel3 = po0Var.n;
                    if (iConversationHistoryListUIModel3 != null) {
                        iConversationHistoryListUIModel3.LoadMoreMessages(10L);
                    }
                }
                return false;
            case 1:
                yo0 yo0Var = (yo0) obj;
                motionEvent2.getClass();
                if (Math.abs(f) < Math.abs(f2) && (iConversationListUIModel = yo0Var.r0) != null && iConversationListUIModel.HasMoreConversations() && (((iConversationListUIModel2 = yo0Var.r0) == null || !iConversationListUIModel2.IsLoading()) && ((recyclerView2 = yo0Var.w0) == null || !recyclerView2.canScrollVertically(1)))) {
                    ye4.a("ChatConversationListFragment", "GestureDetector: load more conversations");
                    IConversationListUIModel iConversationListUIModel3 = yo0Var.r0;
                    if (iConversationListUIModel3 != null) {
                        iConversationListUIModel3.LoadMoreConversations(15);
                    }
                }
                return false;
            case 2:
            case 4:
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
            case 3:
                cy3 cy3Var = (cy3) obj;
                if (cy3Var.q0) {
                    z = false;
                } else {
                    float fAbs = Math.abs(f);
                    float fAbs2 = Math.abs(f2);
                    float x = motionEvent2.getX() - motionEvent.getX();
                    float y = motionEvent2.getY() - motionEvent.getY();
                    int width = cy3Var.getWidth() / 2;
                    int height = cy3Var.getHeight() / 2;
                    by3 by3Var = cy3Var.r0;
                    float[] fArr = by3Var.a;
                    float[] fArr2 = by3Var.b;
                    long[] jArr = by3Var.c;
                    float f3 = fArr[0];
                    float f4 = fArr2[0];
                    long j = jArr[0];
                    z = false;
                    while (i < 4 && jArr[i] != 0) {
                        i++;
                    }
                    float f5 = 0.0f;
                    float f6 = 0.0f;
                    int i2 = 1;
                    while (i2 < i) {
                        float f7 = x;
                        int i3 = i2;
                        int i4 = (int) (jArr[i2] - j);
                        if (i4 != 0) {
                            float f8 = i4;
                            float f9 = ((fArr[i3] - f3) / f8) * 1000.0f;
                            f5 = f5 == 0.0f ? f9 : (f5 + f9) * 0.5f;
                            float f10 = ((fArr2[i3] - f4) / f8) * 1000.0f;
                            f6 = f6 == 0.0f ? f10 : (f6 + f10) * 0.5f;
                        }
                        i2 = i3 + 1;
                        x = f7;
                    }
                    float f11 = x;
                    by3Var.e = f5 < 0.0f ? Math.max(f5, -3.4028235E38f) : Math.min(f5, Float.MAX_VALUE);
                    by3Var.d = f6 < 0.0f ? Math.max(f6, -3.4028235E38f) : Math.min(f6, Float.MAX_VALUE);
                    boolean z2 = cy3Var.t0;
                    by3 by3Var2 = cy3Var.r0;
                    float f12 = by3Var2.e;
                    float f13 = by3Var2.d;
                    int i5 = cy3Var.s0;
                    float f14 = i5;
                    if (f <= f14 || fAbs2 >= fAbs || f11 <= width) {
                        float f15 = -i5;
                        if (f < f15 && fAbs2 < fAbs && f11 < (-width)) {
                            if (!z2 || f12 <= f / 4.0f) {
                                cy3Var.I.getClass();
                                return true;
                            }
                            cy3Var.b(cy3Var.e0, cy3Var.Q, cy3Var.R, motionEvent.getEventTime());
                        } else if (f2 < f15 && fAbs < fAbs2 && y < (-height)) {
                            if (!z2 || f13 <= f2 / 4.0f) {
                                cy3Var.I.getClass();
                                return true;
                            }
                            cy3Var.b(cy3Var.e0, cy3Var.Q, cy3Var.R, motionEvent.getEventTime());
                        } else if (f2 > f14 && fAbs < fAbs2 / 2.0f && y > height) {
                            if (!z2 || f13 >= f2 / 4.0f) {
                                cy3Var.I.getClass();
                                return true;
                            }
                            cy3Var.b(cy3Var.e0, cy3Var.Q, cy3Var.R, motionEvent.getEventTime());
                        }
                    } else {
                        if (!z2 || f12 >= f / 4.0f) {
                            cy3Var.I.getClass();
                            return true;
                        }
                        cy3Var.b(cy3Var.e0, cy3Var.Q, cy3Var.R, motionEvent.getEventTime());
                    }
                }
                return z;
            case 5:
                motionEvent2.getClass();
                kv4 kv4Var = (kv4) obj;
                Scroller scroller = kv4Var.m;
                if (iv4.m == kv4Var.s) {
                    aj4 aj4Var3 = kv4Var.p;
                    boolean z3 = aj4Var3 != null && Float.compare(((v97) aj4Var3.e.getValue()).a, aj4Var3.b) == 0;
                    aj4 aj4Var4 = kv4Var.p;
                    boolean z4 = aj4Var4 != null && ((v97) aj4Var4.e.getValue()).a > aj4Var4.k;
                    if (z3) {
                        return true;
                    }
                    if (!z4) {
                        if (Math.abs(f) > Math.abs(f2) && ((aj4Var2 = kv4Var.p) == null || !aj4Var2.t())) {
                            return true;
                        }
                        if (Math.abs(f2) > Math.abs(f) && ((aj4Var = kv4Var.p) == null || !aj4Var.u())) {
                            return true;
                        }
                    }
                    aj4 aj4Var5 = kv4Var.p;
                    if (aj4Var5 != null && (l97Var = aj4Var5.e) != null && (v97Var = (v97) l97Var.getValue()) != null) {
                        int i6 = (int) v97Var.d;
                        int i7 = (int) v97Var.e;
                        scroller.forceFinished(true);
                        scroller.fling(0, 0, (int) f, (int) f2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        aj4 aj4Var6 = kv4Var.p;
                        if (aj4Var6 == null) {
                            return true;
                        }
                        Timer timer = new Timer();
                        timer.scheduleAtFixedRate(new hv4(scroller, new Point(i6, i7), aj4Var6), 16L, 16L);
                        kv4Var.t = timer;
                        return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3;
        boolean z;
        boolean z2;
        boolean z3;
        ub3 ub3Var;
        aj4 aj4Var;
        l97 l97Var;
        v97 v97Var;
        aj4 aj4Var2;
        aj4 aj4Var3;
        byte b = this.a;
        boolean z4 = false;
        Object obj = this.b;
        switch (b) {
            case 2:
                motionEvent2.getClass();
                if (motionEvent != null && motionEvent.getToolType(0) == 1) {
                    motionEvent3 = motionEvent2;
                    if (motionEvent3.getToolType(0) == 1) {
                        z = true;
                    }
                    if (motionEvent == null && motionEvent.getButtonState() == 0 && motionEvent3.getButtonState() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (motionEvent == null && motionEvent.getActionMasked() == 0 && motionEvent3.getActionMasked() == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z || !z2 || !z3) {
                        return super.onScroll(motionEvent, motionEvent2, f, f2);
                    }
                    y41 y41Var = (y41) obj;
                    y41Var.b = true;
                    c1 c1Var = (c1) y41Var.c;
                    if (Math.abs(f) > Math.abs(f2)) {
                        int i = (int) f;
                        if (i == 0 || c1Var == null || (ub3Var = c1Var.i) == null) {
                            return true;
                        }
                        ub3Var.a(i, true);
                        return true;
                    }
                    int i2 = (int) f2;
                    if (i2 == 0 || c1Var == null) {
                        return true;
                    }
                    int i3 = -i2;
                    ub3 ub3Var2 = c1Var.i;
                    if (ub3Var2 == null) {
                        return true;
                    }
                    ub3Var2.a(i3, false);
                    return true;
                }
                motionEvent3 = motionEvent2;
                z = false;
                if (motionEvent == null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (motionEvent == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (z) {
                }
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            case 3:
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            case 4:
                motionEvent2.getClass();
                return false;
            case 5:
                kv4 kv4Var = (kv4) obj;
                int i4 = kv4Var.n;
                motionEvent2.getClass();
                if (motionEvent == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || kv4Var.f1307o || (aj4Var = kv4Var.p) == null || (l97Var = aj4Var.e) == null || (v97Var = (v97) l97Var.getValue()) == null) {
                    return false;
                }
                float f3 = v97Var.e;
                float f4 = v97Var.d;
                iv4 iv4Var = kv4Var.s;
                iv4 iv4Var2 = iv4.p;
                if (iv4Var2 == iv4Var) {
                    aj4 aj4Var4 = kv4Var.p;
                    if (aj4Var4 != null) {
                        aj4Var4.c(f4 + f, f3 + f2);
                    }
                } else {
                    if (iv4.m != iv4Var) {
                        return false;
                    }
                    float fAbs = Math.abs(motionEvent.getX() - motionEvent2.getX());
                    float fAbs2 = Math.abs(motionEvent.getY() - motionEvent2.getY());
                    aj4 aj4Var5 = kv4Var.p;
                    boolean z5 = aj4Var5 != null && Float.compare(((v97) aj4Var5.e.getValue()).a, aj4Var5.b) == 0;
                    aj4 aj4Var6 = kv4Var.p;
                    boolean z6 = aj4Var6 != null && ((v97) aj4Var6.e.getValue()).a > aj4Var6.k;
                    if ((fAbs > i4 && ((aj4Var3 = kv4Var.p) == null || !aj4Var3.t())) || (fAbs2 > i4 && ((aj4Var2 = kv4Var.p) == null || !aj4Var2.u()))) {
                        z4 = true;
                    }
                    if (z5 || (!z6 && z4)) {
                        kv4Var.s = iv4.n;
                        int x = (int) motionEvent2.getX();
                        int y = (int) motionEvent2.getY();
                        c1 c1Var2 = kv4Var.q;
                        if (c1Var2 != null) {
                            c1Var2.j(1, x, y, 2, 1);
                        }
                    } else {
                        float f5 = i4;
                        if (fAbs > f5 || fAbs2 > f5) {
                            kv4Var.s = iv4Var2;
                        }
                        aj4 aj4Var7 = kv4Var.p;
                        if (aj4Var7 != null) {
                            aj4Var7.c(f4 + f, f3 + f2);
                        }
                    }
                }
                return true;
            case 6:
                motionEvent2.getClass();
                zf8 zf8Var = (zf8) obj;
                IVideoStreamClientViewModel iVideoStreamClientViewModel = zf8Var.q0;
                if (iVideoStreamClientViewModel == null) {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
                int iIVideoStreamClientViewModel_GetVideoWidth = IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_GetVideoWidth(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                IVideoStreamClientViewModel iVideoStreamClientViewModel2 = zf8Var.q0;
                if (iVideoStreamClientViewModel2 == null) {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
                int iIVideoStreamClientViewModel_GetVideoOffsetX = IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_GetVideoOffsetX(iVideoStreamClientViewModel2.n, iVideoStreamClientViewModel2);
                IVideoStreamClientViewModel iVideoStreamClientViewModel3 = zf8Var.q0;
                if (iVideoStreamClientViewModel3 == null) {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
                int iIVideoStreamClientViewModel_GetVideoHeight = IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_GetVideoHeight(iVideoStreamClientViewModel3.n, iVideoStreamClientViewModel3);
                IVideoStreamClientViewModel iVideoStreamClientViewModel4 = zf8Var.q0;
                if (iVideoStreamClientViewModel4 == null) {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
                int iIVideoStreamClientViewModel_GetVideoOffsetY = IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_GetVideoOffsetY(iVideoStreamClientViewModel4.n, iVideoStreamClientViewModel4);
                Double dB0 = zf8.B0(motionEvent != null ? Integer.valueOf((int) motionEvent.getX()) : null, iIVideoStreamClientViewModel_GetVideoWidth, iIVideoStreamClientViewModel_GetVideoOffsetX);
                Double dB1 = zf8.B0(motionEvent != null ? Integer.valueOf((int) motionEvent.getY()) : null, iIVideoStreamClientViewModel_GetVideoHeight, iIVideoStreamClientViewModel_GetVideoOffsetY);
                Double dB2 = zf8.B0(Integer.valueOf((int) motionEvent2.getX()), iIVideoStreamClientViewModel_GetVideoWidth, iIVideoStreamClientViewModel_GetVideoOffsetX);
                Double dB3 = zf8.B0(Integer.valueOf((int) motionEvent2.getY()), iIVideoStreamClientViewModel_GetVideoHeight, iIVideoStreamClientViewModel_GetVideoOffsetY);
                if (dB0 != null && dB1 != null && dB2 != null && dB3 != null) {
                    IMarkingClientViewModel iMarkingClientViewModel = zf8Var.r0;
                    if (iMarkingClientViewModel == null) {
                        im3.e0("markingClientViewModel");
                        throw null;
                    }
                    IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_OnScroll(iMarkingClientViewModel.n, iMarkingClientViewModel, dB0.doubleValue(), dB1.doubleValue(), dB2.doubleValue(), dB3.doubleValue());
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                motionEvent.getClass();
                return true;
            case 5:
                motionEvent.getClass();
                kv4 kv4Var = (kv4) this.b;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                c1 c1Var = kv4Var.q;
                if (c1Var != null) {
                    c1Var.j(1, x, y, 2, 1);
                }
                c1 c1Var2 = kv4Var.q;
                if (c1Var2 != null) {
                    c1Var2.j(1, x, y, 1, 1);
                }
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        ValueAnimator valueAnimatorOfFloat;
        int iOrdinal;
        qf2 qf2VarH0;
        Boolean bool;
        LiveData liveDataA;
        byte b = this.a;
        Object obj = this.b;
        ValueAnimator valueAnimator = null;
        byte b2 = 1;
        switch (b) {
            case 4:
                motionEvent.getClass();
                final M2MControlView m2MControlView = (M2MControlView) obj;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i = M2MControlView.L;
                dj4 dj4VarB = m2MControlView.b(x, y);
                if (dj4VarB != dj4.Invalid) {
                    lb3 lb3Var = m2MControlView.I;
                    dj4 dj4Var = dj4.Main;
                    lb3 lb3Var2 = lb3.n;
                    if (lb3Var != lb3Var2 || dj4VarB == dj4Var) {
                        kb3 kb3Var = m2MControlView.K;
                        if (kb3Var != null && (iOrdinal = dj4VarB.ordinal()) != 0) {
                            if (iOrdinal == 1) {
                                M2MClientActivity m2MClientActivity = (M2MClientActivity) kb3Var;
                                m2MClientActivity.J();
                                jb3 jb3Var = m2MClientActivity.V;
                                boolean zBooleanValue = (jb3Var == null || (qf2VarH0 = jb3Var.h0()) == null || (bool = (Boolean) qf2VarH0.getValue()) == null) ? false : bool.booleanValue();
                                if (it1.c == null) {
                                    im3.e0("viewFactory");
                                    throw null;
                                }
                                Intent intent = new Intent(m2MClientActivity, (Class<?>) SessionSettingsActivity.class);
                                intent.putExtra("extra_settings_type", 2);
                                intent.putExtra("extra_disable_instructions", !zBooleanValue);
                                m2MClientActivity.startActivity(intent);
                            } else if (iOrdinal == 2) {
                                M2MClientActivity m2MClientActivity2 = (M2MClientActivity) kb3Var;
                                jb3 jb3Var2 = m2MClientActivity2.V;
                                if ((jb3Var2 == null || (liveDataA = jb3Var2.A()) == null) ? false : im3.n(liveDataA.getValue(), Boolean.TRUE)) {
                                    KeyboardInputView keyboardInputView = (KeyboardInputView) m2MClientActivity2.findViewById(R.id.DummyKeyboardEdit);
                                    keyboardInputView.setVisibility(0);
                                    keyboardInputView.setFocusable(true);
                                    keyboardInputView.requestFocus();
                                    InputMethodManager inputMethodManager = (InputMethodManager) m2MClientActivity2.getSystemService(InputMethodManager.class);
                                    if (inputMethodManager != null) {
                                        if (Build.VERSION.SDK_INT >= 36) {
                                            inputMethodManager.showSoftInput(keyboardInputView, 0);
                                        } else {
                                            inputMethodManager.showSoftInput(keyboardInputView, 1);
                                        }
                                    }
                                    View view = m2MClientActivity2.R;
                                    if (view != null) {
                                        view.setVisibility(0);
                                    }
                                    m2MClientActivity2.X = true;
                                } else {
                                    String string = m2MClientActivity2.getString(R.string.tv_remote_input_not_supported);
                                    string.getClass();
                                    bu7.MAIN.a(new jy0((byte) 2, 0, string, m2MClientActivity2));
                                }
                            } else if (iOrdinal == 3) {
                                ((M2MClientActivity) kb3Var).N();
                            } else {
                                gk0.s();
                            }
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        int i2 = m2MControlView.p;
                        final int i3 = m2MControlView.f65o;
                        lb3 lb3Var3 = m2MControlView.I;
                        lb3 lb3Var4 = lb3.m;
                        ValueAnimator valueAnimatorOfFloat2 = lb3Var3 == lb3Var4 ? ValueAnimator.ofFloat(i3, i2) : ValueAnimator.ofFloat(i2, i3);
                        valueAnimatorOfFloat2.setDuration(500L);
                        valueAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
                        valueAnimatorOfFloat2.addUpdateListener(new ai4(m2MControlView, b2));
                        valueAnimatorOfFloat2.addListener(new ej4(m2MControlView));
                        if (m2MControlView.I != lb3Var2) {
                            z = true;
                        } else {
                            final int i4 = m2MControlView.n;
                            final int i5 = i4 - i3;
                            z = true;
                            int iS0 = vn4.s0(i2 + (m2MControlView.H.a * ((i4 - i2) - i2)));
                            if (iS0 > i5) {
                                valueAnimatorOfFloat = ValueAnimator.ofFloat(iS0, i5);
                                valueAnimatorOfFloat.getClass();
                            } else if (iS0 < i3) {
                                valueAnimatorOfFloat = ValueAnimator.ofFloat(iS0, i3);
                                valueAnimatorOfFloat.getClass();
                            } else {
                                valueAnimator = null;
                            }
                            valueAnimator = valueAnimatorOfFloat;
                            valueAnimator.setDuration(500L);
                            valueAnimator.setInterpolator(new DecelerateInterpolator());
                            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.cj4
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    int i6 = M2MControlView.L;
                                    valueAnimator2.getClass();
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    animatedValue.getClass();
                                    int iFloatValue = (int) ((Float) animatedValue).floatValue();
                                    M2MControlView m2MControlView2 = m2MControlView;
                                    ViewGroup.LayoutParams layoutParams = m2MControlView2.getLayoutParams();
                                    layoutParams.getClass();
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                    marginLayoutParams.rightMargin = i4 - ((m2MControlView2.f65o + iFloatValue) + m2MControlView2.F);
                                    m2MControlView2.setLayoutParams(marginLayoutParams);
                                    ku5 ku5Var = m2MControlView2.H;
                                    int i7 = i5;
                                    int i8 = i3;
                                    ku5Var.a = (iFloatValue - i8) / (i7 - i8);
                                    m2MControlView2.invalidate();
                                }
                            });
                        }
                        if (valueAnimator != null) {
                            animatorSet.play(valueAnimator).with(valueAnimatorOfFloat2);
                        } else {
                            animatorSet.play(valueAnimatorOfFloat2);
                        }
                        animatorSet.start();
                        if (m2MControlView.I == lb3Var2) {
                            lb3Var2 = lb3Var4;
                        }
                        m2MControlView.I = lb3Var2;
                        dj4Var.s = lb3Var2 == lb3Var4 ? z : false;
                        return z;
                    }
                }
                return false;
            case 5:
            default:
                return super.onSingleTapUp(motionEvent);
            case 6:
                motionEvent.getClass();
                zf8 zf8Var = (zf8) obj;
                IVideoStreamClientViewModel iVideoStreamClientViewModel = zf8Var.q0;
                if (iVideoStreamClientViewModel == null) {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
                int iIVideoStreamClientViewModel_GetVideoWidth = IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_GetVideoWidth(iVideoStreamClientViewModel.n, iVideoStreamClientViewModel);
                IVideoStreamClientViewModel iVideoStreamClientViewModel2 = zf8Var.q0;
                if (iVideoStreamClientViewModel2 == null) {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
                int iIVideoStreamClientViewModel_GetVideoOffsetX = IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_GetVideoOffsetX(iVideoStreamClientViewModel2.n, iVideoStreamClientViewModel2);
                IVideoStreamClientViewModel iVideoStreamClientViewModel3 = zf8Var.q0;
                if (iVideoStreamClientViewModel3 == null) {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
                int iIVideoStreamClientViewModel_GetVideoHeight = IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_GetVideoHeight(iVideoStreamClientViewModel3.n, iVideoStreamClientViewModel3);
                IVideoStreamClientViewModel iVideoStreamClientViewModel4 = zf8Var.q0;
                if (iVideoStreamClientViewModel4 == null) {
                    im3.e0("videoStreamClientViewModel");
                    throw null;
                }
                int iIVideoStreamClientViewModel_GetVideoOffsetY = IVideoStreamClientViewModelSWIGJNI.IVideoStreamClientViewModel_GetVideoOffsetY(iVideoStreamClientViewModel4.n, iVideoStreamClientViewModel4);
                Double dB0 = zf8.B0(Integer.valueOf((int) motionEvent.getX()), iIVideoStreamClientViewModel_GetVideoWidth, iIVideoStreamClientViewModel_GetVideoOffsetX);
                Double dB1 = zf8.B0(Integer.valueOf((int) motionEvent.getY()), iIVideoStreamClientViewModel_GetVideoHeight, iIVideoStreamClientViewModel_GetVideoOffsetY);
                if (dB0 != null && dB1 != null) {
                    IMarkingClientViewModel iMarkingClientViewModel = zf8Var.r0;
                    if (iMarkingClientViewModel == null) {
                        im3.e0("markingClientViewModel");
                        throw null;
                    }
                    IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_CreateArrow(iMarkingClientViewModel.n, iMarkingClientViewModel, dB0.doubleValue(), dB1.doubleValue(), true);
                }
                return true;
        }
    }
}
